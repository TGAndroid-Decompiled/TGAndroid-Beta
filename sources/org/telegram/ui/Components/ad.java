package org.telegram.ui.Components;

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
public final class ad {
    public final org.telegram.ui.ActionBar.n2 f24662a;
    public final FrameLayout f24663b;
    public final org.telegram.ui.ActionBar.e6 f24664c;

    public ad(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var != null && n2Var.getLastStoryViewer() != null && n2Var.getLastStoryViewer().attachedToParent()) {
            this.f24662a = null;
            ai.f6 currentPeerView = n2Var.getLastStoryViewer().f1283n0.getCurrentPeerView();
            this.f24663b = currentPeerView != null ? currentPeerView.f955c1 : null;
            this.f24664c = n2Var.getLastStoryViewer().f1308y;
            return;
        }
        this.f24662a = n2Var;
        this.f24663b = null;
        this.f24664c = n2Var != null ? n2Var.getResourceProvider() : null;
    }

    public static tc A(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        return z(n2Var, i10, 0, e6Var);
    }

    public static tc B(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, ai.d9 d9Var, org.telegram.ui.ve veVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        String str;
        int i11;
        int i12;
        bc bcVar = new bc(n2Var.getParentActivity(), e6Var);
        if (z10) {
            i10 = R.raw.ic_pin;
        } else {
            i10 = R.raw.ic_unpin;
        }
        bcVar.c(i10, 28, 28, "Pin", "Line");
        TextView textView = bcVar.f24967b;
        if (z10) {
            str = "MessagePinnedHint";
        } else {
            str = "MessageUnpinnedHint";
        }
        if (z10) {
            i11 = R.string.MessagePinnedHint;
        } else {
            i11 = R.string.MessageUnpinnedHint;
        }
        textView.setText(LocaleController.getString(str, i11));
        if (!z10) {
            rc rcVar = new rc(n2Var.getParentActivity(), e6Var, true);
            rcVar.f30421a = d9Var;
            rcVar.f30422b = veVar;
            bcVar.setButton(rcVar);
        }
        if (z10) {
            i12 = 1500;
        } else {
            i12 = 5000;
        }
        return tc.g(n2Var, bcVar, i12);
    }

    public static tc C(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        bc bcVar = new bc(n2Var.getParentActivity(), n2Var.getResourceProvider());
        bcVar.d(R.raw.ic_admin, "Shield");
        bcVar.f24967b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return tc.g(n2Var, bcVar, 1500);
    }

    public static tc D(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        String str2;
        bc bcVar = new bc(n2Var.getParentActivity(), n2Var.getResourceProvider());
        bcVar.d(R.raw.ic_ban, "Hand");
        if (user.deleted) {
            str2 = LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        bcVar.f24967b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, str2, str)));
        return tc.g(n2Var, bcVar, 1500);
    }

    public static tc F(FrameLayout frameLayout, boolean z10) {
        zc zcVar;
        ad adVar = new ad(frameLayout, null);
        if (z10) {
            zcVar = zc.h;
        } else {
            zcVar = zc.f33516e;
        }
        return adVar.m(zcVar, 1, -115203550, -1, null);
    }

    public static tc S(int i10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        String string;
        bc bcVar = new bc(n2Var.getParentActivity(), e6Var);
        boolean z10 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                string = LocaleController.getString(R.string.SoundOffHint);
                z10 = false;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            string = LocaleController.getString(R.string.SoundOnHint);
        }
        if (z10) {
            bcVar.d(R.raw.sound_on, new String[0]);
        } else {
            bcVar.d(R.raw.sound_off, new String[0]);
        }
        bcVar.f24967b.setText(string);
        return tc.g(n2Var, bcVar, 1500);
    }

    public static ad X() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return new ad(ob.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.f3) {
            return new ad(((org.telegram.ui.ActionBar.f3) dialog).container, U.getResourceProvider());
        }
        return a0(U);
    }

    public static ad Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        return new ad(frameLayout, e6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var != null && n2Var.getParentActivity() != null && n2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static ad a0(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == null) {
            return X();
        }
        return new ad(n2Var);
    }

    public static void b0(String str) {
        if (!LaunchActivity.C1) {
            return;
        }
        X().t(LocaleController.formatString(R.string.UnknownErrorCode, str), null).j();
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        if (!LaunchActivity.C1) {
            return;
        }
        if (frameLayout == null) {
            b0(str);
            return;
        }
        tc t10 = new ad(frameLayout, e6Var).t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t10.f31138r = false;
        t10.j();
    }

    public static tc d(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        String string;
        bc bcVar = new bc(n2Var.getParentActivity(), n2Var.getResourceProvider());
        if (z10) {
            bcVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            bcVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        bcVar.f24967b.setText(AndroidUtilities.replaceTags(string));
        return tc.g(n2Var, bcVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.C1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
        }
    }

    public static tc j(org.telegram.ui.ActionBar.n2 n2Var) {
        return a0(n2Var).k(false);
    }

    public static tc l(String str, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        int i10;
        String string;
        int i11;
        int i12;
        bc bcVar = new bc(n2Var.getParentActivity(), n2Var.getResourceProvider());
        if (str != null) {
            if (z10) {
                i12 = R.string.DisableSharingToastDisabledPending;
            } else {
                i12 = R.string.DisableSharingToastEnabledPending;
            }
            string = LocaleController.formatString(i12, str);
        } else {
            if (z10) {
                i10 = R.string.DisableSharingToastDisabled;
            } else {
                i10 = R.string.DisableSharingToastEnabled;
            }
            string = LocaleController.getString(i10);
        }
        bcVar.f24967b.setText(AndroidUtilities.replaceTags(string));
        if (!z10 && str == null) {
            i11 = R.raw.contact_check;
        } else {
            i11 = R.raw.e_hand_2;
        }
        bcVar.d(i11, new String[0]);
        return tc.g(n2Var, bcVar, 5000);
    }

    public static tc v(Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, int i10, long j3, int i11, int i12, int i13, int i14, boolean z10, a3.h0 h0Var) {
        bc bcVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z11;
        ea eaVar;
        SpannableStringBuilder replaceTags;
        tc g10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i15;
        int i16;
        ai.f fVar;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && n2Var != null && i10 <= 1 && j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !z10) {
            bcVar = new ec(i11, n2Var);
        } else {
            if (n2Var != null) {
                e6Var = n2Var.getResourceProvider();
            } else {
                e6Var = null;
            }
            bcVar = new bc(i12, i13, context, e6Var);
        }
        bc bcVar2 = bcVar;
        if (h0Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (h0Var != null) {
            eaVar = new ea(2, zArr, h0Var);
        } else {
            eaVar = null;
        }
        if (i10 <= 1) {
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i11 <= 1) {
                    String string = LocaleController.getString(R.string.FwdMessageToSavedMessages);
                    if (z10) {
                        fVar = new ai.f(27);
                    } else {
                        fVar = new ai.f(25);
                    }
                    replaceTags = AndroidUtilities.replaceSingleTag(string, -1, 2, fVar);
                } else {
                    replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ai.f(25));
                }
                bcVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            } else {
                a3.h0 h0Var2 = new a3.h0(eaVar, n2Var, j3, 17);
                if (DialogObject.isChatDialog(j3)) {
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3));
                    if (i11 <= 1) {
                        if (n2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, h0Var2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title));
                        }
                    } else if (n2Var != null) {
                        replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, h0Var2);
                    } else {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
                    }
                } else {
                    TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j3));
                    if (i11 <= 1) {
                        if (z11) {
                            i16 = R.string.FwdMessageToUserShort;
                        } else {
                            i16 = R.string.FwdMessageToUser;
                        }
                        if (n2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i16, UserObject.getFirstName(user)), -1, 2, h0Var2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i16, UserObject.getFirstName(user)));
                        }
                    } else {
                        if (z11) {
                            i15 = R.string.FwdMessagesToUserShort;
                        } else {
                            i15 = R.string.FwdMessagesToUser;
                        }
                        if (n2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i15, UserObject.getFirstName(user)), -1, 2, h0Var2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i15, UserObject.getFirstName(user)));
                        }
                    }
                }
                bcVar2.c(R.raw.forward, 30, 30, new String[0]);
            }
        } else {
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0]));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            }
            bcVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        bcVar2.f24967b.setText(replaceTags);
        if (z11) {
            Context context2 = bcVar2.getContext();
            if (n2Var != null) {
                e6Var2 = n2Var.getResourceProvider();
            } else {
                e6Var2 = null;
            }
            rc rcVar = new rc(context2, e6Var2, true, true);
            rcVar.f30421a = null;
            rcVar.f30422b = eaVar;
            bcVar2.setButton(rcVar);
        }
        bcVar2.postDelayed(new uc(bcVar2, 1), 300);
        if (frameLayout != null) {
            g10 = tc.f(frameLayout, bcVar2, i14);
        } else if (n2Var != null) {
            g10 = tc.g(n2Var, bcVar2, i14);
        } else {
            throw new IllegalArgumentException();
        }
        if (bcVar2 instanceof ec) {
            bcVar2.f24967b.setSingleLine(false);
            bcVar2.f24967b.setMaxLines(2);
            ((ec) bcVar2).setBulletin(g10);
            g10.f31138r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.tc x(android.app.Activity r5, android.widget.FrameLayout r6, int r7, long r8, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ad.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.tc");
    }

    public static org.telegram.ui.Components.tc z(org.telegram.ui.ActionBar.n2 r5, int r6, int r7, org.telegram.ui.ActionBar.e6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ad.z(org.telegram.ui.ActionBar.n2, int, int, org.telegram.ui.ActionBar.e6):org.telegram.ui.Components.tc");
    }

    public final tc E(org.telegram.ui.ActionBar.e6 e6Var) {
        bc bcVar = new bc(W(), e6Var);
        bcVar.d(R.raw.chats_infotip, new String[0]);
        bcVar.f24967b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(bcVar, 1500);
    }

    public final tc G(int i10, int i11, CharSequence charSequence) {
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        bc bcVar = new bc(W(), this.f24664c);
        bcVar.c(i10, 36, 36, new String[0]);
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (charSequence instanceof SpannableStringBuilder) {
                spannableStringBuilder = (SpannableStringBuilder) charSequence;
            } else {
                spannableStringBuilder = new SpannableStringBuilder(charSequence);
            }
            int i13 = 0;
            for (int indexOf = charSequence2.indexOf(10); indexOf >= 0 && indexOf < charSequence.length(); indexOf = charSequence2.indexOf(10, indexOf + 1)) {
                if (i13 >= i11) {
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) " ");
                }
                i13++;
            }
            charSequence = spannableStringBuilder;
        }
        bcVar.f24967b.setSingleLine(false);
        bcVar.f24967b.setMaxLines(i11);
        bcVar.f24967b.setText(charSequence);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(bcVar, i12);
    }

    public final tc H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final tc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f24664c;
        bc bcVar = new bc(W, e6Var);
        if (i10 != 0) {
            bcVar.c(i10, 36, 36, new String[0]);
        } else {
            bcVar.f24966a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) bcVar.f24967b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        bcVar.f24967b.setTextSize(1, 14.0f);
        bcVar.f24967b.setTextDirection(5);
        bcVar.f24967b.setSingleLine(false);
        bcVar.f24967b.setMaxLines(3);
        bcVar.f24967b.setText(charSequence);
        rc rcVar = new rc(W(), e6Var, true, z10);
        rcVar.e(charSequence2);
        rcVar.f30421a = runnable;
        bcVar.setButton(rcVar);
        return b(bcVar, i11);
    }

    public final tc J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        int i11;
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return I(i10, charSequence, str, i11, false, runnable);
    }

    public final tc K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f24664c;
        qc qcVar = new qc(W, e6Var);
        qcVar.c(i10, 36, 36, new String[0]);
        qcVar.f30141b.setText(str);
        qcVar.f30142c.setText(charSequence);
        rc rcVar = new rc(W(), e6Var, true);
        rcVar.e(str2);
        rcVar.f30421a = runnable;
        qcVar.setButton(rcVar);
        return b(qcVar, 5000);
    }

    public final tc L(Drawable drawable, CharSequence charSequence) {
        bc bcVar = new bc(W(), this.f24664c);
        bcVar.f24966a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.vp0) {
            ((org.telegram.ui.vp0) drawable).e(bcVar.f24966a);
        }
        bcVar.f24967b.setText(charSequence);
        bcVar.f24967b.setSingleLine(false);
        bcVar.f24967b.setMaxLines(2);
        return b(bcVar, 2750);
    }

    public final tc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int i11;
        qc qcVar = new qc(W(), this.f24664c);
        qcVar.c(i10, 36, 36, new String[0]);
        qcVar.f30141b.setText(charSequence);
        qcVar.f30142c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(qcVar, i11);
    }

    public final tc N(String str, String str2) {
        qc qcVar = new qc(W(), this.f24664c);
        qcVar.f30140a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) qcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        qcVar.f30141b.setText(str);
        qcVar.f30142c.setText(str2);
        return b(qcVar, 5000);
    }

    public final tc O(TLRPC.Document document, String str, String str2) {
        int i10;
        if (document == null) {
            return new tc();
        }
        pc pcVar = new pc(W(), this.f24664c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        y9 y9Var = pcVar.f29837a;
        y9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = pcVar.f29838b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = pcVar.f29839c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(pcVar, i10);
    }

    public final tc P(int i10, CharSequence charSequence) {
        int i11;
        bc bcVar = new bc(W(), this.f24664c);
        bcVar.c(i10, 36, 36, new String[0]);
        bcVar.f24967b.setText(charSequence);
        bcVar.f24967b.setSingleLine(false);
        bcVar.f24967b.setTextSize(1, 14.0f);
        bcVar.f24967b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(bcVar, i11);
    }

    public final tc Q(int i10, int i11, CharSequence charSequence) {
        int i12;
        bc bcVar = new bc(W(), this.f24664c);
        bcVar.c(i10, i11, i11, new String[0]);
        bcVar.f24967b.setText(charSequence);
        bcVar.f24967b.setSingleLine(false);
        bcVar.f24967b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(bcVar, i12);
    }

    public final tc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        if (document == null) {
            return new tc();
        }
        pc pcVar = new pc(W(), this.f24664c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        y9 y9Var = pcVar.f29837a;
        y9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = pcVar.f29838b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        pcVar.f29839c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(pcVar, i10);
    }

    public final tc T(String str) {
        bc bcVar = new bc(W(), null);
        bcVar.d(R.raw.contact_check, new String[0]);
        bcVar.f24967b.setText(str);
        bcVar.f24967b.setSingleLine(false);
        bcVar.f24967b.setMaxLines(2);
        return b(bcVar, 1500);
    }

    public final tc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        qc qcVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.e6 e6Var = this.f24664c;
        if (!isEmpty) {
            qc qcVar2 = new qc(W(), e6Var);
            qcVar2.f30141b.setText(str);
            qcVar2.f30142c.setText((CharSequence) null);
            qcVar = qcVar2;
        } else {
            bc bcVar = new bc(W(), e6Var);
            bcVar.f24967b.setText(str);
            bcVar.f24967b.setSingleLine(false);
            bcVar.f24967b.setMaxLines(2);
            qcVar = bcVar;
        }
        qcVar.setTimer();
        rc rcVar = new rc(W(), e6Var, true, z10);
        rcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        rcVar.f30421a = runnable;
        rcVar.f30422b = runnable2;
        qcVar.setButton(rcVar);
        return b(qcVar, 5000);
    }

    public final tc V(List list, CharSequence charSequence, CharSequence charSequence2, n6.t tVar) {
        boolean z10;
        float f7;
        int i10;
        Context W = W();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f24664c;
        sc scVar = new sc(W, e6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    scVar.f30763a.setCount(i13);
                    scVar.f30763a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                scVar.f30763a.setTranslationX(AndroidUtilities.dp(4.0f));
                scVar.f30763a.setScaleX(1.2f);
                scVar.f30763a.setScaleY(1.2f);
            } else {
                scVar.f30763a.setScaleX(1.0f);
                scVar.f30763a.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        scVar.f30763a.a(false);
        if (charSequence2 != null) {
            scVar.f30764b.setSingleLine(true);
            scVar.f30764b.setMaxLines(1);
            scVar.f30764b.setText(charSequence);
            scVar.f30765c.setText(charSequence2);
            scVar.f30765c.setSingleLine(false);
            scVar.f30765c.setMaxLines(3);
            if (scVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) scVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) scVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            scVar.f30764b.setSingleLine(false);
            scVar.f30764b.setMaxLines(4);
            scVar.f30764b.setText(charSequence);
            if (scVar.f30764b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    scVar.f30764b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) scVar.f30764b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) scVar.f30764b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (tVar != null) {
            rc rcVar = new rc(W(), e6Var, true);
            rcVar.e(LocaleController.getString(R.string.UndoNoCaps));
            rcVar.f30421a = (Runnable) tVar.f16717b;
            rcVar.f30422b = (Runnable) tVar.f16718c;
            scVar.setButton(rcVar);
        }
        return b(scVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.n2 n2Var = this.f24662a;
        if (n2Var != null) {
            context = n2Var.getParentActivity();
            if (context == null && this.f24662a.getLayoutContainer() != null) {
                context = this.f24662a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f24663b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return ApplicationLoader.applicationContext;
        }
        return context;
    }

    public final tc Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.C1) {
            return new tc();
        }
        if (tL_error == null) {
            return t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
        }
        return t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final tc b(qb qbVar, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f24662a;
        if (n2Var != null) {
            return tc.g(n2Var, qbVar, i10);
        }
        return tc.f(this.f24663b, qbVar, i10);
    }

    public final tc c(CharSequence charSequence) {
        if (W() == null) {
            return new tc();
        }
        bc bcVar = new bc(W(), this.f24664c);
        bcVar.d(R.raw.ic_admin, "Shield");
        bcVar.f24967b.setSingleLine(false);
        bcVar.f24967b.setMaxLines(3);
        bcVar.f24967b.setText(charSequence);
        return b(bcVar, 2750);
    }

    public final tc e(boolean z10) {
        String string;
        bc bcVar = new bc(W(), this.f24664c);
        if (z10) {
            bcVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            bcVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        bcVar.f24967b.setText(AndroidUtilities.replaceTags(string));
        return b(bcVar, 1500);
    }

    public final void e0(String str, boolean z10) {
        if (!LaunchActivity.C1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            tc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
            t10.f31138r = false;
            t10.k(z10);
            return;
        }
        tc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t11.f31138r = false;
        t11.k(z10);
    }

    public final tc f(int i10, Runnable runnable) {
        bc bcVar = new bc(W(), null);
        bcVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new xc(0, runnable), indexOf, indexOf2 - 1, 33);
        bcVar.f24967b.setText(valueOf);
        bcVar.f24967b.setSingleLine(false);
        bcVar.f24967b.setMaxLines(3);
        return b(bcVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.C1) {
            if (tL_error == null) {
                tc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.f31138r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                tc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.f31138r = false;
                t11.k(z10);
            }
        }
    }

    public final tc g(String str, ArrayList arrayList) {
        sc scVar = new sc(W(), this.f24664c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                scVar.f30763a.setCount(i12);
                scVar.f30763a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            scVar.f30763a.setTranslationX(AndroidUtilities.dp(4.0f));
            scVar.f30763a.setScaleX(1.2f);
            scVar.f30763a.setScaleY(1.2f);
        } else {
            scVar.f30763a.setScaleX(1.0f);
            scVar.f30763a.setScaleY(1.0f);
        }
        scVar.f30763a.a(false);
        scVar.f30764b.setSingleLine(false);
        scVar.f30764b.setMaxLines(2);
        scVar.f30764b.setText(str);
        if (scVar.f30764b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) scVar.f30764b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) scVar.f30764b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            scVar.f30763a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(scVar, 5000);
    }

    public final boolean g0(int i10, long j3) {
        org.telegram.ui.ActionBar.n2 n2Var;
        SpannableStringBuilder replaceSingleTag;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (n2Var = this.f24662a) != null) {
            ec ecVar = new ec(i10, n2Var);
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i10 <= 1) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new ai.f(25));
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ai.f(25));
                }
                ecVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                ecVar.f24967b.setText(replaceSingleTag);
                ecVar.f24967b.setSingleLine(false);
                ecVar.f24967b.setMaxLines(2);
                tc b10 = b(ecVar, 3500);
                ecVar.setBulletin(b10);
                b10.f31138r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final tc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        SpannableStringBuilder spannableStringBuilder;
        ja0 ja0Var;
        TLRPC.InputStickerSet inputStickerSet;
        int i11;
        TLRPC.StickerSet stickerSet;
        SpannableStringBuilder replaceTags;
        final TLRPC.InputStickerSet inputStickerSet2 = MessageObject.getInputStickerSet(document);
        if (inputStickerSet2 == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet2, true);
        if (stickerSet2 != null && (stickerSet = stickerSet2.set) != null) {
            if (i10 == 1) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title));
            } else if (i10 == 2) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, stickerSet.title));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, stickerSet.title));
            }
            return q(document, replaceTags, LocaleController.getString(R.string.ViewAction), new Runnable() {
                @Override
                public final void run() {
                    switch (r3) {
                        case 0:
                            callback.run(inputStickerSet2);
                            return;
                        default:
                            callback.run(inputStickerSet2);
                            return;
                    }
                }
            });
        }
        if (i10 == 1) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, "<{LOADING}>")));
        } else if (i10 == 2) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, "<{LOADING}>")));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, "<{LOADING}>")));
        }
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.e6 e6Var = this.f24664c;
        if (indexOf >= 0) {
            ja0Var = new ja0(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), e6Var);
            spannableStringBuilder.setSpan(ja0Var, indexOf, indexOf + 11, 33);
            int i12 = org.telegram.ui.ActionBar.i6.Hi;
            ja0Var.a(i0.a.k(org.telegram.ui.ActionBar.i6.w0(i12, e6Var), 32), i0.a.k(org.telegram.ui.ActionBar.i6.w0(i12, e6Var), 72));
        } else {
            ja0Var = null;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String string = LocaleController.getString(R.string.ViewAction);
        Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                switch (r3) {
                    case 0:
                        callback.run(inputStickerSet2);
                        return;
                    default:
                        callback.run(inputStickerSet2);
                        return;
                }
            }
        };
        Context W = W();
        ?? bcVar = new bc(W, e6Var);
        ea0 ea0Var = new ea0(W, null);
        bcVar.d = ea0Var;
        ea0Var.setDisablePaddingsOffset(true);
        ea0Var.setSingleLine();
        ea0Var.setTypeface(Typeface.SANS_SERIF);
        ea0Var.setTextSize(1, 15.0f);
        ea0Var.setEllipsize(TextUtils.TruncateAt.END);
        ea0Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        bcVar.f24967b.setVisibility(8);
        bcVar.addView(ea0Var, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i13 = org.telegram.ui.ActionBar.i6.Hi;
        bcVar.setTextColor(bcVar.getThemedColor(i13));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            bcVar.f24966a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, i13, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        bcVar.e(document, new String[i11]);
        bcVar.f24967b.setTextSize(1, 14.0f);
        bcVar.f24967b.setSingleLine(i11);
        bcVar.f24967b.setMaxLines(3);
        ea0Var.setText(spannableStringBuilder);
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setSingleLine(i11);
        ea0Var.setMaxLines(3);
        rc rcVar = new rc(W(), e6Var, true);
        rcVar.e(string);
        rcVar.f30421a = runnable;
        bcVar.setButton(rcVar);
        tc b10 = b(bcVar, 2750);
        if (ja0Var != null) {
            xb xbVar = b10.f31126e;
            if (xbVar instanceof zb) {
                ja0Var.f27670b = ((zb) xbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new wc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final tc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new tc();
        }
        bc bcVar = new bc(W(), null);
        bcVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        bcVar.f24967b.setText(str);
        return b(bcVar, 1500);
    }

    public final tc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new tc();
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f24664c;
        if (z10) {
            qc qcVar = new qc(W(), e6Var);
            qcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            qcVar.f30141b.setText(LocaleController.getString(R.string.LinkCopied));
            qcVar.f30142c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
            return b(qcVar, 2750);
        }
        bc bcVar = new bc(W(), e6Var);
        bcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        bcVar.f24967b.setText(LocaleController.getString(R.string.LinkCopied));
        return b(bcVar, 1500);
    }

    public final tc m(zc zcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.e6 e6Var) {
        bc bcVar;
        String string;
        if (i11 != 0 && i12 != 0) {
            bcVar = new bc(i11, i12, W(), e6Var);
        } else {
            bcVar = new bc(W(), e6Var);
        }
        yc ycVar = zcVar.d;
        bcVar.d(ycVar.f33189a, ycVar.f33190b);
        TextView textView = bcVar.f24967b;
        String str = zcVar.f33524a;
        if (zcVar.f33526c) {
            string = LocaleController.formatPluralString(str, i10, new Object[0]);
        } else {
            string = LocaleController.getString(str, zcVar.f33525b);
        }
        textView.setText(AndroidUtilities.replaceSingleTag(string, new ai.f(26)));
        int i13 = zcVar.d.f33191c;
        if (i13 != 0) {
            bcVar.setIconPaddingBottom(i13);
        }
        return b(bcVar, 1500);
    }

    public final tc n(zc zcVar, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        return m(zcVar, i10, 0, 0, e6Var);
    }

    public final tc o(zc zcVar, org.telegram.ui.ActionBar.e6 e6Var) {
        return m(zcVar, 1, 0, 0, e6Var);
    }

    public final tc p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f24664c;
        oc ocVar = new oc(W, e6Var);
        s5 s5Var = new s5(1, UserConfig.selectedAccount, j3);
        y9 y9Var = ocVar.f29447a;
        y9Var.setAnimatedEmojiDrawable(s5Var);
        y9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var), PorterDuff.Mode.SRC_IN));
        ocVar.f29448b.setText(str);
        ocVar.f29449c.setText(str2);
        return b(ocVar, 2750);
    }

    public final tc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f24664c;
        bc bcVar = new bc(W, e6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            bcVar.f24966a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        bcVar.e(document, new String[0]);
        if (bcVar.f24966a.getImageReceiver() != null) {
            bcVar.f24966a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        bcVar.f24967b.setText(charSequence);
        bcVar.f24967b.setTextSize(1, 14.0f);
        bcVar.f24967b.setSingleLine(false);
        bcVar.f24967b.setMaxLines(3);
        rc rcVar = new rc(W(), e6Var, true);
        rcVar.e(str);
        rcVar.f30421a = runnable;
        bcVar.setButton(rcVar);
        return b(bcVar, 2750);
    }

    public final tc r(TLRPC.Document document, String str) {
        bc bcVar = new bc(W(), this.f24664c);
        if (MessageObject.isTextColorEmoji(document)) {
            bcVar.f24966a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        bcVar.e(document, new String[0]);
        bcVar.f24967b.setText(str);
        bcVar.f24967b.setTextSize(1, 14.0f);
        bcVar.f24967b.setSingleLine(false);
        bcVar.f24967b.setMaxLines(3);
        return b(bcVar, 2750);
    }

    public final tc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i10;
        qc qcVar = new qc(W(), this.f24664c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        fk0 fk0Var = qcVar.f30140a;
        if (isTextColorEmoji) {
            fk0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        fk0Var.setAutoRepeat(true);
        fk0Var.g(36, 36, document);
        qcVar.f30141b.setText(str);
        qcVar.f30142c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(qcVar, i10);
    }

    public final tc t(CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        bc bcVar = new bc(W(), e6Var);
        bcVar.d(R.raw.chats_infotip, new String[0]);
        bcVar.f24967b.setText(charSequence);
        bcVar.f24967b.setSingleLine(false);
        bcVar.f24967b.setMaxLines(2);
        return b(bcVar, 1500);
    }

    public final tc u(String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        qc qcVar = new qc(W(), e6Var);
        qcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        qcVar.f30141b.setText(str);
        qcVar.f30142c.setText(str2);
        return b(qcVar, 1500);
    }

    public final tc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f24664c;
        bc bcVar = new bc(W, e6Var);
        bcVar.setBackground(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Fi, e6Var), 12);
        bcVar.f24966a.setImageResource(i10);
        bcVar.f24967b.setText(charSequence);
        bcVar.f24967b.setSingleLine(false);
        bcVar.f24967b.setLines(2);
        bcVar.f24967b.setMaxLines(4);
        TextView textView = bcVar.f24967b;
        textView.setMaxWidth(ci.d4.a(textView.getText(), bcVar.f24967b.getPaint()));
        bcVar.f24967b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) bcVar.f24967b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        bcVar.setWrapWidth();
        return b(bcVar, 5000);
    }

    public final tc y(int i10, TLRPC.Document document, gg.n nVar) {
        String string;
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f24664c;
        bc bcVar = new bc(W, e6Var);
        bcVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        bcVar.removeView(bcVar.f24967b);
        a6 a6Var = new a6(bcVar.getContext());
        bcVar.f24967b = a6Var;
        a6Var.setTypeface(Typeface.SANS_SERIF);
        bcVar.f24967b.setTextSize(1, 15.0f);
        bcVar.f24967b.setEllipsize(TextUtils.TruncateAt.END);
        bcVar.f24967b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new b6(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = bcVar.f24967b;
        if (i10 > 1) {
            string = LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]);
        } else {
            string = LocaleController.getString(R.string.SavedTagMessageTagged);
        }
        textView.setText(new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) spannableString));
        if (nVar != null) {
            rc rcVar = new rc(W(), e6Var, true);
            rcVar.e(LocaleController.getString(R.string.ViewAction));
            rcVar.f30421a = nVar;
            bcVar.setButton(rcVar);
        }
        bcVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Hi, e6Var));
        bcVar.addView(bcVar.f24967b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(bcVar, 2750);
    }

    public ad(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f24663b = frameLayout;
        this.f24662a = null;
        this.f24664c = e6Var;
    }
}
