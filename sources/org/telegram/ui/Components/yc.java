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
    public final org.telegram.ui.ActionBar.n2 f32908a;
    public final FrameLayout f32909b;
    public final org.telegram.ui.ActionBar.f6 f32910c;

    public yc(org.telegram.ui.ActionBar.n2 n2Var) {
        if (n2Var != null && n2Var.getLastStoryViewer() != null && n2Var.getLastStoryViewer().attachedToParent()) {
            this.f32908a = null;
            bi.o5 currentPeerView = n2Var.getLastStoryViewer().f3588n0.getCurrentPeerView();
            this.f32909b = currentPeerView != null ? currentPeerView.f3436c1 : null;
            this.f32910c = n2Var.getLastStoryViewer().f3613y;
            return;
        }
        this.f32908a = n2Var;
        this.f32909b = null;
        this.f32910c = n2Var != null ? n2Var.getResourceProvider() : null;
    }

    public static qc A(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        return z(n2Var, i10, 0, f6Var);
    }

    public static qc B(org.telegram.ui.ActionBar.n2 n2Var, boolean z10, bi.k8 k8Var, org.telegram.ui.te teVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        String str;
        int i11;
        int i12;
        yb ybVar = new yb(n2Var.getParentActivity(), f6Var);
        if (z10) {
            i10 = R.raw.ic_pin;
        } else {
            i10 = R.raw.ic_unpin;
        }
        ybVar.c(i10, 28, 28, "Pin", "Line");
        TextView textView = ybVar.f32903b;
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
            oc ocVar = new oc(n2Var.getParentActivity(), f6Var, true);
            ocVar.f29056a = k8Var;
            ocVar.f29057b = teVar;
            ybVar.setButton(ocVar);
        }
        if (z10) {
            i12 = 1500;
        } else {
            i12 = 5000;
        }
        return qc.g(n2Var, ybVar, i12);
    }

    public static qc C(org.telegram.ui.ActionBar.n2 n2Var, String str) {
        yb ybVar = new yb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        ybVar.d(R.raw.ic_admin, "Shield");
        ybVar.f32903b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return qc.g(n2Var, ybVar, 1500);
    }

    public static qc D(org.telegram.ui.ActionBar.n2 n2Var, TLRPC.User user, String str) {
        String str2;
        yb ybVar = new yb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        ybVar.d(R.raw.ic_ban, "Hand");
        if (user.deleted) {
            str2 = LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        ybVar.f32903b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, str2, str)));
        return qc.g(n2Var, ybVar, 1500);
    }

    public static qc F(FrameLayout frameLayout, boolean z10) {
        xc xcVar;
        yc ycVar = new yc(frameLayout, null);
        if (z10) {
            xcVar = xc.h;
        } else {
            xcVar = xc.f32523e;
        }
        return ycVar.m(xcVar, 1, -115203550, -1, null);
    }

    public static qc S(int i10, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        String string;
        yb ybVar = new yb(n2Var.getParentActivity(), f6Var);
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
            ybVar.d(R.raw.sound_on, new String[0]);
        } else {
            ybVar.d(R.raw.sound_off, new String[0]);
        }
        ybVar.f32903b.setText(string);
        return qc.g(n2Var, ybVar, 1500);
    }

    public static yc X() {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return new yc(lb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.f3) {
            return new yc(((org.telegram.ui.ActionBar.f3) dialog).container, U.getResourceProvider());
        }
        return a0(U);
    }

    public static yc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        return new yc(frameLayout, f6Var);
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

    public static qc d(org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        String string;
        yb ybVar = new yb(n2Var.getParentActivity(), n2Var.getResourceProvider());
        if (z10) {
            ybVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            ybVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        ybVar.f32903b.setText(AndroidUtilities.replaceTags(string));
        return qc.g(n2Var, ybVar, 1500);
    }

    public static qc j(org.telegram.ui.ActionBar.n2 n2Var) {
        return a0(n2Var).k(false);
    }

    public static qc l(String str, org.telegram.ui.ActionBar.n2 n2Var, boolean z10) {
        int i10;
        String string;
        int i11;
        int i12;
        yb ybVar = new yb(n2Var.getParentActivity(), n2Var.getResourceProvider());
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
        ybVar.f32903b.setText(AndroidUtilities.replaceTags(string));
        if (!z10 && str == null) {
            i11 = R.raw.contact_check;
        } else {
            i11 = R.raw.e_hand_2;
        }
        ybVar.d(i11, new String[0]);
        return qc.g(n2Var, ybVar, 5000);
    }

    public static qc v(Context context, org.telegram.ui.ActionBar.n2 n2Var, FrameLayout frameLayout, int i10, long j3, int i11, int i12, int i13, int i14, boolean z10, a3.h0 h0Var) {
        yb ybVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean z11;
        uc ucVar;
        SpannableStringBuilder replaceTags;
        qc g10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i15;
        int i16;
        ah.j jVar;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && n2Var != null && i10 <= 1 && j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !z10) {
            ybVar = new bc(i11, n2Var);
        } else {
            if (n2Var != null) {
                f6Var = n2Var.getResourceProvider();
            } else {
                f6Var = null;
            }
            ybVar = new yb(i12, i13, context, f6Var);
        }
        yb ybVar2 = ybVar;
        if (h0Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (h0Var != null) {
            ucVar = new uc(0, zArr, h0Var);
        } else {
            ucVar = null;
        }
        if (i10 <= 1) {
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i11 <= 1) {
                    String string = LocaleController.getString(R.string.FwdMessageToSavedMessages);
                    if (z10) {
                        jVar = new ah.j(28);
                    } else {
                        jVar = new ah.j(26);
                    }
                    replaceTags = AndroidUtilities.replaceSingleTag(string, -1, 2, jVar);
                } else {
                    replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ah.j(26));
                }
                ybVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            } else {
                a3.h0 h0Var2 = new a3.h0(ucVar, n2Var, j3, 17);
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
                ybVar2.c(R.raw.forward, 30, 30, new String[0]);
            }
        } else {
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0]));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            }
            ybVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        ybVar2.f32903b.setText(replaceTags);
        if (z11) {
            Context context2 = ybVar2.getContext();
            if (n2Var != null) {
                f6Var2 = n2Var.getResourceProvider();
            } else {
                f6Var2 = null;
            }
            oc ocVar = new oc(context2, f6Var2, true, true);
            ocVar.f29056a = null;
            ocVar.f29057b = ucVar;
            ybVar2.setButton(ocVar);
        }
        ybVar2.postDelayed(new rc(ybVar2, 1), 300);
        if (frameLayout != null) {
            g10 = qc.f(frameLayout, ybVar2, i14);
        } else if (n2Var != null) {
            g10 = qc.g(n2Var, ybVar2, i14);
        } else {
            throw new IllegalArgumentException();
        }
        if (ybVar2 instanceof bc) {
            ybVar2.f32903b.setSingleLine(false);
            ybVar2.f32903b.setMaxLines(2);
            ((bc) ybVar2).setBulletin(g10);
            g10.f29714r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.qc x(android.app.Activity r4, android.widget.FrameLayout r5, int r6, long r7, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.qc");
    }

    public static org.telegram.ui.Components.qc z(org.telegram.ui.ActionBar.n2 r5, int r6, int r7, org.telegram.ui.ActionBar.f6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yc.z(org.telegram.ui.ActionBar.n2, int, int, org.telegram.ui.ActionBar.f6):org.telegram.ui.Components.qc");
    }

    public final qc E(org.telegram.ui.ActionBar.f6 f6Var) {
        yb ybVar = new yb(W(), f6Var);
        ybVar.d(R.raw.chats_infotip, new String[0]);
        ybVar.f32903b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(ybVar, 1500);
    }

    public final qc G(int i10, int i11, CharSequence charSequence) {
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        yb ybVar = new yb(W(), this.f32910c);
        ybVar.c(i10, 36, 36, new String[0]);
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
        ybVar.f32903b.setSingleLine(false);
        ybVar.f32903b.setMaxLines(i11);
        ybVar.f32903b.setText(charSequence);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(ybVar, i12);
    }

    public final qc H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final qc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f32910c;
        yb ybVar = new yb(W, f6Var);
        if (i10 != 0) {
            ybVar.c(i10, 36, 36, new String[0]);
        } else {
            ybVar.f32902a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) ybVar.f32903b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        ybVar.f32903b.setTextSize(1, 14.0f);
        ybVar.f32903b.setTextDirection(5);
        ybVar.f32903b.setSingleLine(false);
        ybVar.f32903b.setMaxLines(3);
        ybVar.f32903b.setText(charSequence);
        oc ocVar = new oc(W(), f6Var, true, z10);
        ocVar.e(charSequence2);
        ocVar.f29056a = runnable;
        ybVar.setButton(ocVar);
        return b(ybVar, i11);
    }

    public final qc J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        int i11;
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return I(i10, charSequence, str, i11, false, runnable);
    }

    public final qc K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f32910c;
        nc ncVar = new nc(W, f6Var);
        ncVar.c(i10, 36, 36, new String[0]);
        ncVar.f28751b.setText(str);
        ncVar.f28752c.setText(charSequence);
        oc ocVar = new oc(W(), f6Var, true);
        ocVar.e(str2);
        ocVar.f29056a = runnable;
        ncVar.setButton(ocVar);
        return b(ncVar, 5000);
    }

    public final qc L(Drawable drawable, CharSequence charSequence) {
        yb ybVar = new yb(W(), this.f32910c);
        ybVar.f32902a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.wp0) {
            ((org.telegram.ui.wp0) drawable).e(ybVar.f32902a);
        }
        ybVar.f32903b.setText(charSequence);
        ybVar.f32903b.setSingleLine(false);
        ybVar.f32903b.setMaxLines(2);
        return b(ybVar, 2750);
    }

    public final qc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int i11;
        nc ncVar = new nc(W(), this.f32910c);
        ncVar.c(i10, 36, 36, new String[0]);
        ncVar.f28751b.setText(charSequence);
        ncVar.f28752c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(ncVar, i11);
    }

    public final qc N(String str, String str2) {
        nc ncVar = new nc(W(), this.f32910c);
        ncVar.f28750a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) ncVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        ncVar.f28751b.setText(str);
        ncVar.f28752c.setText(str2);
        return b(ncVar, 5000);
    }

    public final qc O(TLRPC.Document document, String str, String str2) {
        int i10;
        if (document == null) {
            return new qc();
        }
        mc mcVar = new mc(W(), this.f32910c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        x9 x9Var = mcVar.f28459a;
        x9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        x9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = mcVar.f28460b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = mcVar.f28461c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(mcVar, i10);
    }

    public final qc P(int i10, CharSequence charSequence) {
        int i11;
        yb ybVar = new yb(W(), this.f32910c);
        ybVar.c(i10, 36, 36, new String[0]);
        ybVar.f32903b.setText(charSequence);
        ybVar.f32903b.setSingleLine(false);
        ybVar.f32903b.setTextSize(1, 14.0f);
        ybVar.f32903b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(ybVar, i11);
    }

    public final qc Q(int i10, int i11, CharSequence charSequence) {
        int i12;
        yb ybVar = new yb(W(), this.f32910c);
        ybVar.c(i10, i11, i11, new String[0]);
        ybVar.f32903b.setText(charSequence);
        ybVar.f32903b.setSingleLine(false);
        ybVar.f32903b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(ybVar, i12);
    }

    public final qc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        if (document == null) {
            return new qc();
        }
        mc mcVar = new mc(W(), this.f32910c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        x9 x9Var = mcVar.f28459a;
        x9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        x9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = mcVar.f28460b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        mcVar.f28461c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(mcVar, i10);
    }

    public final qc T(String str) {
        yb ybVar = new yb(W(), null);
        ybVar.d(R.raw.contact_check, new String[0]);
        ybVar.f32903b.setText(str);
        ybVar.f32903b.setSingleLine(false);
        ybVar.f32903b.setMaxLines(2);
        return b(ybVar, 1500);
    }

    public final qc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        nc ncVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.f6 f6Var = this.f32910c;
        if (!isEmpty) {
            nc ncVar2 = new nc(W(), f6Var);
            ncVar2.f28751b.setText(str);
            ncVar2.f28752c.setText((CharSequence) null);
            ncVar = ncVar2;
        } else {
            yb ybVar = new yb(W(), f6Var);
            ybVar.f32903b.setText(str);
            ybVar.f32903b.setSingleLine(false);
            ybVar.f32903b.setMaxLines(2);
            ncVar = ybVar;
        }
        ncVar.setTimer();
        oc ocVar = new oc(W(), f6Var, true, z10);
        ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ocVar.f29056a = runnable;
        ocVar.f29057b = runnable2;
        ncVar.setButton(ocVar);
        return b(ncVar, 5000);
    }

    public final qc V(List list, CharSequence charSequence, CharSequence charSequence2, o0.a aVar) {
        boolean z10;
        float f7;
        int i10;
        Context W = W();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f32910c;
        pc pcVar = new pc(W, f6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    pcVar.f29374a.setCount(i13);
                    pcVar.f29374a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                pcVar.f29374a.setTranslationX(AndroidUtilities.dp(4.0f));
                pcVar.f29374a.setScaleX(1.2f);
                pcVar.f29374a.setScaleY(1.2f);
            } else {
                pcVar.f29374a.setScaleX(1.0f);
                pcVar.f29374a.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        pcVar.f29374a.a(false);
        if (charSequence2 != null) {
            pcVar.f29375b.setSingleLine(true);
            pcVar.f29375b.setMaxLines(1);
            pcVar.f29375b.setText(charSequence);
            pcVar.f29376c.setText(charSequence2);
            pcVar.f29376c.setSingleLine(false);
            pcVar.f29376c.setMaxLines(3);
            if (pcVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) pcVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) pcVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            pcVar.f29375b.setSingleLine(false);
            pcVar.f29375b.setMaxLines(4);
            pcVar.f29375b.setText(charSequence);
            if (pcVar.f29375b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    pcVar.f29375b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) pcVar.f29375b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) pcVar.f29375b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (aVar != null) {
            oc ocVar = new oc(W(), f6Var, true);
            ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
            ocVar.f29056a = (Runnable) aVar.f16796b;
            ocVar.f29057b = (Runnable) aVar.f16797c;
            pcVar.setButton(ocVar);
        }
        return b(pcVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.n2 n2Var = this.f32908a;
        if (n2Var != null) {
            context = n2Var.getParentActivity();
            if (context == null && this.f32908a.getLayoutContainer() != null) {
                context = this.f32908a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f32909b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return ApplicationLoader.applicationContext;
        }
        return context;
    }

    public final qc Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.C1) {
            return new qc();
        }
        if (tL_error == null) {
            return t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
        }
        return t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final qc b(nb nbVar, int i10) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f32908a;
        if (n2Var != null) {
            return qc.g(n2Var, nbVar, i10);
        }
        return qc.f(this.f32909b, nbVar, i10);
    }

    public final qc c(CharSequence charSequence) {
        if (W() == null) {
            return new qc();
        }
        yb ybVar = new yb(W(), this.f32910c);
        ybVar.d(R.raw.ic_admin, "Shield");
        ybVar.f32903b.setSingleLine(false);
        ybVar.f32903b.setMaxLines(3);
        ybVar.f32903b.setText(charSequence);
        return b(ybVar, 2750);
    }

    public final void c0(String str, boolean z10) {
        if (!LaunchActivity.C1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            qc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
            t10.f29714r = false;
            t10.k(z10);
            return;
        }
        qc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t11.f29714r = false;
        t11.k(z10);
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.C1) {
            if (tL_error == null) {
                qc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.f29714r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                qc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.f29714r = false;
                t11.k(z10);
            }
        }
    }

    public final qc e(boolean z10) {
        String string;
        yb ybVar = new yb(W(), this.f32910c);
        if (z10) {
            ybVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            ybVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        ybVar.f32903b.setText(AndroidUtilities.replaceTags(string));
        return b(ybVar, 1500);
    }

    public final boolean e0(int i10, long j3) {
        org.telegram.ui.ActionBar.n2 n2Var;
        SpannableStringBuilder replaceSingleTag;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (n2Var = this.f32908a) != null) {
            bc bcVar = new bc(i10, n2Var);
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i10 <= 1) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new ah.j(26));
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ah.j(26));
                }
                bcVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                bcVar.f32903b.setText(replaceSingleTag);
                bcVar.f32903b.setSingleLine(false);
                bcVar.f32903b.setMaxLines(2);
                qc b10 = b(bcVar, 3500);
                bcVar.setBulletin(b10);
                b10.f29714r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final qc f(int i10, Runnable runnable) {
        yb ybVar = new yb(W(), null);
        ybVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new vc(0, runnable), indexOf, indexOf2 - 1, 33);
        ybVar.f32903b.setText(valueOf);
        ybVar.f32903b.setSingleLine(false);
        ybVar.f32903b.setMaxLines(3);
        return b(ybVar, 5000);
    }

    public final qc g(String str, ArrayList arrayList) {
        pc pcVar = new pc(W(), this.f32910c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                pcVar.f29374a.setCount(i12);
                pcVar.f29374a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            pcVar.f29374a.setTranslationX(AndroidUtilities.dp(4.0f));
            pcVar.f29374a.setScaleX(1.2f);
            pcVar.f29374a.setScaleY(1.2f);
        } else {
            pcVar.f29374a.setScaleX(1.0f);
            pcVar.f29374a.setScaleY(1.0f);
        }
        pcVar.f29374a.a(false);
        pcVar.f29375b.setSingleLine(false);
        pcVar.f29375b.setMaxLines(2);
        pcVar.f29375b.setText(str);
        if (pcVar.f29375b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) pcVar.f29375b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) pcVar.f29375b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            pcVar.f29374a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(pcVar, 5000);
    }

    public final qc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        SpannableStringBuilder spannableStringBuilder;
        i90 i90Var;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f32910c;
        if (indexOf >= 0) {
            i90Var = new i90(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), f6Var);
            spannableStringBuilder.setSpan(i90Var, indexOf, indexOf + 11, 33);
            int i12 = org.telegram.ui.ActionBar.j6.Hi;
            i90Var.a(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), 32), i0.a.k(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), 72));
        } else {
            i90Var = null;
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
        ?? ybVar = new yb(W, f6Var);
        d90 d90Var = new d90(W, null);
        ybVar.d = d90Var;
        d90Var.setDisablePaddingsOffset(true);
        d90Var.setSingleLine();
        d90Var.setTypeface(Typeface.SANS_SERIF);
        d90Var.setTextSize(1, 15.0f);
        d90Var.setEllipsize(TextUtils.TruncateAt.END);
        d90Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ybVar.f32903b.setVisibility(8);
        ybVar.addView(d90Var, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i13 = org.telegram.ui.ActionBar.j6.Hi;
        ybVar.setTextColor(ybVar.getThemedColor(i13));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            ybVar.f32902a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i13, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        ybVar.e(document, new String[i11]);
        ybVar.f32903b.setTextSize(1, 14.0f);
        ybVar.f32903b.setSingleLine(i11);
        ybVar.f32903b.setMaxLines(3);
        d90Var.setText(spannableStringBuilder);
        d90Var.setTextSize(1, 14.0f);
        d90Var.setSingleLine(i11);
        d90Var.setMaxLines(3);
        oc ocVar = new oc(W(), f6Var, true);
        ocVar.e(string);
        ocVar.f29056a = runnable;
        ybVar.setButton(ocVar);
        qc b10 = b(ybVar, 2750);
        if (i90Var != null) {
            ub ubVar = b10.f29702e;
            if (ubVar instanceof wb) {
                i90Var.f27076b = ((wb) ubVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new tc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final qc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new qc();
        }
        yb ybVar = new yb(W(), null);
        ybVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        ybVar.f32903b.setText(str);
        return b(ybVar, 1500);
    }

    public final qc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new qc();
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f32910c;
        if (z10) {
            nc ncVar = new nc(W(), f6Var);
            ncVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ncVar.f28751b.setText(LocaleController.getString(R.string.LinkCopied));
            ncVar.f28752c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
            return b(ncVar, 2750);
        }
        yb ybVar = new yb(W(), f6Var);
        ybVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        ybVar.f32903b.setText(LocaleController.getString(R.string.LinkCopied));
        return b(ybVar, 1500);
    }

    public final qc m(xc xcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.f6 f6Var) {
        yb ybVar;
        String string;
        if (i11 != 0 && i12 != 0) {
            ybVar = new yb(i11, i12, W(), f6Var);
        } else {
            ybVar = new yb(W(), f6Var);
        }
        wc wcVar = xcVar.d;
        ybVar.d(wcVar.f32265a, wcVar.f32266b);
        TextView textView = ybVar.f32903b;
        String str = xcVar.f32531a;
        if (xcVar.f32533c) {
            string = LocaleController.formatPluralString(str, i10, new Object[0]);
        } else {
            string = LocaleController.getString(str, xcVar.f32532b);
        }
        textView.setText(AndroidUtilities.replaceSingleTag(string, new ah.j(27)));
        int i13 = xcVar.d.f32267c;
        if (i13 != 0) {
            ybVar.setIconPaddingBottom(i13);
        }
        return b(ybVar, 1500);
    }

    public final qc n(xc xcVar, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        return m(xcVar, i10, 0, 0, f6Var);
    }

    public final qc o(xc xcVar, org.telegram.ui.ActionBar.f6 f6Var) {
        return m(xcVar, 1, 0, 0, f6Var);
    }

    public final qc p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f32910c;
        lc lcVar = new lc(W, f6Var);
        q5 q5Var = new q5(1, UserConfig.selectedAccount, j3);
        x9 x9Var = lcVar.f28159a;
        x9Var.setAnimatedEmojiDrawable(q5Var);
        x9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var), PorterDuff.Mode.SRC_IN));
        lcVar.f28160b.setText(str);
        lcVar.f28161c.setText(str2);
        return b(lcVar, 2750);
    }

    public final qc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f32910c;
        yb ybVar = new yb(W, f6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            ybVar.f32902a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        ybVar.e(document, new String[0]);
        if (ybVar.f32902a.getImageReceiver() != null) {
            ybVar.f32902a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        ybVar.f32903b.setText(charSequence);
        ybVar.f32903b.setTextSize(1, 14.0f);
        ybVar.f32903b.setSingleLine(false);
        ybVar.f32903b.setMaxLines(3);
        oc ocVar = new oc(W(), f6Var, true);
        ocVar.e(str);
        ocVar.f29056a = runnable;
        ybVar.setButton(ocVar);
        return b(ybVar, 2750);
    }

    public final qc r(TLRPC.Document document, String str) {
        yb ybVar = new yb(W(), this.f32910c);
        if (MessageObject.isTextColorEmoji(document)) {
            ybVar.f32902a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        ybVar.e(document, new String[0]);
        ybVar.f32903b.setText(str);
        ybVar.f32903b.setTextSize(1, 14.0f);
        ybVar.f32903b.setSingleLine(false);
        ybVar.f32903b.setMaxLines(3);
        return b(ybVar, 2750);
    }

    public final qc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i10;
        nc ncVar = new nc(W(), this.f32910c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        aj0 aj0Var = ncVar.f28750a;
        if (isTextColorEmoji) {
            aj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        aj0Var.setAutoRepeat(true);
        aj0Var.g(36, 36, document);
        ncVar.f28751b.setText(str);
        ncVar.f28752c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(ncVar, i10);
    }

    public final qc t(CharSequence charSequence, org.telegram.ui.ActionBar.f6 f6Var) {
        yb ybVar = new yb(W(), f6Var);
        ybVar.d(R.raw.chats_infotip, new String[0]);
        ybVar.f32903b.setText(charSequence);
        ybVar.f32903b.setSingleLine(false);
        ybVar.f32903b.setMaxLines(2);
        return b(ybVar, 1500);
    }

    public final qc u(String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        nc ncVar = new nc(W(), f6Var);
        ncVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        ncVar.f28751b.setText(str);
        ncVar.f28752c.setText(str2);
        return b(ncVar, 1500);
    }

    public final qc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f32910c;
        yb ybVar = new yb(W, f6Var);
        ybVar.setBackground(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var), 12);
        ybVar.f32902a.setImageResource(i10);
        ybVar.f32903b.setText(charSequence);
        ybVar.f32903b.setSingleLine(false);
        ybVar.f32903b.setLines(2);
        ybVar.f32903b.setMaxLines(4);
        TextView textView = ybVar.f32903b;
        textView.setMaxWidth(di.f4.a(textView.getText(), ybVar.f32903b.getPaint()));
        ybVar.f32903b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) ybVar.f32903b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        ybVar.setWrapWidth();
        return b(ybVar, 5000);
    }

    public final qc y(int i10, TLRPC.Document document, hg.n nVar) {
        String string;
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f32910c;
        yb ybVar = new yb(W, f6Var);
        ybVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        ybVar.removeView(ybVar.f32903b);
        y5 y5Var = new y5(ybVar.getContext());
        ybVar.f32903b = y5Var;
        y5Var.setTypeface(Typeface.SANS_SERIF);
        ybVar.f32903b.setTextSize(1, 15.0f);
        ybVar.f32903b.setEllipsize(TextUtils.TruncateAt.END);
        ybVar.f32903b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new z5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = ybVar.f32903b;
        if (i10 > 1) {
            string = LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]);
        } else {
            string = LocaleController.getString(R.string.SavedTagMessageTagged);
        }
        textView.setText(new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) spannableString));
        if (nVar != null) {
            oc ocVar = new oc(W(), f6Var, true);
            ocVar.e(LocaleController.getString(R.string.ViewAction));
            ocVar.f29056a = nVar;
            ybVar.setButton(ocVar);
        }
        ybVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, f6Var));
        ybVar.addView(ybVar.f32903b, w7.x5.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(ybVar, 2750);
    }

    public yc(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f32909b = frameLayout;
        this.f32908a = null;
        this.f32910c = f6Var;
    }
}
