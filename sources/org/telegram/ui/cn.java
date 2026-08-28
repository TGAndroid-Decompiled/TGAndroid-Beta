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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.UndoView;
public final class cn implements org.telegram.ui.Cells.k1 {
    public final qn f37236a;

    public cn(qn qnVar) {
        this.f37236a = qnVar;
    }

    public static void a(cn cnVar, org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        MessageObject messageObject;
        int i9;
        qn qnVar = cnVar.f37236a;
        if (qnVar.getParentActivity() != null && document != null) {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23 && ((i10 <= 28 || BuildVars.NO_SCOPED_STORAGE) && qnVar.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                qnVar.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
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
                tL_message.f22401id = messageObject.getId();
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
                int i11 = tL_message.flags;
                tL_message.flags = i11 | 512;
                if (tL_message.from_id != null) {
                    tL_message.flags = i11 | 768;
                }
                ArrayList arrayList = new ArrayList();
                i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                arrayList.add(new MessageObject(i9, tL_message, false, true));
                MediaController.saveFilesFromMessages(qnVar.getParentActivity(), qnVar.getAccountInstance(), arrayList, new qa(cnVar, 1));
            }
        }
    }

    @Override
    public final void A0(org.telegram.ui.Cells.t1 t1Var) {
        yg.c cVar = this.f37236a.yc;
        if (cVar != null && cVar.f50213n == t1Var) {
            cVar.f50216w.getClass();
        }
    }

    @Override
    public final void A1(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        qn qnVar = this.f37236a;
        qnVar.Z4 = messageObject;
        qnVar.d9();
    }

    @Override
    public final void B0() {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject messageObject;
        org.telegram.ui.Components.x5 animation;
        qn qnVar = this.f37236a;
        if (!qnVar.f41932h3 && !SharedConfig.noSoundHintShowed && qnVar.f42077t0 != null && qnVar.getParentActivity() != null && qnVar.fragmentView != null) {
            org.telegram.ui.Components.s30 s30Var = qnVar.f42027p2;
            if (s30Var == null || s30Var.getTag() == null) {
                if (qnVar.f42027p2 == null) {
                    im imVar = qnVar.T0;
                    int indexOfChild = imVar.indexOfChild(qnVar.O);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.s30 s30Var2 = new org.telegram.ui.Components.s30(0, qnVar.getParentActivity(), qnVar.f41848aa, false);
                        qnVar.f42027p2 = s30Var2;
                        s30Var2.setShowingDuration(10000L);
                        imVar.addView(qnVar.f42027p2, indexOfChild + 1, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                        qnVar.f42027p2.setAlpha(0.0f);
                        qnVar.f42027p2.setVisibility(4);
                    } else {
                        return;
                    }
                }
                int childCount = qnVar.f42077t0.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View childAt = qnVar.f42077t0.getChildAt(i9);
                    if ((childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.isVideo() && (animation = t1Var.getPhotoImage().getAnimation()) != null && animation.o() >= 3000 && qnVar.f42027p2.e(t1Var, null, 0, 0, true)) {
                        SharedConfig.setNoSoundHintShowed(true);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final String C(long j10) {
        TLRPC.Peer peer;
        String adminRank;
        qn qnVar = this.f37236a;
        if (UserObject.isBotForum(qnVar.f41903f)) {
            return null;
        }
        TLRPC.Chat chat = qnVar.f41890e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat) && (adminRank = qnVar.getMessagesController().getAdminRank(qnVar.f41890e.f22380id, j10)) != null) {
            return adminRank;
        }
        TLRPC.TL_forumTopic tL_forumTopic = qnVar.Y3;
        if (tL_forumTopic == null || (peer = tL_forumTopic.from_id) == null || (peer.user_id != j10 && peer.channel_id != j10 && peer.chat_id != j10)) {
            return null;
        }
        return LocaleController.getString(R.string.TopicCreator);
    }

    @Override
    public final void C1(MessageObject messageObject) {
        this.f37236a.f42063s.put(messageObject, Boolean.TRUE);
    }

    @Override
    public final void D0(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject, boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        qn qnVar = this.f37236a;
        if (qnVar.getParentActivity() != null && tLObject != null) {
            b5Var = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
                if (((ActionBarLayout) b5Var2).y()) {
                    return;
                }
            }
            Bundle bundle = new Bundle();
            boolean z11 = tLObject instanceof TLRPC.Chat;
            if (z11) {
                bundle.putLong("chat_id", ((TLRPC.Chat) tLObject).f22380id);
            } else if (tLObject instanceof TLRPC.User) {
                bundle.putLong("user_id", ((TLRPC.User) tLObject).f22527id);
            } else {
                return;
            }
            if (z10 && z11) {
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(R.drawable.popup_fixed_alert4, 2, qnVar.getParentActivity(), qnVar.getResourceProvider());
                actionBarPopupWindow$ActionBarPopupWindowLayout.setBackgroundColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.G8));
                org.telegram.ui.ActionBar.g1 g1Var = new org.telegram.ui.ActionBar.g1(qnVar.getParentActivity(), false, false);
                g1Var.g(LocaleController.getString(R.string.OpenChannel2), R.drawable.msg_channel, null);
                g1Var.setMinimumWidth(160);
                g1Var.setOnClickListener(new a(this, 14));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var);
                org.telegram.ui.ActionBar.g1 g1Var2 = new org.telegram.ui.ActionBar.g1(qnVar.getParentActivity(), false, false);
                g1Var2.g(LocaleController.getString(R.string.ProfileJoinChannel), R.drawable.msg_addbot, null);
                g1Var2.setMinimumWidth(160);
                g1Var2.setOnClickListener(new b0(this, (TLRPC.Chat) tLObject, t1Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout.addView(g1Var2);
                qn qnVar2 = new qn(bundle);
                qnVar2.F9 = true;
                qnVar.presentFragmentAsPreviewWithMenu(qnVar2, actionBarPopupWindow$ActionBarPopupWindowLayout);
                qnVar.d7();
                return;
            }
            qnVar.presentFragment(new qn(bundle));
        }
    }

    @Override
    public final void D1(org.telegram.ui.Cells.t1 t1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        Uri parse;
        boolean z11;
        ym ymVar;
        if (str == null || (parse = Uri.parse(str)) == null) {
            return;
        }
        if (!z10 && ve.e.h(str, false, false)) {
            z11 = true;
        } else {
            z11 = z10;
        }
        qn qnVar = this.f37236a;
        ve.d dVar = qnVar.f42124wb;
        if (dVar != null) {
            dVar.a(true);
        }
        if (t1Var.getMessageObject() == null) {
            ymVar = null;
        } else {
            ymVar = new ym(this, t1Var);
        }
        qnVar.f42124wb = ymVar;
        if (!z11 && !ve.e.f(parse, false, null)) {
            org.telegram.ui.Components.y4.r0(qnVar, str, true, true, true, !z11, qnVar.f42124wb, webPage, qnVar.f41848aa);
        } else {
            ve.e.r(qnVar.getParentActivity(), parse, true, true, false, qnVar.f42124wb, null, false, true, false);
        }
    }

    @Override
    public final void E0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        boolean z10;
        MessageObject messageObject = t1Var.getMessageObject();
        int i9 = messageObject.type;
        qn qnVar = this.f37236a;
        if (i9 == 16) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            int i10 = 0;
            if (messageAction instanceof TLRPC.TL_messageActionConferenceCall) {
                HashSet hashSet = new HashSet();
                hashSet.add(Long.valueOf(qnVar.a()));
                ArrayList<TLRPC.Peer> arrayList = ((TLRPC.TL_messageActionConferenceCall) messageAction).other_participants;
                int size = arrayList.size();
                while (i10 < size) {
                    TLRPC.Peer peer = arrayList.get(i10);
                    i10++;
                    hashSet.add(Long.valueOf(DialogObject.getPeerDialogId(peer)));
                }
                TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                tL_inputGroupCallInviteMessage.msg_id = messageObject.getId();
                org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(qnVar.getParentActivity(), 3, null);
                TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                getgroupcall.call = tL_inputGroupCallInviteMessage;
                getgroupcall.limit = qnVar.getMessagesController().conferenceCallSizeLimit;
                c2Var.setOnCancelListener(new gh.x(this, qnVar.getConnectionsManager().sendRequest(getgroupcall, new bg.h0(this, c2Var, hashSet, tL_inputGroupCallInviteMessage, messageObject, 7)), 2));
                c2Var.q(600L);
                return;
            }
            TLRPC.User user = qnVar.f41903f;
            if (user != null) {
                boolean isVideoCall = messageObject.isVideoCall();
                TLRPC.UserFull userFull = qnVar.W7;
                if (userFull != null && userFull.video_calls_available) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.voip.e2.n(user, isVideoCall, z10, qnVar.getParentActivity(), qnVar.getMessagesController().getUserFull(qnVar.f41903f.f22527id), qnVar.getAccountInstance());
                return;
            }
            return;
        }
        qnVar.I7(t1Var, true, false, f10, f11, messageObject.isMusic(), false, false);
    }

    @Override
    public final CharacterStyle E1(org.telegram.ui.Cells.t1 t1Var) {
        qn qnVar;
        int i9;
        if (t1Var.getMessageObject() != null && (i9 = (qnVar = this.f37236a).f42075sb) != 0 && i9 == t1Var.getMessageObject().getId() && qnVar.f42088tb == 1) {
            return qnVar.f42101ub;
        }
        return null;
    }

    @Override
    public final void F(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && messageObject.type == 27) {
            messageObject.toggleChannelRecommendations();
            messageObject.forceUpdate = true;
            t1Var.t2();
            t1Var.requestLayout();
            this.f37236a.f42114w0.R(messageObject, false, false);
        }
    }

    @Override
    public final void F0(org.telegram.ui.Cells.t1 t1Var) {
        g(t1Var, true, false, true);
    }

    @Override
    public final void F1(MessageObject messageObject, String str, String str2, String str3, String str4, int i9, int i10) {
        try {
            qn qnVar = this.f37236a;
            org.telegram.ui.Components.gu.I(qnVar, messageObject, qnVar.Ba, str2, str3, str4, str, i9, i10, -1, qnVar.x9());
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    @Override
    public final void G0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        TLRPC.InputPeer inputPeer;
        if (t1Var != null && (messageObject = t1Var.getMessageObject()) != null && messageObject.messageOwner != null) {
            int id2 = messageObject.getId();
            qn qnVar = this.f37236a;
            if ((qnVar.f42075sb != id2 || qnVar.f42088tb != 7) && (inputPeer = qnVar.getMessagesController().getInputPeer(messageObject.getDialogId())) != null) {
                TL_iv.getRichMessage getrichmessage = new TL_iv.getRichMessage();
                getrichmessage.peer = inputPeer;
                getrichmessage.f22600id = id2;
                ve.d dVar = qnVar.f42124wb;
                if (dVar != null) {
                    dVar.a(true);
                    qnVar.f42124wb = null;
                }
                oi oiVar = new oi(qnVar, id2, t1Var, 2);
                oiVar.f48382b = new rd(6, qnVar, r3);
                qnVar.f42124wb = oiVar;
                oiVar.d();
                int[] iArr = {qnVar.getConnectionsManager().sendRequestTyped(getrichmessage, new Object(), new bg(qnVar, oiVar, iArr, t1Var, messageObject))};
            }
        }
    }

    @Override
    public final boolean G1(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        me meVar;
        e5.w wVar;
        boolean z10;
        org.telegram.ui.ActionBar.b6 b6Var;
        fh.v vVar;
        int i9;
        boolean z11;
        int i10;
        b41 b41Var;
        int i11;
        float f10;
        int i12;
        ArrayList arrayList = null;
        if (!messageObject.isVoiceOnce() && !messageObject.isRoundOnce()) {
            if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                if (messageObject.isMusic()) {
                    MediaController mediaController = MediaController.getInstance();
                    ArrayList L = this.f37236a.f42114w0.L();
                    qn qnVar = this.f37236a;
                    return mediaController.setPlaylist(L, messageObject, qnVar.H6, true ^ qnVar.f42114w0.J, null);
                }
            } else {
                boolean playMessage = MediaController.getInstance().playMessage(messageObject, false);
                MediaController mediaController2 = MediaController.getInstance();
                if (playMessage) {
                    arrayList = this.f37236a.R7(messageObject, false);
                }
                mediaController2.setVoiceMessagesPlaylist(arrayList, false);
                return playMessage;
            }
        } else {
            d41 d41Var = this.f37236a.V9;
            if (d41Var == null || d41Var.X) {
                try {
                    AudioManager audioManager = (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
                    int streamVolume = audioManager.getStreamVolume(3);
                    if (streamVolume == 0) {
                        audioManager.adjustStreamVolume(3, streamVolume, 1);
                        if (!messageObject.isOutOwner()) {
                            org.telegram.ui.Components.oc.a0(this.f37236a).w(R.drawable.tooltip_sound, LocaleController.getString(R.string.VoiceOnceTurnOnSound)).k(true);
                            return false;
                        }
                    }
                } catch (Exception unused) {
                }
                this.f37236a.V9 = new d41(this.f37236a.getParentActivity());
                d41 d41Var2 = this.f37236a.V9;
                if (!messageObject.isOutOwner()) {
                    meVar = this.f37236a.fb(messageObject, true);
                } else {
                    meVar = null;
                }
                if (!messageObject.isOutOwner()) {
                    wVar = qn.O4(this.f37236a, messageObject);
                } else {
                    wVar = null;
                }
                Context context = d41Var2.f37403a;
                fh.v vVar2 = d41Var2.f37406c;
                d41Var2.T = meVar;
                d41Var2.U = wVar;
                b41 b41Var2 = d41Var2.J;
                if (b41Var2 != null) {
                    vVar2.removeView(b41Var2);
                    d41Var2.J = null;
                }
                d41Var2.K = t1Var;
                MessageObject messageObject2 = t1Var.getMessageObject();
                d41Var2.I = messageObject2;
                if (messageObject2 != null && messageObject2.isRoundVideo()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d41Var2.O = z10;
                org.telegram.ui.Cells.t1 t1Var2 = d41Var2.K;
                if (t1Var2 != null) {
                    b6Var = t1Var2.getResourcesProvider();
                } else {
                    b6Var = null;
                }
                d41Var2.H = b6Var;
                if (d41Var2.K != null) {
                    d41Var2.P = 0.0f;
                    d41Var2.Q = t1Var.f25485n;
                    if (t1Var.getParent() instanceof View) {
                        View view = (View) t1Var.getParent();
                        d41Var2.P = view.getY() + d41Var2.P;
                        d41Var2.Q = view.getY() + d41Var2.Q;
                    }
                    int width = d41Var2.K.getWidth();
                    int height = d41Var2.K.getHeight();
                    if (d41Var2.O) {
                        height = Math.min(AndroidUtilities.dp(360.0f), Math.min(width, AndroidUtilities.displaySize.y));
                    }
                    int i13 = height;
                    d41Var2.G = i13 - d41Var2.K.getHeight();
                    i9 = (int) Math.ceil((Math.min(width, i13) * 0.92f) / AndroidUtilities.density);
                    vVar = vVar2;
                    b41 b41Var3 = new b41(d41Var2, d41Var2.getContext(), UserConfig.selectedAccount, d41Var2.K.getResourcesProvider(), width, i13);
                    d41Var2.J = b41Var3;
                    d41Var2.K.j1(b41Var3);
                    d41Var2.J.i1(d41Var2.K);
                    d41Var2.J.setDelegate(new ya.b(19));
                    b41 b41Var4 = d41Var2.J;
                    MessageObject messageObject3 = d41Var2.I;
                    MessageObject.GroupedMessages currentMessagesGroup = d41Var2.K.getCurrentMessagesGroup();
                    org.telegram.ui.Cells.t1 t1Var3 = d41Var2.K;
                    b41Var4.X3(messageObject3, currentMessagesGroup, t1Var3.B, t1Var3.A, false, false);
                    if (!d41Var2.O) {
                        org.telegram.ui.Components.d8 d8Var = new org.telegram.ui.Components.d8();
                        d41Var2.R = d8Var;
                        b41 b41Var5 = d41Var2.J;
                        d8Var.f27678i = b41Var5;
                        b41Var5.f25313ae = d8Var;
                        if (b41Var5.getSeekBarWaveform() != null) {
                            org.telegram.ui.Components.rn0 seekBarWaveform = d41Var2.J.getSeekBarWaveform();
                            seekBarWaveform.L = d41Var2.f37411s;
                            org.telegram.ui.Cells.t1 t1Var4 = seekBarWaveform.f32220n;
                            if (t1Var4 != null) {
                                t1Var4.invalidate();
                            }
                        }
                    }
                    d41Var2.D = false;
                    vVar.addView(d41Var2.J, new FrameLayout.LayoutParams(d41Var2.K.getWidth(), i13, 17));
                } else {
                    vVar = vVar2;
                    i9 = 360;
                }
                TextureView textureView = d41Var2.L;
                if (textureView != null) {
                    vVar.removeView(textureView);
                    d41Var2.L = null;
                }
                if (d41Var2.O) {
                    d41Var2.M = false;
                    TextureView textureView2 = new TextureView(context);
                    d41Var2.L = textureView2;
                    vVar.addView(textureView2, 0, g7.e6.c(i9, i9));
                }
                MediaController.getInstance().pauseByRewind();
                org.telegram.ui.Components.k61 k61Var = d41Var2.f37412w;
                if (k61Var != null) {
                    k61Var.C();
                    d41Var2.f37412w.I();
                    d41Var2.f37412w = null;
                }
                org.telegram.ui.Cells.t1 t1Var5 = d41Var2.K;
                if (t1Var5 != null && t1Var5.getMessageObject() != null) {
                    File pathToAttach = FileLoader.getInstance(d41Var2.K.getMessageObject().currentAccount).getPathToAttach(d41Var2.K.getMessageObject().getDocument());
                    if (pathToAttach != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && (pathToAttach = FileLoader.getInstance(d41Var2.K.getMessageObject().currentAccount).getPathToMessage(d41Var2.K.getMessageObject().messageOwner)) != null && !pathToAttach.exists()) {
                        pathToAttach = new File(pathToAttach.getPath() + ".enc");
                    }
                    if ((pathToAttach == null || !pathToAttach.exists()) && d41Var2.K.getMessageObject().messageOwner.attachPath != null) {
                        pathToAttach = new File(d41Var2.K.getMessageObject().messageOwner.attachPath);
                    }
                    if (pathToAttach != null && pathToAttach.exists()) {
                        org.telegram.ui.Components.k61 k61Var2 = new org.telegram.ui.Components.k61();
                        d41Var2.f37412w = k61Var2;
                        k61Var2.F = new c41(d41Var2);
                        if (d41Var2.R != null) {
                            k61Var2.G = new c41(d41Var2);
                        }
                        if (d41Var2.O) {
                            k61Var2.W(d41Var2.L);
                        }
                        d41Var2.f37412w.E(Uri.fromFile(pathToAttach), "other");
                        d41Var2.f37412w.D();
                        org.telegram.ui.Components.ws wsVar = d41Var2.A;
                        if (wsVar != null) {
                            wsVar.f34355s = d41Var2.f37412w;
                            wsVar.a();
                        }
                    }
                    qn qnVar2 = this.f37236a;
                    qnVar2.showDialog(qnVar2.V9);
                    return false;
                }
                kh.x3 x3Var = d41Var2.f37413x;
                if (x3Var != null) {
                    vVar.removeView(x3Var);
                    d41Var2.f37413x = null;
                }
                MessageObject messageObject4 = d41Var2.I;
                if (messageObject4 != null && messageObject4.isOutOwner()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                MessageObject messageObject5 = d41Var2.I;
                if (messageObject5 != null && messageObject5.getDialogId() != UserConfig.getInstance(d41Var2.I.currentAccount).getClientUserId()) {
                    kh.x3 x3Var2 = new kh.x3(context, 3);
                    d41Var2.f37413x = x3Var2;
                    x3Var2.q(true);
                    if (z11) {
                        long dialogId = d41Var2.I.getDialogId();
                        String str = "";
                        if (dialogId > 0) {
                            TLRPC.User user = MessagesController.getInstance(d41Var2.I.currentAccount).getUser(Long.valueOf(dialogId));
                            if (user != null) {
                                str = UserObject.getFirstName(user);
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(d41Var2.I.currentAccount).getChat(Long.valueOf(-dialogId));
                            if (chat != null) {
                                str = chat.title;
                            }
                        }
                        kh.x3 x3Var3 = d41Var2.f37413x;
                        if (d41Var2.O) {
                            i12 = R.string.VideoOnceOutHint;
                        } else {
                            i12 = R.string.VoiceOnceOutHint;
                        }
                        x3Var3.t(AndroidUtilities.replaceTags(LocaleController.formatString(i12, str)));
                    } else {
                        kh.x3 x3Var4 = d41Var2.f37413x;
                        if (d41Var2.O) {
                            i11 = R.string.VideoOnceHint;
                        } else {
                            i11 = R.string.VoiceOnceHint;
                        }
                        x3Var4.t(AndroidUtilities.replaceTags(LocaleController.getString(i11)));
                    }
                    d41Var2.f37413x.r(12.0f);
                    kh.x3 x3Var5 = d41Var2.f37413x;
                    if (!z11 && !d41Var2.K.B) {
                        f10 = 6.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    x3Var5.setPadding(AndroidUtilities.dp(f10), 0, 0, 0);
                    if (d41Var2.O) {
                        d41Var2.f37413x.n(0.5f, 0.0f);
                        d41Var2.f37413x.G = Layout.Alignment.ALIGN_CENTER;
                    } else {
                        d41Var2.f37413x.n(0.0f, AndroidUtilities.dp(34.0f));
                        d41Var2.f37413x.G = Layout.Alignment.ALIGN_NORMAL;
                    }
                    d41Var2.f37413x.u(14.0f);
                    kh.x3 x3Var6 = d41Var2.f37413x;
                    x3Var6.h = kh.x3.a(x3Var6.getText(), d41Var2.f37413x.getTextPaint());
                    if (d41Var2.O) {
                        vVar.addView(d41Var2.f37413x, g7.e6.d((int) ((d41Var2.K.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, 0.0f, (-75.0f) - (((d41Var2.K.getHeight() + d41Var2.G) / AndroidUtilities.density) / 2.0f), 0.0f, 0.0f));
                    } else {
                        vVar.addView(d41Var2.f37413x, g7.e6.d((int) ((d41Var2.K.getWidth() / AndroidUtilities.density) * 0.6f), 150.0f, 17, ((((d41Var2.K.getWidth() * (-0.39999998f)) / 2.0f) + d41Var2.K.getBoundsLeft()) / AndroidUtilities.density) + 1.0f, ((-75.0f) - ((d41Var2.K.getHeight() / AndroidUtilities.density) / 2.0f)) - 8.0f, 0.0f, 0.0f));
                    }
                    d41Var2.f37413x.v();
                }
                TextView textView = d41Var2.f37414y;
                if (textView != null) {
                    vVar.removeView(textView);
                    d41Var2.f37414y = null;
                }
                TextView textView2 = new TextView(context);
                d41Var2.f37414y = textView2;
                textView2.setTextColor(-1);
                d41Var2.f37414y.setTypeface(AndroidUtilities.bold());
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    d41Var2.f37414y.setBackground(org.telegram.ui.ActionBar.f6.i0(64, 64, 64, 64, 553648127, 872415231, 872415231));
                } else {
                    d41Var2.f37414y.setBackground(org.telegram.ui.ActionBar.f6.i0(64, 64, 64, 64, 771751936, 1140850688, 1140850688));
                }
                d41Var2.f37414y.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
                g7.g6.a(d41Var2.f37414y);
                TextView textView3 = d41Var2.f37414y;
                if (z11) {
                    i10 = R.string.VoiceOnceClose;
                } else {
                    i10 = R.string.VoiceOnceDeleteClose;
                }
                textView3.setText(LocaleController.getString(i10));
                d41Var2.f37414y.setOnClickListener(new z31(d41Var2, 1));
                vVar.addView(d41Var2.f37414y, g7.e6.d(-2, -2.0f, 81, 0.0f, 0.0f, 0.0f, 18.0f));
                if (!z11 && (b41Var = d41Var2.J) != null && b41Var.getMessageObject() != null && d41Var2.J.getMessageObject().messageOwner != null) {
                    d41Var2.J.getMessageObject().messageOwner.media_unread = false;
                    d41Var2.J.invalidate();
                }
                qn qnVar22 = this.f37236a;
                qnVar22.showDialog(qnVar22.V9);
                return false;
            }
        }
        return false;
    }

    @Override
    public final void I0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.Message message = messageObject.messageOwner;
        message.summarizedOpen = !message.summarizedOpen;
        messageObject.updateTranslation(true);
        qn qnVar = this.f37236a;
        qnVar.getMessagesStorage().updateMessageCustomParams(messageObject.getDialogId(), messageObject.messageOwner);
        qnVar.getMessagesController().getTranslateController().checkTranslation(messageObject, true);
        g(t1Var, true, false, true);
    }

    @Override
    public final void I1() {
        org.telegram.ui.ActionBar.b6 b6Var;
        qn qnVar = this.f37236a;
        if (qnVar.T0 != null && qnVar.getParentActivity() != null) {
            Context context = qnVar.T0.getContext();
            b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
            d31.S(context, qnVar, false, b6Var, null);
        }
    }

    @Override
    public final void J(org.telegram.ui.Cells.t1 t1Var) {
        qn qnVar = this.f37236a;
        if (!qnVar.getMessagesController().showSensitiveContent()) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(qnVar.getParentActivity(), 3, null);
            c2Var.q(200L);
            qnVar.getMessagesController().getContentSettings(new a0(this, c2Var, t1Var, 5));
            return;
        }
        if (t1Var.getMessageObject() != null) {
            t1Var.getMessageObject().isSensitiveCached = Boolean.FALSE;
        }
        t1Var.h4();
    }

    @Override
    public final boolean K0(long j10) {
        qn qnVar = this.f37236a;
        TLRPC.Chat chat = qnVar.f41890e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return qnVar.getMessagesController().isOwner(qnVar.f41890e.f22380id, j10);
        }
        return false;
    }

    @Override
    public final void L1(org.telegram.ui.Cells.t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        oi oiVar;
        int i9;
        MessageObject messageObject = t1Var.getMessageObject();
        bg.c2 c2Var = null;
        if (messageExtendedMedia instanceof TLRPC.TL_messageExtendedMediaPreview) {
            qn qnVar = this.f37236a;
            ve.d dVar = qnVar.f42124wb;
            if (dVar != null) {
                dVar.a(true);
                qnVar.f42124wb = null;
            }
            if (t1Var.getMessageObject() == null) {
                qnVar.f42124wb = null;
                oiVar = null;
            } else {
                oiVar = new oi(qnVar, t1Var.getMessageObject().getId(), t1Var, 1);
                qnVar.f42124wb = oiVar;
            }
            i9 = ((org.telegram.ui.ActionBar.o2) this.f37236a).currentAccount;
            gh.v7 y10 = gh.v7.y(i9, false);
            Objects.requireNonNull(oiVar);
            ri riVar = new ri(oiVar, 7);
            Context context = LaunchActivity.C1;
            if (context == null) {
                context = ApplicationLoader.applicationContext;
            }
            org.telegram.ui.ActionBar.b6 I = gh.v7.I();
            if (messageObject != null && context != null) {
                long dialogId = messageObject.getDialogId();
                int id2 = messageObject.getId();
                TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = new TLRPC.TL_inputInvoiceMessage();
                tL_inputInvoiceMessage.peer = MessagesController.getInstance(y10.f9045a).getInputPeer(dialogId);
                tL_inputInvoiceMessage.msg_id = id2;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                JSONObject p6 = mh.c3.p(I, false);
                if (p6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = p6.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceMessage;
                c2Var = new bg.c2(y10, ConnectionsManager.getInstance(y10.f9045a).sendRequest(tL_payments_getPaymentForm, new fh.h1(y10, messageObject, tL_inputInvoiceMessage, riVar, 4)), 3);
            }
            if (c2Var != null) {
                oiVar.f48382b = c2Var;
                oiVar.d();
                return;
            }
            return;
        }
        TLRPC.Message message = messageObject.messageOwner;
        TLRPC.MessageMedia messageMedia = message.media;
        if (messageMedia instanceof TLRPC.TL_messageMediaPaidMedia) {
            TLRPC.TL_messageMediaPaidMedia tL_messageMediaPaidMedia = (TLRPC.TL_messageMediaPaidMedia) messageMedia;
            ArrayList arrayList = new ArrayList();
            int i10 = -1;
            for (int i11 = 0; i11 < tL_messageMediaPaidMedia.extended_media.size(); i11++) {
                TLRPC.MessageExtendedMedia messageExtendedMedia2 = tL_messageMediaPaidMedia.extended_media.get(i11);
                if (messageExtendedMedia2 instanceof TLRPC.TL_messageExtendedMedia) {
                    TLRPC.TL_messageExtendedMedia tL_messageExtendedMedia = (TLRPC.TL_messageExtendedMedia) messageExtendedMedia2;
                    if (tL_messageExtendedMedia == messageExtendedMedia) {
                        i10 = arrayList.size();
                    }
                    TLRPC.TL_message C7 = qn.C7(message);
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
            if (i10 > -1 && !arrayList.isEmpty()) {
                PhotoViewer t12 = PhotoViewer.t1();
                qn qnVar2 = this.f37236a;
                t12.K2(null, qnVar2, qnVar2.f41848aa);
                PhotoViewer.t1().a2(arrayList, i10, this.f37236a.a(), 0L, 0L, this.f37236a.Ca);
            }
        }
    }

    @Override
    public final void M(org.telegram.ui.Cells.t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        TLRPC.Message message;
        int i9;
        int i10;
        int i11;
        int dp;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && (message = messageObject.messageOwner) != null) {
            int i12 = buttonCustom.f19635id;
            TL_stars.StarsAmount starsAmount = null;
            qn qnVar = this.f37236a;
            if (i12 == 1) {
                long peerDialogId = DialogObject.getPeerDialogId(message.from_id);
                df dfVar = new df(10, this, message);
                Pattern pattern = org.telegram.ui.Components.y4.f34847a;
                Activity parentActivity = qnVar.getParentActivity();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity, 0, null);
                String string = LocaleController.getString(R.string.SuggestedMessageDecline);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.SuggestedMessageDeclineInfo, MessagesController.getInstance(UserConfig.selectedAccount).getPeerName(peerDialogId)));
                FrameLayout frameLayout = new FrameLayout(parentActivity);
                frameLayout.setClipChildren(false);
                EditText editText = new EditText(parentActivity);
                editText.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
                editText.setHint(LocaleController.getString(R.string.SuggestedMessageDeclineReasonHint));
                editText.setHintTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.H6, false));
                editText.setTextSize(1, 16.0f);
                editText.setBackground(org.telegram.ui.ActionBar.f6.S(parentActivity));
                editText.setMaxLines(4);
                editText.setRawInputType(147457);
                editText.setImeOptions(6);
                editText.setFilters(new InputFilter[]{new org.telegram.ui.Components.n4(parentActivity)});
                if (LocaleController.isRTL) {
                    i11 = AndroidUtilities.dp(24.0f);
                } else {
                    i11 = 0;
                }
                int dp2 = AndroidUtilities.dp(8.0f);
                if (LocaleController.isRTL) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(24.0f);
                }
                editText.setPadding(i11, dp2, dp, AndroidUtilities.dp(8.0f));
                editText.setSelection(editText.getText().toString().length());
                alertDialog$Builder.n(frameLayout);
                alertDialog$Builder.k(LocaleController.getString(R.string.Decline), new org.telegram.ui.Components.g1(1, dfVar, editText));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                c2Var.J = new org.telegram.ui.Components.o1(editText, 0);
                frameLayout.addView(editText, g7.e6.d(-1, -2.0f, 0, 23.0f, 0.0f, 23.0f, 21.0f));
                editText.requestFocus();
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.fg(editText, 3), 100L);
                qnVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                }
            } else if (i12 == 2) {
                if (message.suggested_post != null) {
                    i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    boolean canManageMonoForum = ChatObject.canManageMonoForum(i9, qnVar.f41890e);
                    if (canManageMonoForum) {
                        i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                        ChatObject.canUserDoChannelDirectAdminAction(i10, qnVar.f41890e, 5);
                    }
                    bg.d dVar = new bg.d(this, message, canManageMonoForum, messageObject, 9);
                    TLRPC.SuggestedPost suggestedPost = message.suggested_post;
                    if (suggestedPost != null) {
                        starsAmount = suggestedPost.price;
                    }
                    qnVar.g7(dVar, gf.a.l(starsAmount), !canManageMonoForum);
                }
            } else if (i12 == 3) {
                qnVar.I7(t1Var, true, false, t1Var.getLastTouchX(), t1Var.getLastTouchY(), true, false, true);
            } else if (i12 == 4) {
                qnVar.N1.m(messageObject.getTopicId(), true);
            }
        }
    }

    @Override
    public final void M0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        long j10;
        int i9;
        ArrayList<MessageObject> arrayList;
        e5.w wVar;
        MessageObject.GroupedMessages groupedMessages;
        int i10;
        qn qnVar = this.f37236a;
        ch.k kVar = qnVar.T9;
        if (kVar != null) {
            HashMap hashMap = kVar.f2488a;
            ch.j jVar = (ch.j) hashMap.get(ch.k.b(t1Var));
            org.telegram.ui.Components.gc gcVar = null;
            if (jVar != null) {
                messageObject = jVar.A;
            } else {
                messageObject = null;
            }
            ch.j jVar2 = (ch.j) qnVar.T9.f2488a.get(ch.k.b(t1Var));
            if (jVar2 != null && (i10 = jVar2.N) != -1) {
                j10 = jVar2.f2485w[i10].d;
            } else {
                j10 = 0;
            }
            if (messageObject != null && j10 != 0) {
                Activity parentActivity = qnVar.getParentActivity();
                i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                boolean z10 = false;
                if (!org.telegram.ui.Components.y4.h(parentActivity, i9, j10, false)) {
                    if (messageObject.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) qnVar.f42083t6.f(messageObject.getGroupId())) != null) {
                        arrayList = groupedMessages.messages;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.l0.k(messageObject);
                    }
                    if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                        z10 = true;
                    }
                    long j11 = j10;
                    e5.w wVar2 = new e5.w(this, arrayList, j11, 18);
                    if (z10) {
                        wVar2.run();
                        wVar = null;
                    } else {
                        wVar = wVar2;
                    }
                    gcVar = org.telegram.ui.Components.oc.v(qnVar.getParentActivity(), qnVar, null, 1, j11, 1, qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.Fi), qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.Hi), 5000, false, wVar);
                    gcVar.f28738k = true;
                    gcVar.k(gcVar.f28733e instanceof org.telegram.ui.Components.rb);
                }
            }
            ch.j jVar3 = (ch.j) hashMap.get(ch.k.b(t1Var));
            if (jVar3 != null) {
                if (gcVar == null) {
                    jVar3.N = -1;
                    jVar3.c();
                    return;
                }
                org.telegram.ui.Components.lb lbVar = gcVar.f28733e;
                if (!(lbVar instanceof org.telegram.ui.Components.ob)) {
                    jVar3.c();
                    return;
                }
                org.telegram.ui.Components.ob obVar = (org.telegram.ui.Components.ob) lbVar;
                jVar3.S = obVar;
                obVar.f31342a.setVisibility(4);
                ViewTreeObserver viewTreeObserver = jVar3.S.getViewTreeObserver();
                viewTreeObserver.addOnPreDrawListener(new ch.f(0, jVar3, viewTreeObserver));
            }
        }
    }

    @Override
    public final void M1(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i9;
        int i10;
        MessagesController.PeerColor peerColor;
        ImageLocation forDocument;
        String str2;
        int themedColor;
        boolean isEmpty = TextUtils.isEmpty(str);
        qn qnVar = this.f37236a;
        if (isEmpty) {
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            zf.k1 k1Var = new zf.k1(qnVar, i9, user, null, null, qnVar.f41848aa);
            t1Var.getLocationOnScreen(new int[2]);
            k1Var.f50583r0 = t1Var.getNameStatusX();
            k1Var.f50584s0 = t1Var.getNameStatusY();
            k1Var.f50587v0 = t1Var.getScaleX();
            k1Var.f50585t0 = t1Var.getLeft();
            k1Var.f50586u0 = t1Var.getTop();
            k1Var.f50588w0 = t1Var;
            int colorId = UserObject.getColorId(user);
            if (colorId >= 7) {
                i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                MessagesController.PeerColors peerColors = MessagesController.getInstance(i10).peerColors;
                Integer num = null;
                if (peerColors != null) {
                    peerColor = peerColors.getColor(colorId);
                } else {
                    peerColor = null;
                }
                if (peerColor != null) {
                    num = Integer.valueOf(peerColor.getColor1());
                }
                k1Var.f50582q0 = num;
            } else {
                k1Var.f50582q0 = Integer.valueOf(qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23250r8[colorId]));
            }
            org.telegram.ui.Components.i5 i5Var = t1Var.f25325bc;
            if (i5Var != null && (i5Var.f29319f[0] instanceof org.telegram.ui.Components.k5)) {
                k1Var.f50587v0 *= 0.95f;
                if (document != null) {
                    org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(qnVar.getParentActivity());
                    SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.f6.f23162m6, 0.2f);
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
                    o9Var.setLayerNum(7);
                    o9Var.setRoundRadius(AndroidUtilities.dp(4.0f));
                    o9Var.l(imageLocation, str3, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), "140_140", svgThumb, document);
                    if (MessageObject.isTextColorEmoji(document)) {
                        Integer num2 = k1Var.f50582q0;
                        if (num2 != null) {
                            themedColor = num2.intValue();
                        } else {
                            themedColor = qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23319v6);
                        }
                        o9Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
                        k1Var.f50590y0 = MessageObject.getInputStickerSet(document);
                    } else {
                        k1Var.f50590y0 = MessageObject.getInputStickerSet(document);
                    }
                    k1Var.f50589x0 = o9Var;
                    k1Var.A0 = true;
                }
            }
            qnVar.showDialog(k1Var);
            return;
        }
        ve.e.s(qnVar.getParentActivity(), "https://" + qnVar.getMessagesController().linkPrefix + "/nft/" + str);
    }

    @Override
    public final void N(org.telegram.ui.Cells.t1 t1Var) {
        qn qnVar = this.f37236a;
        qnVar.f42087ta.l(t1Var, qnVar, true);
        qnVar.f42077t0.I0(false);
    }

    @Override
    public final void O0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.WebPage webPage;
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory;
        TL_stories.StoryItem storyItem;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia2;
        String string;
        int i12;
        TLRPC.User user;
        int i13;
        TLRPC.WebPage webPage2;
        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway;
        final boolean z10;
        MessageObject messageObject = t1Var.getMessageObject();
        boolean z11 = false;
        vm vmVar = null;
        vm vmVar2 = null;
        File file = null;
        TLRPC.User user2 = null;
        vm vmVar3 = null;
        vm vmVar4 = null;
        qn qnVar = this.f37236a;
        if (i9 == 19) {
            ve.d dVar = qnVar.f42124wb;
            if (dVar != null) {
                dVar.a(true);
            }
            if (t1Var.getMessageObject() != null) {
                vmVar2 = new vm(this, t1Var, 2);
            }
            final vm vmVar5 = vmVar2;
            qnVar.f42124wb = vmVar5;
            final Activity parentActivity = qnVar.getParentActivity();
            final org.telegram.ui.ActionBar.b6 resourceProvider = qnVar.getResourceProvider();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            vmVar5.d();
            vmVar5.f48382b = new bg.n(atomicBoolean, 0);
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
            final String b10 = bg.u.b(messageObject);
            TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-messageObject.getFromChatId()));
            if (chat != null && ChatObject.isChannelAndNotMegaGroup(chat)) {
                z10 = true;
            } else {
                z10 = false;
            }
            final long j10 = messageObject.messageOwner.date * 1000;
            bg.u0.d(messageObject, new Utilities.Callback(atomicBoolean, vmVar5, z10, b10, j10, tL_messageMediaGiveaway2, parentActivity, resourceProvider) {
                public final AtomicBoolean f1892a;
                public final ve.d f1893b;
                public final boolean f1894c;
                public final String d;
                public final TLRPC.TL_messageMediaGiveaway f1895e;
                public final Context f1896f;
                public final b6 f1897g;

                {
                    this.f1895e = tL_messageMediaGiveaway2;
                    this.f1896f = parentActivity;
                    this.f1897g = resourceProvider;
                }

                @Override
                public final void run(Object obj) {
                    TLRPC.payments_GiveawayInfo payments_giveawayinfo = (TLRPC.payments_GiveawayInfo) obj;
                    if (!this.f1892a.get()) {
                        this.f1893b.b();
                        boolean z12 = payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfo;
                        boolean z13 = this.f1894c;
                        String str = this.d;
                        TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway3 = this.f1895e;
                        Context context = this.f1896f;
                        b6 b6Var = this.f1897g;
                        if (z12) {
                            u.d(z13, str, (TLRPC.TL_payments_giveawayInfo) payments_giveawayinfo, tL_messageMediaGiveaway3, context, b6Var);
                        } else if (payments_giveawayinfo instanceof TLRPC.TL_payments_giveawayInfoResults) {
                            u.e(z13, str, (TLRPC.TL_payments_giveawayInfoResults) payments_giveawayinfo, tL_messageMediaGiveaway3, context, b6Var);
                        }
                    }
                }
            }, new bg.p(atomicBoolean, vmVar5, 0));
        } else if (i9 == 21) {
            e();
        } else if (i9 == 84) {
            qnVar.ua(t1Var);
        } else if (i9 == 80) {
            ch.g gVar = org.telegram.ui.Components.ag0.K;
            if (qnVar.getParentActivity() != null) {
                qnVar.showDialog(new org.telegram.ui.Components.ag0(qnVar.getContext(), qnVar.getCurrentAccount(), messageObject, qnVar.getResourceProvider()));
            }
        } else if (i9 == 0) {
            TLRPC.MessageMedia messageMedia4 = messageObject.messageOwner.media;
            if (messageMedia4 != null && (webPage2 = messageMedia4.webpage) != null && webPage2.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.C1;
                if (launchActivity == null || launchActivity.P() == null || LaunchActivity.C1.P().l(messageObject) == null) {
                    qnVar.createArticleViewer(false).N(messageObject, null, null, null);
                }
            }
        } else if (i9 == 5) {
            long j11 = messageObject.messageOwner.media.user_id;
            if (j11 != 0) {
                i13 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                user = MessagesController.getInstance(i13).getUser(Long.valueOf(j11));
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
                bundle.putLong("user_id", user.f22527id);
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
                qnVar.showDialog(new org.telegram.ui.Components.wd0(qnVar, null, user, null, file, ne.b.d(str, false), str3, str4, qnVar.f41848aa));
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        } else if (i9 == 30) {
            qnVar.presentFragment(new qn(e2.c.g(messageObject.messageOwner.media.user_id, "user_id")));
        } else if (i9 == 31) {
            long j12 = messageObject.messageOwner.media.user_id;
            if (j12 != 0) {
                i12 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                user2 = MessagesController.getInstance(i12).getUser(Long.valueOf(j12));
            }
            if (user2 != null) {
                if (!TextUtils.isEmpty(messageObject.vCardData)) {
                    string = messageObject.vCardData.toString();
                } else if (!TextUtils.isEmpty(user2.phone)) {
                    string = org.telegram.messenger.ll.g(new StringBuilder("+"), user2.phone, ne.b.c());
                } else {
                    String str5 = MessageObject.getMedia(messageObject.messageOwner).phone_number;
                    if (!TextUtils.isEmpty(str5)) {
                        string = ne.b.c().b(str5);
                    } else {
                        string = LocaleController.getString(R.string.NumberUnknown);
                    }
                }
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", user2.f22527id);
                bundle2.putString("phone", string);
                bundle2.putBoolean("addContact", true);
                qnVar.presentFragment(new is(bundle2));
            }
        } else if (i9 != 23 && i9 != 24) {
            if (messageObject.isSponsored()) {
                qnVar.J9(messageObject, false, false);
                if (messageObject.sponsoredUrl != null) {
                    ve.d dVar2 = qnVar.f42124wb;
                    if (dVar2 != null) {
                        dVar2.a(true);
                    }
                    if (t1Var.getMessageObject() != null) {
                        vmVar3 = new vm(this, t1Var, 4);
                    }
                    qnVar.f42124wb = vmVar3;
                    ve.e.r(qnVar.getParentActivity(), Uri.parse(messageObject.sponsoredUrl), true, false, false, qnVar.f42124wb, null, false, qnVar.getMessagesController().sponsoredLinksInappAllow, false);
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
                    for (int i14 = 0; i14 < storyMentionWebpage.attributes.size(); i14++) {
                        if ((storyMentionWebpage.attributes.get(i14) instanceof TLRPC.TL_webPageAttributeStory) && (storyItem = (tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) storyMentionWebpage.attributes.get(i14)).storyItem) != null) {
                            storyItem.dialogId = DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer);
                            tL_webPageAttributeStory.storyItem.messageId = messageObject.getId();
                            tL_webPageAttributeStory.storyItem.messageType = 1;
                            qnVar.getOrCreateStoryViewer().F(qnVar.getParentActivity(), tL_webPageAttributeStory.storyItem, ih.e7.a(qnVar.f42077t0));
                            return;
                        }
                    }
                }
                if (!qnVar.ea(storyMentionWebpage.url, t1Var, null, messageObject.getId(), 2)) {
                    ve.d dVar3 = qnVar.f42124wb;
                    if (dVar3 != null) {
                        dVar3.a(true);
                    }
                    if (t1Var.getMessageObject() != null) {
                        vmVar4 = new vm(this, t1Var, 5);
                    }
                    qnVar.f42124wb = vmVar4;
                    ve.e.r(qnVar.getParentActivity(), Uri.parse(storyMentionWebpage.url), true, true, false, qnVar.f42124wb, null, false, true, false);
                }
            }
        } else {
            if (i9 == 24) {
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
                ve.d dVar4 = qnVar.f42124wb;
                if (dVar4 != null) {
                    dVar4.a(true);
                }
                if (t1Var.getMessageObject() != null) {
                    vmVar = new vm(this, t1Var, 3);
                }
                qnVar.f42124wb = vmVar;
                if (matcher.matches() && matcher.groupCount() > 1 && matcher.group(1) != null) {
                    String group = matcher.group(1);
                    i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    if (MediaDataController.getInstance(i10).getStickerSetByName(group) == null) {
                        qnVar.f42124wb.d();
                        TLRPC.TL_messages_getStickerSet tL_messages_getStickerSet = new TLRPC.TL_messages_getStickerSet();
                        TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
                        tL_inputStickerSetShortName.short_name = group;
                        tL_messages_getStickerSet.stickerset = tL_inputStickerSetShortName;
                        i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                        qnVar.f42124wb.f48382b = new bg.c2(this, ConnectionsManager.getInstance(i11).sendRequest(tL_messages_getStickerSet, new kh.o3(4, this, z11)), 25);
                        return;
                    }
                }
                ve.e.r(qnVar.getParentActivity(), Uri.parse(webPage.url), true, true, false, qnVar.f42124wb, null, false, true, false);
            }
        }
    }

    @Override
    public final boolean O1(org.telegram.ui.Cells.t1 r52, org.telegram.tgnet.TLRPC.PollAnswer r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.O1(org.telegram.ui.Cells.t1, org.telegram.tgnet.TLRPC$PollAnswer):boolean");
    }

    @Override
    public final void P(MessageObject.TextLayoutBlock textLayoutBlock) {
        StaticLayout staticLayout = textLayoutBlock.textLayout;
        if (staticLayout != null && staticLayout.getText() != null) {
            String charSequence = textLayoutBlock.textLayout.getText().toString();
            SpannableString spannableString = new SpannableString(charSequence);
            spannableString.setSpan(new CodeHighlighting.Span(false, 0, null, textLayoutBlock.language, charSequence), 0, spannableString.length(), 33);
            AndroidUtilities.addToClipboard(spannableString);
            org.telegram.messenger.ll.o(R.string.CodeCopied, org.telegram.ui.Components.oc.a0(this.f37236a));
        }
    }

    @Override
    public final nu0 P1() {
        return this.f37236a.f42074sa;
    }

    @Override
    public final void Q0(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        qn qnVar = this.f37236a;
        qnVar.getSendMessagesHelper().sendCallback(true, t1Var.getMessageObject(), keyboardInlineButton, qnVar);
    }

    @Override
    public final void R(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject.messageOwner.send_state != 0) {
            this.f37236a.getSendMessagesHelper().cancelSendingMessage(messageObject);
        }
    }

    @Override
    public final void R0(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, boolean z10) {
        this.f37236a.U7(characterStyle, z10, t1Var.getMessageObject(), t1Var);
    }

    @Override
    public final boolean R1(long j10) {
        qn qnVar = this.f37236a;
        TLRPC.Chat chat = qnVar.f41890e;
        if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            return qnVar.getMessagesController().isAdmin(qnVar.f41890e.f22380id, j10);
        }
        return false;
    }

    @Override
    public final void S(int i9, org.telegram.ui.Cells.t1 t1Var) {
        boolean z10 = t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveaway;
        qn qnVar = this.f37236a;
        if (z10) {
            long j10 = -((TLRPC.TL_messageMediaGiveaway) t1Var.getMessageObject().messageOwner.media).channels.get(i9).longValue();
            if (qnVar.P5 != j10) {
                qnVar.presentFragment(qn.R9(j10));
            } else {
                qnVar.W0.e(false, false);
            }
        }
        if (t1Var.getMessageObject().messageOwner.media instanceof TLRPC.TL_messageMediaGiveawayResults) {
            qnVar.presentFragment(ProfileActivity.m4(((TLRPC.TL_messageMediaGiveawayResults) t1Var.getMessageObject().messageOwner.media).winners.get(i9).longValue()));
        }
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
            qn qnVar = this.f37236a;
            if (!qnVar.fc && messageObject.getId() == qnVar.ec) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11 && System.currentTimeMillis() - qnVar.f41928gc > 1000) {
                    return true;
                }
            } else {
                return z11;
            }
        }
        return false;
    }

    @Override
    public final void S1(org.telegram.ui.Cells.t1 r22, int r23, float r24, float r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.S1(org.telegram.ui.Cells.t1, int, float, float, boolean):void");
    }

    @Override
    public final void U(MessageObject messageObject) {
        if (messageObject.isVideo()) {
            this.f37236a.fb(messageObject, true);
        }
    }

    @Override
    public final void U0(org.telegram.ui.Cells.t1 t1Var) {
        qn qnVar = this.f37236a;
        qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openBoostForUsersDialog, Long.valueOf(qnVar.P5), t1Var);
    }

    @Override
    public final boolean V(org.telegram.ui.Cells.t1 t1Var, TLRPC.TodoItem todoItem, boolean z10) {
        int i9;
        int i10;
        boolean isForwarded = t1Var.getMessageObject().isForwarded();
        qn qnVar = this.f37236a;
        if (isForwarded) {
            long peerDialogId = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(qnVar);
            int i11 = R.raw.passcode_lock_close;
            int i12 = R.string.TodoCompleteForbiddenForward;
            i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            a02.Q(i11, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i12, DialogObject.getName(i10, peerDialogId)))).k(true);
            return false;
        } else if (!t1Var.getMessageObject().canCompleteTodo()) {
            long peerDialogId2 = DialogObject.getPeerDialogId(t1Var.getMessageObject().getFromPeer());
            org.telegram.ui.Components.oc a03 = org.telegram.ui.Components.oc.a0(qnVar);
            int i13 = R.raw.passcode_lock_close;
            int i14 = R.string.TodoCompleteForbidden;
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            a03.Q(i13, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i14, DialogObject.getName(i9, peerDialogId2)))).k(true);
            return false;
        } else if (!qnVar.getUserConfig().isPremium()) {
            org.telegram.ui.Components.oc.a0(qnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.premiumText(LocaleController.getString(R.string.TodoPremiumRequired), new nm(this, 9))).k(true);
            return false;
        } else {
            qnVar.getSendMessagesHelper().toggleTodo(ChatObject.getSendAsPeerId(qnVar.f41890e, qnVar.V7, true), t1Var.getMessageObject(), todoItem, z10, null);
            return true;
        }
    }

    @Override
    public final boolean W() {
        qn qnVar = this.f37236a;
        if (qnVar.S5[1].size() + qnVar.S5[0].size() <= 0) {
            return false;
        }
        return true;
    }

    @Override
    public final void W0(org.telegram.ui.Cells.t1 t1Var) {
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
            qn qnVar = this.f37236a;
            if (currentMessagesGroup != null) {
                int size = currentMessagesGroup.posArray.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size) {
                        break;
                    } else if ((currentMessagesGroup.posArray.get(i9).flags & 1) != 0) {
                        MessageObject messageObject2 = currentMessagesGroup.messages.get(i9);
                        if (messageObject2 != messageObject) {
                            int childCount = qnVar.f42077t0.getChildCount();
                            for (int i10 = 0; i10 < childCount; i10++) {
                                View childAt = qnVar.f42077t0.getChildAt(i10);
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
                        i9++;
                    }
                }
            }
            qnVar.Jb(messageObject, spannableStringBuilder, 1);
            t1Var.g4(1, false, true);
        }
    }

    @Override
    public final boolean W1(org.telegram.ui.Cells.t1 r37, org.telegram.tgnet.TLRPC.TodoItem r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.W1(org.telegram.ui.Cells.t1, org.telegram.tgnet.TLRPC$TodoItem):boolean");
    }

    @Override
    public final boolean X(org.telegram.ui.Cells.t1 t1Var) {
        int i9;
        MessageObject messageObject;
        TLRPC.Message message;
        if (t1Var != null) {
            qn qnVar = this.f37236a;
            if (qnVar.getParentActivity() != null) {
                i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                if (MessagesController.getInstance(i9).richEditorAllowed() && (messageObject = t1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && message.rich_message != null) {
                    if (!messageObject.translated || message.translatedRichMessage == null) {
                        return messageObject.canEditMessage(qnVar.f41890e);
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
    public final boolean Y() {
        qn qnVar = this.f37236a;
        if (!UserObject.isReplyUser(qnVar.f41903f) && !UserObject.isUserSelf(qnVar.f41903f)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean Y0(int i9, org.telegram.ui.Cells.t1 t1Var) {
        qn qnVar = this.f37236a;
        if (qnVar.f42075sb != 0 && t1Var.getMessageObject() != null && qnVar.f42075sb == t1Var.getMessageObject().getId() && qnVar.f42088tb == i9) {
            return true;
        }
        return false;
    }

    @Override
    public final void Z(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, float f10, float f11, boolean z10) {
        org.telegram.ui.ActionBar.k kVar;
        MessageObject messageObject;
        if (chat == null) {
            return;
        }
        qn qnVar = this.f37236a;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (!kVar.s() && !qnVar.A9()) {
            if (!z10 && chat.signature_profiles && (messageObject = t1Var.getMessageObject()) != null && messageObject.getDialogId() != 1271266957) {
                qnVar.na(DialogObject.getPeerDialogId(messageObject.messageOwner.from_id));
                return;
            } else {
                k(t1Var, chat, i9, z10);
                return;
            }
        }
        qn.b2(qnVar, t1Var, true, f10, f11);
    }

    @Override
    public final boolean Z0(MessageObject messageObject) {
        bm bmVar;
        long dialogId = messageObject.getDialogId();
        qn qnVar = this.f37236a;
        if ((dialogId == 1271266957 || ((bmVar = qnVar.f42114w0) != null && bmVar.J)) && qnVar.N3 != 7) {
            return true;
        }
        return false;
    }

    @Override
    public final void a0(org.telegram.ui.Cells.t1 t1Var) {
        g(t1Var, true, true, false);
    }

    public final void b(TLRPC.Chat chat) {
        SpannableStringBuilder spannableStringBuilder;
        qn qnVar = this.f37236a;
        ak akVar = qnVar.U;
        if (akVar != null) {
            CharSequence fieldText = akVar.getFieldText();
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
                qnVar.U.setFieldText(spannableStringBuilder);
                AndroidUtilities.runOnUIThread(new nm(this, 6), 200L);
            }
        }
    }

    @Override
    public final int b0() {
        return this.f37236a.N3;
    }

    @Override
    public final void b2(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.Chat chat;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        qn qnVar = this.f37236a;
        if (AndroidUtilities.isContextSafe(qnVar.getParentActivity()) && (chat = qnVar.f41890e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
            d(t1Var, qnVar.getMessagesController().getParticipant(qnVar.f41890e.f22380id, currentUser.f22527id));
        }
    }

    public final void c(TLRPC.User user) {
        SpannableStringBuilder spannableStringBuilder;
        qn qnVar = this.f37236a;
        ak akVar = qnVar.U;
        if (akVar != null) {
            CharSequence fieldText = akVar.getFieldText();
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
                SpannableString spannableString = new SpannableString(ta.b.j(UserObject.getFirstName(user, false), " "));
                spannableString.setSpan(new org.telegram.ui.Components.s41("" + user.f22527id, 3, null), 0, spannableString.length(), 33);
                spannableStringBuilder.append((CharSequence) spannableString);
            }
            qnVar.U.setFieldText(spannableStringBuilder);
            AndroidUtilities.runOnUIThread(new nm(this, 7), 200L);
        }
    }

    public final void d(org.telegram.ui.Cells.t1 t1Var, TLObject tLObject) {
        TLRPC.Chat chat;
        boolean z10;
        String str;
        boolean z11;
        String str2;
        boolean z12;
        int i9;
        org.telegram.ui.ActionBar.b6 b6Var;
        TLRPC.User currentUser = t1Var.getCurrentUser();
        qn qnVar = this.f37236a;
        qnVar.getUserConfig().getCurrentUser();
        if (AndroidUtilities.isContextSafe(qnVar.getParentActivity()) && (chat = qnVar.f41890e) != null && currentUser != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
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
                i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
                org.telegram.ui.Components.iz0.b(parentActivity, i9, -qnVar.f41890e.f22380id, currentUser, str2, z15, z16, z12, b6Var);
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
            } else if (ChatObject.isChannel(qnVar.f41890e)) {
                TLRPC.TL_channels_getParticipant tL_channels_getParticipant = new TLRPC.TL_channels_getParticipant();
                qnVar.getMessagesController();
                tL_channels_getParticipant.channel = MessagesController.getInputChannel(qnVar.f41890e);
                tL_channels_getParticipant.participant = qnVar.getMessagesController().getInputPeer(currentUser.f22527id);
                qnVar.getConnectionsManager().sendRequestTyped(tL_channels_getParticipant, new Object(), new bg.y0(13, this, t1Var));
                return;
            } else {
                return;
            }
            z12 = z10;
            str2 = str;
            boolean z152 = z13;
            boolean z162 = z14;
            Activity parentActivity2 = qnVar.getParentActivity();
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
            b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
            org.telegram.ui.Components.iz0.b(parentActivity2, i9, -qnVar.f41890e.f22380id, currentUser, str2, z152, z162, z12, b6Var);
        }
    }

    @Override
    public final pg.a d0() {
        return this.f37236a.Mb;
    }

    @Override
    public final void d1() {
        qn qnVar = this.f37236a;
        qnVar.Q7();
        UndoView undoView = qnVar.f42093u3;
        if (undoView == null) {
            return;
        }
        undoView.j(47, qnVar.P5, null);
    }

    public final void e() {
        if (ApplicationLoader.isStandaloneBuild()) {
            LaunchActivity launchActivity = LaunchActivity.C1;
            if (launchActivity != null) {
                launchActivity.z(true);
                return;
            }
            return;
        }
        boolean isHuaweiStoreApp = BuildVars.isHuaweiStoreApp();
        qn qnVar = this.f37236a;
        if (isHuaweiStoreApp) {
            ve.e.s(qnVar.getParentActivity(), BuildVars.HUAWEI_STORE_URL);
        } else {
            ve.e.s(qnVar.getParentActivity(), BuildVars.PLAYSTORE_APP_URL);
        }
    }

    @Override
    public final boolean e0(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        if (t1Var == null) {
            messageObject = null;
        } else {
            messageObject = t1Var.getMessageObject();
        }
        if (messageObject != null && messageObject.messageOwner != null) {
            qn qnVar = this.f37236a;
            if (qnVar.N3 != 1 && !qnVar.y9() && !messageObject.messageOwner.noforwards && messageObject.type != 29) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void e1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        String str;
        qn qnVar = this.f37236a;
        if (!qnVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            if (qnVar.getParentActivity() != null) {
                if (qnVar.K0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_buttonTypeRequestPeer.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class)) {
                    ak akVar = qnVar.U;
                    MessageObject messageObject = t1Var.getMessageObject();
                    MessageObject messageObject2 = t1Var.getMessageObject();
                    ni niVar = null;
                    if (tL_inlineButtonTypeUrl != null) {
                        str = tL_inlineButtonTypeUrl.url;
                    } else {
                        str = null;
                    }
                    ve.d dVar = qnVar.f42124wb;
                    if (dVar != null) {
                        dVar.a(true);
                        qnVar.f42124wb = null;
                    }
                    if (str != null && t1Var.getMessageObject() != null) {
                        ni niVar2 = new ni(qnVar, t1Var.getMessageObject().getId(), str, t1Var, 1);
                        qnVar.f42124wb = niVar2;
                        niVar = niVar2;
                    } else {
                        qnVar.f42124wb = null;
                    }
                    akVar.b0(keyboardButtonProto, messageObject, messageObject2, niVar);
                }
            }
        }
    }

    @Override
    public final void e2(org.telegram.ui.Cells.t1 t1Var, long j10) {
        Bundle g10 = e2.c.g(j10, "user_id");
        org.telegram.ui.ActionBar.o2 o2Var = this.f37236a;
        if (o2Var.getMessagesController().checkCanOpenChat(g10, o2Var, t1Var.getMessageObject())) {
            o2Var.presentFragment(new qn(g10));
        }
    }

    @Override
    public final boolean f() {
        org.telegram.ui.ActionBar.k kVar;
        org.telegram.ui.ActionBar.k kVar2;
        boolean z10;
        qn qnVar = this.f37236a;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        if (kVar != null) {
            kVar2 = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
            if (!kVar2.s() && !qnVar.A9()) {
                z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
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
    public final boolean f0(org.telegram.ui.Cells.t1 t1Var, final TLRPC.User user) {
        ?? r22;
        ?? r42;
        int i9;
        w4 b10;
        int i10;
        fk fkVar;
        ek ekVar;
        if (!j()) {
            return false;
        }
        qn qnVar = this.f37236a;
        if (qnVar.f41890e != null && (((fkVar = qnVar.K0) == null || fkVar.getVisibility() != 0) && ((ekVar = qnVar.N) == null || ekVar.getVisibility() != 0))) {
            r22 = 1;
        } else {
            r22 = 0;
        }
        TLRPC.Chat chat = qnVar.f41890e;
        if (chat != null && ((qnVar.Z3 == 0 || qnVar.f41882d4) && (!ChatObject.isChannel(chat) || qnVar.f41890e.megagroup))) {
            r42 = 1;
        } else {
            r42 = 0;
        }
        c5[] c5VarArr = new c5[r22 + 2 + r42];
        c5VarArr[0] = c5.d;
        c5VarArr[1] = c5.h;
        char c10 = 2;
        if (r22 != 0) {
            c5VarArr[2] = c5.f37064n;
            c10 = 3;
        }
        if (r42 != 0) {
            c5VarArr[c10] = c5.f37065r;
        }
        TLRPC.UserFull userFull = qnVar.getMessagesController().getUserFull(user.f22527id);
        if (userFull == null) {
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            b10 = w4.b(user, i9, c5VarArr);
        } else {
            b10 = w4.c(user, userFull, c5VarArr);
            if (!com.google.firebase.messaging.l.e(b10)) {
                i10 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
                b10 = w4.b(user, i10, c5VarArr);
            }
        }
        if (com.google.firebase.messaging.l.e(b10)) {
            com.google.firebase.messaging.l.i().s((ViewGroup) qnVar.fragmentView, qnVar.f41848aa, b10, new a7(this, t1Var, user, 6));
            return true;
        }
        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(qnVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new Runnable(this) {
            public final cn f41561b;

            {
                this.f41561b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f41561b.p(user, false);
                        return;
                    case 1:
                        this.f41561b.c(user);
                        return;
                    default:
                        this.f41561b.f37236a.ma(user);
                        return;
                }
            }
        }, false);
        H.c(R.drawable.msg_discussion, LocaleController.getString(R.string.SendMessage), new t1(this, t1Var, user, 25), false);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new Runnable(this) {
            public final cn f41561b;

            {
                this.f41561b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f41561b.p(user, false);
                        return;
                    case 1:
                        this.f41561b.c(user);
                        return;
                    default:
                        this.f41561b.f37236a.ma(user);
                        return;
                }
            }
        }, r22);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new Runnable(this) {
            public final cn f41561b;

            {
                this.f41561b = this;
            }

            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        this.f41561b.p(user, false);
                        return;
                    case 1:
                        this.f41561b.c(user);
                        return;
                    default:
                        this.f41561b.f37236a.ma(user);
                        return;
                }
            }
        }, r42);
        H.f34581t = false;
        H.f34562i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final boolean f2(org.telegram.ui.Cells.t1 t1Var, TL_iv.PageBlock pageBlock) {
        MessageObject messageObject;
        TLRPC.Message message;
        TL_iv.RichMessage richMessage;
        if (t1Var != null && pageBlock != null) {
            qn qnVar = this.f37236a;
            if (qnVar.getParentActivity() != null && (messageObject = t1Var.getMessageObject()) != null && (message = messageObject.messageOwner) != null && messageObject.richLayout != null && (richMessage = message.rich_message) != null) {
                ArrayList arrayList = new ArrayList();
                messageObject.richLayout.collectMediaBlocks(arrayList);
                int indexOf = arrayList.indexOf(pageBlock);
                if (indexOf >= 0) {
                    PhotoViewer t12 = PhotoViewer.t1();
                    t12.K2(null, qnVar, null);
                    return t12.e2(null, null, null, null, null, null, null, indexOf, new lm(qnVar, arrayList), null, 0L, 0L, 0L, true, new km(richMessage, arrayList, messageObject), null);
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void g(org.telegram.ui.Cells.t1 t1Var, boolean z10, boolean z11, boolean z12) {
        MessageObject primaryMessageObject;
        int i9;
        int i10;
        lj ljVar;
        if (t1Var == null || (primaryMessageObject = t1Var.getPrimaryMessageObject()) == null) {
            return;
        }
        primaryMessageObject.forceUpdate = true;
        qn qnVar = this.f37236a;
        ij ijVar = qnVar.f42077t0;
        if (ijVar != null && (ljVar = qnVar.f42103v0) != null && ljVar.f5441y < 0) {
            for (int childCount = ijVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = qnVar.f42077t0.getChildAt(childCount);
                qnVar.f42077t0.getClass();
                i9 = RecyclerView.R(childAt);
                if (i9 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = qnVar.L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        i10 = qnVar.L8(childAt);
                        break;
                    }
                }
            }
        }
        i9 = -1;
        i10 = 0;
        if (z10 && i9 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
            if (z12) {
                lj ljVar2 = qnVar.f42103v0;
                qnVar.f42077t0.getClass();
                ljVar2.i1(RecyclerView.R(t1Var), t1Var.getTop() - ((int) qnVar.o9), false);
            } else {
                qnVar.f42103v0.h1(i9, i10);
            }
        }
        qnVar.J0 = z11;
        qnVar.rc(primaryMessageObject, false);
        qnVar.J0 = false;
    }

    @Override
    public final void g1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Document document) {
        if (t1Var != null && document != null) {
            qn qnVar = this.f37236a;
            if (qnVar.getParentLayout() != null && e0(t1Var)) {
                org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(qnVar, t1Var);
                H.c(R.drawable.msg_download, LocaleController.getString(R.string.SaveToDownloads), new t1(this, t1Var, document, 24), false);
                H.f34581t = false;
                H.Z();
            }
        }
    }

    @Override
    public final void g2(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject == null) {
            return;
        }
        this.f37236a.rc(primaryMessageObject, false);
    }

    @Override
    public final boolean h() {
        return false;
    }

    @Override
    public final String i(org.telegram.ui.Cells.t1 t1Var) {
        qn qnVar;
        int i9;
        if (t1Var.getMessageObject() != null && (i9 = (qnVar = this.f37236a).f42075sb) != 0 && i9 == t1Var.getMessageObject().getId() && qnVar.f42088tb == 3) {
            return qnVar.vb;
        }
        return null;
    }

    @Override
    public final void i0(int i9) {
        CharSequence replaceSingleTag;
        int i10;
        SpannableStringBuilder replaceTags;
        int i11;
        qn qnVar = this.f37236a;
        try {
            if (i9 == 0) {
                qnVar.h7();
                xk xkVar = qnVar.f42106v3;
                if (xkVar != null) {
                    xkVar.l(0L, 84, null, new nm(this, 1));
                    qnVar.f42106v3.performHapticFeedback(3, 2);
                }
            } else if (i9 == 1) {
                String formatDateTime = LocaleController.formatDateTime(qnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                if (qnVar.getMessagesController().transcribeAudioTrialCooldownUntil > 0) {
                    i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeftUntil", org.telegram.ui.Components.i21.h(i11), formatDateTime));
                } else {
                    i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialLeft", org.telegram.ui.Components.i21.h(i10), new Object[0]));
                }
                org.telegram.ui.Components.oc.a0(qnVar).G(R.raw.transcribe, 6, replaceTags).k(true);
                qnVar.fragmentView.performHapticFeedback(3, 2);
            } else if (i9 == 2 || i9 == 3) {
                String formatDateTime2 = LocaleController.formatDateTime(qnVar.getMessagesController().transcribeAudioTrialCooldownUntil, true);
                org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(qnVar);
                int i12 = R.raw.transcribe;
                SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) AndroidUtilities.replaceTags(LocaleController.formatPluralString("TranscriptionTrialEnd", qnVar.getMessagesController().transcribeAudioTrialWeeklyNumber, new Object[0]))).append((CharSequence) " ");
                if (i9 == 2) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.TranscriptionTrialEndBuy), new nm(this, 2));
                } else if (qnVar.getMessagesController().transcribeAudioTrialCooldownUntil <= 0) {
                    replaceSingleTag = "";
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.TranscriptionTrialEndWaitOrBuy, formatDateTime2), new nm(this, 3));
                }
                SpannableStringBuilder append2 = append.append(replaceSingleTag);
                a02.getClass();
                org.telegram.ui.Components.ob obVar = new org.telegram.ui.Components.ob(a02.W(), a02.f31357c);
                obVar.c(i12, 36, 36, new String[0]);
                if (append2 != null) {
                    String charSequence = append2.toString();
                    int i13 = 0;
                    for (int indexOf = charSequence.indexOf(10); indexOf >= 0 && indexOf < append2.length(); indexOf = charSequence.indexOf(10, indexOf + 1)) {
                        if (i13 >= 6) {
                            append2.replace(indexOf, indexOf + 1, (CharSequence) " ");
                        }
                        i13++;
                    }
                }
                obVar.f31343b.setText(append2);
                obVar.f31343b.setSingleLine(false);
                obVar.f31343b.setMaxLines(6);
                a02.b(obVar, 7000).k(true);
                BotWebViewVibrationEffect.APP_ERROR.vibrate();
            }
        } catch (Exception unused) {
        }
    }

    public final boolean j() {
        qn qnVar = this.f37236a;
        if (!UserObject.isUserSelf(qnVar.f41903f)) {
            TLRPC.Chat chat = qnVar.f41890e;
            if (chat != null) {
                if (ChatObject.isChannel(chat) && !qnVar.f41890e.megagroup) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override
    public final boolean j0() {
        if (this.f37236a.N3 == 0) {
            return true;
        }
        return false;
    }

    public final void k(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat, int i9, boolean z10) {
        qn qnVar = this.f37236a;
        TLRPC.Chat chat2 = qnVar.f41890e;
        if (chat2 != null && chat.f22380id == chat2.f22380id) {
            dj djVar = qnVar.W0;
            if (djVar != null && i9 == 0) {
                djVar.e(false, false);
            } else if (t1Var.getMessageObject() != null) {
                qnVar.j(i9, t1Var.getMessageObject().getId(), true, 0, false, 0);
            }
        } else if (chat2 == null || chat.f22380id != chat2.f22380id || qnVar.F9()) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22380id);
            if (i9 != 0) {
                bundle.putInt("message_id", i9);
            }
            oi oiVar = null;
            if (z10) {
                ve.d dVar = qnVar.f42124wb;
                if (dVar != null) {
                    dVar.a(true);
                    qnVar.f42124wb = null;
                }
                if (t1Var.getMessageObject() == null) {
                    qnVar.f42124wb = null;
                } else {
                    oi oiVar2 = new oi(qnVar, t1Var.getMessageObject().getId(), t1Var, 0);
                    qnVar.f42124wb = oiVar2;
                    oiVar = oiVar2;
                }
            }
            if (qnVar.getMessagesController().checkCanOpenChat(bundle, qnVar, t1Var.getMessageObject(), oiVar)) {
                qn qnVar2 = new qn(bundle);
                if (oiVar != null && i9 != 0) {
                    AndroidUtilities.runOnUIThread(new fh.g1(this, oiVar, chat, i9, qnVar2, 16), 5000L);
                    oiVar.d();
                    return;
                }
                qnVar.presentFragment(qnVar2);
            }
        }
    }

    @Override
    public final void k0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        this.f37236a.I7(t1Var, true, false, f10, f11, false, false, false);
    }

    @Override
    public final void k2() {
        this.f37236a.r9();
    }

    @Override
    public final void l(org.telegram.ui.Cells.t1 t1Var, ArrayList arrayList, int i9, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null) {
            int a2 = yg.i.a(messageObject);
            boolean a3 = g7.z7.a(a2, 7);
            qn qnVar = this.f37236a;
            if (a3) {
                org.telegram.ui.Components.oc.a0(qnVar).Q(R.raw.e_hand_2, 36, yg.i.b(messageObject, a2)).j();
            } else if (i9 < 0 && !arrayList.isEmpty()) {
                qnVar.getSendMessagesHelper().sendVote(messageObject, arrayList, null);
                t1Var.S0(true);
            } else if (qnVar.getParentActivity() != null) {
                if (qnVar.f41956j2 == null) {
                    org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(5, qnVar.getParentActivity(), qnVar.f41848aa, false);
                    qnVar.f41956j2 = s30Var;
                    s30Var.setAlpha(0.0f);
                    qnVar.f41956j2.setVisibility(4);
                    int indexOfChild = qnVar.T0.indexOfChild(qnVar.O);
                    if (indexOfChild == -1) {
                        return;
                    }
                    qnVar.T0.addView(qnVar.f41956j2, indexOfChild + 1, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                }
                if (arrayList.isEmpty() && i9 < 0) {
                    ArrayList<org.telegram.ui.Cells.r1> pollButtons = t1Var.getPollButtons();
                    int size = pollButtons.size();
                    int i15 = 0;
                    float f10 = 0.0f;
                    while (true) {
                        if (i15 < size) {
                            org.telegram.ui.Cells.r1 r1Var = pollButtons.get(i15);
                            float y10 = ((t1Var.getY() + r1Var.f24932b) - AndroidUtilities.dp(4.0f)) - qnVar.o9;
                            qnVar.f41991m2 = AndroidUtilities.dp(13.3f) + r1Var.f24931a;
                            int D = org.telegram.messenger.ll.D(6.0f, r1Var.f24932b, i11);
                            qnVar.f42004n2 = D;
                            if (y10 > 0.0f) {
                                i14 = qnVar.f41991m2;
                                i12 = D;
                                f10 = 0.0f;
                                break;
                            }
                            i15++;
                            f10 = y10;
                        } else {
                            i12 = i11;
                            i14 = i10;
                            break;
                        }
                    }
                    if (f10 != 0.0f) {
                        qnVar.f42077t0.v0(0, (int) f10, null);
                        qnVar.f41979l2 = t1Var;
                        return;
                    }
                    i13 = i14;
                } else {
                    i12 = i11;
                    i13 = i10;
                }
                qnVar.f41956j2.e(t1Var, Integer.valueOf(i9), i13, i12, true);
            }
        }
    }

    @Override
    public final int l0(org.telegram.ui.Cells.t1 t1Var) {
        yg.c cVar;
        qn qnVar = this.f37236a;
        if (qnVar.f42076sc.f47776f && (cVar = qnVar.yc) != null && cVar.f50213n == t1Var && cVar.f50208a.getWidth() > 0) {
            return qnVar.yc.f50208a.getHeight();
        }
        return 0;
    }

    @Override
    public final void l1(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        ch.j jVar;
        int i9;
        boolean z10;
        boolean z11;
        float f12;
        ch.k kVar = this.f37236a.T9;
        if (kVar != null && (jVar = (ch.j) kVar.f2488a.get(ch.k.b(t1Var))) != null) {
            ch.d[] dVarArr = jVar.f2485w;
            RectF rectF = jVar.f2483r;
            if (jVar.I) {
                float f13 = (f10 - rectF.left) + jVar.Q;
                float f14 = (f11 - rectF.top) + jVar.R;
                int i10 = ch.i.f2473a;
                int floor = (int) Math.floor((f13 - (AndroidUtilities.dp(9) - (AndroidUtilities.dp(11) / 2.0f))) / AndroidUtilities.dp(ch.i.f2473a + 11));
                if ((-AndroidUtilities.dp(37)) < f14 && f14 < rectF.height()) {
                    i9 = g7.n.b(floor, 0, dVarArr.length - 1);
                } else {
                    i9 = -1;
                }
                if (jVar.N != i9) {
                    jVar.f2477a.performHapticFeedback(3, 1);
                    jVar.N = i9;
                    for (int i11 = 0; i11 < dVarArr.length; i11++) {
                        ch.d dVar = dVarArr[i11];
                        if (i9 == i11) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        float f15 = 1.0f;
                        if (dVar.f2447p != z10) {
                            ValueAnimator valueAnimator = dVar.f2445n;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            dVar.f2447p = z10;
                            float f16 = dVar.f2446o;
                            if (z10) {
                                f12 = 1.0f;
                            } else {
                                f12 = 0.0f;
                            }
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(f16, f12);
                            dVar.f2445n = ofFloat;
                            ofFloat.setDuration(180L);
                            dVar.f2445n.addUpdateListener(dVar);
                            dVar.f2445n.setInterpolator(ch.h.f2455a);
                            dVar.f2445n.start();
                        }
                        ch.d dVar2 = dVarArr[i11];
                        if (i9 != i11 && i9 != -1) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (dVar2.f2444m != z11) {
                            ValueAnimator valueAnimator2 = dVar2.f2442k;
                            if (valueAnimator2 != null) {
                                valueAnimator2.cancel();
                            }
                            dVar2.f2444m = z11;
                            float f17 = dVar2.f2443l;
                            if (!z11) {
                                f15 = 0.0f;
                            }
                            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(f17, f15);
                            dVar2.f2442k = ofFloat2;
                            ofFloat2.setDuration(180L);
                            dVar2.f2442k.addUpdateListener(dVar2);
                            dVar2.f2442k.setInterpolator(ch.h.f2455a);
                            dVar2.f2442k.start();
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void l2(org.telegram.ui.Cells.t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
        this.f37236a.W7(t1Var, reactionCount, z10, f10, f11);
    }

    @Override
    public final void m() {
        e();
    }

    @Override
    public final void m0(org.telegram.ui.Cells.t1 t1Var) {
        TLRPC.TL_chatAdminRights tL_chatAdminRights;
        qn qnVar = this.f37236a;
        if (qnVar.getParentActivity() != null) {
            if (qnVar.T9 == null) {
                ch.k kVar = new ch.k(qnVar.getParentActivity());
                qnVar.T9 = kVar;
                qnVar.T0.addView(kVar, g7.e6.e(-1, -1, 48));
            }
            ch.k kVar2 = qnVar.T9;
            HashMap hashMap = kVar2.f2488a;
            ArrayList arrayList = kVar2.f2490c;
            arrayList.clear();
            int i9 = kVar2.d;
            UserConfig userConfig = UserConfig.getInstance(i9);
            long j10 = userConfig.clientUserId;
            arrayList.add(Long.valueOf(j10));
            if (userConfig.suggestContacts) {
                ArrayList<TLRPC.TL_topPeer> arrayList2 = MediaDataController.getInstance(i9).hints;
                int size = arrayList2.size();
                int i10 = 0;
                while (i10 < size) {
                    TLRPC.TL_topPeer tL_topPeer = arrayList2.get(i10);
                    i10++;
                    TLRPC.TL_topPeer tL_topPeer2 = tL_topPeer;
                    long j11 = tL_topPeer2.peer.user_id;
                    if (j11 != 0) {
                        int i11 = size;
                        if (MessagesController.getInstance(i9).getUser(Long.valueOf(tL_topPeer2.peer.user_id)) != null) {
                            arrayList.add(Long.valueOf(j11));
                        }
                        size = i11;
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList();
            ArrayList<TLRPC.Dialog> allDialogs = MessagesController.getInstance(i9).getAllDialogs();
            for (int i12 = 0; i12 < allDialogs.size(); i12++) {
                TLRPC.Dialog dialog = allDialogs.get(i12);
                if (dialog instanceof TLRPC.TL_dialog) {
                    long j12 = dialog.f22384id;
                    if (j12 != j10 && !DialogObject.isEncryptedDialog(j12)) {
                        if (DialogObject.isUserDialog(dialog.f22384id)) {
                            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(dialog.f22384id));
                            if (user != null && !UserObject.isBot(user) && !UserObject.isDeleted(user) && !UserObject.isService(user.f22527id)) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f22384id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f22384id));
                                }
                            }
                        } else {
                            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-dialog.f22384id));
                            if (chat != null && !chat.forum && !ChatObject.isNotInChat(chat) && ((!chat.gigagroup || ChatObject.hasAdminRights(chat)) && (!ChatObject.isChannel(chat) || chat.creator || (((tL_chatAdminRights = chat.admin_rights) != null && tL_chatAdminRights.post_messages) || chat.megagroup)))) {
                                if (dialog.folder_id == 1) {
                                    arrayList3.add(Long.valueOf(dialog.f22384id));
                                } else {
                                    arrayList.add(Long.valueOf(dialog.f22384id));
                                }
                            }
                        }
                    }
                }
            }
            arrayList.addAll(arrayList3);
            String b10 = ch.k.b(t1Var);
            if (b10 != null) {
                HashSet hashSet = new HashSet();
                ArrayList arrayList4 = new ArrayList();
                int size2 = arrayList.size();
                int i13 = 0;
                while (i13 < size2) {
                    Object obj = arrayList.get(i13);
                    i13++;
                    Long l10 = (Long) obj;
                    if (hashSet.add(l10) && DialogObject.isUserDialog(l10.longValue())) {
                        arrayList4.add(l10);
                    }
                }
                ch.j jVar = new ch.j(kVar2, t1Var, arrayList4, new a1.e(21, kVar2, b10));
                jVar.setBounds(0, 0, kVar2.getMeasuredWidth(), kVar2.getMeasuredHeight());
                jVar.setCallback(kVar2);
                if (!hashMap.containsKey(b10)) {
                    hashMap.put(b10, jVar);
                }
            }
        }
    }

    public final void n(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user) {
        if (user != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22527id);
            org.telegram.ui.ActionBar.o2 o2Var = this.f37236a;
            if (o2Var.getMessagesController().checkCanOpenChat(bundle, o2Var, t1Var.getMessageObject())) {
                o2Var.presentFragment(new qn(bundle));
            }
        }
    }

    @Override
    public final boolean n2(int i9) {
        boolean z10;
        org.telegram.ui.ActionBar.b5 b5Var;
        org.telegram.ui.ActionBar.b5 b5Var2;
        if (i9 != 16 && i9 != R.id.acc_action_small_button && i9 != R.id.acc_action_msg_options) {
            return false;
        }
        qn qnVar = this.f37236a;
        z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
        if (z10 && qnVar.F9) {
            b5Var = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
            if (b5Var != null) {
                b5Var2 = ((org.telegram.ui.ActionBar.o2) qnVar).parentLayout;
                ((ActionBarLayout) b5Var2).r();
            }
            return true;
        }
        return !f();
    }

    public final void o(TLRPC.Chat chat) {
        if (chat != null) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.f22380id);
            bundle.putBoolean("expandPhoto", false);
            this.f37236a.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    @Override
    public final boolean o0() {
        boolean z10;
        qn qnVar = this.f37236a;
        if (!qnVar.A9()) {
            z10 = ((org.telegram.ui.ActionBar.o2) qnVar).inPreviewMode;
            if (!z10) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void o2() {
        qn qnVar = this.f37236a;
        if (qnVar.getUserConfig().isPremium()) {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", qnVar.P5);
            bundle.putInt("start_from", 10);
            qnVar.presentFragment(new org.telegram.ui.Components.k90(bundle, qnVar.W0.getSharedMediaPreloader()));
            return;
        }
        org.telegram.ui.Components.oc.a0(qnVar).Q(R.raw.star_premium_2, 36, AndroidUtilities.replaceSingleTag(LocaleController.formatPluralStringComma("UnlockSimilarChannelsPremium", qnVar.getMessagesController().recommendedChannelsLimitPremium), new nm(this, 4))).j();
    }

    public final void p(TLRPC.User user, boolean z10) {
        int i9;
        if (user != null && user.f22527id != 489000) {
            TLRPC.UserProfilePhoto userProfilePhoto = user.photo;
            int i10 = 0;
            z10 = (userProfilePhoto == null || (userProfilePhoto instanceof TLRPC.TL_userProfilePhotoEmpty)) ? false : false;
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22527id);
            bundle.putBoolean("expandPhoto", z10);
            ProfileActivity profileActivity = new ProfileActivity(bundle, null);
            qn qnVar = this.f37236a;
            TLRPC.User user2 = qnVar.f41903f;
            if (user2 != null && user2.f22527id == user.f22527id) {
                i10 = 1;
            }
            profileActivity.N4(i10);
            Activity parentActivity = qnVar.getParentActivity();
            i9 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            AndroidUtilities.setAdjustResizeToNothing(parentActivity, i9);
            qnVar.presentFragment(profileActivity);
        }
    }

    @Override
    public final void p2(org.telegram.ui.Cells.t1 t1Var, int i9, int i10) {
        MessageObject messageObject;
        TLRPC.TL_factCheck factCheck;
        String str;
        qn qnVar = this.f37236a;
        kh.x3 x3Var = qnVar.f42115w1;
        if (x3Var != null) {
            x3Var.e(true);
        }
        if (qnVar.getParentActivity() != null && (messageObject = t1Var.getMessageObject()) != null && (factCheck = messageObject.getFactCheck()) != null && factCheck.country != null) {
            try {
                str = new Locale("", factCheck.country).getDisplayCountry(LocaleController.getInstance().getCurrentLocale());
            } catch (Exception e10) {
                FileLog.e(e10);
                str = factCheck.country;
            }
            kh.x3 x3Var2 = new kh.x3(qnVar.getParentActivity(), 3);
            x3Var2.q(true);
            x3Var2.G = Layout.Alignment.ALIGN_NORMAL;
            x3Var2.d = -1L;
            x3Var2.P = true;
            x3Var2.f16347e = true;
            x3Var2.r(12.0f);
            qnVar.f42115w1 = x3Var2;
            x3Var2.f16352h0 = new rd(18, this, x3Var2);
            x3Var2.t(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FactCheckToast, str)));
            qnVar.T0.addView(qnVar.f42115w1, g7.e6.d(-1, 520.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
            qnVar.T0.post(new h3.e0(this, t1Var, i10, i9, 4));
        }
    }

    @Override
    public final void q(org.telegram.ui.Cells.t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i9) {
        int i10;
        TLRPC.Document document;
        int i11;
        TLRPC.PollResults pollResults;
        TLRPC.MessageMedia messageMedia2;
        TLRPC.Document document2;
        int i12;
        TLRPC.Document document3;
        int i13;
        int i14;
        int i15;
        long j10;
        long j11;
        int i16;
        boolean z10;
        boolean z11;
        int i17;
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        MessageObject messageObject = t1Var.getMessageObject();
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if (messageMedia != null && messageObject != null && (media instanceof TLRPC.TL_messageMediaPoll)) {
            TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) media;
            TLRPC.WebPage webPage = messageMedia.webpage;
            if (webPage != null) {
                D1(t1Var, webPage, webPage.url, messageMedia.safe);
                return;
            }
            TLRPC.GeoPoint geoPoint = messageMedia.geo;
            qn qnVar = this.f37236a;
            if (geoPoint != null) {
                if (AndroidUtilities.isMapsInstalled(qnVar)) {
                    pc0 pc0Var = new pc0(3);
                    b6Var2 = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
                    pc0Var.setResourceProvider(b6Var2);
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
                    pc0Var.K0 = false;
                    pc0Var.t0(new MessageObject(UserConfig.selectedAccount, tL_message, false, false));
                    qnVar.presentFragment(pc0Var);
                }
            } else if (MessageObject.isAnyKindOfStickerOrEmoji(messageMedia.document)) {
                ht.q().w(qnVar.getParentActivity());
                ht.q().v(new an(this, tL_messageMediaPoll, pollAnswer, t1Var));
                ht q10 = ht.q();
                TLRPC.Document document4 = messageMedia.document;
                if (MessageObject.isAnimatedEmoji(document4)) {
                    i17 = 2;
                } else {
                    i17 = 0;
                }
                MessageObject messageObject2 = t1Var.getMessageObject();
                b6Var = ((org.telegram.ui.ActionBar.o2) qnVar).resourceProvider;
                q10.t(document4, null, "", null, null, i17, false, messageObject2, b6Var, 200);
            } else {
                long j12 = 0;
                if (MessageObject.isMusicDocument(messageMedia.document)) {
                    MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
                    if (MediaController.getInstance().isPlayingMessage(messageObject) && playingMessageObject != null) {
                        boolean z12 = playingMessageObject.isPlayingExplanationObject;
                        if (i9 == -3) {
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
                    TLRPC.TL_message C7 = qn.C7(message);
                    C7.media = messageMedia;
                    C7.attachPath = yg.f.c(message, i9);
                    ArrayList<MessageObject> arrayList = new ArrayList<>();
                    i16 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    MessageObject messageObject3 = new MessageObject(i16, C7, false, true);
                    if (i9 == -3) {
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
                    i14 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    TLRPC.Document document6 = messageMedia.document;
                    yg.a aVar = new yg.a(i14, messageObject, document6, yg.f.c(messageObject.messageOwner, i9));
                    if (aVar.f50204g) {
                        FileLoader.getInstance(i14).cancelLoadFile(document6);
                        aVar.a();
                        MessageObject messageObject4 = t1Var.f25593u7;
                        if (messageObject4 != null && messageObject4.isPoll()) {
                            yg.g gVar = t1Var.Y5;
                            if (gVar != null) {
                                gVar.d();
                            }
                            yg.g gVar2 = t1Var.X5;
                            if (gVar2 != null) {
                                gVar2.d();
                                return;
                            }
                            return;
                        }
                        return;
                    } else if (!aVar.f50203f) {
                        FileLoader.getInstance(i14).loadFile(document6, messageObject, 2, 0);
                        aVar.a();
                        MessageObject messageObject5 = t1Var.f25593u7;
                        if (messageObject5 != null && messageObject5.isPoll()) {
                            yg.g gVar3 = t1Var.Y5;
                            if (gVar3 != null) {
                                gVar3.d();
                            }
                            yg.g gVar4 = t1Var.X5;
                            if (gVar4 != null) {
                                gVar4.d();
                                return;
                            }
                            return;
                        }
                        return;
                    } else {
                        TLRPC.Message message2 = messageObject.messageOwner;
                        TLRPC.TL_message C72 = qn.C7(message2);
                        C72.media = messageMedia;
                        C72.attachPath = yg.f.c(message2, i9);
                        i15 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                        MessageObject messageObject6 = new MessageObject(i15, C72, false, true);
                        if (MessageObject.canPreviewDocument(messageMedia.document)) {
                            PhotoViewer.t1().K2(null, qnVar, qnVar.f41848aa);
                            PhotoViewer t12 = PhotoViewer.t1();
                            int i18 = messageObject6.type;
                            if (i18 != 0) {
                                j10 = qnVar.P5;
                            } else {
                                j10 = 0;
                            }
                            if (i18 != 0) {
                                j11 = qnVar.H6;
                            } else {
                                j11 = 0;
                            }
                            if (i18 != 0) {
                                j12 = qnVar.b();
                            }
                            t12.c2(messageObject6, qnVar, j10, j11, j12, qnVar.Ba);
                            return;
                        }
                        try {
                            AndroidUtilities.openForView(messageObject6, qnVar.getParentActivity(), qnVar.f41848aa, false);
                            return;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            qnVar.z6(messageObject6);
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
                        i10 = arrayList3.size();
                    } else {
                        i10 = -1;
                    }
                    TLRPC.TL_message C73 = qn.C7(message3);
                    C73.media = messageMedia3;
                    C73.attachPath = yg.f.c(message3, -2);
                    i13 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    arrayList3.add(new MessageObject(i13, C73, false, true));
                    arrayList2.add(-2);
                } else {
                    i10 = -1;
                }
                if (messageObject.expandedExplanation && (pollResults = tL_messageMediaPoll.results) != null && (messageMedia2 = pollResults.solution_media) != null && messageMedia2.geo == null && ((document2 = messageMedia2.document) == null || MessageObject.isVideoDocument(document2))) {
                    if (messageMedia2 == messageMedia) {
                        i10 = arrayList3.size();
                    }
                    TLRPC.TL_message C74 = qn.C7(message3);
                    C74.media = messageMedia2;
                    C74.attachPath = yg.f.c(message3, -3);
                    TLRPC.PollResults pollResults2 = tL_messageMediaPoll.results;
                    C74.message = pollResults2.solution;
                    C74.entities = pollResults2.solution_entities;
                    i12 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    arrayList3.add(new MessageObject(i12, C74, false, true));
                    arrayList2.add(-3);
                }
                gf.d.b(tL_messageMediaPoll.poll, qnVar.getUserConfig().getClientUserId());
                TLRPC.Poll poll = tL_messageMediaPoll.poll;
                ArrayList<TLRPC.PollAnswer> arrayList4 = poll.shuffled_answers;
                if (arrayList4 == null) {
                    arrayList4 = poll.answers;
                }
                for (int i19 = 0; i19 < arrayList4.size(); i19++) {
                    TLRPC.PollAnswer pollAnswer2 = arrayList4.get(i19);
                    TLRPC.MessageMedia messageMedia4 = pollAnswer2.media;
                    if (messageMedia4 != null && messageMedia4.geo == null && ((document = messageMedia4.document) == null || MessageObject.isVideoDocument(document))) {
                        if (pollAnswer2.unshuffled_index == i9) {
                            i10 = arrayList3.size();
                        }
                        TLRPC.TL_message C75 = qn.C7(message3);
                        C75.media = messageMedia4;
                        TLRPC.TL_textWithEntities tL_textWithEntities2 = pollAnswer2.text;
                        C75.message = tL_textWithEntities2.text;
                        C75.entities = tL_textWithEntities2.entities;
                        C75.attachPath = yg.f.c(message3, pollAnswer2.unshuffled_index);
                        i11 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                        arrayList3.add(new MessageObject(i11, C75, false, true));
                        arrayList2.add(Integer.valueOf(pollAnswer2.unshuffled_index));
                    }
                }
                if (i10 > -1 && !arrayList3.isEmpty()) {
                    messageObject.pollMediaMapping = arrayList2;
                    PhotoViewer.t1().K2(null, qnVar, qnVar.f41848aa);
                    PhotoViewer.t1().a2(arrayList3, i10, qnVar.a(), 0L, 0L, qnVar.Ca);
                }
            }
        }
    }

    @Override
    public final void q0(String str) {
        qn qnVar = this.f37236a;
        fk fkVar = qnVar.K0;
        if (fkVar == null || fkVar.getVisibility() != 0) {
            ek ekVar = qnVar.N;
            if ((ekVar == null || ekVar.getVisibility() != 0) && qnVar.U != null && str != null && str.length() > 0) {
                ak akVar = qnVar.U;
                akVar.setFieldText("@" + str + " ");
                qnVar.U.G0();
            }
        }
    }

    @Override
    public final org.telegram.ui.Cells.o9 q2() {
        return this.f37236a.Y8;
    }

    @Override
    public final void r(org.telegram.ui.Cells.t1 t1Var) {
        if (t1Var.getMessageObject().isImportedForward()) {
            d1();
            return;
        }
        qn qnVar = this.f37236a;
        if (!qnVar.f41932h3 && qnVar.f42077t0 != null && qnVar.getParentActivity() != null && qnVar.fragmentView != null) {
            if (qnVar.f42038q2 == null) {
                im imVar = qnVar.T0;
                int indexOfChild = imVar.indexOfChild(qnVar.O);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(1, qnVar.getParentActivity(), qnVar.f41848aa, false);
                    qnVar.f42038q2 = s30Var;
                    imVar.addView(s30Var, indexOfChild + 1, g7.e6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
                    qnVar.f42038q2.setAlpha(0.0f);
                    qnVar.f42038q2.setVisibility(4);
                } else {
                    return;
                }
            }
            qnVar.f42038q2.e(t1Var, null, 0, 0, true);
        }
    }

    @Override
    public final boolean r0(org.telegram.ui.Components.t5 t5Var) {
        TLRPC.InputStickerSet inputStickerSet;
        int i9;
        qn qnVar = this.f37236a;
        if (!qnVar.getMessagesController().premiumFeaturesBlocked() && t5Var != null && !t5Var.standard) {
            long documentId = t5Var.getDocumentId();
            TLRPC.Document document = t5Var.document;
            if (document == null) {
                i9 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                document = org.telegram.ui.Components.k5.f(i9, documentId);
            }
            if (document != null && (inputStickerSet = MessageObject.getInputStickerSet(document)) != null) {
                MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(inputStickerSet);
                org.telegram.ui.Components.dv dvVar = new org.telegram.ui.Components.dv(qnVar, qnVar.getParentActivity(), qnVar.f41848aa, arrayList);
                org.telegram.ui.Components.tu tuVar = dvVar.f27817f;
                tuVar.getClass();
                ImageReceiver imageReceiver = new ImageReceiver(tuVar);
                tuVar.v = imageReceiver;
                if (tuVar.d) {
                    imageReceiver.onAttachedToWindow();
                }
                tuVar.f32817w = true;
                tuVar.f32818x.d(1.0f, true);
                tuVar.v.setImage(ImageLocation.getForDocument(document), "140_140", ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90), document), "140_140", DocumentObject.getSvgThumb(document.thumbs, org.telegram.ui.ActionBar.f6.f23162m6, 0.2f, true), 0L, null, null, 0);
                tuVar.v.setLayerNum(7);
                tuVar.v.setAllowStartLottieAnimation(true);
                tuVar.v.setAllowStartAnimation(true);
                tuVar.v.setAutoRepeat(1);
                tuVar.v.setAllowDecodeSingleFrame(true);
                tuVar.v.setParentView(tuVar);
                dvVar.setCalcMandatoryInsets(qnVar.x9());
                qnVar.showDialog(dvVar);
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final boolean r1() {
        qn qnVar = this.f37236a;
        if (qnVar.T0.getMeasuredWidth() > qnVar.T0.getMeasuredHeight()) {
            return true;
        }
        return false;
    }

    @Override
    public final void s() {
        this.f37236a.T0.getClass();
    }

    @Override
    public final void s0(org.telegram.ui.Cells.t1 t1Var, float f10, float f11) {
        qn qnVar = this.f37236a;
        qnVar.I7(t1Var, false, false, f10, f11, true, false, false);
        qnVar.f42077t0.getClass();
        qn.c2(qnVar, RecyclerView.R(t1Var));
    }

    @Override
    public final void s1(org.telegram.ui.Cells.t1 t1Var) {
        qn.U4(this.f37236a, t1Var);
    }

    @Override
    public final void t1(org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        g(t1Var, z10, false, false);
    }

    @Override
    public final void u0(org.telegram.ui.Cells.t1 t1Var, TLRPC.User user, float f10, float f11) {
        org.telegram.ui.ActionBar.k kVar;
        qn qnVar = this.f37236a;
        kVar = ((org.telegram.ui.ActionBar.o2) qnVar).actionBar;
        boolean z10 = true;
        if (!kVar.s() && !qnVar.A9()) {
            if (t1Var.getMessageObject() != null && t1Var.getMessageObject().isSponsored()) {
                O0(10, t1Var);
                return;
            }
            if (!ChatObject.isForum(qnVar.f41890e) && !qnVar.F9()) {
                z10 = false;
            }
            p(user, z10);
            return;
        }
        qn.b2(qnVar, t1Var, true, f10, f11);
    }

    @Override
    public final void v(org.telegram.ui.Cells.t1 r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.v(org.telegram.ui.Cells.t1):void");
    }

    @Override
    public final void w() {
        this.f37236a.Yb();
    }

    @Override
    public final void w0(org.telegram.ui.Cells.t1 r44, float r45, float r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cn.w0(org.telegram.ui.Cells.t1, float, float, boolean):void");
    }

    @Override
    public final void w1(org.telegram.ui.Cells.t1 t1Var, eh.f fVar) {
        TLRPC.Message message;
        if (t1Var == null) {
            fVar.run();
            return;
        }
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject != null && ((!messageObject.isSending() || messageObject.isEditing()) && (message = messageObject.messageOwner) != null && message.rich_message != null)) {
            org.telegram.ui.ActionBar.o2 o2Var = this.f37236a;
            o2Var.getSendMessagesHelper().editRichMessage(messageObject, messageObject.messageOwner.rich_message, null, o2Var, true);
            return;
        }
        fVar.run();
    }

    @Override
    public final void x(org.telegram.ui.Cells.t1 t1Var) {
        int i9;
        int i10;
        lj ljVar;
        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
        if (primaryMessageObject != null) {
            primaryMessageObject.factCheckExpanded = !primaryMessageObject.factCheckExpanded;
            primaryMessageObject.forceUpdate = true;
            qn qnVar = this.f37236a;
            ij ijVar = qnVar.f42077t0;
            if (ijVar != null && (ljVar = qnVar.f42103v0) != null && ljVar.f5441y < 0) {
                for (int childCount = ijVar.getChildCount() - 1; childCount >= 0; childCount--) {
                    View childAt = qnVar.f42077t0.getChildAt(childCount);
                    qnVar.f42077t0.getClass();
                    i9 = RecyclerView.R(childAt);
                    if (i9 >= 0) {
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                                i10 = qnVar.L8(childAt);
                                break;
                            }
                        } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                            i10 = qnVar.L8(childAt);
                            break;
                        }
                    }
                }
            }
            i9 = -1;
            i10 = 0;
            qnVar.rc(primaryMessageObject, false);
            kh.x3 x3Var = qnVar.f42115w1;
            if (x3Var != null) {
                x3Var.e(true);
            }
            if (i9 >= 0 && t1Var.getCurrentMessagesGroup() == null) {
                qnVar.f42103v0.h1(i9, i10);
            }
        }
    }

    @Override
    public final boolean x1(org.telegram.ui.Cells.t1 t1Var, TLRPC.Chat chat) {
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        boolean z10;
        int i14;
        boolean z11;
        int i15;
        w4 w4Var;
        int i16;
        int i17;
        c5 c5Var;
        fk fkVar;
        ek ekVar;
        if (!j()) {
            return false;
        }
        boolean isEmpty = TextUtils.isEmpty(ChatObject.getPublicUsername(chat));
        qn qnVar = this.f37236a;
        if (!isEmpty && qnVar.f41890e != null && (((fkVar = qnVar.K0) == null || fkVar.getVisibility() != 0) && ((ekVar = qnVar.N) == null || ekVar.getVisibility() != 0))) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        TLRPC.Chat chat2 = qnVar.f41890e;
        if (chat2 != null && ((qnVar.Z3 == 0 || qnVar.f41882d4) && (!ChatObject.isChannel(chat2) || qnVar.f41890e.megagroup))) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        TLRPC.Chat chat3 = qnVar.f41890e;
        if (chat3 != null && chat3.f22380id == chat.f22380id && !qnVar.F9()) {
            i11 = 0;
        } else {
            i11 = 1;
        }
        c5[] c5VarArr = new c5[i11 + 1 + i9 + i10];
        c5VarArr[0] = c5.d;
        if (i11 != 0) {
            if (chat.broadcast) {
                c5Var = c5.f37062e;
            } else {
                c5Var = c5.f37063f;
            }
            c5VarArr[1] = c5Var;
            i12 = 2;
        } else {
            i12 = 1;
        }
        if (i9 != 0) {
            c5VarArr[i12] = c5.f37064n;
            i12++;
        }
        if (i10 != 0) {
            c5VarArr[i12] = c5.f37065r;
        }
        TLRPC.ChatFull chatFull = qnVar.getMessagesController().getChatFull(chat.f22380id);
        if (chatFull == null) {
            i13 = ((org.telegram.ui.ActionBar.o2) qnVar).classGuid;
            int i18 = i10;
            ImageLocation forUserOrChat = ImageLocation.getForUserOrChat(chat, 0);
            int i19 = i11;
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
            i14 = i19;
            z11 = i9;
            i15 = i18;
            w4Var = new w4(forUserOrChat, forUserOrChat2, null, str, null, null, bitmapDrawable, chat, c5VarArr, new y4(i13, chat, NotificationCenter.chatInfoDidLoad));
        } else {
            w4Var = w4.a(chat, chatFull, c5VarArr);
            z11 = i9;
            i15 = i10;
            i14 = i11;
            z10 = true;
        }
        if (com.google.firebase.messaging.l.e(w4Var)) {
            com.google.firebase.messaging.l.i().s((ViewGroup) qnVar.fragmentView, qnVar.f41848aa, w4Var, new a7(this, chat, t1Var, 7));
            return z10;
        }
        org.telegram.ui.Components.x60 H = org.telegram.ui.Components.x60.H(qnVar, t1Var);
        H.c(R.drawable.msg_openprofile, LocaleController.getString(R.string.OpenProfile), new qm(this, chat, 0), false);
        boolean z12 = chat.broadcast;
        if (z12) {
            i16 = R.drawable.msg_channel;
        } else {
            i16 = R.drawable.msg_discussion;
        }
        if (z12) {
            i17 = R.string.OpenChannel2;
        } else {
            i17 = R.string.OpenGroup2;
        }
        H.l(i16, LocaleController.getString(i17), new t1(this, t1Var, chat, 26), i14);
        H.l(R.drawable.msg_mention, LocaleController.getString(R.string.Mention), new qm(this, chat, 1), z11);
        H.l(R.drawable.msg_search, LocaleController.getString(R.string.AvatarPreviewSearchMessages), new qm(this, chat, 2), i15);
        H.f34581t = false;
        H.f34562i = 3;
        H.W = true;
        H.a0(0.0f, -AndroidUtilities.dp(48.0f));
        H.Z();
        return true;
    }

    @Override
    public final void y1(org.telegram.ui.Cells.t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        qn qnVar = this.f37236a;
        if (!qnVar.z9()) {
            TL_keyboard.TL_inlineButtonTypeUrl tL_inlineButtonTypeUrl = (TL_keyboard.TL_inlineButtonTypeUrl) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrl.class);
            TL_keyboard.TL_inlineButtonTypeCopy tL_inlineButtonTypeCopy = (TL_keyboard.TL_inlineButtonTypeCopy) gf.c.a(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCopy.class);
            if (qnVar.getParentActivity() != null) {
                if (qnVar.K0.getVisibility() != 0 || tL_inlineButtonTypeUrl != null || tL_inlineButtonTypeCopy != null || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeSwitchInline.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeCallback.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeGame.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeBuy.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUrlAuth.class) || gf.c.c(keyboardButtonProto, TL_keyboard.TL_inlineButtonTypeUserProfile.class)) {
                    if (tL_inlineButtonTypeCopy != null) {
                        String str = tL_inlineButtonTypeCopy.copy_text;
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(qnVar.getParentActivity(), qnVar.f41848aa, false, false);
                        f3Var.fixNavigationBar();
                        f3Var.title = str;
                        f3Var.bigTitle = false;
                        f3Var.multipleLinesTitle = true;
                        CharSequence[] charSequenceArr = {LocaleController.getString(R.string.Copy)};
                        v vVar = new v(2, qnVar, str);
                        f3Var.items = charSequenceArr;
                        f3Var.onClickListener = vVar;
                        qnVar.showDialog(f3Var);
                    } else if (tL_inlineButtonTypeUrl != null) {
                        qnVar.Z9(null, tL_inlineButtonTypeUrl.url, true, t1Var, t1Var.getMessageObject());
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
    public final void z(org.telegram.ui.Cells.t1 t1Var) {
        MessageObject messageObject;
        long j10;
        int i9;
        MessageObject.GroupedMessages currentMessagesGroup = t1Var.getCurrentMessagesGroup();
        if (currentMessagesGroup != null && !currentMessagesGroup.messages.isEmpty()) {
            messageObject = currentMessagesGroup.messages.get(0);
        } else {
            messageObject = t1Var.getMessageObject();
        }
        MessageObject messageObject2 = messageObject;
        TLRPC.MessageReplies messageReplies = messageObject2.messageOwner.replies;
        if (messageReplies != null) {
            int i10 = messageReplies.read_max_id;
            j10 = messageReplies.channel_id;
            i9 = i10;
        } else {
            j10 = 0;
            i9 = -1;
        }
        long j11 = j10;
        qn qnVar = this.f37236a;
        qnVar.aa(qnVar.f41890e.f22380id, messageObject2, messageObject2.getId(), j11, i9, 0, null);
    }

    @Override
    public final boolean z0(MessageObject messageObject) {
        return !this.f37236a.f42063s.containsKey(messageObject);
    }

    @Override
    public final boolean z1() {
        qn qnVar = this.f37236a;
        if (qnVar.T0.getKeyboardHeight() + qnVar.ka >= AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }
}
