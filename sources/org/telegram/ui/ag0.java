package org.telegram.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

public final class ag0 implements Utilities.Callback3 {

    public final int f36531a;

    public final NotificationCenter.NotificationCenterDelegate f36532b;

    public ag0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, int i10) {
        this.f36531a = i10;
        this.f36532b = notificationCenterDelegate;
    }

    @Override
    public final void run(Object obj, Object obj2, Object obj3) {
        int i10;
        char c10;
        final String strSubstring;
        final boolean z10;
        MessageObject messageObject;
        MessageObject messageObject2;
        int i11 = this.f36531a;
        NotificationCenter.NotificationCenterDelegate notificationCenterDelegate = this.f36532b;
        switch (i11) {
            case 0:
                hg0 hg0Var = (hg0) notificationCenterDelegate;
                Long l10 = (Long) obj;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj2;
                String str = (String) obj3;
                org.telegram.ui.Components.p80 p80Var = hg0Var.f38809n;
                ig0 ig0Var = hg0Var.R;
                hg0Var.Q = null;
                hg0Var.P = false;
                if (str == null || !("EMPTY".equals(str) || "CANCELLED".equals(str))) {
                    if (l10.longValue() != 0 && (ig0Var.getParentActivity() instanceof LaunchActivity)) {
                        for (int i12 = 0; i12 < 4; i12++) {
                            UserConfig userConfig = UserConfig.getInstance(i12);
                            if (userConfig.isClientActivated() && userConfig.getClientUserId() == l10.longValue() && ConnectionsManager.getInstance(i12).isTestBackend() == ig0Var.A) {
                                if (UserConfig.selectedAccount != i12) {
                                    ((LaunchActivity) ig0Var.getParentActivity()).K0(i12);
                                }
                                ig0Var.finishFragment();
                                ig0Var.k1(false, true);
                            }
                        }
                    }
                    if (str != null && str.contains("SESSION_PASSWORD_NEEDED")) {
                        ConnectionsManager.getInstance(((org.telegram.ui.ActionBar.n2) ig0Var).currentAccount).sendRequest(new TL_account.getPassword(), new bg0(hg0Var, 1), 10);
                    } else if (str != null) {
                        if (BuildVars.DEBUG_VERSION) {
                            org.telegram.ui.Components.mc.a0(ig0Var).c0(str, false);
                        }
                    }
                    if (auth_authorization instanceof TLRPC.TL_auth_authorization) {
                        ig0Var.o1((TLRPC.TL_auth_authorization) auth_authorization, false);
                    }
                    break;
                } else if (p80Var != null && "CANCELLED".equals(str)) {
                    p80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StartTextPasskey), new xf0(hg0Var, 3)), true));
                    break;
                }
                break;
            case 1:
                final PhotoViewer photoViewer = (PhotoViewer) notificationCenterDelegate;
                final ClickableSpan clickableSpan = (ClickableSpan) obj;
                final TextView textView = (TextView) obj2;
                Runnable runnable = (Runnable) obj3;
                Drawable[] drawableArr = PhotoViewer.P8;
                if (clickableSpan instanceof URLSpan) {
                    String url = ((URLSpan) clickableSpan).getURL();
                    org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(photoViewer.f35800y, photoViewer.f35738r2, false, false);
                    e3Var.setBackgroundColor(-14933463);
                    e3Var.fixNavigationBar(-14933463);
                    if (url.startsWith("video?")) {
                        try {
                            i10 = Integer.parseInt(url.substring(url.indexOf(63) + 1));
                        } catch (Throwable unused) {
                            i10 = -1;
                        }
                    } else {
                        i10 = -1;
                    }
                    try {
                        if (!url.startsWith("mailto:")) {
                            if (url.startsWith("tel:")) {
                                strSubstring = url.substring(4);
                                z10 = true;
                            } else {
                                if (i10 < 0 || (messageObject = photoViewer.P4) == null || messageObject.scheduled) {
                                    c10 = 1;
                                } else {
                                    if (!messageObject.isVideo() && !photoViewer.P4.isRoundVideo() && !photoViewer.P4.isVoice() && !photoViewer.P4.isMusic() && (messageObject2 = photoViewer.P4.replyMessageObject) != null) {
                                        messageObject = messageObject2;
                                    }
                                    long dialogId = messageObject.getDialogId();
                                    int id2 = messageObject.getId();
                                    TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
                                    if (messageFwdHeader != null) {
                                        TLRPC.Peer peer = messageFwdHeader.saved_from_peer;
                                        if (peer != null) {
                                            dialogId = MessageObject.getPeerId(peer);
                                            id2 = messageObject.messageOwner.fwd_from.saved_from_msg_id;
                                        } else {
                                            TLRPC.Peer peer2 = messageFwdHeader.from_id;
                                            if (peer2 != null) {
                                                dialogId = MessageObject.getPeerId(peer2);
                                                id2 = messageObject.messageOwner.fwd_from.channel_post;
                                            }
                                        }
                                    }
                                    c10 = 1;
                                    if (DialogObject.isChatDialog(dialogId)) {
                                        String publicUsername = ChatObject.getPublicUsername(MessagesController.getInstance(photoViewer.P).getChat(Long.valueOf(-dialogId)));
                                        if (publicUsername != null) {
                                            url = "https://t.me/" + publicUsername + "/" + id2 + "?t=" + AndroidUtilities.formatTimestamp(i10);
                                        }
                                    } else {
                                        TLRPC.User user = MessagesController.getInstance(photoViewer.P).getUser(Long.valueOf(dialogId));
                                        String publicUsername2 = UserObject.getPublicUsername(user);
                                        if (user != null && publicUsername2 != null) {
                                            url = "https://t.me/" + publicUsername2 + "/" + id2 + "?t=" + AndroidUtilities.formatTimestamp(i10);
                                        }
                                    }
                                }
                                strSubstring = url;
                                z10 = false;
                            }
                            e3Var.title = strSubstring;
                            e3Var.bigTitle = false;
                            String string = LocaleController.getString(R.string.Open);
                            String string2 = LocaleController.getString(R.string.CopyLink);
                            CharSequence[] charSequenceArr = new CharSequence[2];
                            charSequenceArr[0] = string;
                            charSequenceArr[c10] = string2;
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                                @Override
                                public final void onClick(DialogInterface dialogInterface, int i13) {
                                    String string3;
                                    Drawable[] drawableArr2 = PhotoViewer.P8;
                                    PhotoViewer photoViewer2 = photoViewer;
                                    if (i13 == 0) {
                                        photoViewer2.W1(clickableSpan, textView);
                                        return;
                                    }
                                    if (i13 == 1) {
                                        String str2 = strSubstring;
                                        AndroidUtilities.addToClipboard(str2);
                                        if (z10) {
                                            string3 = LocaleController.getString("PhoneCopied", R.string.PhoneCopied);
                                        } else if (str2.startsWith("#")) {
                                            string3 = LocaleController.getString("HashtagCopied", R.string.HashtagCopied);
                                        } else {
                                            string3 = str2.startsWith("@") ? LocaleController.getString("UsernameCopied", R.string.UsernameCopied) : LocaleController.getString("LinkCopied", R.string.LinkCopied);
                                        }
                                        if (AndroidUtilities.shouldShowClipboardToast()) {
                                            new org.telegram.ui.Components.mc(photoViewer2.f35583a0, photoViewer2.f35738r2).Q(R.raw.voip_invite, 36, string3).j();
                                        }
                                    }
                                }
                            };
                            e3Var.items = charSequenceArr;
                            e3Var.onClickListener = onClickListener;
                            e3Var.setOnHideListener(new s5(runnable, 12));
                            e3Var.scrollNavBar = true;
                            e3Var.show();
                            photoViewer.f35583a0.performHapticFeedback(0, 2);
                            e3Var.setItemColor(0, -1, -1);
                            e3Var.setItemColor(1, -1, -1);
                            e3Var.setBackgroundColor(-14933463);
                            e3Var.setTitleColor(-7697782);
                            e3Var.setCalcMandatoryInsets(true);
                            AndroidUtilities.setNavigationBarColor((Dialog) e3Var, -14933463, false);
                            AndroidUtilities.setLightNavigationBar((Dialog) e3Var, false);
                            e3Var.scrollNavBar = true;
                        } else {
                            strSubstring = url.substring(7);
                            z10 = false;
                        }
                        photoViewer.f35583a0.performHapticFeedback(0, 2);
                        break;
                    } catch (Exception unused2) {
                    }
                    c10 = 1;
                    e3Var.title = strSubstring;
                    e3Var.bigTitle = false;
                    String string3 = LocaleController.getString(R.string.Open);
                    String string4 = LocaleController.getString(R.string.CopyLink);
                    CharSequence[] charSequenceArr2 = new CharSequence[2];
                    charSequenceArr2[0] = string3;
                    charSequenceArr2[c10] = string4;
                    DialogInterface.OnClickListener onClickListener2 = new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i13) {
                            String string5;
                            Drawable[] drawableArr2 = PhotoViewer.P8;
                            PhotoViewer photoViewer2 = photoViewer;
                            if (i13 == 0) {
                                photoViewer2.W1(clickableSpan, textView);
                                return;
                            }
                            if (i13 == 1) {
                                String str2 = strSubstring;
                                AndroidUtilities.addToClipboard(str2);
                                if (z10) {
                                    string5 = LocaleController.getString("PhoneCopied", R.string.PhoneCopied);
                                } else if (str2.startsWith("#")) {
                                    string5 = LocaleController.getString("HashtagCopied", R.string.HashtagCopied);
                                } else {
                                    string5 = str2.startsWith("@") ? LocaleController.getString("UsernameCopied", R.string.UsernameCopied) : LocaleController.getString("LinkCopied", R.string.LinkCopied);
                                }
                                if (AndroidUtilities.shouldShowClipboardToast()) {
                                    new org.telegram.ui.Components.mc(photoViewer2.f35583a0, photoViewer2.f35738r2).Q(R.raw.voip_invite, 36, string5).j();
                                }
                            }
                        }
                    };
                    e3Var.items = charSequenceArr2;
                    e3Var.onClickListener = onClickListener2;
                    e3Var.setOnHideListener(new s5(runnable, 12));
                    e3Var.scrollNavBar = true;
                    e3Var.show();
                    e3Var.setItemColor(0, -1, -1);
                    e3Var.setItemColor(1, -1, -1);
                    e3Var.setBackgroundColor(-14933463);
                    e3Var.setTitleColor(-7697782);
                    e3Var.setCalcMandatoryInsets(true);
                    AndroidUtilities.setNavigationBarColor((Dialog) e3Var, -14933463, false);
                    AndroidUtilities.setLightNavigationBar((Dialog) e3Var, false);
                    e3Var.scrollNavBar = true;
                } else if (runnable != null) {
                    runnable.run();
                }
                break;
            default:
                ((SecretMediaViewer) notificationCenterDelegate).getClass();
                break;
        }
    }
}
