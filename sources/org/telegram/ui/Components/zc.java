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
public final class zc {
    public final org.telegram.ui.ActionBar.m2 f31539a;
    public final FrameLayout f31540b;
    public final org.telegram.ui.ActionBar.c6 f31541c;

    public zc(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var != null && m2Var.getLastStoryViewer() != null && m2Var.getLastStoryViewer().attachedToParent()) {
            this.f31539a = null;
            bi.q5 currentPeerView = m2Var.getLastStoryViewer().f3693n0.getCurrentPeerView();
            this.f31540b = currentPeerView != null ? currentPeerView.f3515c1 : null;
            this.f31541c = m2Var.getLastStoryViewer().f3718y;
            return;
        }
        this.f31539a = m2Var;
        this.f31540b = null;
        this.f31541c = m2Var != null ? m2Var.getResourceProvider() : null;
    }

    public static sc A(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        return z(m2Var, i10, 0, c6Var);
    }

    public static sc B(org.telegram.ui.ActionBar.m2 m2Var, boolean z10, bi.n8 n8Var, org.telegram.ui.bf bfVar, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        String str;
        int i11;
        int i12;
        ac acVar = new ac(m2Var.getParentActivity(), c6Var);
        if (z10) {
            i10 = R.raw.ic_pin;
        } else {
            i10 = R.raw.ic_unpin;
        }
        acVar.c(i10, 28, 28, "Pin", "Line");
        TextView textView = acVar.f23192b;
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
            qc qcVar = new qc(m2Var.getParentActivity(), c6Var, true);
            qcVar.f28266a = n8Var;
            qcVar.f28267b = bfVar;
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
        acVar.f23192b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
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
        acVar.f23192b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, str2, str)));
        return sc.g(m2Var, acVar, 1500);
    }

    public static sc F(FrameLayout frameLayout, boolean z10) {
        yc ycVar;
        zc zcVar = new zc(frameLayout, null);
        if (z10) {
            ycVar = yc.h;
        } else {
            ycVar = yc.e;
        }
        return zcVar.m(ycVar, 1, -115203550, -1, null);
    }

    public static sc S(int i10, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        String string;
        ac acVar = new ac(m2Var.getParentActivity(), c6Var);
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
        acVar.f23192b.setText(string);
        return sc.g(m2Var, acVar, 1500);
    }

    public static zc X() {
        org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
        if (U == null) {
            return new zc(nb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.e3) {
            return new zc(((org.telegram.ui.ActionBar.e3) dialog).container, U.getResourceProvider());
        }
        return a0(U);
    }

    public static zc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        return new zc(frameLayout, c6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var != null && m2Var.getParentActivity() != null && m2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static zc a0(org.telegram.ui.ActionBar.m2 m2Var) {
        if (m2Var == null) {
            return X();
        }
        return new zc(m2Var);
    }

    public static void b0(String str) {
        if (!LaunchActivity.C1) {
            return;
        }
        X().t(LocaleController.formatString(R.string.UnknownErrorCode, str), null).j();
    }

    public static void c0(String str, FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        if (!LaunchActivity.C1) {
            return;
        }
        if (frameLayout == null) {
            b0(str);
            return;
        }
        sc t10 = new zc(frameLayout, c6Var).t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t10.f28813r = false;
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
        acVar.f23192b.setText(AndroidUtilities.replaceTags(string));
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
        acVar.f23192b.setText(AndroidUtilities.replaceTags(string));
        if (!z10 && str == null) {
            i11 = R.raw.contact_check;
        } else {
            i11 = R.raw.e_hand_2;
        }
        acVar.d(i11, new String[0]);
        return sc.g(m2Var, acVar, 5000);
    }

    public static sc v(Context context, org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, int i10, long j10, int i11, int i12, int i13, int i14, boolean z10, a3.i0 i0Var) {
        ac acVar;
        org.telegram.ui.ActionBar.c6 c6Var;
        boolean z11;
        org.telegram.ui.vp vpVar;
        SpannableStringBuilder replaceTags;
        sc g10;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i15;
        int i16;
        ah.j jVar;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && m2Var != null && i10 <= 1 && j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !z10) {
            acVar = new dc(i11, m2Var);
        } else {
            if (m2Var != null) {
                c6Var = m2Var.getResourceProvider();
            } else {
                c6Var = null;
            }
            acVar = new ac(i12, i13, context, c6Var);
        }
        ac acVar2 = acVar;
        if (i0Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (i0Var != null) {
            vpVar = new org.telegram.ui.vp(8, zArr, i0Var);
        } else {
            vpVar = null;
        }
        if (i10 <= 1) {
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
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
                acVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            } else {
                a3.i0 i0Var2 = new a3.i0(vpVar, m2Var, j10, 16);
                if (DialogObject.isChatDialog(j10)) {
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
                    if (i11 <= 1) {
                        if (m2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, i0Var2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title));
                        }
                    } else if (m2Var != null) {
                        replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, i0Var2);
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
                        if (m2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i16, UserObject.getFirstName(user)), -1, 2, i0Var2);
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
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i15, UserObject.getFirstName(user)), -1, 2, i0Var2);
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
        acVar2.f23192b.setText(replaceTags);
        if (z11) {
            Context context2 = acVar2.getContext();
            if (m2Var != null) {
                c6Var2 = m2Var.getResourceProvider();
            } else {
                c6Var2 = null;
            }
            qc qcVar = new qc(context2, c6Var2, true, true);
            qcVar.f28266a = null;
            qcVar.f28267b = vpVar;
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
            acVar2.f23192b.setSingleLine(false);
            acVar2.f23192b.setMaxLines(2);
            ((dc) acVar2).setBulletin(g10);
            g10.f28813r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.sc x(android.app.Activity r5, android.widget.FrameLayout r6, int r7, long r8, int r10, int r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.sc");
    }

    public static org.telegram.ui.Components.sc z(org.telegram.ui.ActionBar.m2 r5, int r6, int r7, org.telegram.ui.ActionBar.c6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zc.z(org.telegram.ui.ActionBar.m2, int, int, org.telegram.ui.ActionBar.c6):org.telegram.ui.Components.sc");
    }

    public final sc E(org.telegram.ui.ActionBar.c6 c6Var) {
        ac acVar = new ac(W(), c6Var);
        acVar.d(R.raw.chats_infotip, new String[0]);
        acVar.f23192b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(acVar, 1500);
    }

    public final sc G(int i10, int i11, CharSequence charSequence) {
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        ac acVar = new ac(W(), this.f31541c);
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
        acVar.f23192b.setSingleLine(false);
        acVar.f23192b.setMaxLines(i11);
        acVar.f23192b.setText(charSequence);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f31541c;
        ac acVar = new ac(W, c6Var);
        if (i10 != 0) {
            acVar.c(i10, 36, 36, new String[0]);
        } else {
            acVar.f23191a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) acVar.f23192b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        acVar.f23192b.setTextSize(1, 14.0f);
        acVar.f23192b.setTextDirection(5);
        acVar.f23192b.setSingleLine(false);
        acVar.f23192b.setMaxLines(3);
        acVar.f23192b.setText(charSequence);
        qc qcVar = new qc(W(), c6Var, true, z10);
        qcVar.e(charSequence2);
        qcVar.f28266a = runnable;
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f31541c;
        pc pcVar = new pc(W, c6Var);
        pcVar.c(i10, 36, 36, new String[0]);
        pcVar.f27960b.setText(str);
        pcVar.f27961c.setText(charSequence);
        qc qcVar = new qc(W(), c6Var, true);
        qcVar.e(str2);
        qcVar.f28266a = runnable;
        pcVar.setButton(qcVar);
        return b(pcVar, 5000);
    }

    public final sc L(Drawable drawable, CharSequence charSequence) {
        ac acVar = new ac(W(), this.f31541c);
        acVar.f23191a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.zp0) {
            ((org.telegram.ui.zp0) drawable).e(acVar.f23191a);
        }
        acVar.f23192b.setText(charSequence);
        acVar.f23192b.setSingleLine(false);
        acVar.f23192b.setMaxLines(2);
        return b(acVar, 2750);
    }

    public final sc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int i11;
        pc pcVar = new pc(W(), this.f31541c);
        pcVar.c(i10, 36, 36, new String[0]);
        pcVar.f27960b.setText(charSequence);
        pcVar.f27961c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(pcVar, i11);
    }

    public final sc N(String str, String str2) {
        pc pcVar = new pc(W(), this.f31541c);
        pcVar.f27959a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) pcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        pcVar.f27960b.setText(str);
        pcVar.f27961c.setText(str2);
        return b(pcVar, 5000);
    }

    public final sc O(TLRPC.Document document, String str, String str2) {
        int i10;
        if (document == null) {
            return new sc();
        }
        oc ocVar = new oc(W(), this.f31541c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        z9 z9Var = ocVar.f27634a;
        z9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        z9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ocVar.f27635b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = ocVar.f27636c;
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
        ac acVar = new ac(W(), this.f31541c);
        acVar.c(i10, 36, 36, new String[0]);
        acVar.f23192b.setText(charSequence);
        acVar.f23192b.setSingleLine(false);
        acVar.f23192b.setTextSize(1, 14.0f);
        acVar.f23192b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(acVar, i11);
    }

    public final sc Q(int i10, int i11, CharSequence charSequence) {
        int i12;
        ac acVar = new ac(W(), this.f31541c);
        acVar.c(i10, i11, i11, new String[0]);
        acVar.f23192b.setText(charSequence);
        acVar.f23192b.setSingleLine(false);
        acVar.f23192b.setMaxLines(2);
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
        oc ocVar = new oc(W(), this.f31541c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        z9 z9Var = ocVar.f27634a;
        z9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        z9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ocVar.f27635b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        ocVar.f27636c.setVisibility(8);
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
        acVar.f23192b.setText(str);
        acVar.f23192b.setSingleLine(false);
        acVar.f23192b.setMaxLines(2);
        return b(acVar, 1500);
    }

    public final sc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        pc pcVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.c6 c6Var = this.f31541c;
        if (!isEmpty) {
            pc pcVar2 = new pc(W(), c6Var);
            pcVar2.f27960b.setText(str);
            pcVar2.f27961c.setText((CharSequence) null);
            pcVar = pcVar2;
        } else {
            ac acVar = new ac(W(), c6Var);
            acVar.f23192b.setText(str);
            acVar.f23192b.setSingleLine(false);
            acVar.f23192b.setMaxLines(2);
            pcVar = acVar;
        }
        pcVar.setTimer();
        qc qcVar = new qc(W(), c6Var, true, z10);
        qcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        qcVar.f28266a = runnable;
        qcVar.f28267b = runnable2;
        pcVar.setButton(qcVar);
        return b(pcVar, 5000);
    }

    public final sc V(List list, CharSequence charSequence, CharSequence charSequence2, n3.b bVar) {
        boolean z10;
        float f7;
        int i10;
        Context W = W();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f31541c;
        rc rcVar = new rc(W, c6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    rcVar.f28493a.setCount(i13);
                    rcVar.f28493a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                rcVar.f28493a.setTranslationX(AndroidUtilities.dp(4.0f));
                rcVar.f28493a.setScaleX(1.2f);
                rcVar.f28493a.setScaleY(1.2f);
            } else {
                rcVar.f28493a.setScaleX(1.0f);
                rcVar.f28493a.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        rcVar.f28493a.a(false);
        if (charSequence2 != null) {
            rcVar.f28494b.setSingleLine(true);
            rcVar.f28494b.setMaxLines(1);
            rcVar.f28494b.setText(charSequence);
            rcVar.f28495c.setText(charSequence2);
            rcVar.f28495c.setSingleLine(false);
            rcVar.f28495c.setMaxLines(3);
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
            rcVar.f28494b.setSingleLine(false);
            rcVar.f28494b.setMaxLines(4);
            rcVar.f28494b.setText(charSequence);
            if (rcVar.f28494b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    rcVar.f28494b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) rcVar.f28494b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) rcVar.f28494b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (bVar != null) {
            qc qcVar = new qc(W(), c6Var, true);
            qcVar.e(LocaleController.getString(R.string.UndoNoCaps));
            qcVar.f28266a = (Runnable) bVar.f15703b;
            qcVar.f28267b = (Runnable) bVar.f15704c;
            rcVar.setButton(qcVar);
        }
        return b(rcVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.m2 m2Var = this.f31539a;
        if (m2Var != null) {
            context = m2Var.getParentActivity();
            if (context == null && this.f31539a.getLayoutContainer() != null) {
                context = this.f31539a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f31540b;
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
        org.telegram.ui.ActionBar.m2 m2Var = this.f31539a;
        if (m2Var != null) {
            return sc.g(m2Var, pbVar, i10);
        }
        return sc.f(this.f31540b, pbVar, i10);
    }

    public final sc c(CharSequence charSequence) {
        if (W() == null) {
            return new sc();
        }
        ac acVar = new ac(W(), this.f31541c);
        acVar.d(R.raw.ic_admin, "Shield");
        acVar.f23192b.setSingleLine(false);
        acVar.f23192b.setMaxLines(3);
        acVar.f23192b.setText(charSequence);
        return b(acVar, 2750);
    }

    public final sc e(boolean z10) {
        String string;
        ac acVar = new ac(W(), this.f31541c);
        if (z10) {
            acVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            acVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        acVar.f23192b.setText(AndroidUtilities.replaceTags(string));
        return b(acVar, 1500);
    }

    public final void e0(String str, boolean z10) {
        if (!LaunchActivity.C1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            sc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
            t10.f28813r = false;
            t10.k(z10);
            return;
        }
        sc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t11.f28813r = false;
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
        valueOf.setSpan(new wc(0, runnable), indexOf, indexOf2 - 1, 33);
        acVar.f23192b.setText(valueOf);
        acVar.f23192b.setSingleLine(false);
        acVar.f23192b.setMaxLines(3);
        return b(acVar, 5000);
    }

    public final void f0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.C1) {
            if (tL_error == null) {
                sc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.f28813r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                sc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.f28813r = false;
                t11.k(z10);
            }
        }
    }

    public final sc g(String str, ArrayList arrayList) {
        rc rcVar = new rc(W(), this.f31541c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                rcVar.f28493a.setCount(i12);
                rcVar.f28493a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            rcVar.f28493a.setTranslationX(AndroidUtilities.dp(4.0f));
            rcVar.f28493a.setScaleX(1.2f);
            rcVar.f28493a.setScaleY(1.2f);
        } else {
            rcVar.f28493a.setScaleX(1.0f);
            rcVar.f28493a.setScaleY(1.0f);
        }
        rcVar.f28493a.a(false);
        rcVar.f28494b.setSingleLine(false);
        rcVar.f28494b.setMaxLines(2);
        rcVar.f28494b.setText(str);
        if (rcVar.f28494b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) rcVar.f28494b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) rcVar.f28494b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            rcVar.f28493a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(rcVar, 5000);
    }

    public final boolean g0(int i10, long j10) {
        org.telegram.ui.ActionBar.m2 m2Var;
        SpannableStringBuilder replaceSingleTag;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (m2Var = this.f31539a) != null) {
            dc dcVar = new dc(i10, m2Var);
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i10 <= 1) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new ah.j(26));
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new ah.j(26));
                }
                dcVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                dcVar.f23192b.setText(replaceSingleTag);
                dcVar.f23192b.setSingleLine(false);
                dcVar.f23192b.setMaxLines(2);
                sc b10 = b(dcVar, 3500);
                dcVar.setBulletin(b10);
                b10.f28813r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final sc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        SpannableStringBuilder spannableStringBuilder;
        ia0 ia0Var;
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f31541c;
        if (indexOf >= 0) {
            ia0Var = new ia0(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), c6Var);
            spannableStringBuilder.setSpan(ia0Var, indexOf, indexOf + 11, 33);
            int i12 = org.telegram.ui.ActionBar.g6.Hi;
            ia0Var.a(i0.a.k(org.telegram.ui.ActionBar.g6.w0(i12, c6Var), 32), i0.a.k(org.telegram.ui.ActionBar.g6.w0(i12, c6Var), 72));
        } else {
            ia0Var = null;
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
        ?? acVar = new ac(W, c6Var);
        da0 da0Var = new da0(W, null);
        acVar.d = da0Var;
        da0Var.setDisablePaddingsOffset(true);
        da0Var.setSingleLine();
        da0Var.setTypeface(Typeface.SANS_SERIF);
        da0Var.setTextSize(1, 15.0f);
        da0Var.setEllipsize(TextUtils.TruncateAt.END);
        da0Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        acVar.f23192b.setVisibility(8);
        acVar.addView(da0Var, w7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i13 = org.telegram.ui.ActionBar.g6.Hi;
        acVar.setTextColor(acVar.getThemedColor(i13));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            acVar.f23191a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, i13, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        acVar.e(document, new String[i11]);
        acVar.f23192b.setTextSize(1, 14.0f);
        acVar.f23192b.setSingleLine(i11);
        acVar.f23192b.setMaxLines(3);
        da0Var.setText(spannableStringBuilder);
        da0Var.setTextSize(1, 14.0f);
        da0Var.setSingleLine(i11);
        da0Var.setMaxLines(3);
        qc qcVar = new qc(W(), c6Var, true);
        qcVar.e(string);
        qcVar.f28266a = runnable;
        acVar.setButton(qcVar);
        sc b10 = b(acVar, 2750);
        if (ia0Var != null) {
            wb wbVar = b10.e;
            if (wbVar instanceof yb) {
                ia0Var.f25617b = ((yb) wbVar).d;
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
        acVar.f23192b.setText(str);
        return b(acVar, 1500);
    }

    public final sc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new sc();
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f31541c;
        if (z10) {
            pc pcVar = new pc(W(), c6Var);
            pcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            pcVar.f27960b.setText(LocaleController.getString(R.string.LinkCopied));
            pcVar.f27961c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
            return b(pcVar, 2750);
        }
        ac acVar = new ac(W(), c6Var);
        acVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        acVar.f23192b.setText(LocaleController.getString(R.string.LinkCopied));
        return b(acVar, 1500);
    }

    public final sc m(yc ycVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.c6 c6Var) {
        ac acVar;
        String string;
        if (i11 != 0 && i12 != 0) {
            acVar = new ac(i11, i12, W(), c6Var);
        } else {
            acVar = new ac(W(), c6Var);
        }
        xc xcVar = ycVar.d;
        acVar.d(xcVar.f30913a, xcVar.f30914b);
        TextView textView = acVar.f23192b;
        String str = ycVar.f31216a;
        if (ycVar.f31218c) {
            string = LocaleController.formatPluralString(str, i10, new Object[0]);
        } else {
            string = LocaleController.getString(str, ycVar.f31217b);
        }
        textView.setText(AndroidUtilities.replaceSingleTag(string, new ah.j(27)));
        int i13 = ycVar.d.f30915c;
        if (i13 != 0) {
            acVar.setIconPaddingBottom(i13);
        }
        return b(acVar, 1500);
    }

    public final sc n(yc ycVar, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        return m(ycVar, i10, 0, 0, c6Var);
    }

    public final sc o(yc ycVar, org.telegram.ui.ActionBar.c6 c6Var) {
        return m(ycVar, 1, 0, 0, c6Var);
    }

    public final sc p(long j10, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f31541c;
        nc ncVar = new nc(W, c6Var);
        s5 s5Var = new s5(1, UserConfig.selectedAccount, j10);
        z9 z9Var = ncVar.f27338a;
        z9Var.setAnimatedEmojiDrawable(s5Var);
        z9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.G6, c6Var), PorterDuff.Mode.SRC_IN));
        ncVar.f27339b.setText(str);
        ncVar.f27340c.setText(str2);
        return b(ncVar, 2750);
    }

    public final sc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f31541c;
        ac acVar = new ac(W, c6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            acVar.f23191a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        acVar.e(document, new String[0]);
        if (acVar.f23191a.getImageReceiver() != null) {
            acVar.f23191a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        acVar.f23192b.setText(charSequence);
        acVar.f23192b.setTextSize(1, 14.0f);
        acVar.f23192b.setSingleLine(false);
        acVar.f23192b.setMaxLines(3);
        qc qcVar = new qc(W(), c6Var, true);
        qcVar.e(str);
        qcVar.f28266a = runnable;
        acVar.setButton(qcVar);
        return b(acVar, 2750);
    }

    public final sc r(TLRPC.Document document, String str) {
        ac acVar = new ac(W(), this.f31541c);
        if (MessageObject.isTextColorEmoji(document)) {
            acVar.f23191a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        acVar.e(document, new String[0]);
        acVar.f23192b.setText(str);
        acVar.f23192b.setTextSize(1, 14.0f);
        acVar.f23192b.setSingleLine(false);
        acVar.f23192b.setMaxLines(3);
        return b(acVar, 2750);
    }

    public final sc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i10;
        pc pcVar = new pc(W(), this.f31541c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        bk0 bk0Var = pcVar.f27959a;
        if (isTextColorEmoji) {
            bk0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        bk0Var.setAutoRepeat(true);
        bk0Var.g(36, 36, document);
        pcVar.f27960b.setText(str);
        pcVar.f27961c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(pcVar, i10);
    }

    public final sc t(CharSequence charSequence, org.telegram.ui.ActionBar.c6 c6Var) {
        ac acVar = new ac(W(), c6Var);
        acVar.d(R.raw.chats_infotip, new String[0]);
        acVar.f23192b.setText(charSequence);
        acVar.f23192b.setSingleLine(false);
        acVar.f23192b.setMaxLines(2);
        return b(acVar, 1500);
    }

    public final sc u(String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        pc pcVar = new pc(W(), c6Var);
        pcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        pcVar.f27960b.setText(str);
        pcVar.f27961c.setText(str2);
        return b(pcVar, 1500);
    }

    public final sc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f31541c;
        ac acVar = new ac(W, c6Var);
        acVar.setBackground(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Fi, c6Var), 12);
        acVar.f23191a.setImageResource(i10);
        acVar.f23192b.setText(charSequence);
        acVar.f23192b.setSingleLine(false);
        acVar.f23192b.setLines(2);
        acVar.f23192b.setMaxLines(4);
        TextView textView = acVar.f23192b;
        textView.setMaxWidth(di.d4.a(textView.getText(), acVar.f23192b.getPaint()));
        acVar.f23192b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) acVar.f23192b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        acVar.setWrapWidth();
        return b(acVar, 5000);
    }

    public final sc y(int i10, TLRPC.Document document, hg.n nVar) {
        String string;
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f31541c;
        ac acVar = new ac(W, c6Var);
        acVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        acVar.removeView(acVar.f23192b);
        a6 a6Var = new a6(acVar.getContext());
        acVar.f23192b = a6Var;
        a6Var.setTypeface(Typeface.SANS_SERIF);
        acVar.f23192b.setTextSize(1, 15.0f);
        acVar.f23192b.setEllipsize(TextUtils.TruncateAt.END);
        acVar.f23192b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new b6(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = acVar.f23192b;
        if (i10 > 1) {
            string = LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]);
        } else {
            string = LocaleController.getString(R.string.SavedTagMessageTagged);
        }
        textView.setText(new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) spannableString));
        if (nVar != null) {
            qc qcVar = new qc(W(), c6Var, true);
            qcVar.e(LocaleController.getString(R.string.ViewAction));
            qcVar.f28266a = nVar;
            acVar.setButton(qcVar);
        }
        acVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Hi, c6Var));
        acVar.addView(acVar.f23192b, w7.z5.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(acVar, 2750);
    }

    public zc(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f31540b = frameLayout;
        this.f31539a = null;
        this.f31541c = c6Var;
    }
}
