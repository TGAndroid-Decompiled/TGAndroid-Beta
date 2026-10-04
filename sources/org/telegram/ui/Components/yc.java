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
public final class yc {
    public final org.telegram.ui.ActionBar.n2 f33128a;
    public final FrameLayout f33129b;
    public final org.telegram.ui.ActionBar.d6 f33130c;

    public yc(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var != null && n2Var.getLastStoryViewer() != null && n2Var.getLastStoryViewer().attachedToParent()) {
            this.f33128a = null;
            ai.e6 currentPeerView = n2Var.getLastStoryViewer().f1174n0.getCurrentPeerView();
            this.f33129b = currentPeerView != null ? currentPeerView.f844c1 : null;
            this.f33130c = n2Var.getLastStoryViewer().f1199y;
            return;
        }
        this.f33128a = n2Var;
        this.f33129b = null;
        this.f33130c = n2Var != null ? n2Var.getResourceProvider() : null;
    }

    public static rc A(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        return z(n2Var, i10, 0, d6Var);
    }

    public static rc B(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, ai.c9 c9Var, org.telegram.ui.ve veVar, org.telegram.ui.ActionBar.d6 d6Var) {
        int i10;
        String str;
        int i11;
        int i12;
        zb zbVar = new zb(n2Var.getParentActivity(), d6Var);
        if (z10) {
            i10 = R.raw.ic_pin;
        } else {
            i10 = R.raw.ic_unpin;
        }
        zbVar.c(i10, 28, 28, "Pin", "Line");
        TextView textView = zbVar.f33465b;
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
            pc pcVar = new pc(n2Var.getParentActivity(), d6Var, true);
            pcVar.f29594a = c9Var;
            pcVar.f29595b = veVar;
            zbVar.setButton(pcVar);
        }
        if (z10) {
            i12 = 1500;
        } else {
            i12 = 5000;
        }
        return rc.g(n2Var, zbVar, i12);
    }

    public static rc C(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        zb zbVar = new zb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        zbVar.d(R.raw.ic_admin, "Shield");
        zbVar.f33465b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return rc.g(n2Var, zbVar, 1500);
    }

    public static rc D(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        String str2;
        zb zbVar = new zb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        zbVar.d(R.raw.ic_ban, "Hand");
        if (user.deleted) {
            str2 = LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        zbVar.f33465b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, str2, str)));
        return rc.g(n2Var, zbVar, 1500);
    }

    public static rc F(FrameLayout frameLayout, boolean z10) {
        xc xcVar;
        yc ycVar = new yc(frameLayout, null);
        if (z10) {
            xcVar = xc.h;
        } else {
            xcVar = xc.f32755e;
        }
        return ycVar.m(xcVar, 1, -115203550, -1, null);
    }

    public static rc S(int i10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        String string;
        zb zbVar = new zb(n2Var.getParentActivity(), d6Var);
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
            zbVar.d(R.raw.sound_on, new String[0]);
        } else {
            zbVar.d(R.raw.sound_off, new String[0]);
        }
        zbVar.f33465b.setText(string);
        return rc.g(n2Var, zbVar, 1500);
    }

    public static yc X() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return new yc(mb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.f3) {
            return new yc(((org.telegram.ui.ActionBar.f3) dialog).container, U.getResourceProvider());
        }
        return a0(U);
    }

    public static yc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var) {
        return new yc(frameLayout, d6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var != null && n2Var.getParentActivity() != null && n2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static yc a0(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == null) {
            return X();
        }
        return new yc(n2Var);
    }

    public static void b0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.C1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
        }
    }

    public static rc d(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        String string;
        zb zbVar = new zb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        if (z10) {
            zbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            zbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        zbVar.f33465b.setText(AndroidUtilities.replaceTags(string));
        return rc.g(n2Var, zbVar, 1500);
    }

    public static rc j(org.telegram.ui.ActionBar.n2 n2Var) {
        return a0(n2Var).k(false);
    }

    public static rc l(String str, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        int i10;
        String string;
        int i11;
        int i12;
        zb zbVar = new zb(n2Var.getParentActivity(), n2Var.getResourceProvider());
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
        zbVar.f33465b.setText(AndroidUtilities.replaceTags(string));
        if (!z10 && str == null) {
            i11 = R.raw.contact_check;
        } else {
            i11 = R.raw.e_hand_2;
        }
        zbVar.d(i11, new String[0]);
        return rc.g(n2Var, zbVar, 5000);
    }

    public static rc v(Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, int i10, long j3, int i11, int i12, int i13, int i14, boolean z10, a3.h0 h0Var) {
        zb zbVar;
        org.telegram.ui.ActionBar.d6 d6Var;
        boolean z11;
        org.telegram.ui.oh ohVar;
        SpannableStringBuilder replaceTags;
        rc g10;
        org.telegram.ui.ActionBar.d6 d6Var2;
        int i15;
        int i16;
        ai.f fVar;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && n2Var != null && i10 <= 1 && j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !z10) {
            zbVar = new cc(i11, n2Var);
        } else {
            if (n2Var != null) {
                d6Var = n2Var.getResourceProvider();
            } else {
                d6Var = null;
            }
            zbVar = new zb(i12, i13, context, d6Var);
        }
        zb zbVar2 = zbVar;
        if (h0Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (h0Var != null) {
            ohVar = new org.telegram.ui.oh(28, zArr, h0Var);
        } else {
            ohVar = null;
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
                zbVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            } else {
                a3.h0 h0Var2 = new a3.h0(ohVar, n2Var, j3, 16);
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
                zbVar2.c(R.raw.forward, 30, 30, new String[0]);
            }
        } else {
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0]));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            }
            zbVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        zbVar2.f33465b.setText(replaceTags);
        if (z11) {
            Context context2 = zbVar2.getContext();
            if (n2Var != null) {
                d6Var2 = n2Var.getResourceProvider();
            } else {
                d6Var2 = null;
            }
            pc pcVar = new pc(context2, d6Var2, true, true);
            pcVar.f29594a = null;
            pcVar.f29595b = ohVar;
            zbVar2.setButton(pcVar);
        }
        zbVar2.postDelayed(new sc(zbVar2, 1), 300);
        if (frameLayout != null) {
            g10 = rc.f(frameLayout, zbVar2, i14);
        } else if (n2Var != null) {
            g10 = rc.g(n2Var, zbVar2, i14);
        } else {
            throw new IllegalArgumentException();
        }
        if (zbVar2 instanceof cc) {
            zbVar2.f33465b.setSingleLine(false);
            zbVar2.f33465b.setMaxLines(2);
            ((cc) zbVar2).setBulletin(g10);
            g10.f30346r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.rc x(android.app.Activity r4, android.widget.FrameLayout r5, int r6, long r7, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.rc");
    }

    public static org.telegram.ui.Components.rc z(org.telegram.ui.ActionBar.n2 r5, int r6, int r7, org.telegram.ui.ActionBar.d6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yc.z(org.telegram.ui.ActionBar.n2, int, int, org.telegram.ui.ActionBar.d6):org.telegram.ui.Components.rc");
    }

    public final rc E(org.telegram.ui.ActionBar.d6 d6Var) {
        zb zbVar = new zb(W(), d6Var);
        zbVar.d(R.raw.chats_infotip, new String[0]);
        zbVar.f33465b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(zbVar, 1500);
    }

    public final rc G(int i10, int i11, CharSequence charSequence) {
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        zb zbVar = new zb(W(), this.f33130c);
        zbVar.c(i10, 36, 36, new String[0]);
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
        zbVar.f33465b.setSingleLine(false);
        zbVar.f33465b.setMaxLines(i11);
        zbVar.f33465b.setText(charSequence);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(zbVar, i12);
    }

    public final rc H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final rc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.d6 d6Var = this.f33130c;
        zb zbVar = new zb(W, d6Var);
        if (i10 != 0) {
            zbVar.c(i10, 36, 36, new String[0]);
        } else {
            zbVar.f33464a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) zbVar.f33465b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        zbVar.f33465b.setTextSize(1, 14.0f);
        zbVar.f33465b.setTextDirection(5);
        zbVar.f33465b.setSingleLine(false);
        zbVar.f33465b.setMaxLines(3);
        zbVar.f33465b.setText(charSequence);
        pc pcVar = new pc(W(), d6Var, true, z10);
        pcVar.e(charSequence2);
        pcVar.f29594a = runnable;
        zbVar.setButton(pcVar);
        return b(zbVar, i11);
    }

    public final rc J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        int i11;
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return I(i10, charSequence, str, i11, false, runnable);
    }

    public final rc K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.d6 d6Var = this.f33130c;
        oc ocVar = new oc(W, d6Var);
        ocVar.c(i10, 36, 36, new String[0]);
        ocVar.f29328b.setText(str);
        ocVar.f29329c.setText(charSequence);
        pc pcVar = new pc(W(), d6Var, true);
        pcVar.e(str2);
        pcVar.f29594a = runnable;
        ocVar.setButton(pcVar);
        return b(ocVar, 5000);
    }

    public final rc L(Drawable drawable, CharSequence charSequence) {
        zb zbVar = new zb(W(), this.f33130c);
        zbVar.f33464a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.rp0) {
            ((org.telegram.ui.rp0) drawable).e(zbVar.f33464a);
        }
        zbVar.f33465b.setText(charSequence);
        zbVar.f33465b.setSingleLine(false);
        zbVar.f33465b.setMaxLines(2);
        return b(zbVar, 2750);
    }

    public final rc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int i11;
        oc ocVar = new oc(W(), this.f33130c);
        ocVar.c(i10, 36, 36, new String[0]);
        ocVar.f29328b.setText(charSequence);
        ocVar.f29329c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(ocVar, i11);
    }

    public final rc N(String str, String str2) {
        oc ocVar = new oc(W(), this.f33130c);
        ocVar.f29327a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) ocVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        ocVar.f29328b.setText(str);
        ocVar.f29329c.setText(str2);
        return b(ocVar, 5000);
    }

    public final rc O(TLRPC.Document document, String str, String str2) {
        int i10;
        if (document == null) {
            return new rc();
        }
        nc ncVar = new nc(W(), this.f33130c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        w9 w9Var = ncVar.f28925a;
        w9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ncVar.f28926b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = ncVar.f28927c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(ncVar, i10);
    }

    public final rc P(int i10, CharSequence charSequence) {
        int i11;
        zb zbVar = new zb(W(), this.f33130c);
        zbVar.c(i10, 36, 36, new String[0]);
        zbVar.f33465b.setText(charSequence);
        zbVar.f33465b.setSingleLine(false);
        zbVar.f33465b.setTextSize(1, 14.0f);
        zbVar.f33465b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(zbVar, i11);
    }

    public final rc Q(int i10, int i11, CharSequence charSequence) {
        int i12;
        zb zbVar = new zb(W(), this.f33130c);
        zbVar.c(i10, i11, i11, new String[0]);
        zbVar.f33465b.setText(charSequence);
        zbVar.f33465b.setSingleLine(false);
        zbVar.f33465b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(zbVar, i12);
    }

    public final rc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        if (document == null) {
            return new rc();
        }
        nc ncVar = new nc(W(), this.f33130c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        w9 w9Var = ncVar.f28925a;
        w9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ncVar.f28926b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        ncVar.f28927c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(ncVar, i10);
    }

    public final rc T(String str) {
        zb zbVar = new zb(W(), null);
        zbVar.d(R.raw.contact_check, new String[0]);
        zbVar.f33465b.setText(str);
        zbVar.f33465b.setSingleLine(false);
        zbVar.f33465b.setMaxLines(2);
        return b(zbVar, 1500);
    }

    public final rc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        oc ocVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.d6 d6Var = this.f33130c;
        if (!isEmpty) {
            oc ocVar2 = new oc(W(), d6Var);
            ocVar2.f29328b.setText(str);
            ocVar2.f29329c.setText((CharSequence) null);
            ocVar = ocVar2;
        } else {
            zb zbVar = new zb(W(), d6Var);
            zbVar.f33465b.setText(str);
            zbVar.f33465b.setSingleLine(false);
            zbVar.f33465b.setMaxLines(2);
            ocVar = zbVar;
        }
        ocVar.setTimer();
        pc pcVar = new pc(W(), d6Var, true, z10);
        pcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        pcVar.f29594a = runnable;
        pcVar.f29595b = runnable2;
        ocVar.setButton(pcVar);
        return b(ocVar, 5000);
    }

    public final rc V(List list, CharSequence charSequence, CharSequence charSequence2, o0.a aVar) {
        boolean z10;
        float f7;
        int i10;
        Context W = W();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f33130c;
        qc qcVar = new qc(W, d6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    qcVar.f29991a.setCount(i13);
                    qcVar.f29991a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                qcVar.f29991a.setTranslationX(AndroidUtilities.dp(4.0f));
                qcVar.f29991a.setScaleX(1.2f);
                qcVar.f29991a.setScaleY(1.2f);
            } else {
                qcVar.f29991a.setScaleX(1.0f);
                qcVar.f29991a.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        qcVar.f29991a.a(false);
        if (charSequence2 != null) {
            qcVar.f29992b.setSingleLine(true);
            qcVar.f29992b.setMaxLines(1);
            qcVar.f29992b.setText(charSequence);
            qcVar.f29993c.setText(charSequence2);
            qcVar.f29993c.setSingleLine(false);
            qcVar.f29993c.setMaxLines(3);
            if (qcVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) qcVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) qcVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            qcVar.f29992b.setSingleLine(false);
            qcVar.f29992b.setMaxLines(4);
            qcVar.f29992b.setText(charSequence);
            if (qcVar.f29992b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    qcVar.f29992b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) qcVar.f29992b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) qcVar.f29992b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (aVar != null) {
            pc pcVar = new pc(W(), d6Var, true);
            pcVar.e(LocaleController.getString(R.string.UndoNoCaps));
            pcVar.f29594a = (Runnable) aVar.f16927b;
            pcVar.f29595b = (Runnable) aVar.f16928c;
            qcVar.setButton(pcVar);
        }
        return b(qcVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.n2 n2Var = this.f33128a;
        if (n2Var != null) {
            context = n2Var.getParentActivity();
            if (context == null && this.f33128a.getLayoutContainer() != null) {
                context = this.f33128a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f33129b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return ApplicationLoader.applicationContext;
        }
        return context;
    }

    public final rc Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.C1) {
            return new rc();
        }
        if (tL_error == null) {
            return t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
        }
        return t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final rc b(ob obVar, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f33128a;
        if (n2Var != null) {
            return rc.g(n2Var, obVar, i10);
        }
        return rc.f(this.f33129b, obVar, i10);
    }

    public final rc c(CharSequence charSequence) {
        if (W() == null) {
            return new rc();
        }
        zb zbVar = new zb(W(), this.f33130c);
        zbVar.d(R.raw.ic_admin, "Shield");
        zbVar.f33465b.setSingleLine(false);
        zbVar.f33465b.setMaxLines(3);
        zbVar.f33465b.setText(charSequence);
        return b(zbVar, 2750);
    }

    public final void c0(String str, boolean z10) {
        if (!LaunchActivity.C1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            rc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
            t10.f30346r = false;
            t10.k(z10);
            return;
        }
        rc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t11.f30346r = false;
        t11.k(z10);
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.C1) {
            if (tL_error == null) {
                rc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.f30346r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                rc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.f30346r = false;
                t11.k(z10);
            }
        }
    }

    public final rc e(boolean z10) {
        String string;
        zb zbVar = new zb(W(), this.f33130c);
        if (z10) {
            zbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            zbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        zbVar.f33465b.setText(AndroidUtilities.replaceTags(string));
        return b(zbVar, 1500);
    }

    public final boolean e0(int i10, long j3) {
        org.telegram.ui.ActionBar.n2 n2Var;
        SpannableStringBuilder replaceSingleTag;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (n2Var = this.f33128a) != null) {
            cc ccVar = new cc(i10, n2Var);
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i10 <= 1) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new ai.f(25));
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ai.f(25));
                }
                ccVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                ccVar.f33465b.setText(replaceSingleTag);
                ccVar.f33465b.setSingleLine(false);
                ccVar.f33465b.setMaxLines(2);
                rc b10 = b(ccVar, 3500);
                ccVar.setBulletin(b10);
                b10.f30346r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final rc f(int i10, Runnable runnable) {
        zb zbVar = new zb(W(), null);
        zbVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new vc(0, runnable), indexOf, indexOf2 - 1, 33);
        zbVar.f33465b.setText(valueOf);
        zbVar.f33465b.setSingleLine(false);
        zbVar.f33465b.setMaxLines(3);
        return b(zbVar, 5000);
    }

    public final rc g(String str, ArrayList arrayList) {
        qc qcVar = new qc(W(), this.f33130c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                qcVar.f29991a.setCount(i12);
                qcVar.f29991a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            qcVar.f29991a.setTranslationX(AndroidUtilities.dp(4.0f));
            qcVar.f29991a.setScaleX(1.2f);
            qcVar.f29991a.setScaleY(1.2f);
        } else {
            qcVar.f29991a.setScaleX(1.0f);
            qcVar.f29991a.setScaleY(1.0f);
        }
        qcVar.f29991a.a(false);
        qcVar.f29992b.setSingleLine(false);
        qcVar.f29992b.setMaxLines(2);
        qcVar.f29992b.setText(str);
        if (qcVar.f29992b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) qcVar.f29992b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) qcVar.f29992b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            qcVar.f29991a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(qcVar, 5000);
    }

    public final rc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        SpannableStringBuilder spannableStringBuilder;
        v90 v90Var;
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
        org.telegram.ui.ActionBar.d6 d6Var = this.f33130c;
        if (indexOf >= 0) {
            v90Var = new v90(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), d6Var);
            spannableStringBuilder.setSpan(v90Var, indexOf, indexOf + 11, 33);
            int i12 = org.telegram.ui.ActionBar.i6.Hi;
            v90Var.a(i0.a.k(org.telegram.ui.ActionBar.i6.v0(i12, d6Var), 32), i0.a.k(org.telegram.ui.ActionBar.i6.v0(i12, d6Var), 72));
        } else {
            v90Var = null;
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
        ?? zbVar = new zb(W, d6Var);
        q90 q90Var = new q90(W, null);
        zbVar.d = q90Var;
        q90Var.setDisablePaddingsOffset(true);
        q90Var.setSingleLine();
        q90Var.setTypeface(Typeface.SANS_SERIF);
        q90Var.setTextSize(1, 15.0f);
        q90Var.setEllipsize(TextUtils.TruncateAt.END);
        q90Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        zbVar.f33465b.setVisibility(8);
        zbVar.addView(q90Var, w7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i13 = org.telegram.ui.ActionBar.i6.Hi;
        zbVar.setTextColor(zbVar.getThemedColor(i13));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            zbVar.f33464a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i13, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        zbVar.e(document, new String[i11]);
        zbVar.f33465b.setTextSize(1, 14.0f);
        zbVar.f33465b.setSingleLine(i11);
        zbVar.f33465b.setMaxLines(3);
        q90Var.setText(spannableStringBuilder);
        q90Var.setTextSize(1, 14.0f);
        q90Var.setSingleLine(i11);
        q90Var.setMaxLines(3);
        pc pcVar = new pc(W(), d6Var, true);
        pcVar.e(string);
        pcVar.f29594a = runnable;
        zbVar.setButton(pcVar);
        rc b10 = b(zbVar, 2750);
        if (v90Var != null) {
            vb vbVar = b10.f30334e;
            if (vbVar instanceof xb) {
                v90Var.f31609b = ((xb) vbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new uc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final rc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new rc();
        }
        zb zbVar = new zb(W(), null);
        zbVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        zbVar.f33465b.setText(str);
        return b(zbVar, 1500);
    }

    public final rc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new rc();
        }
        org.telegram.ui.ActionBar.d6 d6Var = this.f33130c;
        if (z10) {
            oc ocVar = new oc(W(), d6Var);
            ocVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ocVar.f29328b.setText(LocaleController.getString(R.string.LinkCopied));
            ocVar.f29329c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
            return b(ocVar, 2750);
        }
        zb zbVar = new zb(W(), d6Var);
        zbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        zbVar.f33465b.setText(LocaleController.getString(R.string.LinkCopied));
        return b(zbVar, 1500);
    }

    public final rc m(xc xcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.d6 d6Var) {
        zb zbVar;
        String string;
        if (i11 != 0 && i12 != 0) {
            zbVar = new zb(i11, i12, W(), d6Var);
        } else {
            zbVar = new zb(W(), d6Var);
        }
        wc wcVar = xcVar.d;
        zbVar.d(wcVar.f32510a, wcVar.f32511b);
        TextView textView = zbVar.f33465b;
        String str = xcVar.f32763a;
        if (xcVar.f32765c) {
            string = LocaleController.formatPluralString(str, i10, new Object[0]);
        } else {
            string = LocaleController.getString(str, xcVar.f32764b);
        }
        textView.setText(AndroidUtilities.replaceSingleTag(string, new ai.f(26)));
        int i13 = xcVar.d.f32512c;
        if (i13 != 0) {
            zbVar.setIconPaddingBottom(i13);
        }
        return b(zbVar, 1500);
    }

    public final rc n(xc xcVar, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        return m(xcVar, i10, 0, 0, d6Var);
    }

    public final rc o(xc xcVar, org.telegram.ui.ActionBar.d6 d6Var) {
        return m(xcVar, 1, 0, 0, d6Var);
    }

    public final rc p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.d6 d6Var = this.f33130c;
        mc mcVar = new mc(W, d6Var);
        q5 q5Var = new q5(1, UserConfig.selectedAccount, j3);
        w9 w9Var = mcVar.f28570a;
        w9Var.setAnimatedEmojiDrawable(q5Var);
        w9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var), PorterDuff.Mode.SRC_IN));
        mcVar.f28571b.setText(str);
        mcVar.f28572c.setText(str2);
        return b(mcVar, 2750);
    }

    public final rc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.d6 d6Var = this.f33130c;
        zb zbVar = new zb(W, d6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            zbVar.f33464a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        zbVar.e(document, new String[0]);
        if (zbVar.f33464a.getImageReceiver() != null) {
            zbVar.f33464a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        zbVar.f33465b.setText(charSequence);
        zbVar.f33465b.setTextSize(1, 14.0f);
        zbVar.f33465b.setSingleLine(false);
        zbVar.f33465b.setMaxLines(3);
        pc pcVar = new pc(W(), d6Var, true);
        pcVar.e(str);
        pcVar.f29594a = runnable;
        zbVar.setButton(pcVar);
        return b(zbVar, 2750);
    }

    public final rc r(TLRPC.Document document, String str) {
        zb zbVar = new zb(W(), this.f33130c);
        if (MessageObject.isTextColorEmoji(document)) {
            zbVar.f33464a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        zbVar.e(document, new String[0]);
        zbVar.f33465b.setText(str);
        zbVar.f33465b.setTextSize(1, 14.0f);
        zbVar.f33465b.setSingleLine(false);
        zbVar.f33465b.setMaxLines(3);
        return b(zbVar, 2750);
    }

    public final rc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i10;
        oc ocVar = new oc(W(), this.f33130c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        nj0 nj0Var = ocVar.f29327a;
        if (isTextColorEmoji) {
            nj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        nj0Var.setAutoRepeat(true);
        nj0Var.g(36, 36, document);
        ocVar.f29328b.setText(str);
        ocVar.f29329c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(ocVar, i10);
    }

    public final rc t(CharSequence charSequence, org.telegram.ui.ActionBar.d6 d6Var) {
        zb zbVar = new zb(W(), d6Var);
        zbVar.d(R.raw.chats_infotip, new String[0]);
        zbVar.f33465b.setText(charSequence);
        zbVar.f33465b.setSingleLine(false);
        zbVar.f33465b.setMaxLines(2);
        return b(zbVar, 1500);
    }

    public final rc u(String str, String str2, org.telegram.ui.ActionBar.d6 d6Var) {
        oc ocVar = new oc(W(), d6Var);
        ocVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        ocVar.f29328b.setText(str);
        ocVar.f29329c.setText(str2);
        return b(ocVar, 1500);
    }

    public final rc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.d6 d6Var = this.f33130c;
        zb zbVar = new zb(W, d6Var);
        zbVar.setBackground(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Fi, d6Var), 12);
        zbVar.f33464a.setImageResource(i10);
        zbVar.f33465b.setText(charSequence);
        zbVar.f33465b.setSingleLine(false);
        zbVar.f33465b.setLines(2);
        zbVar.f33465b.setMaxLines(4);
        TextView textView = zbVar.f33465b;
        textView.setMaxWidth(ci.e4.a(textView.getText(), zbVar.f33465b.getPaint()));
        zbVar.f33465b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) zbVar.f33465b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        zbVar.setWrapWidth();
        return b(zbVar, 5000);
    }

    public final rc y(int i10, TLRPC.Document document, gg.n nVar) {
        String string;
        Context W = W();
        org.telegram.ui.ActionBar.d6 d6Var = this.f33130c;
        zb zbVar = new zb(W, d6Var);
        zbVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        zbVar.removeView(zbVar.f33465b);
        y5 y5Var = new y5(zbVar.getContext());
        zbVar.f33465b = y5Var;
        y5Var.setTypeface(Typeface.SANS_SERIF);
        zbVar.f33465b.setTextSize(1, 15.0f);
        zbVar.f33465b.setEllipsize(TextUtils.TruncateAt.END);
        zbVar.f33465b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new z5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = zbVar.f33465b;
        if (i10 > 1) {
            string = LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]);
        } else {
            string = LocaleController.getString(R.string.SavedTagMessageTagged);
        }
        textView.setText(new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) spannableString));
        if (nVar != null) {
            pc pcVar = new pc(W(), d6Var, true);
            pcVar.e(LocaleController.getString(R.string.ViewAction));
            pcVar.f29594a = nVar;
            zbVar.setButton(pcVar);
        }
        zbVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Hi, d6Var));
        zbVar.addView(zbVar.f33465b, w7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(zbVar, 2750);
    }

    public yc(FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var) {
        this.f33129b = frameLayout;
        this.f33128a = null;
        this.f33130c = d6Var;
    }
}
