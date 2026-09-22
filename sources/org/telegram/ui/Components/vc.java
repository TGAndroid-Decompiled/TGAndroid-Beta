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
    public final org.telegram.ui.ActionBar.n2 f28685a;
    public final FrameLayout f28686b;
    public final org.telegram.ui.ActionBar.e6 f28687c;

    public vc(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var != null && n2Var.getLastStoryViewer() != null && n2Var.getLastStoryViewer().attachedToParent()) {
            this.f28685a = null;
            ai.f6 currentPeerView = n2Var.getLastStoryViewer().f1093n0.getCurrentPeerView();
            this.f28686b = currentPeerView != null ? currentPeerView.f800c1 : null;
            this.f28687c = n2Var.getLastStoryViewer().f1118y;
            return;
        }
        this.f28685a = n2Var;
        this.f28686b = null;
        this.f28687c = n2Var != null ? n2Var.getResourceProvider() : null;
    }

    public static oc A(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        return z(n2Var, i10, 0, e6Var);
    }

    public static oc B(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, ai.c9 c9Var, org.telegram.ui.se seVar, org.telegram.ui.ActionBar.e6 e6Var) {
        int i10;
        String str;
        int i11;
        int i12;
        wb wbVar = new wb(n2Var.getParentActivity(), e6Var);
        if (z10) {
            i10 = R.raw.ic_pin;
        } else {
            i10 = R.raw.ic_unpin;
        }
        wbVar.c(i10, 28, 28, "Pin", "Line");
        TextView textView = wbVar.f29679b;
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
            mc mcVar = new mc(n2Var.getParentActivity(), e6Var, true);
            mcVar.f26136a = c9Var;
            mcVar.f26137b = seVar;
            wbVar.setButton(mcVar);
        }
        if (z10) {
            i12 = 1500;
        } else {
            i12 = 5000;
        }
        return oc.g(n2Var, wbVar, i12);
    }

    public static oc C(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        wb wbVar = new wb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        wbVar.d(R.raw.ic_admin, "Shield");
        wbVar.f29679b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return oc.g(n2Var, wbVar, 1500);
    }

    public static oc D(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        String str2;
        wb wbVar = new wb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        wbVar.d(R.raw.ic_ban, "Hand");
        if (user.deleted) {
            str2 = LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        wbVar.f29679b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, str2, str)));
        return oc.g(n2Var, wbVar, 1500);
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

    public static oc S(int i10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.e6 e6Var) {
        String string;
        wb wbVar = new wb(n2Var.getParentActivity(), e6Var);
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
        wbVar.f29679b.setText(string);
        return oc.g(n2Var, wbVar, 1500);
    }

    public static vc X() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return new vc(jb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.f3) {
            return new vc(((org.telegram.ui.ActionBar.f3) dialog).container, U.getResourceProvider());
        }
        return a0(U);
    }

    public static vc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        return new vc(frameLayout, e6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var != null && n2Var.getParentActivity() != null && n2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static vc a0(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var == null) {
            return X();
        }
        return new vc(n2Var);
    }

    public static void b0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.C1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
        }
    }

    public static oc d(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        String string;
        wb wbVar = new wb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        if (z10) {
            wbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            wbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        wbVar.f29679b.setText(AndroidUtilities.replaceTags(string));
        return oc.g(n2Var, wbVar, 1500);
    }

    public static oc j(org.telegram.ui.ActionBar.n2 n2Var) {
        return a0(n2Var).k(false);
    }

    public static oc l(String str, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        int i10;
        String string;
        int i11;
        int i12;
        wb wbVar = new wb(n2Var.getParentActivity(), n2Var.getResourceProvider());
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
        wbVar.f29679b.setText(AndroidUtilities.replaceTags(string));
        if (!z10 && str == null) {
            i11 = R.raw.contact_check;
        } else {
            i11 = R.raw.e_hand_2;
        }
        wbVar.d(i11, new String[0]);
        return oc.g(n2Var, wbVar, 5000);
    }

    public static oc v(Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, int i10, long j3, int i11, int i12, int i13, int i14, boolean z10, a3.h0 h0Var) {
        wb wbVar;
        org.telegram.ui.ActionBar.e6 e6Var;
        boolean z11;
        org.telegram.ui.uh uhVar;
        SpannableStringBuilder replaceTags;
        oc g10;
        org.telegram.ui.ActionBar.e6 e6Var2;
        int i15;
        int i16;
        ai.f fVar;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && n2Var != null && i10 <= 1 && j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !z10) {
            wbVar = new zb(i11, n2Var);
        } else {
            if (n2Var != null) {
                e6Var = n2Var.getResourceProvider();
            } else {
                e6Var = null;
            }
            wbVar = new wb(i12, i13, context, e6Var);
        }
        wb wbVar2 = wbVar;
        if (h0Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (h0Var != null) {
            uhVar = new org.telegram.ui.uh(24, zArr, h0Var);
        } else {
            uhVar = null;
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
                wbVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            } else {
                a3.h0 h0Var2 = new a3.h0(uhVar, n2Var, j3, 17);
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
        wbVar2.f29679b.setText(replaceTags);
        if (z11) {
            Context context2 = wbVar2.getContext();
            if (n2Var != null) {
                e6Var2 = n2Var.getResourceProvider();
            } else {
                e6Var2 = null;
            }
            mc mcVar = new mc(context2, e6Var2, true, true);
            mcVar.f26136a = null;
            mcVar.f26137b = uhVar;
            wbVar2.setButton(mcVar);
        }
        wbVar2.postDelayed(new pc(wbVar2, 1), 300);
        if (frameLayout != null) {
            g10 = oc.f(frameLayout, wbVar2, i14);
        } else if (n2Var != null) {
            g10 = oc.g(n2Var, wbVar2, i14);
        } else {
            throw new IllegalArgumentException();
        }
        if (wbVar2 instanceof zb) {
            wbVar2.f29679b.setSingleLine(false);
            wbVar2.f29679b.setMaxLines(2);
            ((zb) wbVar2).setBulletin(g10);
            g10.f26759r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.oc x(android.app.Activity r4, android.widget.FrameLayout r5, int r6, long r7, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.oc");
    }

    public static org.telegram.ui.Components.oc z(org.telegram.ui.ActionBar.n2 r5, int r6, int r7, org.telegram.ui.ActionBar.e6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vc.z(org.telegram.ui.ActionBar.n2, int, int, org.telegram.ui.ActionBar.e6):org.telegram.ui.Components.oc");
    }

    public final oc E(org.telegram.ui.ActionBar.e6 e6Var) {
        wb wbVar = new wb(W(), e6Var);
        wbVar.d(R.raw.chats_infotip, new String[0]);
        wbVar.f29679b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(wbVar, 1500);
    }

    public final oc G(int i10, int i11, CharSequence charSequence) {
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        wb wbVar = new wb(W(), this.f28687c);
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
        wbVar.f29679b.setSingleLine(false);
        wbVar.f29679b.setMaxLines(i11);
        wbVar.f29679b.setText(charSequence);
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f28687c;
        wb wbVar = new wb(W, e6Var);
        if (i10 != 0) {
            wbVar.c(i10, 36, 36, new String[0]);
        } else {
            wbVar.f29678a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) wbVar.f29679b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        wbVar.f29679b.setTextSize(1, 14.0f);
        wbVar.f29679b.setTextDirection(5);
        wbVar.f29679b.setSingleLine(false);
        wbVar.f29679b.setMaxLines(3);
        wbVar.f29679b.setText(charSequence);
        mc mcVar = new mc(W(), e6Var, true, z10);
        mcVar.e(charSequence2);
        mcVar.f26136a = runnable;
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f28687c;
        lc lcVar = new lc(W, e6Var);
        lcVar.c(i10, 36, 36, new String[0]);
        lcVar.f25906b.setText(str);
        lcVar.f25907c.setText(charSequence);
        mc mcVar = new mc(W(), e6Var, true);
        mcVar.e(str2);
        mcVar.f26136a = runnable;
        lcVar.setButton(mcVar);
        return b(lcVar, 5000);
    }

    public final oc L(Drawable drawable, CharSequence charSequence) {
        wb wbVar = new wb(W(), this.f28687c);
        wbVar.f29678a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.vp0) {
            ((org.telegram.ui.vp0) drawable).e(wbVar.f29678a);
        }
        wbVar.f29679b.setText(charSequence);
        wbVar.f29679b.setSingleLine(false);
        wbVar.f29679b.setMaxLines(2);
        return b(wbVar, 2750);
    }

    public final oc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int i11;
        lc lcVar = new lc(W(), this.f28687c);
        lcVar.c(i10, 36, 36, new String[0]);
        lcVar.f25906b.setText(charSequence);
        lcVar.f25907c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(lcVar, i11);
    }

    public final oc N(String str, String str2) {
        lc lcVar = new lc(W(), this.f28687c);
        lcVar.f25905a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) lcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        lcVar.f25906b.setText(str);
        lcVar.f25907c.setText(str2);
        return b(lcVar, 5000);
    }

    public final oc O(TLRPC.Document document, String str, String str2) {
        int i10;
        if (document == null) {
            return new oc();
        }
        kc kcVar = new kc(W(), this.f28687c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        u9 u9Var = kcVar.f25583a;
        u9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        u9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = kcVar.f25584b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = kcVar.f25585c;
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
        wb wbVar = new wb(W(), this.f28687c);
        wbVar.c(i10, 36, 36, new String[0]);
        wbVar.f29679b.setText(charSequence);
        wbVar.f29679b.setSingleLine(false);
        wbVar.f29679b.setTextSize(1, 14.0f);
        wbVar.f29679b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(wbVar, i11);
    }

    public final oc Q(int i10, int i11, CharSequence charSequence) {
        int i12;
        wb wbVar = new wb(W(), this.f28687c);
        wbVar.c(i10, i11, i11, new String[0]);
        wbVar.f29679b.setText(charSequence);
        wbVar.f29679b.setSingleLine(false);
        wbVar.f29679b.setMaxLines(2);
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
        kc kcVar = new kc(W(), this.f28687c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        u9 u9Var = kcVar.f25583a;
        u9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        u9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = kcVar.f25584b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        kcVar.f25585c.setVisibility(8);
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
        wbVar.f29679b.setText(str);
        wbVar.f29679b.setSingleLine(false);
        wbVar.f29679b.setMaxLines(2);
        return b(wbVar, 1500);
    }

    public final oc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        lc lcVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.e6 e6Var = this.f28687c;
        if (!isEmpty) {
            lc lcVar2 = new lc(W(), e6Var);
            lcVar2.f25906b.setText(str);
            lcVar2.f25907c.setText((CharSequence) null);
            lcVar = lcVar2;
        } else {
            wb wbVar = new wb(W(), e6Var);
            wbVar.f29679b.setText(str);
            wbVar.f29679b.setSingleLine(false);
            wbVar.f29679b.setMaxLines(2);
            lcVar = wbVar;
        }
        lcVar.setTimer();
        mc mcVar = new mc(W(), e6Var, true, z10);
        mcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        mcVar.f26136a = runnable;
        mcVar.f26137b = runnable2;
        lcVar.setButton(mcVar);
        return b(lcVar, 5000);
    }

    public final oc V(List list, CharSequence charSequence, CharSequence charSequence2, o0.a aVar) {
        boolean z10;
        float f7;
        int i10;
        Context W = W();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f28687c;
        nc ncVar = new nc(W, e6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    ncVar.f26432a.setCount(i13);
                    ncVar.f26432a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                ncVar.f26432a.setTranslationX(AndroidUtilities.dp(4.0f));
                ncVar.f26432a.setScaleX(1.2f);
                ncVar.f26432a.setScaleY(1.2f);
            } else {
                ncVar.f26432a.setScaleX(1.0f);
                ncVar.f26432a.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        ncVar.f26432a.a(false);
        if (charSequence2 != null) {
            ncVar.f26433b.setSingleLine(true);
            ncVar.f26433b.setMaxLines(1);
            ncVar.f26433b.setText(charSequence);
            ncVar.f26434c.setText(charSequence2);
            ncVar.f26434c.setSingleLine(false);
            ncVar.f26434c.setMaxLines(3);
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
            ncVar.f26433b.setSingleLine(false);
            ncVar.f26433b.setMaxLines(4);
            ncVar.f26433b.setText(charSequence);
            if (ncVar.f26433b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    ncVar.f26433b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) ncVar.f26433b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) ncVar.f26433b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (aVar != null) {
            mc mcVar = new mc(W(), e6Var, true);
            mcVar.e(LocaleController.getString(R.string.UndoNoCaps));
            mcVar.f26136a = (Runnable) aVar.f15298b;
            mcVar.f26137b = (Runnable) aVar.f15299c;
            ncVar.setButton(mcVar);
        }
        return b(ncVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.n2 n2Var = this.f28685a;
        if (n2Var != null) {
            context = n2Var.getParentActivity();
            if (context == null && this.f28685a.getLayoutContainer() != null) {
                context = this.f28685a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f28686b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return ApplicationLoader.applicationContext;
        }
        return context;
    }

    public final oc Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.C1) {
            return new oc();
        }
        if (tL_error == null) {
            return t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
        }
        return t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final oc b(lb lbVar, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f28685a;
        if (n2Var != null) {
            return oc.g(n2Var, lbVar, i10);
        }
        return oc.f(this.f28686b, lbVar, i10);
    }

    public final oc c(CharSequence charSequence) {
        if (W() == null) {
            return new oc();
        }
        wb wbVar = new wb(W(), this.f28687c);
        wbVar.d(R.raw.ic_admin, "Shield");
        wbVar.f29679b.setSingleLine(false);
        wbVar.f29679b.setMaxLines(3);
        wbVar.f29679b.setText(charSequence);
        return b(wbVar, 2750);
    }

    public final void c0(String str, boolean z10) {
        if (!LaunchActivity.C1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            oc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
            t10.f26759r = false;
            t10.k(z10);
            return;
        }
        oc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t11.f26759r = false;
        t11.k(z10);
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.C1) {
            if (tL_error == null) {
                oc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.f26759r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                oc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.f26759r = false;
                t11.k(z10);
            }
        }
    }

    public final oc e(boolean z10) {
        String string;
        wb wbVar = new wb(W(), this.f28687c);
        if (z10) {
            wbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            wbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        wbVar.f29679b.setText(AndroidUtilities.replaceTags(string));
        return b(wbVar, 1500);
    }

    public final boolean e0(int i10, long j3) {
        org.telegram.ui.ActionBar.n2 n2Var;
        SpannableStringBuilder replaceSingleTag;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (n2Var = this.f28685a) != null) {
            zb zbVar = new zb(i10, n2Var);
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i10 <= 1) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new ai.f(25));
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ai.f(25));
                }
                zbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                zbVar.f29679b.setText(replaceSingleTag);
                zbVar.f29679b.setSingleLine(false);
                zbVar.f29679b.setMaxLines(2);
                oc b10 = b(zbVar, 3500);
                zbVar.setBulletin(b10);
                b10.f26759r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
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
        wbVar.f29679b.setText(valueOf);
        wbVar.f29679b.setSingleLine(false);
        wbVar.f29679b.setMaxLines(3);
        return b(wbVar, 5000);
    }

    public final oc g(String str, ArrayList arrayList) {
        nc ncVar = new nc(W(), this.f28687c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                ncVar.f26432a.setCount(i12);
                ncVar.f26432a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            ncVar.f26432a.setTranslationX(AndroidUtilities.dp(4.0f));
            ncVar.f26432a.setScaleX(1.2f);
            ncVar.f26432a.setScaleY(1.2f);
        } else {
            ncVar.f26432a.setScaleX(1.0f);
            ncVar.f26432a.setScaleY(1.0f);
        }
        ncVar.f26432a.a(false);
        ncVar.f26433b.setSingleLine(false);
        ncVar.f26433b.setMaxLines(2);
        ncVar.f26433b.setText(str);
        if (ncVar.f26433b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) ncVar.f26433b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) ncVar.f26433b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            ncVar.f26432a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(ncVar, 5000);
    }

    public final oc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        SpannableStringBuilder spannableStringBuilder;
        h90 h90Var;
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
        org.telegram.ui.ActionBar.e6 e6Var = this.f28687c;
        if (indexOf >= 0) {
            h90Var = new h90(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), e6Var);
            spannableStringBuilder.setSpan(h90Var, indexOf, indexOf + 11, 33);
            int i12 = org.telegram.ui.ActionBar.i6.Hi;
            h90Var.a(i0.a.k(org.telegram.ui.ActionBar.i6.v0(i12, e6Var), 32), i0.a.k(org.telegram.ui.ActionBar.i6.v0(i12, e6Var), 72));
        } else {
            h90Var = null;
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
        ?? wbVar = new wb(W, e6Var);
        c90 c90Var = new c90(W, null);
        wbVar.d = c90Var;
        c90Var.setDisablePaddingsOffset(true);
        c90Var.setSingleLine();
        c90Var.setTypeface(Typeface.SANS_SERIF);
        c90Var.setTextSize(1, 15.0f);
        c90Var.setEllipsize(TextUtils.TruncateAt.END);
        c90Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        wbVar.f29679b.setVisibility(8);
        wbVar.addView(c90Var, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i13 = org.telegram.ui.ActionBar.i6.Hi;
        wbVar.setTextColor(wbVar.getThemedColor(i13));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            wbVar.f29678a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, i13, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        wbVar.e(document, new String[i11]);
        wbVar.f29679b.setTextSize(1, 14.0f);
        wbVar.f29679b.setSingleLine(i11);
        wbVar.f29679b.setMaxLines(3);
        c90Var.setText(spannableStringBuilder);
        c90Var.setTextSize(1, 14.0f);
        c90Var.setSingleLine(i11);
        c90Var.setMaxLines(3);
        mc mcVar = new mc(W(), e6Var, true);
        mcVar.e(string);
        mcVar.f26136a = runnable;
        wbVar.setButton(mcVar);
        oc b10 = b(wbVar, 2750);
        if (h90Var != null) {
            sb sbVar = b10.e;
            if (sbVar instanceof ub) {
                h90Var.f24641b = ((ub) sbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new rc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final oc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new oc();
        }
        wb wbVar = new wb(W(), null);
        wbVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        wbVar.f29679b.setText(str);
        return b(wbVar, 1500);
    }

    public final oc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new oc();
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f28687c;
        if (z10) {
            lc lcVar = new lc(W(), e6Var);
            lcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            lcVar.f25906b.setText(LocaleController.getString(R.string.LinkCopied));
            lcVar.f25907c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
            return b(lcVar, 2750);
        }
        wb wbVar = new wb(W(), e6Var);
        wbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        wbVar.f29679b.setText(LocaleController.getString(R.string.LinkCopied));
        return b(wbVar, 1500);
    }

    public final oc m(uc ucVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.e6 e6Var) {
        wb wbVar;
        String string;
        if (i11 != 0 && i12 != 0) {
            wbVar = new wb(i11, i12, W(), e6Var);
        } else {
            wbVar = new wb(W(), e6Var);
        }
        tc tcVar = ucVar.d;
        wbVar.d(tcVar.f28094a, tcVar.f28095b);
        TextView textView = wbVar.f29679b;
        String str = ucVar.f28338a;
        if (ucVar.f28340c) {
            string = LocaleController.formatPluralString(str, i10, new Object[0]);
        } else {
            string = LocaleController.getString(str, ucVar.f28339b);
        }
        textView.setText(AndroidUtilities.replaceSingleTag(string, new ai.f(26)));
        int i13 = ucVar.d.f28096c;
        if (i13 != 0) {
            wbVar.setIconPaddingBottom(i13);
        }
        return b(wbVar, 1500);
    }

    public final oc n(uc ucVar, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        return m(ucVar, i10, 0, 0, e6Var);
    }

    public final oc o(uc ucVar, org.telegram.ui.ActionBar.e6 e6Var) {
        return m(ucVar, 1, 0, 0, e6Var);
    }

    public final oc p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f28687c;
        jc jcVar = new jc(W, e6Var);
        o5 o5Var = new o5(1, UserConfig.selectedAccount, j3);
        u9 u9Var = jcVar.f25275a;
        u9Var.setAnimatedEmojiDrawable(o5Var);
        u9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, e6Var), PorterDuff.Mode.SRC_IN));
        jcVar.f25276b.setText(str);
        jcVar.f25277c.setText(str2);
        return b(jcVar, 2750);
    }

    public final oc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f28687c;
        wb wbVar = new wb(W, e6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            wbVar.f29678a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        wbVar.e(document, new String[0]);
        if (wbVar.f29678a.getImageReceiver() != null) {
            wbVar.f29678a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        wbVar.f29679b.setText(charSequence);
        wbVar.f29679b.setTextSize(1, 14.0f);
        wbVar.f29679b.setSingleLine(false);
        wbVar.f29679b.setMaxLines(3);
        mc mcVar = new mc(W(), e6Var, true);
        mcVar.e(str);
        mcVar.f26136a = runnable;
        wbVar.setButton(mcVar);
        return b(wbVar, 2750);
    }

    public final oc r(TLRPC.Document document, String str) {
        wb wbVar = new wb(W(), this.f28687c);
        if (MessageObject.isTextColorEmoji(document)) {
            wbVar.f29678a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        wbVar.e(document, new String[0]);
        wbVar.f29679b.setText(str);
        wbVar.f29679b.setTextSize(1, 14.0f);
        wbVar.f29679b.setSingleLine(false);
        wbVar.f29679b.setMaxLines(3);
        return b(wbVar, 2750);
    }

    public final oc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i10;
        lc lcVar = new lc(W(), this.f28687c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        aj0 aj0Var = lcVar.f25905a;
        if (isTextColorEmoji) {
            aj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        aj0Var.setAutoRepeat(true);
        aj0Var.g(36, 36, document);
        lcVar.f25906b.setText(str);
        lcVar.f25907c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(lcVar, i10);
    }

    public final oc t(CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        wb wbVar = new wb(W(), e6Var);
        wbVar.d(R.raw.chats_infotip, new String[0]);
        wbVar.f29679b.setText(charSequence);
        wbVar.f29679b.setSingleLine(false);
        wbVar.f29679b.setMaxLines(2);
        return b(wbVar, 1500);
    }

    public final oc u(String str, String str2, org.telegram.ui.ActionBar.e6 e6Var) {
        lc lcVar = new lc(W(), e6Var);
        lcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        lcVar.f25906b.setText(str);
        lcVar.f25907c.setText(str2);
        return b(lcVar, 1500);
    }

    public final oc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f28687c;
        wb wbVar = new wb(W, e6Var);
        wbVar.setBackground(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Fi, e6Var), 12);
        wbVar.f29678a.setImageResource(i10);
        wbVar.f29679b.setText(charSequence);
        wbVar.f29679b.setSingleLine(false);
        wbVar.f29679b.setLines(2);
        wbVar.f29679b.setMaxLines(4);
        TextView textView = wbVar.f29679b;
        textView.setMaxWidth(ci.f4.a(textView.getText(), wbVar.f29679b.getPaint()));
        wbVar.f29679b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) wbVar.f29679b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        wbVar.setWrapWidth();
        return b(wbVar, 5000);
    }

    public final oc y(int i10, TLRPC.Document document, gg.n nVar) {
        String string;
        Context W = W();
        org.telegram.ui.ActionBar.e6 e6Var = this.f28687c;
        wb wbVar = new wb(W, e6Var);
        wbVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        wbVar.removeView(wbVar.f29679b);
        w5 w5Var = new w5(wbVar.getContext());
        wbVar.f29679b = w5Var;
        w5Var.setTypeface(Typeface.SANS_SERIF);
        wbVar.f29679b.setTextSize(1, 15.0f);
        wbVar.f29679b.setEllipsize(TextUtils.TruncateAt.END);
        wbVar.f29679b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new x5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = wbVar.f29679b;
        if (i10 > 1) {
            string = LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]);
        } else {
            string = LocaleController.getString(R.string.SavedTagMessageTagged);
        }
        textView.setText(new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) spannableString));
        if (nVar != null) {
            mc mcVar = new mc(W(), e6Var, true);
            mcVar.e(LocaleController.getString(R.string.ViewAction));
            mcVar.f26136a = nVar;
            wbVar.setButton(mcVar);
        }
        wbVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Hi, e6Var));
        wbVar.addView(wbVar.f29679b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(wbVar, 2750);
    }

    public vc(FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f28686b = frameLayout;
        this.f28685a = null;
        this.f28687c = e6Var;
    }
}
