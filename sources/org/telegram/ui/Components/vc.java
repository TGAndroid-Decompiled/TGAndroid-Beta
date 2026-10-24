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
public final class vc {
    public final org.telegram.ui.ActionBar.o2 f31414a;
    public final FrameLayout f31415b;
    public final org.telegram.ui.ActionBar.g6 f31416c;

    public vc(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var != null && o2Var.getLastStoryViewer() != null && o2Var.getLastStoryViewer().attachedToParent()) {
            this.f31414a = null;
            ci.p4 currentPeerView = o2Var.getLastStoryViewer().f6249n0.getCurrentPeerView();
            this.f31415b = currentPeerView != null ? currentPeerView.f5656c1 : null;
            this.f31416c = o2Var.getLastStoryViewer().f6274y;
            return;
        }
        this.f31414a = o2Var;
        this.f31415b = null;
        this.f31416c = o2Var != null ? o2Var.getResourceProvider() : null;
    }

    public static oc A(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        return z(o2Var, i10, 0, g6Var);
    }

    public static oc B(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, ai.db dbVar, org.telegram.ui.se seVar, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        String str;
        int i11;
        int i12;
        wb wbVar = new wb(o2Var.getParentActivity(), g6Var);
        if (z10) {
            i10 = R.raw.ic_pin;
        } else {
            i10 = R.raw.ic_unpin;
        }
        wbVar.c(i10, 28, 28, "Pin", "Line");
        TextView textView = wbVar.f32176b;
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
            mc mcVar = new mc(o2Var.getParentActivity(), g6Var, true);
            mcVar.f28574b = dbVar;
            mcVar.f28575c = seVar;
            wbVar.setButton(mcVar);
        }
        if (z10) {
            i12 = 1500;
        } else {
            i12 = 5000;
        }
        return oc.g(o2Var, wbVar, i12);
    }

    public static oc C(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        wb wbVar = new wb(o2Var.getParentActivity(), o2Var.getResourceProvider());
        wbVar.d(R.raw.ic_admin, "Shield");
        wbVar.f32176b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return oc.g(o2Var, wbVar, 1500);
    }

    public static oc D(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        String str2;
        wb wbVar = new wb(o2Var.getParentActivity(), o2Var.getResourceProvider());
        wbVar.d(R.raw.ic_ban, "Hand");
        if (user.deleted) {
            str2 = LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        wbVar.f32176b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, str2, str)));
        return oc.g(o2Var, wbVar, 1500);
    }

    public static oc F(FrameLayout frameLayout, boolean z10) {
        uc ucVar;
        vc vcVar = new vc(frameLayout, null);
        if (z10) {
            ucVar = uc.h;
        } else {
            ucVar = uc.e;
        }
        return vcVar.m(ucVar, 1, -115203550, -1, null);
    }

    public static oc S(int i10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        String string;
        wb wbVar = new wb(o2Var.getParentActivity(), g6Var);
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
            wbVar.d(R.raw.sound_on, new String[0]);
        } else {
            wbVar.d(R.raw.sound_off, new String[0]);
        }
        wbVar.f32176b.setText(string);
        return oc.g(o2Var, wbVar, 1500);
    }

    public static vc X() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return new vc(jb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.h3) {
            return new vc(((org.telegram.ui.ActionBar.h3) dialog).container, U.getResourceProvider());
        }
        return a0(U);
    }

    public static vc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var) {
        return new vc(frameLayout, g6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var != null && o2Var.getParentActivity() != null && o2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static vc a0(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var == null) {
            return X();
        }
        return new vc(o2Var);
    }

    public static void b0(String str) {
        if (!LaunchActivity.E1) {
            return;
        }
        X().t(LocaleController.formatString(R.string.UnknownErrorCode, str), null).j();
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (frameLayout == null) {
            b0(str);
            return;
        }
        oc t10 = new vc(frameLayout, g6Var).t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t10.f29211r = false;
        t10.j();
    }

    public static oc d(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        String string;
        wb wbVar = new wb(o2Var.getParentActivity(), o2Var.getResourceProvider());
        if (z10) {
            wbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            wbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        wbVar.f32176b.setText(AndroidUtilities.replaceTags(string));
        return oc.g(o2Var, wbVar, 1500);
    }

    public static void d0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.E1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
        }
    }

    public static oc j(org.telegram.ui.ActionBar.o2 o2Var) {
        return a0(o2Var).k(false);
    }

    public static oc l(String str, org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        int i10;
        String string;
        int i11;
        int i12;
        wb wbVar = new wb(o2Var.getParentActivity(), o2Var.getResourceProvider());
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
        wbVar.f32176b.setText(AndroidUtilities.replaceTags(string));
        if (!z10 && str == null) {
            i11 = R.raw.contact_check;
        } else {
            i11 = R.raw.e_hand_2;
        }
        wbVar.d(i11, new String[0]);
        return oc.g(o2Var, wbVar, 5000);
    }

    public static oc v(Context context, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, int i10, long j10, int i11, int i12, int i13, int i14, boolean z10, a3.i0 i0Var) {
        org.telegram.ui.ActionBar.g6 g6Var;
        wb wbVar;
        boolean z11;
        org.telegram.ui.eh ehVar;
        SpannableStringBuilder replaceTags;
        oc g10;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i15;
        int i16;
        pc pcVar;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && o2Var != null && i10 <= 1 && j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !z10) {
            wbVar = new zb(i11, o2Var);
        } else {
            if (o2Var != null) {
                g6Var = o2Var.getResourceProvider();
            } else {
                g6Var = null;
            }
            wbVar = new wb(i12, i13, context, g6Var);
        }
        wb wbVar2 = wbVar;
        if (i0Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (i0Var != null) {
            ehVar = new org.telegram.ui.eh(27, zArr, i0Var);
        } else {
            ehVar = null;
        }
        if (i10 <= 1) {
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i11 <= 1) {
                    String string = LocaleController.getString(R.string.FwdMessageToSavedMessages);
                    if (z10) {
                        pcVar = new pc(2);
                    } else {
                        pcVar = new pc(0);
                    }
                    replaceTags = AndroidUtilities.replaceSingleTag(string, -1, 2, pcVar);
                } else {
                    replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new pc(0));
                }
                wbVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            } else {
                a3.i0 i0Var2 = new a3.i0(ehVar, o2Var, j10, 19);
                if (DialogObject.isChatDialog(j10)) {
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
                    if (i11 <= 1) {
                        if (o2Var != null) {
                            ?? formatString = LocaleController.formatString(R.string.FwdMessageToGroup, chat.title);
                            replaceTags = AndroidUtilities.replaceSingleTag(formatString, formatString, 2, i0Var2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title));
                        }
                    } else if (o2Var != null) {
                        ?? formatString2 = LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title);
                        replaceTags = AndroidUtilities.replaceSingleTag(formatString2, formatString2, 2, i0Var2);
                    } else {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
                    }
                } else {
                    TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                    if (i11 <= 1) {
                        if (z11) {
                            i16 = R.string.FwdMessageToUserShort;
                        } else {
                            i16 = R.string.FwdMessageToUser;
                        }
                        if (o2Var != null) {
                            ?? formatString3 = LocaleController.formatString(i16, UserObject.getFirstName(user));
                            replaceTags = AndroidUtilities.replaceSingleTag(formatString3, formatString3, 2, i0Var2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i16, UserObject.getFirstName(user)));
                        }
                    } else {
                        if (z11) {
                            i15 = R.string.FwdMessagesToUserShort;
                        } else {
                            i15 = R.string.FwdMessagesToUser;
                        }
                        if (o2Var != null) {
                            ?? formatString4 = LocaleController.formatString(i15, UserObject.getFirstName(user));
                            replaceTags = AndroidUtilities.replaceSingleTag(formatString4, formatString4, 2, i0Var2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i15, UserObject.getFirstName(user)));
                        }
                    }
                }
                wbVar2.c(R.raw.forward, 30, 30, new String[0]);
            }
        } else {
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0]));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            }
            wbVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        wbVar2.f32176b.setText(replaceTags);
        if (z11) {
            Context context2 = wbVar2.getContext();
            if (o2Var != null) {
                g6Var2 = o2Var.getResourceProvider();
            } else {
                g6Var2 = null;
            }
            mc mcVar = new mc(context2, g6Var2, true, true);
            mcVar.f28574b = null;
            mcVar.f28575c = ehVar;
            wbVar2.setButton(mcVar);
        }
        wbVar2.postDelayed(new qc(wbVar2, 1), 300);
        if (frameLayout != null) {
            g10 = oc.f(frameLayout, wbVar2, i14);
        } else if (o2Var != null) {
            g10 = oc.g(o2Var, wbVar2, i14);
        } else {
            throw new IllegalArgumentException();
        }
        if (wbVar2 instanceof zb) {
            wbVar2.f32176b.setSingleLine(false);
            wbVar2.f32176b.setMaxLines(2);
            ((zb) wbVar2).setBulletin(g10);
            g10.f29211r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.oc x(android.app.Activity r5, android.widget.FrameLayout r6, int r7, long r8, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.oc");
    }

    public static org.telegram.ui.Components.oc z(org.telegram.ui.ActionBar.o2 r5, int r6, int r7, org.telegram.ui.ActionBar.g6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vc.z(org.telegram.ui.ActionBar.o2, int, int, org.telegram.ui.ActionBar.g6):org.telegram.ui.Components.oc");
    }

    public final oc E(org.telegram.ui.ActionBar.g6 g6Var) {
        wb wbVar = new wb(W(), g6Var);
        wbVar.d(R.raw.chats_infotip, new String[0]);
        wbVar.f32176b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(wbVar, 1500);
    }

    public final oc G(int i10, int i11, CharSequence charSequence) {
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        wb wbVar = new wb(W(), this.f31416c);
        wbVar.c(i10, 36, 36, new String[0]);
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
        wbVar.f32176b.setSingleLine(false);
        wbVar.f32176b.setMaxLines(i11);
        wbVar.f32176b.setText(charSequence);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(wbVar, i12);
    }

    public final oc H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final oc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.f31416c;
        wb wbVar = new wb(W, g6Var);
        if (i10 != 0) {
            wbVar.c(i10, 36, 36, new String[0]);
        } else {
            wbVar.f32175a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) wbVar.f32176b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        wbVar.f32176b.setTextSize(1, 14.0f);
        wbVar.f32176b.setTextDirection(5);
        wbVar.f32176b.setSingleLine(false);
        wbVar.f32176b.setMaxLines(3);
        wbVar.f32176b.setText(charSequence);
        mc mcVar = new mc(W(), g6Var, true, z10);
        mcVar.e(charSequence2);
        mcVar.f28574b = runnable;
        wbVar.setButton(mcVar);
        return b(wbVar, i11);
    }

    public final oc J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        int i11;
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return I(i10, charSequence, str, i11, false, runnable);
    }

    public final oc K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.f31416c;
        lc lcVar = new lc(W, g6Var);
        lcVar.c(i10, 36, 36, new String[0]);
        lcVar.f28318b.setText(str);
        lcVar.f28319c.setText(charSequence);
        mc mcVar = new mc(W(), g6Var, true);
        mcVar.e(str2);
        mcVar.f28574b = runnable;
        lcVar.setButton(mcVar);
        return b(lcVar, 5000);
    }

    public final oc L(Drawable drawable, CharSequence charSequence) {
        wb wbVar = new wb(W(), this.f31416c);
        wbVar.f32175a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.fp0) {
            ((org.telegram.ui.fp0) drawable).e(wbVar.f32175a);
        }
        wbVar.f32176b.setText(charSequence);
        wbVar.f32176b.setSingleLine(false);
        wbVar.f32176b.setMaxLines(2);
        return b(wbVar, 2750);
    }

    public final oc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int i11;
        lc lcVar = new lc(W(), this.f31416c);
        lcVar.c(i10, 36, 36, new String[0]);
        lcVar.f28318b.setText(charSequence);
        lcVar.f28319c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(lcVar, i11);
    }

    public final oc N(String str, String str2) {
        lc lcVar = new lc(W(), this.f31416c);
        lcVar.f28317a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) lcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        lcVar.f28318b.setText(str);
        lcVar.f28319c.setText(str2);
        return b(lcVar, 5000);
    }

    public final oc O(TLRPC.Document document, String str, String str2) {
        int i10;
        if (document == null) {
            return new oc();
        }
        kc kcVar = new kc(W(), this.f31416c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        u9 u9Var = kcVar.f28000a;
        u9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        u9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = kcVar.f28001b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = kcVar.f28002c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(kcVar, i10);
    }

    public final oc P(int i10, CharSequence charSequence) {
        int i11;
        wb wbVar = new wb(W(), this.f31416c);
        wbVar.c(i10, 36, 36, new String[0]);
        wbVar.f32176b.setText(charSequence);
        wbVar.f32176b.setSingleLine(false);
        wbVar.f32176b.setTextSize(1, 14.0f);
        wbVar.f32176b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(wbVar, i11);
    }

    public final oc Q(int i10, int i11, CharSequence charSequence) {
        int i12;
        wb wbVar = new wb(W(), this.f31416c);
        wbVar.c(i10, i11, i11, new String[0]);
        wbVar.f32176b.setText(charSequence);
        wbVar.f32176b.setSingleLine(false);
        wbVar.f32176b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(wbVar, i12);
    }

    public final oc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        if (document == null) {
            return new oc();
        }
        kc kcVar = new kc(W(), this.f31416c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        u9 u9Var = kcVar.f28000a;
        u9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        u9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = kcVar.f28001b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        kcVar.f28002c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(kcVar, i10);
    }

    public final oc T(String str) {
        wb wbVar = new wb(W(), null);
        wbVar.d(R.raw.contact_check, new String[0]);
        wbVar.f32176b.setText(str);
        wbVar.f32176b.setSingleLine(false);
        wbVar.f32176b.setMaxLines(2);
        return b(wbVar, 1500);
    }

    public final oc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        lc lcVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.g6 g6Var = this.f31416c;
        if (!isEmpty) {
            lc lcVar2 = new lc(W(), g6Var);
            lcVar2.f28318b.setText(str);
            lcVar2.f28319c.setText((CharSequence) null);
            lcVar = lcVar2;
        } else {
            wb wbVar = new wb(W(), g6Var);
            wbVar.f32176b.setText(str);
            wbVar.f32176b.setSingleLine(false);
            wbVar.f32176b.setMaxLines(2);
            lcVar = wbVar;
        }
        lcVar.setTimer();
        mc mcVar = new mc(W(), g6Var, true, z10);
        mcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        mcVar.f28574b = runnable;
        mcVar.f28575c = runnable2;
        lcVar.setButton(mcVar);
        return b(lcVar, 5000);
    }

    public final oc V(List list, CharSequence charSequence, CharSequence charSequence2, mi.q qVar) {
        boolean z10;
        float f7;
        int i10;
        Context W = W();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f31416c;
        nc ncVar = new nc(W, g6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    ncVar.f28864a.setCount(i13);
                    ncVar.f28864a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                ncVar.f28864a.setTranslationX(AndroidUtilities.dp(4.0f));
                ncVar.f28864a.setScaleX(1.2f);
                ncVar.f28864a.setScaleY(1.2f);
            } else {
                ncVar.f28864a.setScaleX(1.0f);
                ncVar.f28864a.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        ncVar.f28864a.a(false);
        if (charSequence2 != null) {
            ncVar.f28865b.setSingleLine(true);
            ncVar.f28865b.setMaxLines(1);
            ncVar.f28865b.setText(charSequence);
            ncVar.f28866c.setText(charSequence2);
            ncVar.f28866c.setSingleLine(false);
            ncVar.f28866c.setMaxLines(3);
            if (ncVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) ncVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) ncVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            ncVar.f28865b.setSingleLine(false);
            ncVar.f28865b.setMaxLines(4);
            ncVar.f28865b.setText(charSequence);
            if (ncVar.f28865b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    ncVar.f28865b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) ncVar.f28865b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) ncVar.f28865b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (qVar != null) {
            mc mcVar = new mc(W(), g6Var, true);
            mcVar.e(LocaleController.getString(R.string.UndoNoCaps));
            mcVar.f28574b = (Runnable) qVar.f17036b;
            mcVar.f28575c = (Runnable) qVar.f17037c;
            ncVar.setButton(mcVar);
        }
        return b(ncVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.o2 o2Var = this.f31414a;
        if (o2Var != null) {
            context = o2Var.getParentActivity();
            if (context == null && this.f31414a.getLayoutContainer() != null) {
                context = this.f31414a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f31415b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return ApplicationLoader.applicationContext;
        }
        return context;
    }

    public final oc Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.E1) {
            return new oc();
        }
        if (tL_error == null) {
            return t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
        }
        return t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final oc b(lb lbVar, int i10) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f31414a;
        if (o2Var != null) {
            return oc.g(o2Var, lbVar, i10);
        }
        return oc.f(this.f31415b, lbVar, i10);
    }

    public final oc c(CharSequence charSequence) {
        if (W() == null) {
            return new oc();
        }
        wb wbVar = new wb(W(), this.f31416c);
        wbVar.d(R.raw.ic_admin, "Shield");
        wbVar.f32176b.setSingleLine(false);
        wbVar.f32176b.setMaxLines(3);
        wbVar.f32176b.setText(charSequence);
        return b(wbVar, 2750);
    }

    public final oc e(boolean z10) {
        String string;
        wb wbVar = new wb(W(), this.f31416c);
        if (z10) {
            wbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            wbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        wbVar.f32176b.setText(AndroidUtilities.replaceTags(string));
        return b(wbVar, 1500);
    }

    public final void e0(String str, boolean z10) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            oc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
            t10.f29211r = false;
            t10.k(z10);
            return;
        }
        oc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t11.f29211r = false;
        t11.k(z10);
    }

    public final oc f(int i10, Runnable runnable) {
        wb wbVar = new wb(W(), null);
        wbVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new sc(0, runnable), indexOf, indexOf2 - 1, 33);
        wbVar.f32176b.setText(valueOf);
        wbVar.f32176b.setSingleLine(false);
        wbVar.f32176b.setMaxLines(3);
        return b(wbVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                oc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.f29211r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                oc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.f29211r = false;
                t11.k(z10);
            }
        }
    }

    public final oc g(String str, ArrayList arrayList) {
        nc ncVar = new nc(W(), this.f31416c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                ncVar.f28864a.setCount(i12);
                ncVar.f28864a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            ncVar.f28864a.setTranslationX(AndroidUtilities.dp(4.0f));
            ncVar.f28864a.setScaleX(1.2f);
            ncVar.f28864a.setScaleY(1.2f);
        } else {
            ncVar.f28864a.setScaleX(1.0f);
            ncVar.f28864a.setScaleY(1.0f);
        }
        ncVar.f28864a.a(false);
        ncVar.f28865b.setSingleLine(false);
        ncVar.f28865b.setMaxLines(2);
        ncVar.f28865b.setText(str);
        if (ncVar.f28865b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) ncVar.f28865b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) ncVar.f28865b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            ncVar.f28864a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(ncVar, 5000);
    }

    public final boolean g0(int i10, long j10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        SpannableStringBuilder replaceSingleTag;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (o2Var = this.f31414a) != null) {
            zb zbVar = new zb(i10, o2Var);
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i10 <= 1) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new pc(0));
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new pc(0));
                }
                zbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                zbVar.f32176b.setText(replaceSingleTag);
                zbVar.f32176b.setSingleLine(false);
                zbVar.f32176b.setMaxLines(2);
                oc b10 = b(zbVar, 3500);
                zbVar.setBulletin(b10);
                b10.f29211r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final oc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        SpannableStringBuilder spannableStringBuilder;
        ba0 ba0Var;
        TLRPC.InputStickerSet inputStickerSet;
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
            return r(document, replaceTags, LocaleController.getString(R.string.ViewAction), new Runnable() {
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f31416c;
        if (indexOf >= 0) {
            ba0Var = new ba0(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), g6Var);
            spannableStringBuilder.setSpan(ba0Var, indexOf, indexOf + 11, 33);
            int i11 = org.telegram.ui.ActionBar.k6.Hi;
            ba0Var.a(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i11, g6Var), 32), i0.a.o(org.telegram.ui.ActionBar.k6.w0(i11, g6Var), 72));
        } else {
            ba0Var = null;
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
        ?? wbVar = new wb(W, g6Var);
        w90 w90Var = new w90(W, null);
        wbVar.d = w90Var;
        w90Var.setDisablePaddingsOffset(true);
        w90Var.setSingleLine();
        w90Var.setTypeface(Typeface.SANS_SERIF);
        w90Var.setTextSize(1, 15.0f);
        w90Var.setEllipsize(TextUtils.TruncateAt.END);
        w90Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        wbVar.f32176b.setVisibility(8);
        wbVar.addView(w90Var, w7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.k6.Hi;
        wbVar.setTextColor(wbVar.getThemedColor(i12));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            org.telegram.ui.ActionBar.r6.t(wbVar.f32175a, i12, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = inputStickerSet2;
        }
        wbVar.e(document, new String[0]);
        wbVar.f32176b.setTextSize(1, 14.0f);
        wbVar.f32176b.setSingleLine(false);
        wbVar.f32176b.setMaxLines(3);
        w90Var.setText(spannableStringBuilder);
        w90Var.setTextSize(1, 14.0f);
        w90Var.setSingleLine(false);
        w90Var.setMaxLines(3);
        mc mcVar = new mc(W(), g6Var, true);
        mcVar.e(string);
        mcVar.f28574b = runnable;
        wbVar.setButton(mcVar);
        oc b10 = b(wbVar, 2750);
        if (ba0Var != null) {
            sb sbVar = b10.e;
            if (sbVar instanceof ub) {
                ba0Var.f24953b = ((ub) sbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new ai.k4(i10, b10, currentTimeMillis));
        return b10;
    }

    public final oc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new oc();
        }
        wb wbVar = new wb(W(), null);
        wbVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        wbVar.f32176b.setText(str);
        return b(wbVar, 1500);
    }

    public final oc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new oc();
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f31416c;
        if (z10) {
            lc lcVar = new lc(W(), g6Var);
            lcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            lcVar.f28318b.setText(LocaleController.getString(R.string.LinkCopied));
            lcVar.f28319c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
            return b(lcVar, 2750);
        }
        wb wbVar = new wb(W(), g6Var);
        wbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        wbVar.f32176b.setText(LocaleController.getString(R.string.LinkCopied));
        return b(wbVar, 1500);
    }

    public final oc m(uc ucVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.g6 g6Var) {
        wb wbVar;
        String string;
        if (i11 != 0 && i12 != 0) {
            wbVar = new wb(i11, i12, W(), g6Var);
        } else {
            wbVar = new wb(W(), g6Var);
        }
        tc tcVar = ucVar.d;
        wbVar.d(tcVar.f30779a, tcVar.f30780b);
        TextView textView = wbVar.f32176b;
        String str = ucVar.f31088a;
        if (ucVar.f31090c) {
            string = LocaleController.formatPluralString(str, i10, new Object[0]);
        } else {
            string = LocaleController.getString(str, ucVar.f31089b);
        }
        textView.setText(AndroidUtilities.replaceSingleTag(string, new pc(1)));
        int i13 = ucVar.d.f30781c;
        if (i13 != 0) {
            wbVar.setIconPaddingBottom(i13);
        }
        return b(wbVar, 1500);
    }

    public final oc n(uc ucVar, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        return m(ucVar, i10, 0, 0, g6Var);
    }

    public final oc o(uc ucVar, org.telegram.ui.ActionBar.g6 g6Var) {
        return m(ucVar, 1, 0, 0, g6Var);
    }

    public final oc p(long j10, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.f31416c;
        jc jcVar = new jc(W, g6Var);
        p5 p5Var = new p5(1, UserConfig.selectedAccount, j10);
        u9 u9Var = jcVar.f27666a;
        u9Var.setAnimatedEmojiDrawable(p5Var);
        u9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, g6Var), PorterDuff.Mode.SRC_IN));
        jcVar.f27667b.setText(str);
        jcVar.f27668c.setText(str2);
        return b(jcVar, 2750);
    }

    public final oc q(TLRPC.Document document, CharSequence charSequence) {
        wb wbVar = new wb(W(), this.f31416c);
        if (MessageObject.isTextColorEmoji(document)) {
            org.telegram.ui.ActionBar.r6.t(wbVar.f32175a, org.telegram.ui.ActionBar.k6.Hi, null, PorterDuff.Mode.SRC_IN);
        }
        wbVar.e(document, new String[0]);
        wbVar.f32176b.setText(charSequence);
        wbVar.f32176b.setTextSize(1, 14.0f);
        wbVar.f32176b.setSingleLine(false);
        wbVar.f32176b.setMaxLines(3);
        return b(wbVar, 2750);
    }

    public final oc r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.f31416c;
        wb wbVar = new wb(W, g6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            org.telegram.ui.ActionBar.r6.t(wbVar.f32175a, org.telegram.ui.ActionBar.k6.Hi, null, PorterDuff.Mode.SRC_IN);
        }
        wbVar.e(document, new String[0]);
        if (wbVar.f32175a.getImageReceiver() != null) {
            wbVar.f32175a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        wbVar.f32176b.setText(charSequence);
        wbVar.f32176b.setTextSize(1, 14.0f);
        wbVar.f32176b.setSingleLine(false);
        wbVar.f32176b.setMaxLines(3);
        mc mcVar = new mc(W(), g6Var, true);
        mcVar.e(str);
        mcVar.f28574b = runnable;
        wbVar.setButton(mcVar);
        return b(wbVar, 2750);
    }

    public final oc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i10;
        lc lcVar = new lc(W(), this.f31416c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        ak0 ak0Var = lcVar.f28317a;
        if (isTextColorEmoji) {
            org.telegram.ui.ActionBar.r6.t(ak0Var, org.telegram.ui.ActionBar.k6.Hi, null, PorterDuff.Mode.SRC_IN);
        }
        ak0Var.setAutoRepeat(true);
        ak0Var.g(36, 36, document);
        lcVar.f28318b.setText(str);
        lcVar.f28319c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(lcVar, i10);
    }

    public final oc t(CharSequence charSequence, org.telegram.ui.ActionBar.g6 g6Var) {
        wb wbVar = new wb(W(), g6Var);
        wbVar.d(R.raw.chats_infotip, new String[0]);
        wbVar.f32176b.setText(charSequence);
        wbVar.f32176b.setSingleLine(false);
        wbVar.f32176b.setMaxLines(2);
        return b(wbVar, 1500);
    }

    public final oc u(String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        lc lcVar = new lc(W(), g6Var);
        lcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        lcVar.f28318b.setText(str);
        lcVar.f28319c.setText(str2);
        return b(lcVar, 1500);
    }

    public final oc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.f31416c;
        wb wbVar = new wb(W, g6Var);
        wbVar.setBackground(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Fi, g6Var), 12);
        wbVar.f32175a.setImageResource(i10);
        wbVar.f32176b.setText(charSequence);
        wbVar.f32176b.setSingleLine(false);
        wbVar.f32176b.setLines(2);
        wbVar.f32176b.setMaxLines(4);
        TextView textView = wbVar.f32176b;
        textView.setMaxWidth(ei.x3.a(textView.getText(), wbVar.f32176b.getPaint()));
        wbVar.f32176b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) wbVar.f32176b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        wbVar.setWrapWidth();
        return b(wbVar, 5000);
    }

    public final oc y(int i10, TLRPC.Document document, hg.n nVar) {
        String string;
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.f31416c;
        wb wbVar = new wb(W, g6Var);
        wbVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        wbVar.removeView(wbVar.f32176b);
        x5 x5Var = new x5(wbVar.getContext());
        wbVar.f32176b = x5Var;
        x5Var.setTypeface(Typeface.SANS_SERIF);
        wbVar.f32176b.setTextSize(1, 15.0f);
        wbVar.f32176b.setEllipsize(TextUtils.TruncateAt.END);
        wbVar.f32176b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new y5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = wbVar.f32176b;
        if (i10 > 1) {
            string = LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]);
        } else {
            string = LocaleController.getString(R.string.SavedTagMessageTagged);
        }
        textView.setText(new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) spannableString));
        if (nVar != null) {
            mc mcVar = new mc(W(), g6Var, true);
            mcVar.e(LocaleController.getString(R.string.ViewAction));
            mcVar.f28574b = nVar;
            wbVar.setButton(mcVar);
        }
        wbVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Hi, g6Var));
        wbVar.addView(wbVar.f32176b, w7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(wbVar, 2750);
    }

    public vc(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f31415b = frameLayout;
        this.f31414a = null;
        this.f31416c = g6Var;
    }
}
