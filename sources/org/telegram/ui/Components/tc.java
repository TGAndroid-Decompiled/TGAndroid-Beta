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
public final class tc {
    public final org.telegram.ui.ActionBar.o2 f32922a;
    public final FrameLayout f32923b;
    public final org.telegram.ui.ActionBar.c6 f32924c;

    public tc(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var != null && o2Var.getLastStoryViewer() != null && o2Var.getLastStoryViewer().attachedToParent()) {
            this.f32922a = null;
            lh.d4 currentPeerView = o2Var.getLastStoryViewer().f15765j0.getCurrentPeerView();
            this.f32923b = currentPeerView != null ? currentPeerView.Y0 : null;
            this.f32924c = o2Var.getLastStoryViewer().f15793y;
            return;
        }
        this.f32922a = o2Var;
        this.f32923b = null;
        this.f32924c = o2Var != null ? o2Var.getResourceProvider() : null;
    }

    public static mc A(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        return z(o2Var, i10, 0, c6Var);
    }

    public static mc B(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, ag.z1 z1Var, org.telegram.ui.ke keVar, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10;
        String str;
        int i11;
        int i12;
        ub ubVar = new ub(o2Var.getParentActivity(), c6Var);
        if (z10) {
            i10 = R.raw.ic_pin;
        } else {
            i10 = R.raw.ic_unpin;
        }
        ubVar.c(i10, 28, 28, "Pin", "Line");
        TextView textView = ubVar.f33185b;
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
            kc kcVar = new kc(o2Var.getParentActivity(), c6Var, true);
            kcVar.f30007a = z1Var;
            kcVar.f30008b = keVar;
            ubVar.setButton(kcVar);
        }
        if (z10) {
            i12 = 1500;
        } else {
            i12 = 5000;
        }
        return mc.g(o2Var, ubVar, i12);
    }

    public static mc C(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        ub ubVar = new ub(o2Var.getParentActivity(), o2Var.getResourceProvider());
        ubVar.d(R.raw.ic_admin, "Shield");
        ubVar.f33185b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return mc.g(o2Var, ubVar, 1500);
    }

    public static mc D(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        String str2;
        ub ubVar = new ub(o2Var.getParentActivity(), o2Var.getResourceProvider());
        ubVar.d(R.raw.ic_ban, "Hand");
        if (user.deleted) {
            str2 = LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        ubVar.f33185b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, str2, str)));
        return mc.g(o2Var, ubVar, 1500);
    }

    public static mc F(FrameLayout frameLayout, boolean z10) {
        sc scVar;
        tc tcVar = new tc(frameLayout, null);
        if (z10) {
            scVar = sc.h;
        } else {
            scVar = sc.f32602e;
        }
        return tcVar.m(scVar, 1, -115203550, -1, null);
    }

    public static mc S(int i10, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        String string;
        ub ubVar = new ub(o2Var.getParentActivity(), c6Var);
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
            ubVar.d(R.raw.sound_on, new String[0]);
        } else {
            ubVar.d(R.raw.sound_off, new String[0]);
        }
        ubVar.f33185b.setText(string);
        return mc.g(o2Var, ubVar, 1500);
    }

    public static tc X() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return new tc(hb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.f3) {
            return new tc(((org.telegram.ui.ActionBar.f3) dialog).container, U.getResourceProvider());
        }
        return a0(U);
    }

    public static tc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        return new tc(frameLayout, c6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var != null && o2Var.getParentActivity() != null && o2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static tc a0(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var == null) {
            return X();
        }
        return new tc(o2Var);
    }

    public static void b0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.f35561y1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
        }
    }

    public static mc d(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        String string;
        ub ubVar = new ub(o2Var.getParentActivity(), o2Var.getResourceProvider());
        if (z10) {
            ubVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            ubVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        ubVar.f33185b.setText(AndroidUtilities.replaceTags(string));
        return mc.g(o2Var, ubVar, 1500);
    }

    public static mc j(org.telegram.ui.ActionBar.o2 o2Var) {
        return a0(o2Var).k(false);
    }

    public static mc l(String str, org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        int i10;
        String string;
        int i11;
        int i12;
        ub ubVar = new ub(o2Var.getParentActivity(), o2Var.getResourceProvider());
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
        ubVar.f33185b.setText(AndroidUtilities.replaceTags(string));
        if (!z10 && str == null) {
            i11 = R.raw.contact_check;
        } else {
            i11 = R.raw.e_hand_2;
        }
        ubVar.d(i11, new String[0]);
        return mc.g(o2Var, ubVar, 5000);
    }

    public static mc v(Context context, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, int i10, long j10, int i11, int i12, int i13, int i14, boolean z10, g5.v vVar) {
        org.telegram.ui.ActionBar.c6 c6Var;
        ub ubVar;
        boolean z11;
        z2 z2Var;
        SpannableStringBuilder replaceTags;
        mc g10;
        org.telegram.ui.ActionBar.c6 c6Var2;
        int i15;
        int i16;
        g5 g5Var;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && o2Var != null && i10 <= 1 && j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !z10) {
            ubVar = new xb(i11, o2Var);
        } else {
            if (o2Var != null) {
                c6Var = o2Var.getResourceProvider();
            } else {
                c6Var = null;
            }
            ubVar = new ub(i12, i13, context, c6Var);
        }
        ub ubVar2 = ubVar;
        if (vVar == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (vVar != null) {
            z2Var = new z2(3, zArr, vVar);
        } else {
            z2Var = null;
        }
        if (i10 <= 1) {
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i11 <= 1) {
                    String string = LocaleController.getString(R.string.FwdMessageToSavedMessages);
                    if (z10) {
                        g5Var = new g5(4);
                    } else {
                        g5Var = new g5(2);
                    }
                    replaceTags = AndroidUtilities.replaceSingleTag(string, -1, 2, g5Var);
                } else {
                    replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new g5(2));
                }
                ubVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            } else {
                g5.v vVar2 = new g5.v(z2Var, o2Var, j10, 19);
                if (DialogObject.isChatDialog(j10)) {
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
                    if (i11 <= 1) {
                        if (o2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, vVar2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title));
                        }
                    } else if (o2Var != null) {
                        replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, vVar2);
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
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i16, UserObject.getFirstName(user)), -1, 2, vVar2);
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
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i15, UserObject.getFirstName(user)), -1, 2, vVar2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i15, UserObject.getFirstName(user)));
                        }
                    }
                }
                ubVar2.c(R.raw.forward, 30, 30, new String[0]);
            }
        } else {
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0]));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            }
            ubVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        ubVar2.f33185b.setText(replaceTags);
        if (z11) {
            Context context2 = ubVar2.getContext();
            if (o2Var != null) {
                c6Var2 = o2Var.getResourceProvider();
            } else {
                c6Var2 = null;
            }
            kc kcVar = new kc(context2, c6Var2, true, true);
            kcVar.f30007a = null;
            kcVar.f30008b = z2Var;
            ubVar2.setButton(kcVar);
        }
        ubVar2.postDelayed(new nc(ubVar2, 1), 300);
        if (frameLayout != null) {
            g10 = mc.f(frameLayout, ubVar2, i14);
        } else if (o2Var != null) {
            g10 = mc.g(o2Var, ubVar2, i14);
        } else {
            throw new IllegalArgumentException();
        }
        if (ubVar2 instanceof xb) {
            ubVar2.f33185b.setSingleLine(false);
            ubVar2.f33185b.setMaxLines(2);
            ((xb) ubVar2).setBulletin(g10);
            g10.f30660r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.mc x(android.app.Activity r4, android.widget.FrameLayout r5, int r6, long r7, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.mc");
    }

    public static org.telegram.ui.Components.mc z(org.telegram.ui.ActionBar.o2 r5, int r6, int r7, org.telegram.ui.ActionBar.c6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tc.z(org.telegram.ui.ActionBar.o2, int, int, org.telegram.ui.ActionBar.c6):org.telegram.ui.Components.mc");
    }

    public final mc E(org.telegram.ui.ActionBar.c6 c6Var) {
        ub ubVar = new ub(W(), c6Var);
        ubVar.d(R.raw.chats_infotip, new String[0]);
        ubVar.f33185b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(ubVar, 1500);
    }

    public final mc G(int i10, int i11, CharSequence charSequence) {
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        ub ubVar = new ub(W(), this.f32924c);
        ubVar.c(i10, 36, 36, new String[0]);
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
        ubVar.f33185b.setSingleLine(false);
        ubVar.f33185b.setMaxLines(i11);
        ubVar.f33185b.setText(charSequence);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(ubVar, i12);
    }

    public final mc H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final mc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f32924c;
        ub ubVar = new ub(W, c6Var);
        if (i10 != 0) {
            ubVar.c(i10, 36, 36, new String[0]);
        } else {
            ubVar.f33184a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) ubVar.f33185b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        ubVar.f33185b.setTextSize(1, 14.0f);
        ubVar.f33185b.setTextDirection(5);
        ubVar.f33185b.setSingleLine(false);
        ubVar.f33185b.setMaxLines(3);
        ubVar.f33185b.setText(charSequence);
        kc kcVar = new kc(W(), c6Var, true, z10);
        kcVar.e(charSequence2);
        kcVar.f30007a = runnable;
        ubVar.setButton(kcVar);
        return b(ubVar, i11);
    }

    public final mc J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        int i11;
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return I(i10, charSequence, str, i11, false, runnable);
    }

    public final mc K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f32924c;
        jc jcVar = new jc(W, c6Var);
        jcVar.c(i10, 36, 36, new String[0]);
        jcVar.f29638b.setText(str);
        jcVar.f29639c.setText(charSequence);
        kc kcVar = new kc(W(), c6Var, true);
        kcVar.e(str2);
        kcVar.f30007a = runnable;
        jcVar.setButton(kcVar);
        return b(jcVar, 5000);
    }

    public final mc L(Drawable drawable, CharSequence charSequence) {
        ub ubVar = new ub(W(), this.f32924c);
        ubVar.f33184a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.uo0) {
            ((org.telegram.ui.uo0) drawable).e(ubVar.f33184a);
        }
        ubVar.f33185b.setText(charSequence);
        ubVar.f33185b.setSingleLine(false);
        ubVar.f33185b.setMaxLines(2);
        return b(ubVar, 2750);
    }

    public final mc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int i11;
        jc jcVar = new jc(W(), this.f32924c);
        jcVar.c(i10, 36, 36, new String[0]);
        jcVar.f29638b.setText(charSequence);
        jcVar.f29639c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(jcVar, i11);
    }

    public final mc N(String str, String str2) {
        jc jcVar = new jc(W(), this.f32924c);
        jcVar.f29637a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) jcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        jcVar.f29638b.setText(str);
        jcVar.f29639c.setText(str2);
        return b(jcVar, 5000);
    }

    public final mc O(TLRPC.Document document, String str, String str2) {
        int i10;
        if (document == null) {
            return new mc();
        }
        ic icVar = new ic(W(), this.f32924c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        t9 t9Var = icVar.f29363a;
        t9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        t9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = icVar.f29364b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = icVar.f29365c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(icVar, i10);
    }

    public final mc P(int i10, CharSequence charSequence) {
        int i11;
        ub ubVar = new ub(W(), this.f32924c);
        ubVar.c(i10, 36, 36, new String[0]);
        ubVar.f33185b.setText(charSequence);
        ubVar.f33185b.setSingleLine(false);
        ubVar.f33185b.setTextSize(1, 14.0f);
        ubVar.f33185b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(ubVar, i11);
    }

    public final mc Q(int i10, int i11, CharSequence charSequence) {
        int i12;
        ub ubVar = new ub(W(), this.f32924c);
        ubVar.c(i10, i11, i11, new String[0]);
        ubVar.f33185b.setText(charSequence);
        ubVar.f33185b.setSingleLine(false);
        ubVar.f33185b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(ubVar, i12);
    }

    public final mc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        if (document == null) {
            return new mc();
        }
        ic icVar = new ic(W(), this.f32924c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        t9 t9Var = icVar.f29363a;
        t9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        t9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = icVar.f29364b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        icVar.f29365c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(icVar, i10);
    }

    public final mc T(String str) {
        ub ubVar = new ub(W(), null);
        ubVar.d(R.raw.contact_check, new String[0]);
        ubVar.f33185b.setText(str);
        ubVar.f33185b.setSingleLine(false);
        ubVar.f33185b.setMaxLines(2);
        return b(ubVar, 1500);
    }

    public final mc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        jc jcVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.c6 c6Var = this.f32924c;
        if (!isEmpty) {
            jc jcVar2 = new jc(W(), c6Var);
            jcVar2.f29638b.setText(str);
            jcVar2.f29639c.setText((CharSequence) null);
            jcVar = jcVar2;
        } else {
            ub ubVar = new ub(W(), c6Var);
            ubVar.f33185b.setText(str);
            ubVar.f33185b.setSingleLine(false);
            ubVar.f33185b.setMaxLines(2);
            jcVar = ubVar;
        }
        jcVar.setTimer();
        kc kcVar = new kc(W(), c6Var, true, z10);
        kcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        kcVar.f30007a = runnable;
        kcVar.f30008b = runnable2;
        jcVar.setButton(kcVar);
        return b(jcVar, 5000);
    }

    public final mc V(List list, CharSequence charSequence, CharSequence charSequence2, oc.i iVar) {
        boolean z10;
        float f9;
        int i10;
        Context W = W();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f32924c;
        lc lcVar = new lc(W, c6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    lcVar.f30284a.setCount(i13);
                    lcVar.f30284a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f9 = 4.0f;
            if (list.size() == 1) {
                lcVar.f30284a.setTranslationX(AndroidUtilities.dp(4.0f));
                lcVar.f30284a.setScaleX(1.2f);
                lcVar.f30284a.setScaleY(1.2f);
            } else {
                lcVar.f30284a.setScaleX(1.0f);
                lcVar.f30284a.setScaleY(1.0f);
            }
        } else {
            f9 = 4.0f;
            i10 = 0;
        }
        lcVar.f30284a.a(false);
        if (charSequence2 != null) {
            lcVar.f30285b.setSingleLine(true);
            lcVar.f30285b.setMaxLines(1);
            lcVar.f30285b.setText(charSequence);
            lcVar.f30286c.setText(charSequence2);
            lcVar.f30286c.setSingleLine(false);
            lcVar.f30286c.setMaxLines(3);
            if (lcVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f9);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) lcVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) lcVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            lcVar.f30285b.setSingleLine(false);
            lcVar.f30285b.setMaxLines(4);
            lcVar.f30285b.setText(charSequence);
            if (lcVar.f30285b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    lcVar.f30285b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f9);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) lcVar.f30285b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) lcVar.f30285b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (iVar != null) {
            kc kcVar = new kc(W(), c6Var, true);
            kcVar.e(LocaleController.getString(R.string.UndoNoCaps));
            kcVar.f30007a = (Runnable) iVar.f19483b;
            kcVar.f30008b = (Runnable) iVar.f19484c;
            lcVar.setButton(kcVar);
        }
        return b(lcVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.o2 o2Var = this.f32922a;
        if (o2Var != null) {
            context = o2Var.getParentActivity();
            if (context == null && this.f32922a.getLayoutContainer() != null) {
                context = this.f32922a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f32923b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return ApplicationLoader.applicationContext;
        }
        return context;
    }

    public final mc Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.f35561y1) {
            return new mc();
        }
        if (tL_error == null) {
            return t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
        }
        return t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final mc b(jb jbVar, int i10) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f32922a;
        if (o2Var != null) {
            return mc.g(o2Var, jbVar, i10);
        }
        return mc.f(this.f32923b, jbVar, i10);
    }

    public final mc c(CharSequence charSequence) {
        if (W() == null) {
            return new mc();
        }
        ub ubVar = new ub(W(), this.f32924c);
        ubVar.d(R.raw.ic_admin, "Shield");
        ubVar.f33185b.setSingleLine(false);
        ubVar.f33185b.setMaxLines(3);
        ubVar.f33185b.setText(charSequence);
        return b(ubVar, 2750);
    }

    public final void c0(String str, boolean z10) {
        if (!LaunchActivity.f35561y1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            mc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
            t10.f30660r = false;
            t10.k(z10);
            return;
        }
        mc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t11.f30660r = false;
        t11.k(z10);
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.f35561y1) {
            if (tL_error == null) {
                mc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.f30660r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                mc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.f30660r = false;
                t11.k(z10);
            }
        }
    }

    public final mc e(boolean z10) {
        String string;
        ub ubVar = new ub(W(), this.f32924c);
        if (z10) {
            ubVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            ubVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        ubVar.f33185b.setText(AndroidUtilities.replaceTags(string));
        return b(ubVar, 1500);
    }

    public final boolean e0(int i10, long j10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        SpannableStringBuilder replaceSingleTag;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (o2Var = this.f32922a) != null) {
            xb xbVar = new xb(i10, o2Var);
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i10 <= 1) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new g5(2));
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new g5(2));
                }
                xbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                xbVar.f33185b.setText(replaceSingleTag);
                xbVar.f33185b.setSingleLine(false);
                xbVar.f33185b.setMaxLines(2);
                mc b10 = b(xbVar, 3500);
                xbVar.setBulletin(b10);
                b10.f30660r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final mc f(int i10, Runnable runnable) {
        ub ubVar = new ub(W(), null);
        ubVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new qc(0, runnable), indexOf, indexOf2 - 1, 33);
        ubVar.f33185b.setText(valueOf);
        ubVar.f33185b.setSingleLine(false);
        ubVar.f33185b.setMaxLines(3);
        return b(ubVar, 5000);
    }

    public final mc g(String str, ArrayList arrayList) {
        lc lcVar = new lc(W(), this.f32924c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                lcVar.f30284a.setCount(i12);
                lcVar.f30284a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            lcVar.f30284a.setTranslationX(AndroidUtilities.dp(4.0f));
            lcVar.f30284a.setScaleX(1.2f);
            lcVar.f30284a.setScaleY(1.2f);
        } else {
            lcVar.f30284a.setScaleX(1.0f);
            lcVar.f30284a.setScaleY(1.0f);
        }
        lcVar.f30284a.a(false);
        lcVar.f30285b.setSingleLine(false);
        lcVar.f30285b.setMaxLines(2);
        lcVar.f30285b.setText(str);
        if (lcVar.f30285b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) lcVar.f30285b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) lcVar.f30285b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            lcVar.f30284a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(lcVar, 5000);
    }

    public final mc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        SpannableStringBuilder spannableStringBuilder;
        d90 d90Var;
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f32924c;
        if (indexOf >= 0) {
            d90Var = new d90(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), c6Var);
            spannableStringBuilder.setSpan(d90Var, indexOf, indexOf + 11, 33);
            int i12 = org.telegram.ui.ActionBar.g6.Hi;
            d90Var.a(i0.a.k(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), 32), i0.a.k(org.telegram.ui.ActionBar.g6.v0(i12, c6Var), 72));
        } else {
            d90Var = null;
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
        ?? ubVar = new ub(W, c6Var);
        y80 y80Var = new y80(W, null);
        ubVar.d = y80Var;
        y80Var.setDisablePaddingsOffset(true);
        y80Var.setSingleLine();
        y80Var.setTypeface(Typeface.SANS_SERIF);
        y80Var.setTextSize(1, 15.0f);
        y80Var.setEllipsize(TextUtils.TruncateAt.END);
        y80Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        ubVar.f33185b.setVisibility(8);
        ubVar.addView(y80Var, i7.f6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i13 = org.telegram.ui.ActionBar.g6.Hi;
        ubVar.setTextColor(ubVar.getThemedColor(i13));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            ubVar.f33184a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i13, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        ubVar.e(document, new String[i11]);
        ubVar.f33185b.setTextSize(1, 14.0f);
        ubVar.f33185b.setSingleLine(i11);
        ubVar.f33185b.setMaxLines(3);
        y80Var.setText(spannableStringBuilder);
        y80Var.setTextSize(1, 14.0f);
        y80Var.setSingleLine(i11);
        y80Var.setMaxLines(3);
        kc kcVar = new kc(W(), c6Var, true);
        kcVar.e(string);
        kcVar.f30007a = runnable;
        ubVar.setButton(kcVar);
        mc b10 = b(ubVar, 2750);
        if (d90Var != null) {
            rb rbVar = b10.f30648e;
            if (rbVar instanceof tb) {
                d90Var.f27718b = ((tb) rbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new pc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final mc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new mc();
        }
        ub ubVar = new ub(W(), null);
        ubVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        ubVar.f33185b.setText(str);
        return b(ubVar, 1500);
    }

    public final mc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new mc();
        }
        org.telegram.ui.ActionBar.c6 c6Var = this.f32924c;
        if (z10) {
            jc jcVar = new jc(W(), c6Var);
            jcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            jcVar.f29638b.setText(LocaleController.getString(R.string.LinkCopied));
            jcVar.f29639c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
            return b(jcVar, 2750);
        }
        ub ubVar = new ub(W(), c6Var);
        ubVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        ubVar.f33185b.setText(LocaleController.getString(R.string.LinkCopied));
        return b(ubVar, 1500);
    }

    public final mc m(sc scVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.c6 c6Var) {
        ub ubVar;
        String string;
        if (i11 != 0 && i12 != 0) {
            ubVar = new ub(i11, i12, W(), c6Var);
        } else {
            ubVar = new ub(W(), c6Var);
        }
        rc rcVar = scVar.d;
        ubVar.d(rcVar.f32263a, rcVar.f32264b);
        TextView textView = ubVar.f33185b;
        String str = scVar.f32610a;
        if (scVar.f32612c) {
            string = LocaleController.formatPluralString(str, i10, new Object[0]);
        } else {
            string = LocaleController.getString(str, scVar.f32611b);
        }
        textView.setText(AndroidUtilities.replaceSingleTag(string, new g5(3)));
        int i13 = scVar.d.f32265c;
        if (i13 != 0) {
            ubVar.setIconPaddingBottom(i13);
        }
        return b(ubVar, 1500);
    }

    public final mc n(sc scVar, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        return m(scVar, i10, 0, 0, c6Var);
    }

    public final mc o(sc scVar, org.telegram.ui.ActionBar.c6 c6Var) {
        return m(scVar, 1, 0, 0, c6Var);
    }

    public final mc p(long j10, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f32924c;
        hc hcVar = new hc(W, c6Var);
        p5 p5Var = new p5(1, UserConfig.selectedAccount, j10);
        t9 t9Var = hcVar.f29161a;
        t9Var.setAnimatedEmojiDrawable(p5Var);
        t9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var), PorterDuff.Mode.SRC_IN));
        hcVar.f29162b.setText(str);
        hcVar.f29163c.setText(str2);
        return b(hcVar, 2750);
    }

    public final mc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f32924c;
        ub ubVar = new ub(W, c6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            ubVar.f33184a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        ubVar.e(document, new String[0]);
        if (ubVar.f33184a.getImageReceiver() != null) {
            ubVar.f33184a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        ubVar.f33185b.setText(charSequence);
        ubVar.f33185b.setTextSize(1, 14.0f);
        ubVar.f33185b.setSingleLine(false);
        ubVar.f33185b.setMaxLines(3);
        kc kcVar = new kc(W(), c6Var, true);
        kcVar.e(str);
        kcVar.f30007a = runnable;
        ubVar.setButton(kcVar);
        return b(ubVar, 2750);
    }

    public final mc r(TLRPC.Document document, String str) {
        ub ubVar = new ub(W(), this.f32924c);
        if (MessageObject.isTextColorEmoji(document)) {
            ubVar.f33184a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        ubVar.e(document, new String[0]);
        ubVar.f33185b.setText(str);
        ubVar.f33185b.setTextSize(1, 14.0f);
        ubVar.f33185b.setSingleLine(false);
        ubVar.f33185b.setMaxLines(3);
        return b(ubVar, 2750);
    }

    public final mc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i10;
        jc jcVar = new jc(W(), this.f32924c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        aj0 aj0Var = jcVar.f29637a;
        if (isTextColorEmoji) {
            aj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        aj0Var.setAutoRepeat(true);
        aj0Var.g(36, 36, document);
        jcVar.f29638b.setText(str);
        jcVar.f29639c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(jcVar, i10);
    }

    public final mc t(CharSequence charSequence, org.telegram.ui.ActionBar.c6 c6Var) {
        ub ubVar = new ub(W(), c6Var);
        ubVar.d(R.raw.chats_infotip, new String[0]);
        ubVar.f33185b.setText(charSequence);
        ubVar.f33185b.setSingleLine(false);
        ubVar.f33185b.setMaxLines(2);
        return b(ubVar, 1500);
    }

    public final mc u(String str, String str2, org.telegram.ui.ActionBar.c6 c6Var) {
        jc jcVar = new jc(W(), c6Var);
        jcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        jcVar.f29638b.setText(str);
        jcVar.f29639c.setText(str2);
        return b(jcVar, 1500);
    }

    public final mc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f32924c;
        ub ubVar = new ub(W, c6Var);
        ubVar.setBackground(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Fi, c6Var), 12);
        ubVar.f33184a.setImageResource(i10);
        ubVar.f33185b.setText(charSequence);
        ubVar.f33185b.setSingleLine(false);
        ubVar.f33185b.setLines(2);
        ubVar.f33185b.setMaxLines(4);
        TextView textView = ubVar.f33185b;
        textView.setMaxWidth(nh.t3.a(textView.getText(), ubVar.f33185b.getPaint()));
        ubVar.f33185b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) ubVar.f33185b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        ubVar.setWrapWidth();
        return b(ubVar, 5000);
    }

    public final mc y(int i10, TLRPC.Document document, j3.y yVar) {
        String string;
        Context W = W();
        org.telegram.ui.ActionBar.c6 c6Var = this.f32924c;
        ub ubVar = new ub(W, c6Var);
        ubVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        ubVar.removeView(ubVar.f33185b);
        x5 x5Var = new x5(ubVar.getContext());
        ubVar.f33185b = x5Var;
        x5Var.setTypeface(Typeface.SANS_SERIF);
        ubVar.f33185b.setTextSize(1, 15.0f);
        ubVar.f33185b.setEllipsize(TextUtils.TruncateAt.END);
        ubVar.f33185b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new y5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = ubVar.f33185b;
        if (i10 > 1) {
            string = LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]);
        } else {
            string = LocaleController.getString(R.string.SavedTagMessageTagged);
        }
        textView.setText(new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) spannableString));
        if (yVar != null) {
            kc kcVar = new kc(W(), c6Var, true);
            kcVar.e(LocaleController.getString(R.string.ViewAction));
            kcVar.f30007a = yVar;
            ubVar.setButton(kcVar);
        }
        ubVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Hi, c6Var));
        ubVar.addView(ubVar.f33185b, i7.f6.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(ubVar, 2750);
    }

    public tc(FrameLayout frameLayout, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f32923b = frameLayout;
        this.f32922a = null;
        this.f32924c = c6Var;
    }
}
