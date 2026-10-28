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
public final class wc {
    public final org.telegram.ui.ActionBar.r2 f34496a;
    public final FrameLayout f34497b;
    public final org.telegram.ui.ActionBar.u6 f34498c;

    public wc(org.telegram.ui.ActionBar.r2 r2Var) {
        if (r2Var != null && r2Var.getLastStoryViewer() != null && r2Var.getLastStoryViewer().attachedToParent()) {
            this.f34496a = null;
            di.q4 currentPeerView = r2Var.getLastStoryViewer().f9444n0.getCurrentPeerView();
            this.f34497b = currentPeerView != null ? currentPeerView.R0 : null;
            this.f34498c = r2Var.getLastStoryViewer().f9469y;
            return;
        }
        this.f34496a = r2Var;
        this.f34497b = null;
        this.f34498c = r2Var != null ? r2Var.getResourceProvider() : null;
    }

    public static qc A(org.telegram.ui.ActionBar.r2 r2Var, boolean z10, org.telegram.ui.ActionBar.u6 u6Var) {
        int i10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        return z(r2Var, i10, 0, u6Var);
    }

    public static qc B(org.telegram.ui.ActionBar.r2 r2Var, boolean z10, ai.h1 h1Var, org.telegram.ui.te teVar, org.telegram.ui.ActionBar.u6 u6Var) {
        int i10;
        String str;
        int i11;
        int i12;
        yb ybVar = new yb(r2Var.getParentActivity(), u6Var);
        if (z10) {
            i10 = R.raw.ic_pin;
        } else {
            i10 = R.raw.ic_unpin;
        }
        ybVar.c(i10, 28, 28, "Pin", "Line");
        TextView textView = ybVar.f35028b;
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
            oc ocVar = new oc(r2Var.getParentActivity(), u6Var, true);
            ocVar.f31259b = h1Var;
            ocVar.f31260c = teVar;
            ybVar.setButton(ocVar);
        }
        if (z10) {
            i12 = 1500;
        } else {
            i12 = 5000;
        }
        return qc.g(r2Var, ybVar, i12);
    }

    public static qc C(org.telegram.ui.ActionBar.r2 r2Var, String str) {
        yb ybVar = new yb(r2Var.getParentActivity(), r2Var.getResourceProvider());
        ybVar.d(R.raw.ic_admin, "Shield");
        ybVar.f35028b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return qc.g(r2Var, ybVar, 1500);
    }

    public static qc D(org.telegram.ui.ActionBar.r2 r2Var, TLRPC.User user, String str) {
        String str2;
        yb ybVar = new yb(r2Var.getParentActivity(), r2Var.getResourceProvider());
        ybVar.d(R.raw.ic_ban, "Hand");
        if (user.deleted) {
            str2 = LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        ybVar.f35028b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, str2, str)));
        return qc.g(r2Var, ybVar, 1500);
    }

    public static qc F(FrameLayout frameLayout, boolean z10) {
        vc vcVar;
        wc wcVar = new wc(frameLayout, null);
        if (z10) {
            vcVar = vc.h;
        } else {
            vcVar = vc.e;
        }
        return wcVar.m(vcVar, 1, -115203550, -1, null);
    }

    public static qc T(int i10, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        String string;
        yb ybVar = new yb(r2Var.getParentActivity(), u6Var);
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
        ybVar.f35028b.setText(string);
        return qc.g(r2Var, ybVar, 1500);
    }

    public static wc Y() {
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return new wc(lb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.k3) {
            return new wc(((org.telegram.ui.ActionBar.k3) dialog).container, U.getResourceProvider());
        }
        return b0(U);
    }

    public static boolean a(org.telegram.ui.ActionBar.r2 r2Var) {
        if (r2Var != null && r2Var.getParentActivity() != null && r2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static wc a0(FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var) {
        return new wc(frameLayout, u6Var);
    }

    public static wc b0(org.telegram.ui.ActionBar.r2 r2Var) {
        if (r2Var == null) {
            return Y();
        }
        return new wc(r2Var);
    }

    public static void c0(String str) {
        if (!LaunchActivity.E1) {
            return;
        }
        Y().t(LocaleController.formatString(R.string.UnknownErrorCode, str), null).j();
    }

    public static qc d(org.telegram.ui.ActionBar.r2 r2Var, boolean z10) {
        String string;
        yb ybVar = new yb(r2Var.getParentActivity(), r2Var.getResourceProvider());
        if (z10) {
            ybVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            ybVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        ybVar.f35028b.setText(AndroidUtilities.replaceTags(string));
        return qc.g(r2Var, ybVar, 1500);
    }

    public static void d0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (frameLayout == null) {
            c0(str);
            return;
        }
        qc t10 = new wc(frameLayout, u6Var).t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t10.f31870s = false;
        t10.j();
    }

    public static void e0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.E1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            Y().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
        }
    }

    public static qc j(org.telegram.ui.ActionBar.r2 r2Var) {
        return b0(r2Var).k(false);
    }

    public static qc l(String str, org.telegram.ui.ActionBar.r2 r2Var, boolean z10) {
        int i10;
        String string;
        int i11;
        int i12;
        yb ybVar = new yb(r2Var.getParentActivity(), r2Var.getResourceProvider());
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
        ybVar.f35028b.setText(AndroidUtilities.replaceTags(string));
        if (!z10 && str == null) {
            i11 = R.raw.contact_check;
        } else {
            i11 = R.raw.e_hand_2;
        }
        ybVar.d(i11, new String[0]);
        return qc.g(r2Var, ybVar, 5000);
    }

    public static qc v(Context context, org.telegram.ui.ActionBar.r2 r2Var, FrameLayout frameLayout, int i10, long j10, int i11, int i12, int i13, int i14, boolean z10, a3.i0 i0Var) {
        org.telegram.ui.ActionBar.u6 u6Var;
        yb ybVar;
        boolean z11;
        org.telegram.ui.kp kpVar;
        SpannableStringBuilder replaceTags;
        qc g7;
        org.telegram.ui.ActionBar.u6 u6Var2;
        int i15;
        int i16;
        k5 k5Var;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && r2Var != null && i10 <= 1 && j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !z10) {
            ybVar = new bc(i11, r2Var);
        } else {
            if (r2Var != null) {
                u6Var = r2Var.getResourceProvider();
            } else {
                u6Var = null;
            }
            ybVar = new yb(i12, i13, context, u6Var);
        }
        yb ybVar2 = ybVar;
        if (i0Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (i0Var != null) {
            kpVar = new org.telegram.ui.kp(8, zArr, i0Var);
        } else {
            kpVar = null;
        }
        if (i10 <= 1) {
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i11 <= 1) {
                    String string = LocaleController.getString(R.string.FwdMessageToSavedMessages);
                    if (z10) {
                        k5Var = new k5(4);
                    } else {
                        k5Var = new k5(2);
                    }
                    replaceTags = AndroidUtilities.replaceSingleTag(string, -1, 2, k5Var);
                } else {
                    replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new k5(2));
                }
                ybVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            } else {
                a3.i0 i0Var2 = new a3.i0(kpVar, r2Var, j10, 19);
                if (DialogObject.isChatDialog(j10)) {
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
                    if (i11 <= 1) {
                        if (r2Var != null) {
                            ?? formatString = LocaleController.formatString(R.string.FwdMessageToGroup, chat.title);
                            replaceTags = AndroidUtilities.replaceSingleTag(formatString, formatString, 2, i0Var2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title));
                        }
                    } else if (r2Var != null) {
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
                        if (r2Var != null) {
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
                        if (r2Var != null) {
                            ?? formatString4 = LocaleController.formatString(i15, UserObject.getFirstName(user));
                            replaceTags = AndroidUtilities.replaceSingleTag(formatString4, formatString4, 2, i0Var2);
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
        ybVar2.f35028b.setText(replaceTags);
        if (z11) {
            Context context2 = ybVar2.getContext();
            if (r2Var != null) {
                u6Var2 = r2Var.getResourceProvider();
            } else {
                u6Var2 = null;
            }
            oc ocVar = new oc(context2, u6Var2, true, true);
            ocVar.f31259b = null;
            ocVar.f31260c = kpVar;
            ybVar2.setButton(ocVar);
        }
        ybVar2.postDelayed(new rc(ybVar2, 1), 300);
        if (frameLayout != null) {
            g7 = qc.f(frameLayout, ybVar2, i14);
        } else if (r2Var != null) {
            g7 = qc.g(r2Var, ybVar2, i14);
        } else {
            throw new IllegalArgumentException();
        }
        if (ybVar2 instanceof bc) {
            ybVar2.f35028b.setSingleLine(false);
            ybVar2.f35028b.setMaxLines(2);
            ((bc) ybVar2).setBulletin(g7);
            g7.f31870s = false;
        }
        return g7;
    }

    public static org.telegram.ui.Components.qc x(android.app.Activity r5, android.widget.FrameLayout r6, int r7, long r8, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.qc");
    }

    public static org.telegram.ui.Components.qc z(org.telegram.ui.ActionBar.r2 r5, int r6, int r7, org.telegram.ui.ActionBar.u6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wc.z(org.telegram.ui.ActionBar.r2, int, int, org.telegram.ui.ActionBar.u6):org.telegram.ui.Components.qc");
    }

    public final qc E(org.telegram.ui.ActionBar.u6 u6Var) {
        yb ybVar = new yb(X(), u6Var);
        ybVar.d(R.raw.chats_infotip, new String[0]);
        ybVar.f35028b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(ybVar, 1500);
    }

    public final qc G(int i10, int i11, CharSequence charSequence) {
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        yb ybVar = new yb(X(), this.f34498c);
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
        ybVar.f35028b.setSingleLine(false);
        ybVar.f35028b.setMaxLines(i11);
        ybVar.f35028b.setText(charSequence);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(ybVar, i12);
    }

    public final qc H(int i10, CharSequence charSequence) {
        return R(i10, 36, charSequence);
    }

    public final qc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.u6 u6Var = this.f34498c;
        yb ybVar = new yb(X, u6Var);
        if (i10 != 0) {
            ybVar.c(i10, 36, 36, new String[0]);
        } else {
            ybVar.f35027a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) ybVar.f35028b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        ybVar.f35028b.setTextSize(1, 14.0f);
        ybVar.f35028b.setTextDirection(5);
        ybVar.f35028b.setSingleLine(false);
        ybVar.f35028b.setMaxLines(3);
        ybVar.f35028b.setText(charSequence);
        oc ocVar = new oc(X(), u6Var, true, z10);
        ocVar.e(charSequence2);
        ocVar.f31259b = runnable;
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
        Context X = X();
        org.telegram.ui.ActionBar.u6 u6Var = this.f34498c;
        nc ncVar = new nc(X, u6Var);
        ncVar.c(i10, 36, 36, new String[0]);
        ncVar.f30859b.setText(str);
        ncVar.f30860c.setText(charSequence);
        oc ocVar = new oc(X(), u6Var, true);
        ocVar.e(str2);
        ocVar.f31259b = runnable;
        ncVar.setButton(ocVar);
        return b(ncVar, 5000);
    }

    public final qc L(Drawable drawable, CharSequence charSequence) {
        yb ybVar = new yb(X(), this.f34498c);
        ybVar.f35027a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.op0) {
            ((org.telegram.ui.op0) drawable).e(ybVar.f35027a);
        }
        ybVar.f35028b.setText(charSequence);
        ybVar.f35028b.setSingleLine(false);
        ybVar.f35028b.setMaxLines(2);
        return b(ybVar, 2750);
    }

    public final qc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int i11;
        nc ncVar = new nc(X(), this.f34498c);
        ncVar.c(i10, 36, 36, new String[0]);
        ncVar.f30859b.setText(charSequence);
        ncVar.f30860c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(ncVar, i11);
    }

    public final qc N(String str, String str2) {
        nc ncVar = new nc(X(), this.f34498c);
        ncVar.f30858a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) ncVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        ncVar.f30859b.setText(str);
        ncVar.f30860c.setText(str2);
        return b(ncVar, 5000);
    }

    public final qc O(TLRPC.Document document, String str, String str2) {
        int i10;
        if (document == null) {
            return new qc();
        }
        mc mcVar = new mc(X(), this.f34498c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        y9 y9Var = mcVar.f30492a;
        y9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = mcVar.f30493b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = mcVar.f30494c;
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
        rg0 rg0Var = new rg0(X(), this.f34498c, null, charSequence);
        rg0Var.f32252c.f(i10, 24, 24, null);
        qc b10 = b(rg0Var, 1780);
        b10.f31863l = true;
        ub ubVar = b10.e;
        ubVar.pillStyle = true;
        ubVar.b();
        b10.f31855a = 1313167187;
        return b10;
    }

    public final qc Q(int i10, CharSequence charSequence) {
        int i11;
        yb ybVar = new yb(X(), this.f34498c);
        ybVar.c(i10, 36, 36, new String[0]);
        ybVar.f35028b.setText(charSequence);
        ybVar.f35028b.setSingleLine(false);
        ybVar.f35028b.setTextSize(1, 14.0f);
        ybVar.f35028b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(ybVar, i11);
    }

    public final qc R(int i10, int i11, CharSequence charSequence) {
        int i12;
        yb ybVar = new yb(X(), this.f34498c);
        ybVar.c(i10, i11, i11, new String[0]);
        ybVar.f35028b.setText(charSequence);
        ybVar.f35028b.setSingleLine(false);
        ybVar.f35028b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(ybVar, i12);
    }

    public final qc S(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        if (document == null) {
            return new qc();
        }
        mc mcVar = new mc(X(), this.f34498c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        y9 y9Var = mcVar.f30492a;
        y9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        y9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = mcVar.f30493b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        mcVar.f30494c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(mcVar, i10);
    }

    public final qc U(String str) {
        yb ybVar = new yb(X(), null);
        ybVar.d(R.raw.contact_check, new String[0]);
        ybVar.f35028b.setText(str);
        ybVar.f35028b.setSingleLine(false);
        ybVar.f35028b.setMaxLines(2);
        return b(ybVar, 1500);
    }

    public final qc V(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        yb ybVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.u6 u6Var = this.f34498c;
        if (!isEmpty) {
            nc ncVar = new nc(X(), u6Var);
            ncVar.f30859b.setText(str);
            ncVar.f30860c.setText((CharSequence) null);
            ybVar = ncVar;
        } else {
            yb ybVar2 = new yb(X(), u6Var);
            ybVar2.f35028b.setText(str);
            ybVar2.f35028b.setSingleLine(false);
            ybVar2.f35028b.setMaxLines(2);
            ybVar = ybVar2;
        }
        ybVar.setTimer();
        oc ocVar = new oc(X(), u6Var, true, z10);
        ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ocVar.f31259b = runnable;
        ocVar.f31260c = runnable2;
        ybVar.setButton(ocVar);
        return b(ybVar, 5000);
    }

    public final qc W(List list, CharSequence charSequence, CharSequence charSequence2, m4.c cVar) {
        boolean z10;
        float f7;
        int i10;
        Context X = X();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.f34498c;
        pc pcVar = new pc(X, u6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    pcVar.f31568a.setCount(i13);
                    pcVar.f31568a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                pcVar.f31568a.setTranslationX(AndroidUtilities.dp(4.0f));
                pcVar.f31568a.setScaleX(1.2f);
                pcVar.f31568a.setScaleY(1.2f);
            } else {
                pcVar.f31568a.setScaleX(1.0f);
                pcVar.f31568a.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        pcVar.f31568a.a(false);
        if (charSequence2 != null) {
            pcVar.f31569b.setSingleLine(true);
            pcVar.f31569b.setMaxLines(1);
            pcVar.f31569b.setText(charSequence);
            pcVar.f31570c.setText(charSequence2);
            pcVar.f31570c.setSingleLine(false);
            pcVar.f31570c.setMaxLines(3);
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
            pcVar.f31569b.setSingleLine(false);
            pcVar.f31569b.setMaxLines(4);
            pcVar.f31569b.setText(charSequence);
            if (pcVar.f31569b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    pcVar.f31569b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) pcVar.f31569b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) pcVar.f31569b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (cVar != null) {
            oc ocVar = new oc(X(), u6Var, true);
            ocVar.e(LocaleController.getString(R.string.UndoNoCaps));
            ocVar.f31259b = (Runnable) cVar.f18008b;
            ocVar.f31260c = (Runnable) cVar.f18009c;
            pcVar.setButton(ocVar);
        }
        return b(pcVar, 5000);
    }

    public final Context X() {
        Context context;
        org.telegram.ui.ActionBar.r2 r2Var = this.f34496a;
        if (r2Var != null) {
            context = r2Var.getParentActivity();
            if (context == null && this.f34496a.getLayoutContainer() != null) {
                context = this.f34496a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f34497b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return ApplicationLoader.applicationContext;
        }
        return context;
    }

    public final qc Z(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.E1) {
            return new qc();
        }
        if (tL_error == null) {
            return t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
        }
        return t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final qc b(ub ubVar, int i10) {
        org.telegram.ui.ActionBar.r2 r2Var = this.f34496a;
        if (r2Var != null) {
            return qc.g(r2Var, ubVar, i10);
        }
        return qc.f(this.f34497b, ubVar, i10);
    }

    public final qc c(CharSequence charSequence) {
        if (X() == null) {
            return new qc();
        }
        yb ybVar = new yb(X(), this.f34498c);
        ybVar.d(R.raw.ic_admin, "Shield");
        ybVar.f35028b.setSingleLine(false);
        ybVar.f35028b.setMaxLines(3);
        ybVar.f35028b.setText(charSequence);
        return b(ybVar, 2750);
    }

    public final qc e(boolean z10) {
        String string;
        yb ybVar = new yb(X(), this.f34498c);
        if (z10) {
            ybVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            ybVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        ybVar.f35028b.setText(AndroidUtilities.replaceTags(string));
        return b(ybVar, 1500);
    }

    public final qc f(int i10, Runnable runnable) {
        yb ybVar = new yb(X(), null);
        ybVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new tc(0, runnable), indexOf, indexOf2 - 1, 33);
        ybVar.f35028b.setText(valueOf);
        ybVar.f35028b.setSingleLine(false);
        ybVar.f35028b.setMaxLines(3);
        return b(ybVar, 5000);
    }

    public final void f0(String str, boolean z10) {
        if (!LaunchActivity.E1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            qc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
            t10.f31870s = false;
            t10.k(z10);
            return;
        }
        qc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t11.f31870s = false;
        t11.k(z10);
    }

    public final qc g(String str, ArrayList arrayList) {
        pc pcVar = new pc(X(), this.f34498c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                pcVar.f31568a.setCount(i12);
                pcVar.f31568a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            pcVar.f31568a.setTranslationX(AndroidUtilities.dp(4.0f));
            pcVar.f31568a.setScaleX(1.2f);
            pcVar.f31568a.setScaleY(1.2f);
        } else {
            pcVar.f31568a.setScaleX(1.0f);
            pcVar.f31568a.setScaleY(1.0f);
        }
        pcVar.f31568a.a(false);
        pcVar.f31569b.setSingleLine(false);
        pcVar.f31569b.setMaxLines(2);
        pcVar.f31569b.setText(str);
        if (pcVar.f31569b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) pcVar.f31569b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) pcVar.f31569b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            pcVar.f31568a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(pcVar, 5000);
    }

    public final void g0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.E1) {
            if (tL_error == null) {
                qc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.f31870s = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                qc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.f31870s = false;
                t11.k(z10);
            }
        }
    }

    public final qc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        SpannableStringBuilder spannableStringBuilder;
        fa0 fa0Var;
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
        org.telegram.ui.ActionBar.u6 u6Var = this.f34498c;
        if (indexOf >= 0) {
            fa0Var = new fa0(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), u6Var);
            spannableStringBuilder.setSpan(fa0Var, indexOf, indexOf + 11, 33);
            int i11 = org.telegram.ui.ActionBar.y6.Hi;
            fa0Var.a(i0.a.o(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), 32), i0.a.o(org.telegram.ui.ActionBar.y6.w0(i11, u6Var), 72));
        } else {
            fa0Var = null;
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
        Context X = X();
        ?? ybVar = new yb(X, u6Var);
        aa0 aa0Var = new aa0(X, null);
        ybVar.d = aa0Var;
        aa0Var.setDisablePaddingsOffset(true);
        aa0Var.setSingleLine();
        aa0Var.setTypeface(Typeface.SANS_SERIF);
        aa0Var.setTextSize(1, 15.0f);
        aa0Var.setEllipsize(TextUtils.TruncateAt.END);
        aa0Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ybVar.f35028b.setVisibility(8);
        ybVar.addView(aa0Var, kb1.m(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.y6.Hi;
        ybVar.setTextColor(ybVar.getThemedColor(i12));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            org.telegram.ui.ActionBar.f7.t(ybVar.f35027a, i12, null, PorterDuff.Mode.SRC_IN);
        } else {
            inputStickerSet = inputStickerSet2;
        }
        ybVar.e(document, new String[0]);
        ybVar.f35028b.setTextSize(1, 14.0f);
        ybVar.f35028b.setSingleLine(false);
        ybVar.f35028b.setMaxLines(3);
        aa0Var.setText(spannableStringBuilder);
        aa0Var.setTextSize(1, 14.0f);
        aa0Var.setSingleLine(false);
        aa0Var.setMaxLines(3);
        oc ocVar = new oc(X(), u6Var, true);
        ocVar.e(string);
        ocVar.f31259b = runnable;
        ybVar.setButton(ocVar);
        qc b10 = b(ybVar, 2750);
        if (fa0Var != null) {
            ub ubVar = b10.e;
            if (ubVar instanceof wb) {
                fa0Var.f28084b = ((wb) ubVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new bi.f4(i10, b10, currentTimeMillis));
        return b10;
    }

    public final boolean h0(int i10, long j10) {
        org.telegram.ui.ActionBar.r2 r2Var;
        SpannableStringBuilder replaceSingleTag;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (r2Var = this.f34496a) != null) {
            bc bcVar = new bc(i10, r2Var);
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i10 <= 1) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new k5(2));
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new k5(2));
                }
                bcVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                bcVar.f35028b.setText(replaceSingleTag);
                bcVar.f35028b.setSingleLine(false);
                bcVar.f35028b.setMaxLines(2);
                qc b10 = b(bcVar, 3500);
                bcVar.setBulletin(b10);
                b10.f31870s = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final qc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new qc();
        }
        yb ybVar = new yb(X(), null);
        ybVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        ybVar.f35028b.setText(str);
        return b(ybVar, 1500);
    }

    public final qc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new qc();
        }
        org.telegram.ui.ActionBar.u6 u6Var = this.f34498c;
        if (z10) {
            nc ncVar = new nc(X(), u6Var);
            ncVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            ncVar.f30859b.setText(LocaleController.getString(R.string.LinkCopied));
            ncVar.f30860c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
            return b(ncVar, 2750);
        }
        yb ybVar = new yb(X(), u6Var);
        ybVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        ybVar.f35028b.setText(LocaleController.getString(R.string.LinkCopied));
        return b(ybVar, 1500);
    }

    public final qc m(vc vcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.u6 u6Var) {
        yb ybVar;
        String string;
        if (i11 != 0 && i12 != 0) {
            ybVar = new yb(i11, i12, X(), u6Var);
        } else {
            ybVar = new yb(X(), u6Var);
        }
        uc ucVar = vcVar.d;
        ybVar.d(ucVar.f33359a, ucVar.f33360b);
        TextView textView = ybVar.f35028b;
        String str = vcVar.f33672a;
        if (vcVar.f33674c) {
            string = LocaleController.formatPluralString(str, i10, new Object[0]);
        } else {
            string = LocaleController.getString(str, vcVar.f33673b);
        }
        textView.setText(AndroidUtilities.replaceSingleTag(string, new k5(3)));
        int i13 = vcVar.d.f33361c;
        if (i13 != 0) {
            ybVar.setIconPaddingBottom(i13);
        }
        return b(ybVar, 1500);
    }

    public final qc n(vc vcVar, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        return m(vcVar, i10, 0, 0, u6Var);
    }

    public final qc o(vc vcVar, org.telegram.ui.ActionBar.u6 u6Var) {
        return m(vcVar, 1, 0, 0, u6Var);
    }

    public final qc p(long j10, String str, String str2) {
        Context X = X();
        org.telegram.ui.ActionBar.u6 u6Var = this.f34498c;
        lc lcVar = new lc(X, u6Var);
        t5 t5Var = new t5(1, UserConfig.selectedAccount, j10);
        y9 y9Var = lcVar.f30224a;
        y9Var.setAnimatedEmojiDrawable(t5Var);
        y9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G6, u6Var), PorterDuff.Mode.SRC_IN));
        lcVar.f30225b.setText(str);
        lcVar.f30226c.setText(str2);
        return b(lcVar, 2750);
    }

    public final qc q(TLRPC.Document document, CharSequence charSequence) {
        yb ybVar = new yb(X(), this.f34498c);
        if (MessageObject.isTextColorEmoji(document)) {
            org.telegram.ui.ActionBar.f7.t(ybVar.f35027a, org.telegram.ui.ActionBar.y6.Hi, null, PorterDuff.Mode.SRC_IN);
        }
        ybVar.e(document, new String[0]);
        ybVar.f35028b.setText(charSequence);
        ybVar.f35028b.setTextSize(1, 14.0f);
        ybVar.f35028b.setSingleLine(false);
        ybVar.f35028b.setMaxLines(3);
        return b(ybVar, 2750);
    }

    public final qc r(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context X = X();
        org.telegram.ui.ActionBar.u6 u6Var = this.f34498c;
        yb ybVar = new yb(X, u6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            org.telegram.ui.ActionBar.f7.t(ybVar.f35027a, org.telegram.ui.ActionBar.y6.Hi, null, PorterDuff.Mode.SRC_IN);
        }
        ybVar.e(document, new String[0]);
        if (ybVar.f35027a.getImageReceiver() != null) {
            ybVar.f35027a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        ybVar.f35028b.setText(charSequence);
        ybVar.f35028b.setTextSize(1, 14.0f);
        ybVar.f35028b.setSingleLine(false);
        ybVar.f35028b.setMaxLines(3);
        oc ocVar = new oc(X(), u6Var, true);
        ocVar.e(str);
        ocVar.f31259b = runnable;
        ybVar.setButton(ocVar);
        return b(ybVar, 2750);
    }

    public final qc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i10;
        nc ncVar = new nc(X(), this.f34498c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        bk0 bk0Var = ncVar.f30858a;
        if (isTextColorEmoji) {
            org.telegram.ui.ActionBar.f7.t(bk0Var, org.telegram.ui.ActionBar.y6.Hi, null, PorterDuff.Mode.SRC_IN);
        }
        bk0Var.setAutoRepeat(true);
        bk0Var.g(36, 36, document);
        ncVar.f30859b.setText(str);
        ncVar.f30860c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(ncVar, i10);
    }

    public final qc t(CharSequence charSequence, org.telegram.ui.ActionBar.u6 u6Var) {
        yb ybVar = new yb(X(), u6Var);
        ybVar.d(R.raw.chats_infotip, new String[0]);
        ybVar.f35028b.setText(charSequence);
        ybVar.f35028b.setSingleLine(false);
        ybVar.f35028b.setMaxLines(2);
        return b(ybVar, 1500);
    }

    public final qc u(String str, String str2, org.telegram.ui.ActionBar.u6 u6Var) {
        nc ncVar = new nc(X(), u6Var);
        ncVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        ncVar.f30859b.setText(str);
        ncVar.f30860c.setText(str2);
        return b(ncVar, 1500);
    }

    public final qc w(int i10, CharSequence charSequence) {
        Context X = X();
        org.telegram.ui.ActionBar.u6 u6Var = this.f34498c;
        yb ybVar = new yb(X, u6Var);
        ybVar.setBackground(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Fi, u6Var), 12);
        ybVar.f35027a.setImageResource(i10);
        ybVar.f35028b.setText(charSequence);
        ybVar.f35028b.setSingleLine(false);
        ybVar.f35028b.setLines(2);
        ybVar.f35028b.setMaxLines(4);
        TextView textView = ybVar.f35028b;
        textView.setMaxWidth(fi.v3.a(textView.getText(), ybVar.f35028b.getPaint()));
        ybVar.f35028b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) ybVar.f35028b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        ybVar.setWrapWidth();
        return b(ybVar, 5000);
    }

    public final qc y(int i10, TLRPC.Document document, i2.v vVar) {
        String string;
        Context X = X();
        org.telegram.ui.ActionBar.u6 u6Var = this.f34498c;
        yb ybVar = new yb(X, u6Var);
        ybVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        ybVar.removeView(ybVar.f35028b);
        b6 b6Var = new b6(ybVar.getContext());
        ybVar.f35028b = b6Var;
        b6Var.setTypeface(Typeface.SANS_SERIF);
        ybVar.f35028b.setTextSize(1, 15.0f);
        ybVar.f35028b.setEllipsize(TextUtils.TruncateAt.END);
        ybVar.f35028b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new c6(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = ybVar.f35028b;
        if (i10 > 1) {
            string = LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]);
        } else {
            string = LocaleController.getString(R.string.SavedTagMessageTagged);
        }
        textView.setText(new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) spannableString));
        if (vVar != null) {
            oc ocVar = new oc(X(), u6Var, true);
            ocVar.e(LocaleController.getString(R.string.ViewAction));
            ocVar.f31259b = vVar;
            ybVar.setButton(ocVar);
        }
        ybVar.setTextColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Hi, u6Var));
        ybVar.addView(ybVar.f35028b, kb1.m(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(ybVar, 2750);
    }

    public wc(FrameLayout frameLayout, org.telegram.ui.ActionBar.u6 u6Var) {
        this.f34497b = frameLayout;
        this.f34496a = null;
        this.f34498c = u6Var;
    }
}
