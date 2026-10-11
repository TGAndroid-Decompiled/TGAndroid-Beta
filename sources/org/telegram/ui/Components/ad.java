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
    public final org.telegram.ui.ActionBar.m2 f24560a;
    public final FrameLayout f24561b;
    public final org.telegram.ui.ActionBar.d6 f24562c;

    public ad(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var != null && m2Var.getLastStoryViewer() != null && m2Var.getLastStoryViewer().attachedToParent()) {
            this.f24560a = null;
            ai.f6 currentPeerView = m2Var.getLastStoryViewer().f1283n0.getCurrentPeerView();
            this.f24561b = currentPeerView != null ? currentPeerView.f955c1 : null;
            this.f24562c = m2Var.getLastStoryViewer().f1308y;
            return;
        }
        this.f24560a = m2Var;
        this.f24561b = null;
        this.f24562c = m2Var != null ? m2Var.getResourceProvider() : null;
    }

    public static sc A(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        return z(m2Var, i10, 0, d6Var);
    }

    public static sc B(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, ai.d9 d9Var, org.telegram.ui.ue ueVar, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        String str;
        int i11;
        int i12;
        ac acVar = new ac(m2Var.getParentActivity(), d6Var);
        if (z10) {
            i10 = R.raw.ic_pin;
        } else {
            i10 = R.raw.ic_unpin;
        }
        acVar.c(i10, 28, 28, "Pin", "Line");
        TextView textView = acVar.f24555b;
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
            qc qcVar = new qc(m2Var.getParentActivity(), d6Var, true);
            qcVar.f30224a = d9Var;
            qcVar.f30225b = ueVar;
            acVar.setButton(qcVar);
        }
        if (z10) {
            i12 = 1500;
        } else {
            i12 = 5000;
        }
        return sc.g(m2Var, acVar, i12);
    }

    public static sc C(org.telegram.ui.ActionBar.m2 m2Var, String str) {
        ac acVar = new ac(m2Var.getParentActivity(), m2Var.getResourceProvider());
        acVar.d(R.raw.ic_admin, "Shield");
        acVar.f24555b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return sc.g(m2Var, acVar, 1500);
    }

    public static sc D(org.telegram.ui.ActionBar.m2 m2Var, TLRPC.User user, String str) {
        String str2;
        ac acVar = new ac(m2Var.getParentActivity(), m2Var.getResourceProvider());
        acVar.d(R.raw.ic_ban, "Hand");
        if (user.deleted) {
            str2 = LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        acVar.f24555b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, str2, str)));
        return sc.g(m2Var, acVar, 1500);
    }

    public static sc F(FrameLayout frameLayout, boolean z10) {
        zc zcVar;
        ad adVar = new ad(frameLayout, null);
        if (z10) {
            zcVar = zc.h;
        } else {
            zcVar = zc.f33597e;
        }
        return adVar.m(zcVar, 1, -115203550, -1, null);
    }

    public static sc S(int i10, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        String string;
        ac acVar = new ac(m2Var.getParentActivity(), d6Var);
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
            acVar.d(R.raw.sound_on, new String[0]);
        } else {
            acVar.d(R.raw.sound_off, new String[0]);
        }
        acVar.f24555b.setText(string);
        return sc.g(m2Var, acVar, 1500);
    }

    public static ad X() {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return new ad(nb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.e3) {
            return new ad(((org.telegram.ui.ActionBar.e3) dialog).container, U.getResourceProvider());
        }
        return a0(U);
    }

    public static ad Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var) {
        return new ad(frameLayout, d6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var != null && m2Var.getParentActivity() != null && m2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static ad a0(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var == null) {
            return X();
        }
        return new ad(m2Var);
    }

    public static void b0(String str) {
        if (!LaunchActivity.C1) {
            return;
        }
        X().t(LocaleController.formatString(R.string.UnknownErrorCode, str), null).j();
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var) {
        if (!LaunchActivity.C1) {
            return;
        }
        if (frameLayout == null) {
            b0(str);
            return;
        }
        sc t10 = new ad(frameLayout, d6Var).t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t10.f30841r = false;
        t10.j();
    }

    public static sc d(org.telegram.ui.ActionBar.m2 m2Var, boolean z10) {
        String string;
        ac acVar = new ac(m2Var.getParentActivity(), m2Var.getResourceProvider());
        if (z10) {
            acVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            acVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        acVar.f24555b.setText(AndroidUtilities.replaceTags(string));
        return sc.g(m2Var, acVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.C1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
        }
    }

    public static sc j(org.telegram.ui.ActionBar.m2 m2Var) {
        return a0(m2Var).k(false);
    }

    public static sc l(String str, org.telegram.ui.ActionBar.m2 m2Var, boolean z10) {
        int i10;
        String string;
        int i11;
        int i12;
        ac acVar = new ac(m2Var.getParentActivity(), m2Var.getResourceProvider());
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
        acVar.f24555b.setText(AndroidUtilities.replaceTags(string));
        if (!z10 && str == null) {
            i11 = R.raw.contact_check;
        } else {
            i11 = R.raw.e_hand_2;
        }
        acVar.d(i11, new String[0]);
        return sc.g(m2Var, acVar, 5000);
    }

    public static sc v(Context context, org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, int i10, long j3, int i11, int i12, int i13, int i14, boolean z10, a3.h0 h0Var) {
        ac acVar;
        org.telegram.ui.ActionBar.d6 d6Var;
        boolean z11;
        wc wcVar;
        SpannableStringBuilder replaceTags;
        sc g10;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i15;
        int i16;
        ai.f fVar;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && m2Var != null && i10 <= 1 && j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !z10) {
            acVar = new dc(i11, m2Var);
        } else {
            if (m2Var != null) {
                d6Var = m2Var.getResourceProvider();
            } else {
                d6Var = null;
            }
            acVar = new ac(i12, i13, context, d6Var);
        }
        ac acVar2 = acVar;
        if (h0Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (h0Var != null) {
            wcVar = new wc(1, zArr, h0Var);
        } else {
            wcVar = null;
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
                acVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            } else {
                a3.h0 h0Var2 = new a3.h0(wcVar, m2Var, j3, 16);
                if (DialogObject.isChatDialog(j3)) {
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3));
                    if (i11 <= 1) {
                        if (m2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, h0Var2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title));
                        }
                    } else if (m2Var != null) {
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
                        if (m2Var != null) {
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
                        if (m2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i15, UserObject.getFirstName(user)), -1, 2, h0Var2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i15, UserObject.getFirstName(user)));
                        }
                    }
                }
                acVar2.c(R.raw.forward, 30, 30, new String[0]);
            }
        } else {
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0]));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            }
            acVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        acVar2.f24555b.setText(replaceTags);
        if (z11) {
            Context context2 = acVar2.getContext();
            if (m2Var != null) {
                d6Var2 = m2Var.getResourceProvider();
            } else {
                d6Var2 = null;
            }
            qc qcVar = new qc(context2, d6Var2, true, true);
            qcVar.f30224a = null;
            qcVar.f30225b = wcVar;
            acVar2.setButton(qcVar);
        }
        acVar2.postDelayed(new tc(acVar2, 1), 300);
        if (frameLayout != null) {
            g10 = sc.f(frameLayout, acVar2, i14);
        } else if (m2Var != null) {
            g10 = sc.g(m2Var, acVar2, i14);
        } else {
            throw new IllegalArgumentException();
        }
        if (acVar2 instanceof dc) {
            acVar2.f24555b.setSingleLine(false);
            acVar2.f24555b.setMaxLines(2);
            ((dc) acVar2).setBulletin(g10);
            g10.f30841r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.sc x(android.app.Activity r5, android.widget.FrameLayout r6, int r7, long r8, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ad.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.sc");
    }

    public static org.telegram.ui.Components.sc z(org.telegram.ui.ActionBar.m2 r5, int r6, int r7, org.telegram.ui.ActionBar.d6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ad.z(org.telegram.ui.ActionBar.m2, int, int, org.telegram.ui.ActionBar.d6):org.telegram.ui.Components.sc");
    }

    public final sc E(org.telegram.ui.ActionBar.d6 d6Var) {
        ac acVar = new ac(W(), d6Var);
        acVar.d(R.raw.chats_infotip, new String[0]);
        acVar.f24555b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(acVar, 1500);
    }

    public final sc G(int i10, int i11, CharSequence charSequence) {
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        ac acVar = new ac(W(), this.f24562c);
        acVar.c(i10, 36, 36, new String[0]);
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
        acVar.f24555b.setSingleLine(false);
        acVar.f24555b.setMaxLines(i11);
        acVar.f24555b.setText(charSequence);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(acVar, i12);
    }

    public final sc H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final sc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.d6 d6Var = this.f24562c;
        ac acVar = new ac(W, d6Var);
        if (i10 != 0) {
            acVar.c(i10, 36, 36, new String[0]);
        } else {
            acVar.f24554a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) acVar.f24555b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        acVar.f24555b.setTextSize(1, 14.0f);
        acVar.f24555b.setTextDirection(5);
        acVar.f24555b.setSingleLine(false);
        acVar.f24555b.setMaxLines(3);
        acVar.f24555b.setText(charSequence);
        qc qcVar = new qc(W(), d6Var, true, z10);
        qcVar.e(charSequence2);
        qcVar.f30224a = runnable;
        acVar.setButton(qcVar);
        return b(acVar, i11);
    }

    public final sc J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        int i11;
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return I(i10, charSequence, str, i11, false, runnable);
    }

    public final sc K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.d6 d6Var = this.f24562c;
        pc pcVar = new pc(W, d6Var);
        pcVar.c(i10, 36, 36, new String[0]);
        pcVar.f29840b.setText(str);
        pcVar.f29841c.setText(charSequence);
        qc qcVar = new qc(W(), d6Var, true);
        qcVar.e(str2);
        qcVar.f30224a = runnable;
        pcVar.setButton(qcVar);
        return b(pcVar, 5000);
    }

    public final sc L(Drawable drawable, CharSequence charSequence) {
        ac acVar = new ac(W(), this.f24562c);
        acVar.f24554a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.up0) {
            ((org.telegram.ui.up0) drawable).e(acVar.f24554a);
        }
        acVar.f24555b.setText(charSequence);
        acVar.f24555b.setSingleLine(false);
        acVar.f24555b.setMaxLines(2);
        return b(acVar, 2750);
    }

    public final sc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int i11;
        pc pcVar = new pc(W(), this.f24562c);
        pcVar.c(i10, 36, 36, new String[0]);
        pcVar.f29840b.setText(charSequence);
        pcVar.f29841c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(pcVar, i11);
    }

    public final sc N(String str, String str2) {
        pc pcVar = new pc(W(), this.f24562c);
        pcVar.f29839a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) pcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        pcVar.f29840b.setText(str);
        pcVar.f29841c.setText(str2);
        return b(pcVar, 5000);
    }

    public final sc O(TLRPC.Document document, String str, String str2) {
        int i10;
        if (document == null) {
            return new sc();
        }
        oc ocVar = new oc(W(), this.f24562c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        y9 y9Var = ocVar.f29470a;
        y9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ocVar.f29471b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = ocVar.f29472c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(ocVar, i10);
    }

    public final sc P(int i10, CharSequence charSequence) {
        int i11;
        ac acVar = new ac(W(), this.f24562c);
        acVar.c(i10, 36, 36, new String[0]);
        acVar.f24555b.setText(charSequence);
        acVar.f24555b.setSingleLine(false);
        acVar.f24555b.setTextSize(1, 14.0f);
        acVar.f24555b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(acVar, i11);
    }

    public final sc Q(int i10, int i11, CharSequence charSequence) {
        int i12;
        ac acVar = new ac(W(), this.f24562c);
        acVar.c(i10, i11, i11, new String[0]);
        acVar.f24555b.setText(charSequence);
        acVar.f24555b.setSingleLine(false);
        acVar.f24555b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(acVar, i12);
    }

    public final sc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        if (document == null) {
            return new sc();
        }
        oc ocVar = new oc(W(), this.f24562c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        y9 y9Var = ocVar.f29470a;
        y9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ocVar.f29471b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        ocVar.f29472c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(ocVar, i10);
    }

    public final sc T(String str) {
        ac acVar = new ac(W(), null);
        acVar.d(R.raw.contact_check, new String[0]);
        acVar.f24555b.setText(str);
        acVar.f24555b.setSingleLine(false);
        acVar.f24555b.setMaxLines(2);
        return b(acVar, 1500);
    }

    public final sc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        pc pcVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.d6 d6Var = this.f24562c;
        if (!isEmpty) {
            pc pcVar2 = new pc(W(), d6Var);
            pcVar2.f29840b.setText(str);
            pcVar2.f29841c.setText((CharSequence) null);
            pcVar = pcVar2;
        } else {
            ac acVar = new ac(W(), d6Var);
            acVar.f24555b.setText(str);
            acVar.f24555b.setSingleLine(false);
            acVar.f24555b.setMaxLines(2);
            pcVar = acVar;
        }
        pcVar.setTimer();
        qc qcVar = new qc(W(), d6Var, true, z10);
        qcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        qcVar.f30224a = runnable;
        qcVar.f30225b = runnable2;
        pcVar.setButton(qcVar);
        return b(pcVar, 5000);
    }

    public final sc V(List list, CharSequence charSequence, CharSequence charSequence2, n6.k kVar) {
        boolean z10;
        float f7;
        int i10;
        Context W = W();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f24562c;
        rc rcVar = new rc(W, d6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    rcVar.f30496a.setCount(i13);
                    rcVar.f30496a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                rcVar.f30496a.setTranslationX(AndroidUtilities.dp(4.0f));
                rcVar.f30496a.setScaleX(1.2f);
                rcVar.f30496a.setScaleY(1.2f);
            } else {
                rcVar.f30496a.setScaleX(1.0f);
                rcVar.f30496a.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        rcVar.f30496a.a(false);
        if (charSequence2 != null) {
            rcVar.f30497b.setSingleLine(true);
            rcVar.f30497b.setMaxLines(1);
            rcVar.f30497b.setText(charSequence);
            rcVar.f30498c.setText(charSequence2);
            rcVar.f30498c.setSingleLine(false);
            rcVar.f30498c.setMaxLines(3);
            if (rcVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) rcVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) rcVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            rcVar.f30497b.setSingleLine(false);
            rcVar.f30497b.setMaxLines(4);
            rcVar.f30497b.setText(charSequence);
            if (rcVar.f30497b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    rcVar.f30497b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) rcVar.f30497b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) rcVar.f30497b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (kVar != null) {
            qc qcVar = new qc(W(), d6Var, true);
            qcVar.e(LocaleController.getString(R.string.UndoNoCaps));
            qcVar.f30224a = (Runnable) kVar.f16765b;
            qcVar.f30225b = (Runnable) kVar.f16766c;
            rcVar.setButton(qcVar);
        }
        return b(rcVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.m2 m2Var = this.f24560a;
        if (m2Var != null) {
            context = m2Var.getParentActivity();
            if (context == null && this.f24560a.getLayoutContainer() != null) {
                context = this.f24560a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f24561b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return ApplicationLoader.applicationContext;
        }
        return context;
    }

    public final sc Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.C1) {
            return new sc();
        }
        if (tL_error == null) {
            return t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
        }
        return t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final sc b(pb pbVar, int i10) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f24560a;
        if (m2Var != null) {
            return sc.g(m2Var, pbVar, i10);
        }
        return sc.f(this.f24561b, pbVar, i10);
    }

    public final sc c(CharSequence charSequence) {
        if (W() == null) {
            return new sc();
        }
        ac acVar = new ac(W(), this.f24562c);
        acVar.d(R.raw.ic_admin, "Shield");
        acVar.f24555b.setSingleLine(false);
        acVar.f24555b.setMaxLines(3);
        acVar.f24555b.setText(charSequence);
        return b(acVar, 2750);
    }

    public final sc e(boolean z10) {
        String string;
        ac acVar = new ac(W(), this.f24562c);
        if (z10) {
            acVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            acVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        acVar.f24555b.setText(AndroidUtilities.replaceTags(string));
        return b(acVar, 1500);
    }

    public final void e0(String str, boolean z10) {
        if (!LaunchActivity.C1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            sc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
            t10.f30841r = false;
            t10.k(z10);
            return;
        }
        sc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t11.f30841r = false;
        t11.k(z10);
    }

    public final sc f(int i10, Runnable runnable) {
        ac acVar = new ac(W(), null);
        acVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new xc(0, runnable), indexOf, indexOf2 - 1, 33);
        acVar.f24555b.setText(valueOf);
        acVar.f24555b.setSingleLine(false);
        acVar.f24555b.setMaxLines(3);
        return b(acVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.C1) {
            if (tL_error == null) {
                sc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.f30841r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                sc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.f30841r = false;
                t11.k(z10);
            }
        }
    }

    public final sc g(String str, ArrayList arrayList) {
        rc rcVar = new rc(W(), this.f24562c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                rcVar.f30496a.setCount(i12);
                rcVar.f30496a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            rcVar.f30496a.setTranslationX(AndroidUtilities.dp(4.0f));
            rcVar.f30496a.setScaleX(1.2f);
            rcVar.f30496a.setScaleY(1.2f);
        } else {
            rcVar.f30496a.setScaleX(1.0f);
            rcVar.f30496a.setScaleY(1.0f);
        }
        rcVar.f30496a.a(false);
        rcVar.f30497b.setSingleLine(false);
        rcVar.f30497b.setMaxLines(2);
        rcVar.f30497b.setText(str);
        if (rcVar.f30497b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) rcVar.f30497b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) rcVar.f30497b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            rcVar.f30496a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(rcVar, 5000);
    }

    public final boolean g0(int i10, long j3) {
        org.telegram.ui.ActionBar.m2 m2Var;
        SpannableStringBuilder replaceSingleTag;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (m2Var = this.f24560a) != null) {
            dc dcVar = new dc(i10, m2Var);
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i10 <= 1) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new ai.f(25));
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ai.f(25));
                }
                dcVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                dcVar.f24555b.setText(replaceSingleTag);
                dcVar.f24555b.setSingleLine(false);
                dcVar.f24555b.setMaxLines(2);
                sc b10 = b(dcVar, 3500);
                dcVar.setBulletin(b10);
                b10.f30841r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final sc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f24562c;
        if (indexOf >= 0) {
            ja0Var = new ja0(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), d6Var);
            spannableStringBuilder.setSpan(ja0Var, indexOf, indexOf + 11, 33);
            int i12 = org.telegram.ui.ActionBar.h6.Hi;
            ja0Var.a(i0.a.k(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), 32), i0.a.k(org.telegram.ui.ActionBar.h6.w0(i12, d6Var), 72));
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
        ?? acVar = new ac(W, d6Var);
        ea0 ea0Var = new ea0(W, null);
        acVar.d = ea0Var;
        ea0Var.setDisablePaddingsOffset(true);
        ea0Var.setSingleLine();
        ea0Var.setTypeface(Typeface.SANS_SERIF);
        ea0Var.setTextSize(1, 15.0f);
        ea0Var.setEllipsize(TextUtils.TruncateAt.END);
        ea0Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        acVar.f24555b.setVisibility(8);
        acVar.addView(ea0Var, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i13 = org.telegram.ui.ActionBar.h6.Hi;
        acVar.setTextColor(acVar.getThemedColor(i13));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            acVar.f24554a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i13, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        acVar.e(document, new String[i11]);
        acVar.f24555b.setTextSize(1, 14.0f);
        acVar.f24555b.setSingleLine(i11);
        acVar.f24555b.setMaxLines(3);
        ea0Var.setText(spannableStringBuilder);
        ea0Var.setTextSize(1, 14.0f);
        ea0Var.setSingleLine(i11);
        ea0Var.setMaxLines(3);
        qc qcVar = new qc(W(), d6Var, true);
        qcVar.e(string);
        qcVar.f30224a = runnable;
        acVar.setButton(qcVar);
        sc b10 = b(acVar, 2750);
        if (ja0Var != null) {
            wb wbVar = b10.f30829e;
            if (wbVar instanceof yb) {
                ja0Var.f27686b = ((yb) wbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new vc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final sc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new sc();
        }
        ac acVar = new ac(W(), null);
        acVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        acVar.f24555b.setText(str);
        return b(acVar, 1500);
    }

    public final sc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new sc();
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f24562c;
        if (z10) {
            pc pcVar = new pc(W(), d6Var);
            pcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            pcVar.f29840b.setText(LocaleController.getString(R.string.LinkCopied));
            pcVar.f29841c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
            return b(pcVar, 2750);
        }
        ac acVar = new ac(W(), d6Var);
        acVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        acVar.f24555b.setText(LocaleController.getString(R.string.LinkCopied));
        return b(acVar, 1500);
    }

    public final sc m(zc zcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        ac acVar;
        String string;
        if (i11 != 0 && i12 != 0) {
            acVar = new ac(i11, i12, W(), d6Var);
        } else {
            acVar = new ac(W(), d6Var);
        }
        yc ycVar = zcVar.d;
        acVar.d(ycVar.f33224a, ycVar.f33225b);
        TextView textView = acVar.f24555b;
        String str = zcVar.f33605a;
        if (zcVar.f33607c) {
            string = LocaleController.formatPluralString(str, i10, new Object[0]);
        } else {
            string = LocaleController.getString(str, zcVar.f33606b);
        }
        textView.setText(AndroidUtilities.replaceSingleTag(string, new ai.f(26)));
        int i13 = zcVar.d.f33226c;
        if (i13 != 0) {
            acVar.setIconPaddingBottom(i13);
        }
        return b(acVar, 1500);
    }

    public final sc n(zc zcVar, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        return m(zcVar, i10, 0, 0, d6Var);
    }

    public final sc o(zc zcVar, org.telegram.ui.ActionBar.d6 d6Var) {
        return m(zcVar, 1, 0, 0, d6Var);
    }

    public final sc p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.d6 d6Var = this.f24562c;
        nc ncVar = new nc(W, d6Var);
        s5 s5Var = new s5(1, UserConfig.selectedAccount, j3);
        y9 y9Var = ncVar.f29143a;
        y9Var.setAnimatedEmojiDrawable(s5Var);
        y9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var), PorterDuff.Mode.SRC_IN));
        ncVar.f29144b.setText(str);
        ncVar.f29145c.setText(str2);
        return b(ncVar, 2750);
    }

    public final sc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.d6 d6Var = this.f24562c;
        ac acVar = new ac(W, d6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            acVar.f24554a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        acVar.e(document, new String[0]);
        if (acVar.f24554a.getImageReceiver() != null) {
            acVar.f24554a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        acVar.f24555b.setText(charSequence);
        acVar.f24555b.setTextSize(1, 14.0f);
        acVar.f24555b.setSingleLine(false);
        acVar.f24555b.setMaxLines(3);
        qc qcVar = new qc(W(), d6Var, true);
        qcVar.e(str);
        qcVar.f30224a = runnable;
        acVar.setButton(qcVar);
        return b(acVar, 2750);
    }

    public final sc r(TLRPC.Document document, String str) {
        ac acVar = new ac(W(), this.f24562c);
        if (MessageObject.isTextColorEmoji(document)) {
            acVar.f24554a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        acVar.e(document, new String[0]);
        acVar.f24555b.setText(str);
        acVar.f24555b.setTextSize(1, 14.0f);
        acVar.f24555b.setSingleLine(false);
        acVar.f24555b.setMaxLines(3);
        return b(acVar, 2750);
    }

    public final sc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i10;
        pc pcVar = new pc(W(), this.f24562c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        gk0 gk0Var = pcVar.f29839a;
        if (isTextColorEmoji) {
            gk0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        gk0Var.setAutoRepeat(true);
        gk0Var.g(36, 36, document);
        pcVar.f29840b.setText(str);
        pcVar.f29841c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(pcVar, i10);
    }

    public final sc t(CharSequence charSequence, org.telegram.ui.ActionBar.d6 d6Var) {
        ac acVar = new ac(W(), d6Var);
        acVar.d(R.raw.chats_infotip, new String[0]);
        acVar.f24555b.setText(charSequence);
        acVar.f24555b.setSingleLine(false);
        acVar.f24555b.setMaxLines(2);
        return b(acVar, 1500);
    }

    public final sc u(String str, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        pc pcVar = new pc(W(), d6Var);
        pcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        pcVar.f29840b.setText(str);
        pcVar.f29841c.setText(str2);
        return b(pcVar, 1500);
    }

    public final sc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.d6 d6Var = this.f24562c;
        ac acVar = new ac(W, d6Var);
        acVar.setBackground(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Fi, d6Var), 12);
        acVar.f24554a.setImageResource(i10);
        acVar.f24555b.setText(charSequence);
        acVar.f24555b.setSingleLine(false);
        acVar.f24555b.setLines(2);
        acVar.f24555b.setMaxLines(4);
        TextView textView = acVar.f24555b;
        textView.setMaxWidth(ci.d4.a(textView.getText(), acVar.f24555b.getPaint()));
        acVar.f24555b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) acVar.f24555b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        acVar.setWrapWidth();
        return b(acVar, 5000);
    }

    public final sc y(int i10, TLRPC.Document document, gg.n nVar) {
        String string;
        Context W = W();
        org.telegram.ui.ActionBar.d6 d6Var = this.f24562c;
        ac acVar = new ac(W, d6Var);
        acVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        acVar.removeView(acVar.f24555b);
        a6 a6Var = new a6(acVar.getContext());
        acVar.f24555b = a6Var;
        a6Var.setTypeface(Typeface.SANS_SERIF);
        acVar.f24555b.setTextSize(1, 15.0f);
        acVar.f24555b.setEllipsize(TextUtils.TruncateAt.END);
        acVar.f24555b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new b6(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = acVar.f24555b;
        if (i10 > 1) {
            string = LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]);
        } else {
            string = LocaleController.getString(R.string.SavedTagMessageTagged);
        }
        textView.setText(new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) spannableString));
        if (nVar != null) {
            qc qcVar = new qc(W(), d6Var, true);
            qcVar.e(LocaleController.getString(R.string.ViewAction));
            qcVar.f30224a = nVar;
            acVar.setButton(qcVar);
        }
        acVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Hi, d6Var));
        acVar.addView(acVar.f24555b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(acVar, 2750);
    }

    public ad(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f24561b = frameLayout;
        this.f24560a = null;
        this.f24562c = d6Var;
    }
}
