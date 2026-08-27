package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

public final class mc {

    public final org.telegram.ui.ActionBar.n2 f30643a;

    public final FrameLayout f30644b;

    public final org.telegram.ui.ActionBar.c6 f30645c;

    public mc(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == null || n2Var.getLastStoryViewer() == null || !n2Var.getLastStoryViewer().attachedToParent()) {
            this.f30643a = n2Var;
            this.f30644b = null;
            this.f30645c = n2Var != null ? n2Var.getResourceProvider() : null;
        } else {
            this.f30643a = null;
            jh.e4 currentPeerView = n2Var.getLastStoryViewer().f13487j0.getCurrentPeerView();
            this.f30644b = currentPeerView != null ? currentPeerView.Y0 : null;
            this.f30645c = n2Var.getLastStoryViewer().f13515y;
        }
    }

    public static ec A(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        return z(n2Var, z10 ? 3 : 4, 0, c6Var);
    }

    public static ec B(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, ag.k0 k0Var, org.telegram.ui.me meVar, org.telegram.ui.ActionBar.c6 c6Var) {
        mb mbVar = new mb(n2Var.getParentActivity(), c6Var);
        mbVar.c(z10 ? R.raw.ic_pin : R.raw.ic_unpin, 28, 28, "Pin", "Line");
        mbVar.f30639b.setText(LocaleController.getString(z10 ? "MessagePinnedHint" : "MessageUnpinnedHint", z10 ? R.string.MessagePinnedHint : R.string.MessageUnpinnedHint));
        if (!z10) {
            cc ccVar = new cc(n2Var.getParentActivity(), c6Var, true);
            ccVar.f27402a = k0Var;
            ccVar.f27403b = meVar;
            mbVar.setButton(ccVar);
        }
        return ec.g(n2Var, mbVar, z10 ? 1500 : 5000);
    }

    public static ec C(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        mb mbVar = new mb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        mbVar.d(R.raw.ic_admin, "Shield");
        mbVar.f30639b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return ec.g(n2Var, mbVar, 1500);
    }

    public static ec D(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        mb mbVar = new mb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        mbVar.d(R.raw.ic_ban, "Hand");
        mbVar.f30639b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, user.deleted ? LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]) : user.first_name, str)));
        return ec.g(n2Var, mbVar, 1500);
    }

    public static ec F(FrameLayout frameLayout, boolean z10) {
        return new mc(frameLayout, null).m(z10 ? lc.h : lc.f30339e, 1, -115203550, -1, null);
    }

    public static ec S(int i10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        String string;
        mb mbVar = new mb(n2Var.getParentActivity(), c6Var);
        boolean z10 = true;
        if (i10 == 0) {
            string = LocaleController.getString(R.string.SoundOnHint);
        } else {
            if (i10 != 1) {
                throw new IllegalArgumentException();
            }
            string = LocaleController.getString(R.string.SoundOffHint);
            z10 = false;
        }
        if (z10) {
            mbVar.d(R.raw.sound_on, new String[0]);
        } else {
            mbVar.d(R.raw.sound_off, new String[0]);
        }
        mbVar.f30639b.setText(string);
        return ec.g(n2Var, mbVar, 1500);
    }

    public static mc X() {
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null) {
            return new mc(ab.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = n2VarU.visibleDialog;
        return dialog instanceof org.telegram.ui.ActionBar.e3 ? new mc(((org.telegram.ui.ActionBar.e3) dialog).container, n2VarU.getResourceProvider()) : a0(n2VarU);
    }

    public static mc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        return new mc(frameLayout, c6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.n2 n2Var) {
        return (n2Var == null || n2Var.getParentActivity() == null || n2Var.getLayoutContainer() == null) ? false : true;
    }

    public static mc a0(org.telegram.ui.ActionBar.n2 n2Var) {
        return n2Var == null ? X() : new mc(n2Var);
    }

    public static void b0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.f35497y1) {
            if (tL_error == null || tL_error.code != 406) {
                X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
            }
        }
    }

    public static ec d(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        String string;
        mb mbVar = new mb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        if (z10) {
            mbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            mbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        mbVar.f30639b.setText(AndroidUtilities.replaceTags(string));
        return ec.g(n2Var, mbVar, 1500);
    }

    public static ec j(org.telegram.ui.ActionBar.n2 n2Var) {
        return a0(n2Var).k(false);
    }

    public static ec l(String str, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        String string;
        mb mbVar = new mb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        if (str != null) {
            string = LocaleController.formatString(z10 ? R.string.DisableSharingToastDisabledPending : R.string.DisableSharingToastEnabledPending, str);
        } else {
            string = LocaleController.getString(z10 ? R.string.DisableSharingToastDisabled : R.string.DisableSharingToastEnabled);
        }
        mbVar.f30639b.setText(AndroidUtilities.replaceTags(string));
        mbVar.d((z10 || str != null) ? R.raw.e_hand_2 : R.raw.contact_check, new String[0]);
        return ec.g(n2Var, mbVar, 5000);
    }

    public static ec v(Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, int i10, long j10, int i11, int i12, int i13, int i14, boolean z10, e5.u uVar) {
        mb mbVar;
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        ec ecVarG;
        int i15 = 1;
        if (!UserConfig.getInstance(UserConfig.selectedAccount).isPremium() || n2Var == null || i10 > 1 || j10 != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId || z10) {
            mbVar = new mb(i12, i13, context, n2Var != null ? n2Var.getResourceProvider() : null);
        } else {
            mbVar = new pb(i11, n2Var);
        }
        mb mbVar2 = mbVar;
        boolean z11 = uVar != null;
        org.telegram.ui.yq yqVar = uVar != null ? new org.telegram.ui.yq(6, new boolean[]{false}, uVar) : null;
        if (i10 > 1) {
            spannableStringBuilderReplaceTags = i11 <= 1 ? AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0])) : AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            mbVar2.c(R.raw.forward, 30, 30, new String[0]);
        } else if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
            int i16 = 29;
            if (i11 <= 1) {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, z10 ? new gc(i15) : new ag.l3(i16));
            } else {
                spannableStringBuilderReplaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ag.l3(i16));
            }
            mbVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
        } else {
            e5.u uVar2 = new e5.u(yqVar, n2Var, j10, 20);
            if (DialogObject.isChatDialog(j10)) {
                TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
                if (i11 <= 1) {
                    spannableStringBuilderReplaceTags = n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, uVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title));
                } else {
                    spannableStringBuilderReplaceTags = n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, uVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
                }
            } else {
                TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                if (i11 <= 1) {
                    int i17 = z11 ? R.string.FwdMessageToUserShort : R.string.FwdMessageToUser;
                    spannableStringBuilderReplaceTags = n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i17, UserObject.getFirstName(user)), -1, 2, uVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(i17, UserObject.getFirstName(user)));
                } else {
                    int i18 = z11 ? R.string.FwdMessagesToUserShort : R.string.FwdMessagesToUser;
                    spannableStringBuilderReplaceTags = n2Var != null ? AndroidUtilities.replaceSingleTag(LocaleController.formatString(i18, UserObject.getFirstName(user)), -1, 2, uVar2) : AndroidUtilities.replaceTags(LocaleController.formatString(i18, UserObject.getFirstName(user)));
                }
            }
            mbVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        mbVar2.f30639b.setText(spannableStringBuilderReplaceTags);
        if (z11) {
            cc ccVar = new cc(mbVar2.getContext(), n2Var != null ? n2Var.getResourceProvider() : null, true, true);
            ccVar.f27402a = null;
            ccVar.f27403b = yqVar;
            mbVar2.setButton(ccVar);
        }
        mbVar2.postDelayed(new fc(mbVar2, 1), 300);
        if (frameLayout != null) {
            ecVarG = ec.f(frameLayout, mbVar2, i14);
        } else {
            if (n2Var == null) {
                throw new IllegalArgumentException();
            }
            ecVarG = ec.g(n2Var, mbVar2, i14);
        }
        if (mbVar2 instanceof pb) {
            mbVar2.f30639b.setSingleLine(false);
            mbVar2.f30639b.setMaxLines(2);
            ((pb) mbVar2).setBulletin(ecVarG);
            ecVarG.f28028r = false;
        }
        return ecVarG;
    }

    public static ec x(Activity activity, FrameLayout frameLayout, int i10, long j10, int i11, int i12) {
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        SpannableStringBuilder spannableStringBuilderReplaceTags2;
        int i13;
        mb mbVar = new mb(i11, i12, activity, null);
        if (i10 <= 1) {
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(LocaleController.getString(R.string.InvLinkToSavedMessages));
                mbVar.c(R.raw.saved_messages, 30, 30, new String[0]);
                i13 = -1;
            } else {
                if (DialogObject.isChatDialog(j10)) {
                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToGroup", R.string.InvLinkToGroup, MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10)).title));
                } else {
                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToUser", R.string.InvLinkToUser, UserObject.getFirstName(MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10)))));
                }
                mbVar.c(R.raw.forward, 30, 30, new String[0]);
            }
            mbVar.f30639b.setText(spannableStringBuilderReplaceTags2);
            if (i13 > 0) {
                mbVar.postDelayed(new fc(mbVar, 0), i13);
            }
            return ec.f(frameLayout, mbVar, 1500);
        }
        spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("InvLinkToChats", R.string.InvLinkToChats, LocaleController.formatPluralString("Chats", i10, new Object[0])));
        mbVar.c(R.raw.forward, 30, 30, new String[0]);
        spannableStringBuilderReplaceTags2 = spannableStringBuilderReplaceTags;
        i13 = 300;
        mbVar.f30639b.setText(spannableStringBuilderReplaceTags2);
        if (i13 > 0) {
            mbVar.postDelayed(new fc(mbVar, 0), i13);
        }
        return ec.f(frameLayout, mbVar, 1500);
    }

    public static ec z(org.telegram.ui.ActionBar.n2 n2Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        String string;
        boolean z10;
        mb mbVar = new mb(n2Var.getParentActivity(), c6Var);
        boolean z11 = true;
        if (i10 == 0) {
            string = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Hours", 1, new Object[0]));
        } else if (i10 == 1) {
            string = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Hours", 8, new Object[0]));
        } else {
            if (i10 != 2) {
                if (i10 == 3) {
                    string = LocaleController.getString(R.string.NotificationsMutedHint);
                } else if (i10 == 4) {
                    string = LocaleController.getString(R.string.NotificationsUnmutedHint);
                    z10 = false;
                    z11 = false;
                } else {
                    if (i10 != 5) {
                        throw new IllegalArgumentException();
                    }
                    string = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatTTLString(i11));
                    z10 = true;
                }
                if (z11) {
                    mbVar.d(R.raw.mute_for, new String[0]);
                } else if (z10) {
                    mbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
                } else {
                    mbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
                }
                mbVar.f30639b.setText(string);
                return ec.g(n2Var, mbVar, 1500);
            }
            string = LocaleController.formatString("NotificationsMutedForHint", R.string.NotificationsMutedForHint, LocaleController.formatPluralString("Days", 2, new Object[0]));
        }
        z10 = true;
        z11 = false;
        if (z11) {
            mbVar.d(R.raw.mute_for, new String[0]);
        } else if (z10) {
            mbVar.d(R.raw.ic_mute, "Body Main", "Body Top", "Line", "Curve Big", "Curve Small");
        } else {
            mbVar.d(R.raw.ic_unmute, "BODY", "Wibe Big", "Wibe Big 3", "Wibe Small");
        }
        mbVar.f30639b.setText(string);
        return ec.g(n2Var, mbVar, 1500);
    }

    public final ec E(org.telegram.ui.ActionBar.c6 c6Var) {
        mb mbVar = new mb(W(), c6Var);
        mbVar.d(R.raw.chats_infotip, new String[0]);
        mbVar.f30639b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(mbVar, 1500);
    }

    public final ec G(int i10, int i11, CharSequence charSequence) {
        mb mbVar = new mb(W(), this.f30645c);
        mbVar.c(i10, 36, 36, new String[0]);
        if (charSequence != null) {
            String string = charSequence.toString();
            SpannableStringBuilder spannableStringBuilder = charSequence instanceof SpannableStringBuilder ? (SpannableStringBuilder) charSequence : new SpannableStringBuilder(charSequence);
            int i12 = 0;
            for (int iIndexOf = string.indexOf(10); iIndexOf >= 0 && iIndexOf < charSequence.length(); iIndexOf = string.indexOf(10, iIndexOf + 1)) {
                if (i12 >= i11) {
                    spannableStringBuilder.replace(iIndexOf, iIndexOf + 1, (CharSequence) " ");
                }
                i12++;
            }
            charSequence = spannableStringBuilder;
        }
        mbVar.f30639b.setSingleLine(false);
        mbVar.f30639b.setMaxLines(i11);
        mbVar.f30639b.setText(charSequence);
        return b(mbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ec H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final ec I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context contextW = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f30645c;
        mb mbVar = new mb(contextW, c6Var);
        if (i10 != 0) {
            mbVar.c(i10, 36, 36, new String[0]);
        } else {
            mbVar.f30638a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) mbVar.f30639b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        mbVar.f30639b.setTextSize(1, 14.0f);
        mbVar.f30639b.setTextDirection(5);
        mbVar.f30639b.setSingleLine(false);
        mbVar.f30639b.setMaxLines(3);
        mbVar.f30639b.setText(charSequence);
        cc ccVar = new cc(W(), c6Var, true, z10);
        ccVar.e(charSequence2);
        ccVar.f27402a = runnable;
        mbVar.setButton(ccVar);
        return b(mbVar, i11);
    }

    public final ec J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        return I(i10, charSequence, str, charSequence.length() < 20 ? 1500 : 2750, false, runnable);
    }

    public final ec K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context contextW = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f30645c;
        bc bcVar = new bc(contextW, c6Var);
        bcVar.c(i10, 36, 36, new String[0]);
        bcVar.f27064b.setText(str);
        bcVar.f27065c.setText(charSequence);
        cc ccVar = new cc(W(), c6Var, true);
        ccVar.e(str2);
        ccVar.f27402a = runnable;
        bcVar.setButton(ccVar);
        return b(bcVar, 5000);
    }

    public final ec L(Drawable drawable, CharSequence charSequence) {
        mb mbVar = new mb(W(), this.f30645c);
        mbVar.f30638a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.wo0) {
            ((org.telegram.ui.wo0) drawable).e(mbVar.f30638a);
        }
        mbVar.f30639b.setText(charSequence);
        mbVar.f30639b.setSingleLine(false);
        mbVar.f30639b.setMaxLines(2);
        return b(mbVar, 2750);
    }

    public final ec M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        bc bcVar = new bc(W(), this.f30645c);
        bcVar.c(i10, 36, 36, new String[0]);
        bcVar.f27064b.setText(charSequence);
        bcVar.f27065c.setText(charSequence2);
        return b(bcVar, charSequence2.length() + charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ec N(String str, String str2) {
        bc bcVar = new bc(W(), this.f30645c);
        bcVar.f27063a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) bcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        bcVar.f27064b.setText(str);
        bcVar.f27065c.setText(str2);
        return b(bcVar, 5000);
    }

    public final ec O(TLRPC.Document document, String str, String str2) {
        if (document == null) {
            return new eb();
        }
        ac acVar = new ac(W(), this.f30645c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        n9 n9Var = acVar.f26723a;
        n9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        n9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = acVar.f26724b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = acVar.f26725c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        return b(acVar, str2.length() < 20 ? 1500 : 2750);
    }

    public final ec P(int i10, CharSequence charSequence) {
        mb mbVar = new mb(W(), this.f30645c);
        mbVar.c(i10, 36, 36, new String[0]);
        mbVar.f30639b.setText(charSequence);
        mbVar.f30639b.setSingleLine(false);
        mbVar.f30639b.setTextSize(1, 14.0f);
        mbVar.f30639b.setMaxLines(4);
        return b(mbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ec Q(int i10, int i11, CharSequence charSequence) {
        mb mbVar = new mb(W(), this.f30645c);
        mbVar.c(i10, i11, i11, new String[0]);
        mbVar.f30639b.setText(charSequence);
        mbVar.f30639b.setSingleLine(false);
        mbVar.f30639b.setMaxLines(2);
        return b(mbVar, charSequence.length() < 20 ? 1500 : 2750);
    }

    public final ec R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        if (document == null) {
            return new eb();
        }
        ac acVar = new ac(W(), this.f30645c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        n9 n9Var = acVar.f26723a;
        n9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        n9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = acVar.f26724b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        acVar.f26725c.setVisibility(8);
        return b(acVar, spannableStringBuilder.length() < 20 ? 1500 : 2750);
    }

    public final ec T(String str) {
        mb mbVar = new mb(W(), null);
        mbVar.d(R.raw.contact_check, new String[0]);
        mbVar.f30639b.setText(str);
        mbVar.f30639b.setSingleLine(false);
        mbVar.f30639b.setMaxLines(2);
        return b(mbVar, 1500);
    }

    public final ec U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        cb cbVar;
        boolean zIsEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.c6 c6Var = this.f30645c;
        if (zIsEmpty) {
            mb mbVar = new mb(W(), c6Var);
            mbVar.f30639b.setText(str);
            mbVar.f30639b.setSingleLine(false);
            mbVar.f30639b.setMaxLines(2);
            cbVar = mbVar;
        } else {
            bc bcVar = new bc(W(), c6Var);
            bcVar.f27064b.setText(str);
            bcVar.f27065c.setText((CharSequence) null);
            cbVar = bcVar;
        }
        cbVar.setTimer();
        cc ccVar = new cc(W(), c6Var, true, z10);
        ccVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ccVar.f27402a = runnable;
        ccVar.f27403b = runnable2;
        cbVar.setButton(ccVar);
        return b(cbVar, 5000);
    }

    public final ec V(List list, CharSequence charSequence, CharSequence charSequence2, org.telegram.ui.i6 i6Var) {
        float f10;
        int i10;
        Context contextW = W();
        boolean z10 = charSequence2 != null;
        org.telegram.ui.ActionBar.c6 c6Var = this.f30645c;
        dc dcVar = new dc(contextW, c6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    dcVar.f27706a.setCount(i13);
                    dcVar.f27706a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                dcVar.f27706a.setTranslationX(AndroidUtilities.dp(4.0f));
                dcVar.f27706a.setScaleX(1.2f);
                dcVar.f27706a.setScaleY(1.2f);
            } else {
                dcVar.f27706a.setScaleX(1.0f);
                dcVar.f27706a.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i10 = 0;
        }
        dcVar.f27706a.a(false);
        if (charSequence2 != null) {
            dcVar.f27707b.setSingleLine(true);
            dcVar.f27707b.setMaxLines(1);
            dcVar.f27707b.setText(charSequence);
            dcVar.f27708c.setText(charSequence2);
            dcVar.f27708c.setSingleLine(false);
            dcVar.f27708c.setMaxLines(3);
            if (dcVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int iDp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    iDp += AndroidUtilities.dp(f10);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) dcVar.d.getLayoutParams()).rightMargin = iDp;
                } else {
                    ((ViewGroup.MarginLayoutParams) dcVar.d.getLayoutParams()).leftMargin = iDp;
                }
            }
        } else {
            dcVar.f27707b.setSingleLine(false);
            dcVar.f27707b.setMaxLines(4);
            dcVar.f27707b.setText(charSequence);
            if (dcVar.f27707b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int iDp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dcVar.f27707b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    iDp2 += AndroidUtilities.dp(f10);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) dcVar.f27707b.getLayoutParams()).rightMargin = iDp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) dcVar.f27707b.getLayoutParams()).leftMargin = iDp2;
                }
            }
        }
        if (i6Var != null) {
            cc ccVar = new cc(W(), c6Var, true);
            ccVar.e(LocaleController.getString(R.string.UndoNoCaps));
            ccVar.f27402a = (Runnable) i6Var.f38984b;
            ccVar.f27403b = (Runnable) i6Var.f38985c;
            dcVar.setButton(ccVar);
        }
        return b(dcVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.n2 n2Var = this.f30643a;
        if (n2Var != null) {
            context = n2Var.getParentActivity();
            if (context == null && this.f30643a.getLayoutContainer() != null) {
                context = this.f30643a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f30644b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        return context == null ? ApplicationLoader.applicationContext : context;
    }

    public final ec Y(TLRPC.TL_error tL_error) {
        if (LaunchActivity.f35497y1) {
            return tL_error == null ? t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null) : t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
        }
        return new eb();
    }

    public final ec b(cb cbVar, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f30643a;
        return n2Var != null ? ec.g(n2Var, cbVar, i10) : ec.f(this.f30644b, cbVar, i10);
    }

    public final ec c(CharSequence charSequence) {
        if (W() == null) {
            return new eb();
        }
        mb mbVar = new mb(W(), this.f30645c);
        mbVar.d(R.raw.ic_admin, "Shield");
        mbVar.f30639b.setSingleLine(false);
        mbVar.f30639b.setMaxLines(3);
        mbVar.f30639b.setText(charSequence);
        return b(mbVar, 2750);
    }

    public final void c0(String str, boolean z10) {
        if (LaunchActivity.f35497y1) {
            if (TextUtils.isEmpty(str)) {
                ec ecVarT = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                ecVarT.f28028r = false;
                ecVarT.k(z10);
            } else {
                ec ecVarT2 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
                ecVarT2.f28028r = false;
                ecVarT2.k(z10);
            }
        }
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.f35497y1) {
            if (tL_error == null) {
                ec ecVarT = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                ecVarT.f28028r = false;
                ecVarT.k(z10);
            } else if (tL_error.code != 406) {
                ec ecVarT2 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                ecVarT2.f28028r = false;
                ecVarT2.k(z10);
            }
        }
    }

    public final ec e(boolean z10) {
        String string;
        mb mbVar = new mb(W(), this.f30645c);
        if (z10) {
            mbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            mbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        mbVar.f30639b.setText(AndroidUtilities.replaceTags(string));
        return b(mbVar, 1500);
    }

    public final boolean e0(int i10, long j10) {
        org.telegram.ui.ActionBar.n2 n2Var;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (n2Var = this.f30643a) != null) {
            pb pbVar = new pb(i10, n2Var);
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                SpannableStringBuilder spannableStringBuilderReplaceSingleTag = i10 <= 1 ? AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new ag.l3(29)) : AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ag.l3(29));
                pbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                pbVar.f30639b.setText(spannableStringBuilderReplaceSingleTag);
                pbVar.f30639b.setSingleLine(false);
                pbVar.f30639b.setMaxLines(2);
                ec ecVarB = b(pbVar, 3500);
                pbVar.setBulletin(ecVarB);
                ecVarB.f28028r = false;
                ecVarB.k(true);
                return true;
            }
        }
        return false;
    }

    public final ec f(int i10, Runnable runnable) {
        mb mbVar = new mb(W(), null);
        mbVar.d(R.raw.caption_limit, new String[0]);
        String pluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder spannableStringBuilderValueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(pluralString));
        int iIndexOf = pluralString.indexOf(42);
        int i11 = iIndexOf + 1;
        int iIndexOf2 = pluralString.indexOf(42, i11);
        spannableStringBuilderValueOf.replace(iIndexOf, iIndexOf2 + 1, (CharSequence) pluralString.substring(i11, iIndexOf2));
        spannableStringBuilderValueOf.setSpan(new jc(0, runnable), iIndexOf, iIndexOf2 - 1, 33);
        mbVar.f30639b.setText(spannableStringBuilderValueOf);
        mbVar.f30639b.setSingleLine(false);
        mbVar.f30639b.setMaxLines(3);
        return b(mbVar, 5000);
    }

    public final ec g(String str, ArrayList arrayList) {
        dc dcVar = new dc(W(), this.f30645c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                dcVar.f27706a.setCount(i12);
                dcVar.f27706a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            dcVar.f27706a.setTranslationX(AndroidUtilities.dp(4.0f));
            dcVar.f27706a.setScaleX(1.2f);
            dcVar.f27706a.setScaleY(1.2f);
        } else {
            dcVar.f27706a.setScaleX(1.0f);
            dcVar.f27706a.setScaleY(1.0f);
        }
        dcVar.f27706a.a(false);
        dcVar.f27707b.setSingleLine(false);
        dcVar.f27707b.setMaxLines(2);
        dcVar.f27707b.setText(str);
        if (dcVar.f27707b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int iDp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) dcVar.f27707b.getLayoutParams()).rightMargin = iDp;
            } else {
                ((ViewGroup.MarginLayoutParams) dcVar.f27707b.getLayoutParams()).leftMargin = iDp;
            }
        }
        if (LocaleController.isRTL) {
            dcVar.f27706a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(dcVar, 5000);
    }

    public final ec h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        SpannableStringBuilder spannableStringBuilder;
        u80 u80Var;
        int i11;
        TLRPC.StickerSet stickerSet;
        CharSequence charSequenceReplaceTags;
        final TLRPC.InputStickerSet inputStickerSet = MessageObject.getInputStickerSet(document);
        if (inputStickerSet == null) {
            return null;
        }
        final int i12 = 1;
        TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, true);
        final int i13 = 0;
        if (stickerSet2 != null && (stickerSet = stickerSet2.set) != null) {
            if (i10 == 1) {
                charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title));
            } else {
                charSequenceReplaceTags = i10 == 2 ? AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title)) : AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title));
            }
            return q(document, charSequenceReplaceTags, LocaleController.getString(R.string.ViewAction), new Runnable() {
                @Override
                public final void run() {
                    switch (i12) {
                        case 0:
                            callback.run(inputStickerSet);
                            break;
                        default:
                            callback.run(inputStickerSet);
                            break;
                    }
                }
            });
        }
        if (i10 == 1) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, "<{LOADING}>")));
        } else {
            spannableStringBuilder = i10 == 2 ? new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, "<{LOADING}>"))) : new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, "<{LOADING}>")));
        }
        int iIndexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.c6 c6Var = this.f30645c;
        if (iIndexOf >= 0) {
            u80Var = new u80(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), c6Var);
            spannableStringBuilder.setSpan(u80Var, iIndexOf, iIndexOf + 11, 33);
            int i14 = org.telegram.ui.ActionBar.g6.Hi;
            u80Var.a(i0.b.k(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), 32), i0.b.k(org.telegram.ui.ActionBar.g6.v0(i14, c6Var), 72));
        } else {
            u80Var = null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = LocaleController.getString(R.string.ViewAction);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                switch (i13) {
                    case 0:
                        callback.run(inputStickerSet);
                        break;
                    default:
                        callback.run(inputStickerSet);
                        break;
                }
            }
        };
        Context contextW = W();
        lb lbVar = new lb(contextW, c6Var);
        p80 p80Var = new p80(contextW, null);
        lbVar.d = p80Var;
        p80Var.setDisablePaddingsOffset(true);
        p80Var.setSingleLine();
        p80Var.setTypeface(Typeface.SANS_SERIF);
        p80Var.setTextSize(1, 15.0f);
        p80Var.setEllipsize(TextUtils.TruncateAt.END);
        p80Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        lbVar.f30639b.setVisibility(8);
        lbVar.addView(p80Var, h7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i15 = org.telegram.ui.ActionBar.g6.Hi;
        lbVar.setTextColor(lbVar.getThemedColor(i15));
        if (MessageObject.isTextColorEmoji(document)) {
            i11 = 0;
            lbVar.f30638a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i15, false), PorterDuff.Mode.SRC_IN));
        } else {
            i11 = 0;
        }
        lbVar.e(document, new String[i11]);
        lbVar.f30639b.setTextSize(1, 14.0f);
        lbVar.f30639b.setSingleLine(i11);
        lbVar.f30639b.setMaxLines(3);
        p80Var.setText(spannableStringBuilder);
        p80Var.setTextSize(1, 14.0f);
        p80Var.setSingleLine(i11);
        p80Var.setMaxLines(3);
        cc ccVar = new cc(W(), c6Var, true);
        ccVar.e(string);
        ccVar.f27402a = runnable;
        lbVar.setButton(ccVar);
        ec ecVarB = b(lbVar, 2750);
        if (u80Var != null) {
            jb jbVar = ecVarB.f28016e;
            if (jbVar instanceof lb) {
                u80Var.f33014b = ((lb) jbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new ic(i10, ecVarB, jCurrentTimeMillis));
        return ecVarB;
    }

    public final ec i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new eb();
        }
        mb mbVar = new mb(W(), null);
        mbVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        mbVar.f30639b.setText(str);
        return b(mbVar, 1500);
    }

    public final ec k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new eb();
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f30645c;
        if (!z10) {
            mb mbVar = new mb(W(), c6Var);
            mbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            mbVar.f30639b.setText(LocaleController.getString(R.string.LinkCopied));
            return b(mbVar, 1500);
        }
        bc bcVar = new bc(W(), c6Var);
        bcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        bcVar.f27064b.setText(LocaleController.getString(R.string.LinkCopied));
        bcVar.f27065c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
        return b(bcVar, 2750);
    }

    public final ec m(lc lcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.c6 c6Var) {
        mb mbVar = (i11 == 0 || i12 == 0) ? new mb(W(), c6Var) : new mb(i11, i12, W(), c6Var);
        kc kcVar = lcVar.d;
        mbVar.d(kcVar.f30066a, kcVar.f30067b);
        TextView textView = mbVar.f30639b;
        String str = lcVar.f30347a;
        textView.setText(AndroidUtilities.replaceSingleTag(lcVar.f30349c ? LocaleController.formatPluralString(str, i10, new Object[0]) : LocaleController.getString(str, lcVar.f30348b), new gc(0)));
        int i13 = lcVar.d.f30068c;
        if (i13 != 0) {
            mbVar.setIconPaddingBottom(i13);
        }
        return b(mbVar, 1500);
    }

    public final ec n(lc lcVar, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        return m(lcVar, i10, 0, 0, c6Var);
    }

    public final ec o(lc lcVar, org.telegram.ui.ActionBar.c6 c6Var) {
        return m(lcVar, 1, 0, 0, c6Var);
    }

    public final ec p(long j10, String str, String str2) {
        Context contextW = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f30645c;
        zb zbVar = new zb(contextW, c6Var);
        k5 k5Var = new k5(1, UserConfig.selectedAccount, j10);
        n9 n9Var = zbVar.f35218a;
        n9Var.setAnimatedEmojiDrawable(k5Var);
        n9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var), PorterDuff.Mode.SRC_IN));
        zbVar.f35219b.setText(str);
        zbVar.f35220c.setText(str2);
        return b(zbVar, 2750);
    }

    public final ec q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context contextW = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f30645c;
        mb mbVar = new mb(contextW, c6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            mbVar.f30638a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        mbVar.e(document, new String[0]);
        if (mbVar.f30638a.getImageReceiver() != null) {
            mbVar.f30638a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        mbVar.f30639b.setText(charSequence);
        mbVar.f30639b.setTextSize(1, 14.0f);
        mbVar.f30639b.setSingleLine(false);
        mbVar.f30639b.setMaxLines(3);
        cc ccVar = new cc(W(), c6Var, true);
        ccVar.e(str);
        ccVar.f27402a = runnable;
        mbVar.setButton(ccVar);
        return b(mbVar, 2750);
    }

    public final ec r(TLRPC.Document document, String str) {
        mb mbVar = new mb(W(), this.f30645c);
        if (MessageObject.isTextColorEmoji(document)) {
            mbVar.f30638a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        mbVar.e(document, new String[0]);
        mbVar.f30639b.setText(str);
        mbVar.f30639b.setTextSize(1, 14.0f);
        mbVar.f30639b.setSingleLine(false);
        mbVar.f30639b.setMaxLines(3);
        return b(mbVar, 2750);
    }

    public final ec s(TLRPC.Document document, String str, CharSequence charSequence) {
        bc bcVar = new bc(W(), this.f30645c);
        boolean zIsTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ri0 ri0Var = bcVar.f27063a;
        if (zIsTextColorEmoji) {
            ri0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        ri0Var.setAutoRepeat(true);
        ri0Var.g(36, 36, document);
        bcVar.f27064b.setText(str);
        bcVar.f27065c.setText(charSequence);
        return b(bcVar, charSequence.length() + str.length() < 20 ? 1500 : 2750);
    }

    public final ec t(CharSequence charSequence, org.telegram.ui.ActionBar.c6 c6Var) {
        mb mbVar = new mb(W(), c6Var);
        mbVar.d(R.raw.chats_infotip, new String[0]);
        mbVar.f30639b.setText(charSequence);
        mbVar.f30639b.setSingleLine(false);
        mbVar.f30639b.setMaxLines(2);
        return b(mbVar, 1500);
    }

    public final ec u(String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        bc bcVar = new bc(W(), c6Var);
        bcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        bcVar.f27064b.setText(str);
        bcVar.f27065c.setText(str2);
        return b(bcVar, 1500);
    }

    public final ec w(int i10, CharSequence charSequence) {
        Context contextW = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f30645c;
        mb mbVar = new mb(contextW, c6Var);
        mbVar.setBackground(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Fi, c6Var), 12);
        mbVar.f30638a.setImageResource(i10);
        mbVar.f30639b.setText(charSequence);
        mbVar.f30639b.setSingleLine(false);
        mbVar.f30639b.setLines(2);
        mbVar.f30639b.setMaxLines(4);
        TextView textView = mbVar.f30639b;
        textView.setMaxWidth(lh.w3.a(textView.getText(), mbVar.f30639b.getPaint()));
        mbVar.f30639b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) mbVar.f30639b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        mbVar.setWrapWidth();
        return b(mbVar, 5000);
    }

    public final ec y(int i10, TLRPC.Document document, h3.z zVar) {
        Context contextW = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f30645c;
        mb mbVar = new mb(contextW, c6Var);
        mbVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        mbVar.removeView(mbVar.f30639b);
        s5 s5Var = new s5(mbVar.getContext());
        mbVar.f30639b = s5Var;
        s5Var.setTypeface(Typeface.SANS_SERIF);
        mbVar.f30639b.setTextSize(1, 15.0f);
        mbVar.f30639b.setEllipsize(TextUtils.TruncateAt.END);
        mbVar.f30639b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new t5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        mbVar.f30639b.setText(new SpannableStringBuilder(i10 > 1 ? LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]) : LocaleController.getString(R.string.SavedTagMessageTagged)).append((CharSequence) " ").append((CharSequence) spannableString));
        if (zVar != null) {
            cc ccVar = new cc(W(), c6Var, true);
            ccVar.e(LocaleController.getString(R.string.ViewAction));
            ccVar.f27402a = zVar;
            mbVar.setButton(ccVar);
        }
        mbVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hi, c6Var));
        mbVar.addView(mbVar.f30639b, h7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(mbVar, 2750);
    }

    public mc(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f30644b = frameLayout;
        this.f30643a = null;
        this.f30645c = c6Var;
    }
}
