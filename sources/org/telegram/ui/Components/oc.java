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
public final class oc {
    public final org.telegram.ui.ActionBar.o2 f31355a;
    public final FrameLayout f31356b;
    public final org.telegram.ui.ActionBar.b6 f31357c;

    public oc(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var != null && o2Var.getLastStoryViewer() != null && o2Var.getLastStoryViewer().attachedToParent()) {
            this.f31355a = null;
            ih.i4 currentPeerView = o2Var.getLastStoryViewer().f11806j0.getCurrentPeerView();
            this.f31356b = currentPeerView != null ? currentPeerView.Y0 : null;
            this.f31357c = o2Var.getLastStoryViewer().f11834y;
            return;
        }
        this.f31355a = o2Var;
        this.f31356b = null;
        this.f31357c = o2Var != null ? o2Var.getResourceProvider() : null;
    }

    public static gc A(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, org.telegram.ui.ActionBar.b6 b6Var) {
        int i9;
        if (z10) {
            i9 = 3;
        } else {
            i9 = 4;
        }
        return z(o2Var, i9, 0, b6Var);
    }

    public static gc B(org.telegram.ui.ActionBar.o2 o2Var, boolean z10, c3.d dVar, org.telegram.ui.me meVar, org.telegram.ui.ActionBar.b6 b6Var) {
        int i9;
        String str;
        int i10;
        int i11;
        ob obVar = new ob(o2Var.getParentActivity(), b6Var);
        if (z10) {
            i9 = R.raw.ic_pin;
        } else {
            i9 = R.raw.ic_unpin;
        }
        obVar.c(i9, 28, 28, "Pin", "Line");
        TextView textView = obVar.f31343b;
        if (z10) {
            str = "MessagePinnedHint";
        } else {
            str = "MessageUnpinnedHint";
        }
        if (z10) {
            i10 = R.string.MessagePinnedHint;
        } else {
            i10 = R.string.MessageUnpinnedHint;
        }
        textView.setText(LocaleController.getString(str, i10));
        if (!z10) {
            ec ecVar = new ec(o2Var.getParentActivity(), b6Var, true);
            ecVar.f27999a = dVar;
            ecVar.f28000b = meVar;
            obVar.setButton(ecVar);
        }
        if (z10) {
            i11 = 1500;
        } else {
            i11 = 5000;
        }
        return gc.g(o2Var, obVar, i11);
    }

    public static gc C(org.telegram.ui.ActionBar.o2 o2Var, String str) {
        ob obVar = new ob(o2Var.getParentActivity(), o2Var.getResourceProvider());
        obVar.d(R.raw.ic_admin, "Shield");
        obVar.f31343b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return gc.g(o2Var, obVar, 1500);
    }

    public static gc D(org.telegram.ui.ActionBar.o2 o2Var, TLRPC.User user, String str) {
        String str2;
        ob obVar = new ob(o2Var.getParentActivity(), o2Var.getResourceProvider());
        obVar.d(R.raw.ic_ban, "Hand");
        if (user.deleted) {
            str2 = LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        obVar.f31343b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, str2, str)));
        return gc.g(o2Var, obVar, 1500);
    }

    public static gc F(FrameLayout frameLayout, boolean z10) {
        nc ncVar;
        oc ocVar = new oc(frameLayout, null);
        if (z10) {
            ncVar = nc.h;
        } else {
            ncVar = nc.f31064e;
        }
        return ocVar.m(ncVar, 1, -115203550, -1, null);
    }

    public static gc S(int i9, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        String string;
        ob obVar = new ob(o2Var.getParentActivity(), b6Var);
        boolean z10 = true;
        if (i9 != 0) {
            if (i9 == 1) {
                string = LocaleController.getString(R.string.SoundOffHint);
                z10 = false;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            string = LocaleController.getString(R.string.SoundOnHint);
        }
        if (z10) {
            obVar.d(R.raw.sound_on, new String[0]);
        } else {
            obVar.d(R.raw.sound_off, new String[0]);
        }
        obVar.f31343b.setText(string);
        return gc.g(o2Var, obVar, 1500);
    }

    public static oc X() {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return new oc(cb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.f3) {
            return new oc(((org.telegram.ui.ActionBar.f3) dialog).container, U.getResourceProvider());
        }
        return a0(U);
    }

    public static oc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.b6 b6Var) {
        return new oc(frameLayout, b6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var != null && o2Var.getParentActivity() != null && o2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static oc a0(org.telegram.ui.ActionBar.o2 o2Var) {
        if (o2Var == null) {
            return X();
        }
        return new oc(o2Var);
    }

    public static void b0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.f35494y1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
        }
    }

    public static gc d(org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        String string;
        ob obVar = new ob(o2Var.getParentActivity(), o2Var.getResourceProvider());
        if (z10) {
            obVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            obVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        obVar.f31343b.setText(AndroidUtilities.replaceTags(string));
        return gc.g(o2Var, obVar, 1500);
    }

    public static gc j(org.telegram.ui.ActionBar.o2 o2Var) {
        return a0(o2Var).k(false);
    }

    public static gc l(String str, org.telegram.ui.ActionBar.o2 o2Var, boolean z10) {
        int i9;
        String string;
        int i10;
        int i11;
        ob obVar = new ob(o2Var.getParentActivity(), o2Var.getResourceProvider());
        if (str != null) {
            if (z10) {
                i11 = R.string.DisableSharingToastDisabledPending;
            } else {
                i11 = R.string.DisableSharingToastEnabledPending;
            }
            string = LocaleController.formatString(i11, str);
        } else {
            if (z10) {
                i9 = R.string.DisableSharingToastDisabled;
            } else {
                i9 = R.string.DisableSharingToastEnabled;
            }
            string = LocaleController.getString(i9);
        }
        obVar.f31343b.setText(AndroidUtilities.replaceTags(string));
        if (!z10 && str == null) {
            i10 = R.raw.contact_check;
        } else {
            i10 = R.raw.e_hand_2;
        }
        obVar.d(i10, new String[0]);
        return gc.g(o2Var, obVar, 5000);
    }

    public static gc v(Context context, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, int i9, long j10, int i10, int i11, int i12, int i13, boolean z10, e5.w wVar) {
        org.telegram.ui.ActionBar.b6 b6Var;
        ob obVar;
        boolean z11;
        org.telegram.ui.wq wqVar;
        SpannableStringBuilder replaceTags;
        gc g10;
        org.telegram.ui.ActionBar.b6 b6Var2;
        int i14;
        int i15;
        hc hcVar;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && o2Var != null && i9 <= 1 && j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !z10) {
            obVar = new rb(i10, o2Var);
        } else {
            if (o2Var != null) {
                b6Var = o2Var.getResourceProvider();
            } else {
                b6Var = null;
            }
            obVar = new ob(i11, i12, context, b6Var);
        }
        ob obVar2 = obVar;
        if (wVar == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (wVar != null) {
            wqVar = new org.telegram.ui.wq(6, zArr, wVar);
        } else {
            wqVar = null;
        }
        if (i9 <= 1) {
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i10 <= 1) {
                    String string = LocaleController.getString(R.string.FwdMessageToSavedMessages);
                    if (z10) {
                        hcVar = new hc(2);
                    } else {
                        hcVar = new hc(0);
                    }
                    replaceTags = AndroidUtilities.replaceSingleTag(string, -1, 2, hcVar);
                } else {
                    replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new hc(0));
                }
                obVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            } else {
                e5.w wVar2 = new e5.w(wqVar, o2Var, j10, 20);
                if (DialogObject.isChatDialog(j10)) {
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
                    if (i10 <= 1) {
                        if (o2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, wVar2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title));
                        }
                    } else if (o2Var != null) {
                        replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, wVar2);
                    } else {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
                    }
                } else {
                    TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                    if (i10 <= 1) {
                        if (z11) {
                            i15 = R.string.FwdMessageToUserShort;
                        } else {
                            i15 = R.string.FwdMessageToUser;
                        }
                        if (o2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i15, UserObject.getFirstName(user)), -1, 2, wVar2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i15, UserObject.getFirstName(user)));
                        }
                    } else {
                        if (z11) {
                            i14 = R.string.FwdMessagesToUserShort;
                        } else {
                            i14 = R.string.FwdMessagesToUser;
                        }
                        if (o2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i14, UserObject.getFirstName(user)), -1, 2, wVar2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i14, UserObject.getFirstName(user)));
                        }
                    }
                }
                obVar2.c(R.raw.forward, 30, 30, new String[0]);
            }
        } else {
            if (i10 <= 1) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i9, new Object[0]));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i9, new Object[0]));
            }
            obVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        obVar2.f31343b.setText(replaceTags);
        if (z11) {
            Context context2 = obVar2.getContext();
            if (o2Var != null) {
                b6Var2 = o2Var.getResourceProvider();
            } else {
                b6Var2 = null;
            }
            ec ecVar = new ec(context2, b6Var2, true, true);
            ecVar.f27999a = null;
            ecVar.f28000b = wqVar;
            obVar2.setButton(ecVar);
        }
        obVar2.postDelayed(new ic(obVar2, 1), 300);
        if (frameLayout != null) {
            g10 = gc.f(frameLayout, obVar2, i13);
        } else if (o2Var != null) {
            g10 = gc.g(o2Var, obVar2, i13);
        } else {
            throw new IllegalArgumentException();
        }
        if (obVar2 instanceof rb) {
            obVar2.f31343b.setSingleLine(false);
            obVar2.f31343b.setMaxLines(2);
            ((rb) obVar2).setBulletin(g10);
            g10.f28745r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.gc x(android.app.Activity r4, android.widget.FrameLayout r5, int r6, long r7, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.gc");
    }

    public static org.telegram.ui.Components.gc z(org.telegram.ui.ActionBar.o2 r5, int r6, int r7, org.telegram.ui.ActionBar.b6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.oc.z(org.telegram.ui.ActionBar.o2, int, int, org.telegram.ui.ActionBar.b6):org.telegram.ui.Components.gc");
    }

    public final gc E(org.telegram.ui.ActionBar.b6 b6Var) {
        ob obVar = new ob(W(), b6Var);
        obVar.d(R.raw.chats_infotip, new String[0]);
        obVar.f31343b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(obVar, 1500);
    }

    public final gc G(int i9, int i10, CharSequence charSequence) {
        int i11;
        SpannableStringBuilder spannableStringBuilder;
        ob obVar = new ob(W(), this.f31357c);
        obVar.c(i9, 36, 36, new String[0]);
        if (charSequence != null) {
            String charSequence2 = charSequence.toString();
            if (charSequence instanceof SpannableStringBuilder) {
                spannableStringBuilder = (SpannableStringBuilder) charSequence;
            } else {
                spannableStringBuilder = new SpannableStringBuilder(charSequence);
            }
            int i12 = 0;
            for (int indexOf = charSequence2.indexOf(10); indexOf >= 0 && indexOf < charSequence.length(); indexOf = charSequence2.indexOf(10, indexOf + 1)) {
                if (i12 >= i10) {
                    spannableStringBuilder.replace(indexOf, indexOf + 1, (CharSequence) " ");
                }
                i12++;
            }
            charSequence = spannableStringBuilder;
        }
        obVar.f31343b.setSingleLine(false);
        obVar.f31343b.setMaxLines(i10);
        obVar.f31343b.setText(charSequence);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(obVar, i11);
    }

    public final gc H(int i9, CharSequence charSequence) {
        return Q(i9, 36, charSequence);
    }

    public final gc I(int i9, CharSequence charSequence, CharSequence charSequence2, int i10, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.b6 b6Var = this.f31357c;
        ob obVar = new ob(W, b6Var);
        if (i9 != 0) {
            obVar.c(i9, 36, 36, new String[0]);
        } else {
            obVar.f31342a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) obVar.f31343b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        obVar.f31343b.setTextSize(1, 14.0f);
        obVar.f31343b.setTextDirection(5);
        obVar.f31343b.setSingleLine(false);
        obVar.f31343b.setMaxLines(3);
        obVar.f31343b.setText(charSequence);
        ec ecVar = new ec(W(), b6Var, true, z10);
        ecVar.e(charSequence2);
        ecVar.f27999a = runnable;
        obVar.setButton(ecVar);
        return b(obVar, i10);
    }

    public final gc J(int i9, CharSequence charSequence, String str, Runnable runnable) {
        int i10;
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return I(i9, charSequence, str, i10, false, runnable);
    }

    public final gc K(int i9, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.b6 b6Var = this.f31357c;
        dc dcVar = new dc(W, b6Var);
        dcVar.c(i9, 36, 36, new String[0]);
        dcVar.f27704b.setText(str);
        dcVar.f27705c.setText(charSequence);
        ec ecVar = new ec(W(), b6Var, true);
        ecVar.e(str2);
        ecVar.f27999a = runnable;
        dcVar.setButton(ecVar);
        return b(dcVar, 5000);
    }

    public final gc L(Drawable drawable, CharSequence charSequence) {
        ob obVar = new ob(W(), this.f31357c);
        obVar.f31342a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.vo0) {
            ((org.telegram.ui.vo0) drawable).e(obVar.f31342a);
        }
        obVar.f31343b.setText(charSequence);
        obVar.f31343b.setSingleLine(false);
        obVar.f31343b.setMaxLines(2);
        return b(obVar, 2750);
    }

    public final gc M(CharSequence charSequence, CharSequence charSequence2, int i9) {
        int i10;
        dc dcVar = new dc(W(), this.f31357c);
        dcVar.c(i9, 36, 36, new String[0]);
        dcVar.f27704b.setText(charSequence);
        dcVar.f27705c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(dcVar, i10);
    }

    public final gc N(String str, String str2) {
        dc dcVar = new dc(W(), this.f31357c);
        dcVar.f27703a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) dcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        dcVar.f27704b.setText(str);
        dcVar.f27705c.setText(str2);
        return b(dcVar, 5000);
    }

    public final gc O(TLRPC.Document document, String str, String str2) {
        int i9;
        if (document == null) {
            return new gc();
        }
        cc ccVar = new cc(W(), this.f31357c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        o9 o9Var = ccVar.f27465a;
        o9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        o9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ccVar.f27466b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = ccVar.f27467c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i9 = 1500;
        } else {
            i9 = 2750;
        }
        return b(ccVar, i9);
    }

    public final gc P(int i9, CharSequence charSequence) {
        int i10;
        ob obVar = new ob(W(), this.f31357c);
        obVar.c(i9, 36, 36, new String[0]);
        obVar.f31343b.setText(charSequence);
        obVar.f31343b.setSingleLine(false);
        obVar.f31343b.setTextSize(1, 14.0f);
        obVar.f31343b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(obVar, i10);
    }

    public final gc Q(int i9, int i10, CharSequence charSequence) {
        int i11;
        ob obVar = new ob(W(), this.f31357c);
        obVar.c(i9, i10, i10, new String[0]);
        obVar.f31343b.setText(charSequence);
        obVar.f31343b.setSingleLine(false);
        obVar.f31343b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(obVar, i11);
    }

    public final gc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i9;
        if (document == null) {
            return new gc();
        }
        cc ccVar = new cc(W(), this.f31357c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        o9 o9Var = ccVar.f27465a;
        o9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        o9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ccVar.f27466b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        ccVar.f27467c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i9 = 1500;
        } else {
            i9 = 2750;
        }
        return b(ccVar, i9);
    }

    public final gc T(String str) {
        ob obVar = new ob(W(), null);
        obVar.d(R.raw.contact_check, new String[0]);
        obVar.f31343b.setText(str);
        obVar.f31343b.setSingleLine(false);
        obVar.f31343b.setMaxLines(2);
        return b(obVar, 1500);
    }

    public final gc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        dc dcVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.b6 b6Var = this.f31357c;
        if (!isEmpty) {
            dc dcVar2 = new dc(W(), b6Var);
            dcVar2.f27704b.setText(str);
            dcVar2.f27705c.setText((CharSequence) null);
            dcVar = dcVar2;
        } else {
            ob obVar = new ob(W(), b6Var);
            obVar.f31343b.setText(str);
            obVar.f31343b.setSingleLine(false);
            obVar.f31343b.setMaxLines(2);
            dcVar = obVar;
        }
        dcVar.setTimer();
        ec ecVar = new ec(W(), b6Var, true, z10);
        ecVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ecVar.f27999a = runnable;
        ecVar.f28000b = runnable2;
        dcVar.setButton(ecVar);
        return b(dcVar, 5000);
    }

    public final gc V(List list, CharSequence charSequence, CharSequence charSequence2, org.telegram.ui.Cells.e3 e3Var) {
        boolean z10;
        float f10;
        int i9;
        Context W = W();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.f31357c;
        fc fcVar = new fc(W, b6Var, z10);
        if (list != null) {
            int i10 = 0;
            i9 = 0;
            for (int i11 = 3; i10 < list.size() && i9 < i11; i11 = 3) {
                TLObject tLObject = (TLObject) list.get(i10);
                if (tLObject != null) {
                    int i12 = i9 + 1;
                    fcVar.f28372a.setCount(i12);
                    fcVar.f28372a.b(i9, tLObject, UserConfig.selectedAccount);
                    i9 = i12;
                }
                i10++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                fcVar.f28372a.setTranslationX(AndroidUtilities.dp(4.0f));
                fcVar.f28372a.setScaleX(1.2f);
                fcVar.f28372a.setScaleY(1.2f);
            } else {
                fcVar.f28372a.setScaleX(1.0f);
                fcVar.f28372a.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i9 = 0;
        }
        fcVar.f28372a.a(false);
        if (charSequence2 != null) {
            fcVar.f28373b.setSingleLine(true);
            fcVar.f28373b.setMaxLines(1);
            fcVar.f28373b.setText(charSequence);
            fcVar.f28374c.setText(charSequence2);
            fcVar.f28374c.setSingleLine(false);
            fcVar.f28374c.setMaxLines(3);
            if (fcVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i9) * 12));
                if (i9 == 1) {
                    dp += AndroidUtilities.dp(f10);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) fcVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) fcVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            fcVar.f28373b.setSingleLine(false);
            fcVar.f28373b.setMaxLines(4);
            fcVar.f28373b.setText(charSequence);
            if (fcVar.f28373b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i9) * 12));
                if (i9 == 1) {
                    fcVar.f28373b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f10);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) fcVar.f28373b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) fcVar.f28373b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (e3Var != null) {
            ec ecVar = new ec(W(), b6Var, true);
            ecVar.e(LocaleController.getString(R.string.UndoNoCaps));
            ecVar.f27999a = (Runnable) e3Var.f24286b;
            ecVar.f28000b = (Runnable) e3Var.f24287c;
            fcVar.setButton(ecVar);
        }
        return b(fcVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.o2 o2Var = this.f31355a;
        if (o2Var != null) {
            context = o2Var.getParentActivity();
            if (context == null && this.f31355a.getLayoutContainer() != null) {
                context = this.f31355a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f31356b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return ApplicationLoader.applicationContext;
        }
        return context;
    }

    public final gc Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.f35494y1) {
            return new gc();
        }
        if (tL_error == null) {
            return t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
        }
        return t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final gc b(eb ebVar, int i9) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f31355a;
        if (o2Var != null) {
            return gc.g(o2Var, ebVar, i9);
        }
        return gc.f(this.f31356b, ebVar, i9);
    }

    public final gc c(CharSequence charSequence) {
        if (W() == null) {
            return new gc();
        }
        ob obVar = new ob(W(), this.f31357c);
        obVar.d(R.raw.ic_admin, "Shield");
        obVar.f31343b.setSingleLine(false);
        obVar.f31343b.setMaxLines(3);
        obVar.f31343b.setText(charSequence);
        return b(obVar, 2750);
    }

    public final void c0(String str, boolean z10) {
        if (!LaunchActivity.f35494y1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            gc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
            t10.f28745r = false;
            t10.k(z10);
            return;
        }
        gc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t11.f28745r = false;
        t11.k(z10);
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.f35494y1) {
            if (tL_error == null) {
                gc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.f28745r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                gc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.f28745r = false;
                t11.k(z10);
            }
        }
    }

    public final gc e(boolean z10) {
        String string;
        ob obVar = new ob(W(), this.f31357c);
        if (z10) {
            obVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            obVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        obVar.f31343b.setText(AndroidUtilities.replaceTags(string));
        return b(obVar, 1500);
    }

    public final boolean e0(int i9, long j10) {
        org.telegram.ui.ActionBar.o2 o2Var;
        SpannableStringBuilder replaceSingleTag;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (o2Var = this.f31355a) != null) {
            rb rbVar = new rb(i9, o2Var);
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i9 <= 1) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new hc(0));
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new hc(0));
                }
                rbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                rbVar.f31343b.setText(replaceSingleTag);
                rbVar.f31343b.setSingleLine(false);
                rbVar.f31343b.setMaxLines(2);
                gc b10 = b(rbVar, 3500);
                rbVar.setBulletin(b10);
                b10.f28745r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final gc f(int i9, Runnable runnable) {
        ob obVar = new ob(W(), null);
        obVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i9, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i10 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i10);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i10, indexOf2));
        valueOf.setSpan(new lc(0, runnable), indexOf, indexOf2 - 1, 33);
        obVar.f31343b.setText(valueOf);
        obVar.f31343b.setSingleLine(false);
        obVar.f31343b.setMaxLines(3);
        return b(obVar, 5000);
    }

    public final gc g(String str, ArrayList arrayList) {
        fc fcVar = new fc(W(), this.f31357c, false);
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size() && i9 < 3; i10++) {
            TLObject tLObject = (TLObject) arrayList.get(i10);
            if (tLObject != null) {
                int i11 = i9 + 1;
                fcVar.f28372a.setCount(i11);
                fcVar.f28372a.b(i9, tLObject, UserConfig.selectedAccount);
                i9 = i11;
            }
        }
        if (arrayList.size() == 1) {
            fcVar.f28372a.setTranslationX(AndroidUtilities.dp(4.0f));
            fcVar.f28372a.setScaleX(1.2f);
            fcVar.f28372a.setScaleY(1.2f);
        } else {
            fcVar.f28372a.setScaleX(1.0f);
            fcVar.f28372a.setScaleY(1.0f);
        }
        fcVar.f28372a.a(false);
        fcVar.f28373b.setSingleLine(false);
        fcVar.f28373b.setMaxLines(2);
        fcVar.f28373b.setText(str);
        if (fcVar.f28373b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i9) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) fcVar.f28373b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) fcVar.f28373b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            fcVar.f28372a.setTranslationX(AndroidUtilities.dp(32 - ((i9 - 1) * 12)));
        }
        return b(fcVar, 5000);
    }

    public final gc h(TLRPC.Document document, int i9, final Utilities.Callback callback) {
        SpannableStringBuilder spannableStringBuilder;
        q80 q80Var;
        TLRPC.InputStickerSet inputStickerSet;
        int i10;
        TLRPC.StickerSet stickerSet;
        SpannableStringBuilder replaceTags;
        final TLRPC.InputStickerSet inputStickerSet2 = MessageObject.getInputStickerSet(document);
        if (inputStickerSet2 == null) {
            return null;
        }
        TLRPC.TL_messages_stickerSet stickerSet2 = MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet2, true);
        if (stickerSet2 != null && (stickerSet = stickerSet2.set) != null) {
            if (i9 == 1) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, stickerSet.title));
            } else if (i9 == 2) {
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
        if (i9 == 1) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("TopicContainsEmojiPackSingle", R.string.TopicContainsEmojiPackSingle, "<{LOADING}>")));
        } else if (i9 == 2) {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("StoryContainsEmojiPackSingle", R.string.StoryContainsEmojiPackSingle, "<{LOADING}>")));
        } else {
            spannableStringBuilder = new SpannableStringBuilder(AndroidUtilities.replaceTags(LocaleController.formatString("MessageContainsEmojiPackSingle", R.string.MessageContainsEmojiPackSingle, "<{LOADING}>")));
        }
        int indexOf = spannableStringBuilder.toString().indexOf("<{LOADING}>");
        org.telegram.ui.ActionBar.b6 b6Var = this.f31357c;
        if (indexOf >= 0) {
            q80Var = new q80(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), b6Var);
            spannableStringBuilder.setSpan(q80Var, indexOf, indexOf + 11, 33);
            int i11 = org.telegram.ui.ActionBar.f6.Hi;
            q80Var.a(i0.a.k(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), 32), i0.a.k(org.telegram.ui.ActionBar.f6.v0(i11, b6Var), 72));
        } else {
            q80Var = null;
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
        ?? obVar = new ob(W, b6Var);
        l80 l80Var = new l80(W, null);
        obVar.d = l80Var;
        l80Var.setDisablePaddingsOffset(true);
        l80Var.setSingleLine();
        l80Var.setTypeface(Typeface.SANS_SERIF);
        l80Var.setTextSize(1, 15.0f);
        l80Var.setEllipsize(TextUtils.TruncateAt.END);
        l80Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        obVar.f31343b.setVisibility(8);
        obVar.addView(l80Var, g7.e6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i12 = org.telegram.ui.ActionBar.f6.Hi;
        obVar.setTextColor(obVar.getThemedColor(i12));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i10 = 0;
            obVar.f31342a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i12, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i10 = 0;
        }
        obVar.e(document, new String[i10]);
        obVar.f31343b.setTextSize(1, 14.0f);
        obVar.f31343b.setSingleLine(i10);
        obVar.f31343b.setMaxLines(3);
        l80Var.setText(spannableStringBuilder);
        l80Var.setTextSize(1, 14.0f);
        l80Var.setSingleLine(i10);
        l80Var.setMaxLines(3);
        ec ecVar = new ec(W(), b6Var, true);
        ecVar.e(string);
        ecVar.f27999a = runnable;
        obVar.setButton(ecVar);
        gc b10 = b(obVar, 2750);
        if (q80Var != null) {
            lb lbVar = b10.f28733e;
            if (lbVar instanceof nb) {
                q80Var.f31860b = ((nb) lbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new kc(i9, b10, currentTimeMillis));
        return b10;
    }

    public final gc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new gc();
        }
        ob obVar = new ob(W(), null);
        obVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        obVar.f31343b.setText(str);
        return b(obVar, 1500);
    }

    public final gc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new gc();
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.f31357c;
        if (z10) {
            dc dcVar = new dc(W(), b6Var);
            dcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            dcVar.f27704b.setText(LocaleController.getString(R.string.LinkCopied));
            dcVar.f27705c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
            return b(dcVar, 2750);
        }
        ob obVar = new ob(W(), b6Var);
        obVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        obVar.f31343b.setText(LocaleController.getString(R.string.LinkCopied));
        return b(obVar, 1500);
    }

    public final gc m(nc ncVar, int i9, int i10, int i11, org.telegram.ui.ActionBar.b6 b6Var) {
        ob obVar;
        String string;
        if (i10 != 0 && i11 != 0) {
            obVar = new ob(i10, i11, W(), b6Var);
        } else {
            obVar = new ob(W(), b6Var);
        }
        mc mcVar = ncVar.d;
        obVar.d(mcVar.f30788a, mcVar.f30789b);
        TextView textView = obVar.f31343b;
        String str = ncVar.f31072a;
        if (ncVar.f31074c) {
            string = LocaleController.formatPluralString(str, i9, new Object[0]);
        } else {
            string = LocaleController.getString(str, ncVar.f31073b);
        }
        textView.setText(AndroidUtilities.replaceSingleTag(string, new hc(1)));
        int i12 = ncVar.d.f30790c;
        if (i12 != 0) {
            obVar.setIconPaddingBottom(i12);
        }
        return b(obVar, 1500);
    }

    public final gc n(nc ncVar, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        return m(ncVar, i9, 0, 0, b6Var);
    }

    public final gc o(nc ncVar, org.telegram.ui.ActionBar.b6 b6Var) {
        return m(ncVar, 1, 0, 0, b6Var);
    }

    public final gc p(long j10, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.b6 b6Var = this.f31357c;
        bc bcVar = new bc(W, b6Var);
        k5 k5Var = new k5(1, UserConfig.selectedAccount, j10);
        o9 o9Var = bcVar.f27142a;
        o9Var.setAnimatedEmojiDrawable(k5Var);
        o9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, b6Var), PorterDuff.Mode.SRC_IN));
        bcVar.f27143b.setText(str);
        bcVar.f27144c.setText(str2);
        return b(bcVar, 2750);
    }

    public final gc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.b6 b6Var = this.f31357c;
        ob obVar = new ob(W, b6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            obVar.f31342a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        obVar.e(document, new String[0]);
        if (obVar.f31342a.getImageReceiver() != null) {
            obVar.f31342a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        obVar.f31343b.setText(charSequence);
        obVar.f31343b.setTextSize(1, 14.0f);
        obVar.f31343b.setSingleLine(false);
        obVar.f31343b.setMaxLines(3);
        ec ecVar = new ec(W(), b6Var, true);
        ecVar.e(str);
        ecVar.f27999a = runnable;
        obVar.setButton(ecVar);
        return b(obVar, 2750);
    }

    public final gc r(TLRPC.Document document, String str) {
        ob obVar = new ob(W(), this.f31357c);
        if (MessageObject.isTextColorEmoji(document)) {
            obVar.f31342a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        obVar.e(document, new String[0]);
        obVar.f31343b.setText(str);
        obVar.f31343b.setTextSize(1, 14.0f);
        obVar.f31343b.setSingleLine(false);
        obVar.f31343b.setMaxLines(3);
        return b(obVar, 2750);
    }

    public final gc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i9;
        dc dcVar = new dc(W(), this.f31357c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        pi0 pi0Var = dcVar.f27703a;
        if (isTextColorEmoji) {
            pi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        pi0Var.setAutoRepeat(true);
        pi0Var.g(36, 36, document);
        dcVar.f27704b.setText(str);
        dcVar.f27705c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i9 = 1500;
        } else {
            i9 = 2750;
        }
        return b(dcVar, i9);
    }

    public final gc t(CharSequence charSequence, org.telegram.ui.ActionBar.b6 b6Var) {
        ob obVar = new ob(W(), b6Var);
        obVar.d(R.raw.chats_infotip, new String[0]);
        obVar.f31343b.setText(charSequence);
        obVar.f31343b.setSingleLine(false);
        obVar.f31343b.setMaxLines(2);
        return b(obVar, 1500);
    }

    public final gc u(String str, String str2, org.telegram.ui.ActionBar.b6 b6Var) {
        dc dcVar = new dc(W(), b6Var);
        dcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        dcVar.f27704b.setText(str);
        dcVar.f27705c.setText(str2);
        return b(dcVar, 1500);
    }

    public final gc w(int i9, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.b6 b6Var = this.f31357c;
        ob obVar = new ob(W, b6Var);
        obVar.setBackground(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Fi, b6Var), 12);
        obVar.f31342a.setImageResource(i9);
        obVar.f31343b.setText(charSequence);
        obVar.f31343b.setSingleLine(false);
        obVar.f31343b.setLines(2);
        obVar.f31343b.setMaxLines(4);
        TextView textView = obVar.f31343b;
        textView.setMaxWidth(kh.x3.a(textView.getText(), obVar.f31343b.getPaint()));
        obVar.f31343b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) obVar.f31343b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        obVar.setWrapWidth();
        return b(obVar, 5000);
    }

    public final gc y(int i9, TLRPC.Document document, h3.y yVar) {
        String string;
        Context W = W();
        org.telegram.ui.ActionBar.b6 b6Var = this.f31357c;
        ob obVar = new ob(W, b6Var);
        obVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        obVar.removeView(obVar.f31343b);
        s5 s5Var = new s5(obVar.getContext());
        obVar.f31343b = s5Var;
        s5Var.setTypeface(Typeface.SANS_SERIF);
        obVar.f31343b.setTextSize(1, 15.0f);
        obVar.f31343b.setEllipsize(TextUtils.TruncateAt.END);
        obVar.f31343b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new t5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = obVar.f31343b;
        if (i9 > 1) {
            string = LocaleController.formatPluralString("SavedTagMessagesTagged", i9, new Object[0]);
        } else {
            string = LocaleController.getString(R.string.SavedTagMessageTagged);
        }
        textView.setText(new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) spannableString));
        if (yVar != null) {
            ec ecVar = new ec(W(), b6Var, true);
            ecVar.e(LocaleController.getString(R.string.ViewAction));
            ecVar.f27999a = yVar;
            obVar.setButton(ecVar);
        }
        obVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Hi, b6Var));
        obVar.addView(obVar.f31343b, g7.e6.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(obVar, 2750);
    }

    public oc(FrameLayout frameLayout, org.telegram.ui.ActionBar.b6 b6Var) {
        this.f31356b = frameLayout;
        this.f31355a = null;
        this.f31357c = b6Var;
    }
}
