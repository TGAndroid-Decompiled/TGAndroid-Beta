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
    public final org.telegram.ui.ActionBar.p2 f28747a;
    public final FrameLayout f28748b;
    public final org.telegram.ui.ActionBar.f6 f28749c;

    public wc(org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var != null && p2Var.getLastStoryViewer() != null && p2Var.getLastStoryViewer().attachedToParent()) {
            this.f28747a = null;
            zh.a3 currentPeerView = p2Var.getLastStoryViewer().f48947n0.getCurrentPeerView();
            this.f28748b = currentPeerView != null ? currentPeerView.f48160c1 : null;
            this.f28749c = p2Var.getLastStoryViewer().f48972y;
            return;
        }
        this.f28747a = p2Var;
        this.f28748b = null;
        this.f28749c = p2Var != null ? p2Var.getResourceProvider() : null;
    }

    public static pc A(org.telegram.ui.ActionBar.p2 p2Var, boolean z10, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        if (z10) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        return z(p2Var, i10, 0, f6Var);
    }

    public static pc B(org.telegram.ui.ActionBar.p2 p2Var, boolean z10, di.q qVar, org.telegram.ui.ve veVar, org.telegram.ui.ActionBar.f6 f6Var) {
        int i10;
        String str;
        int i11;
        int i12;
        xb xbVar = new xb(p2Var.getParentActivity(), f6Var);
        if (z10) {
            i10 = R.raw.ic_pin;
        } else {
            i10 = R.raw.ic_unpin;
        }
        xbVar.c(i10, 28, 28, "Pin", "Line");
        TextView textView = xbVar.f29000b;
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
            nc ncVar = new nc(p2Var.getParentActivity(), f6Var, true);
            ncVar.f25483a = qVar;
            ncVar.f25484b = veVar;
            xbVar.setButton(ncVar);
        }
        if (z10) {
            i12 = 1500;
        } else {
            i12 = 5000;
        }
        return pc.g(p2Var, xbVar, i12);
    }

    public static pc C(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        xb xbVar = new xb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        xbVar.d(R.raw.ic_admin, "Shield");
        xbVar.f29000b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return pc.g(p2Var, xbVar, 1500);
    }

    public static pc D(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, String str) {
        String str2;
        xb xbVar = new xb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        xbVar.d(R.raw.ic_ban, "Hand");
        if (user.deleted) {
            str2 = LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        xbVar.f29000b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, str2, str)));
        return pc.g(p2Var, xbVar, 1500);
    }

    public static pc F(FrameLayout frameLayout, boolean z10) {
        vc vcVar;
        wc wcVar = new wc(frameLayout, null);
        if (z10) {
            vcVar = vc.h;
        } else {
            vcVar = vc.e;
        }
        return wcVar.m(vcVar, 1, -115203550, -1, null);
    }

    public static pc S(int i10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        String string;
        xb xbVar = new xb(p2Var.getParentActivity(), f6Var);
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
            xbVar.d(R.raw.sound_on, new String[0]);
        } else {
            xbVar.d(R.raw.sound_off, new String[0]);
        }
        xbVar.f29000b.setText(string);
        return pc.g(p2Var, xbVar, 1500);
    }

    public static wc X() {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return new wc(kb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.h3) {
            return new wc(((org.telegram.ui.ActionBar.h3) dialog).container, U.getResourceProvider());
        }
        return a0(U);
    }

    public static wc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        return new wc(frameLayout, f6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var != null && p2Var.getParentActivity() != null && p2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static wc a0(org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var == null) {
            return X();
        }
        return new wc(p2Var);
    }

    public static void b0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.C1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
        }
    }

    public static pc d(org.telegram.ui.ActionBar.p2 p2Var, boolean z10) {
        String string;
        xb xbVar = new xb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        if (z10) {
            xbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            xbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        xbVar.f29000b.setText(AndroidUtilities.replaceTags(string));
        return pc.g(p2Var, xbVar, 1500);
    }

    public static pc j(org.telegram.ui.ActionBar.p2 p2Var) {
        return a0(p2Var).k(false);
    }

    public static pc l(String str, org.telegram.ui.ActionBar.p2 p2Var, boolean z10) {
        int i10;
        String string;
        int i11;
        int i12;
        xb xbVar = new xb(p2Var.getParentActivity(), p2Var.getResourceProvider());
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
        xbVar.f29000b.setText(AndroidUtilities.replaceTags(string));
        if (!z10 && str == null) {
            i11 = R.raw.contact_check;
        } else {
            i11 = R.raw.e_hand_2;
        }
        xbVar.d(i11, new String[0]);
        return pc.g(p2Var, xbVar, 5000);
    }

    public static pc v(Context context, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, int i10, long j3, int i11, int i12, int i13, int i14, boolean z10, a3.h0 h0Var) {
        xb xbVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        boolean z11;
        org.telegram.ui.qh qhVar;
        SpannableStringBuilder replaceTags;
        pc g10;
        org.telegram.ui.ActionBar.f6 f6Var2;
        int i15;
        int i16;
        bi.f0 f0Var;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && p2Var != null && i10 <= 1 && j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !z10) {
            xbVar = new ac(i11, p2Var);
        } else {
            if (p2Var != null) {
                f6Var = p2Var.getResourceProvider();
            } else {
                f6Var = null;
            }
            xbVar = new xb(i12, i13, context, f6Var);
        }
        xb xbVar2 = xbVar;
        if (h0Var == null) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean[] zArr = {false};
        if (h0Var != null) {
            qhVar = new org.telegram.ui.qh(27, zArr, h0Var);
        } else {
            qhVar = null;
        }
        if (i10 <= 1) {
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i11 <= 1) {
                    String string = LocaleController.getString(R.string.FwdMessageToSavedMessages);
                    if (z10) {
                        f0Var = new bi.f0(22);
                    } else {
                        f0Var = new bi.f0(20);
                    }
                    replaceTags = AndroidUtilities.replaceSingleTag(string, -1, 2, f0Var);
                } else {
                    replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new bi.f0(20));
                }
                xbVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            } else {
                a3.h0 h0Var2 = new a3.h0(qhVar, p2Var, j3, 11);
                if (DialogObject.isChatDialog(j3)) {
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j3));
                    if (i11 <= 1) {
                        if (p2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, h0Var2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title));
                        }
                    } else if (p2Var != null) {
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
                        if (p2Var != null) {
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
                        if (p2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i15, UserObject.getFirstName(user)), -1, 2, h0Var2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i15, UserObject.getFirstName(user)));
                        }
                    }
                }
                xbVar2.c(R.raw.forward, 30, 30, new String[0]);
            }
        } else {
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0]));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            }
            xbVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        xbVar2.f29000b.setText(replaceTags);
        if (z11) {
            Context context2 = xbVar2.getContext();
            if (p2Var != null) {
                f6Var2 = p2Var.getResourceProvider();
            } else {
                f6Var2 = null;
            }
            nc ncVar = new nc(context2, f6Var2, true, true);
            ncVar.f25483a = null;
            ncVar.f25484b = qhVar;
            xbVar2.setButton(ncVar);
        }
        xbVar2.postDelayed(new qc(xbVar2, 1), 300);
        if (frameLayout != null) {
            g10 = pc.f(frameLayout, xbVar2, i14);
        } else if (p2Var != null) {
            g10 = pc.g(p2Var, xbVar2, i14);
        } else {
            throw new IllegalArgumentException();
        }
        if (xbVar2 instanceof ac) {
            xbVar2.f29000b.setSingleLine(false);
            xbVar2.f29000b.setMaxLines(2);
            ((ac) xbVar2).setBulletin(g10);
            g10.f26089r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.pc x(android.app.Activity r4, android.widget.FrameLayout r5, int r6, long r7, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.pc");
    }

    public static org.telegram.ui.Components.pc z(org.telegram.ui.ActionBar.p2 r5, int r6, int r7, org.telegram.ui.ActionBar.f6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wc.z(org.telegram.ui.ActionBar.p2, int, int, org.telegram.ui.ActionBar.f6):org.telegram.ui.Components.pc");
    }

    public final pc E(org.telegram.ui.ActionBar.f6 f6Var) {
        xb xbVar = new xb(W(), f6Var);
        xbVar.d(R.raw.chats_infotip, new String[0]);
        xbVar.f29000b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(xbVar, 1500);
    }

    public final pc G(int i10, int i11, CharSequence charSequence) {
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        xb xbVar = new xb(W(), this.f28749c);
        xbVar.c(i10, 36, 36, new String[0]);
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
        xbVar.f29000b.setSingleLine(false);
        xbVar.f29000b.setMaxLines(i11);
        xbVar.f29000b.setText(charSequence);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(xbVar, i12);
    }

    public final pc H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final pc I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z10, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f28749c;
        xb xbVar = new xb(W, f6Var);
        if (i10 != 0) {
            xbVar.c(i10, 36, 36, new String[0]);
        } else {
            xbVar.f28999a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) xbVar.f29000b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        xbVar.f29000b.setTextSize(1, 14.0f);
        xbVar.f29000b.setTextDirection(5);
        xbVar.f29000b.setSingleLine(false);
        xbVar.f29000b.setMaxLines(3);
        xbVar.f29000b.setText(charSequence);
        nc ncVar = new nc(W(), f6Var, true, z10);
        ncVar.e(charSequence2);
        ncVar.f25483a = runnable;
        xbVar.setButton(ncVar);
        return b(xbVar, i11);
    }

    public final pc J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        int i11;
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return I(i10, charSequence, str, i11, false, runnable);
    }

    public final pc K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f28749c;
        mc mcVar = new mc(W, f6Var);
        mcVar.c(i10, 36, 36, new String[0]);
        mcVar.f25216b.setText(str);
        mcVar.f25217c.setText(charSequence);
        nc ncVar = new nc(W(), f6Var, true);
        ncVar.e(str2);
        ncVar.f25483a = runnable;
        mcVar.setButton(ncVar);
        return b(mcVar, 5000);
    }

    public final pc L(Drawable drawable, CharSequence charSequence) {
        xb xbVar = new xb(W(), this.f28749c);
        xbVar.f28999a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.vp0) {
            ((org.telegram.ui.vp0) drawable).e(xbVar.f28999a);
        }
        xbVar.f29000b.setText(charSequence);
        xbVar.f29000b.setSingleLine(false);
        xbVar.f29000b.setMaxLines(2);
        return b(xbVar, 2750);
    }

    public final pc M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int i11;
        mc mcVar = new mc(W(), this.f28749c);
        mcVar.c(i10, 36, 36, new String[0]);
        mcVar.f25216b.setText(charSequence);
        mcVar.f25217c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(mcVar, i11);
    }

    public final pc N(String str, String str2) {
        mc mcVar = new mc(W(), this.f28749c);
        mcVar.f25215a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) mcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        mcVar.f25216b.setText(str);
        mcVar.f25217c.setText(str2);
        return b(mcVar, 5000);
    }

    public final pc O(TLRPC.Document document, String str, String str2) {
        int i10;
        if (document == null) {
            return new pc();
        }
        lc lcVar = new lc(W(), this.f28749c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        w9 w9Var = lcVar.f24933a;
        w9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = lcVar.f24934b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = lcVar.f24935c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(lcVar, i10);
    }

    public final pc P(int i10, CharSequence charSequence) {
        int i11;
        xb xbVar = new xb(W(), this.f28749c);
        xbVar.c(i10, 36, 36, new String[0]);
        xbVar.f29000b.setText(charSequence);
        xbVar.f29000b.setSingleLine(false);
        xbVar.f29000b.setTextSize(1, 14.0f);
        xbVar.f29000b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(xbVar, i11);
    }

    public final pc Q(int i10, int i11, CharSequence charSequence) {
        int i12;
        xb xbVar = new xb(W(), this.f28749c);
        xbVar.c(i10, i11, i11, new String[0]);
        xbVar.f29000b.setText(charSequence);
        xbVar.f29000b.setSingleLine(false);
        xbVar.f29000b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(xbVar, i12);
    }

    public final pc R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        if (document == null) {
            return new pc();
        }
        lc lcVar = new lc(W(), this.f28749c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        w9 w9Var = lcVar.f24933a;
        w9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        w9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = lcVar.f24934b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        lcVar.f24935c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(lcVar, i10);
    }

    public final pc T(String str) {
        xb xbVar = new xb(W(), null);
        xbVar.d(R.raw.contact_check, new String[0]);
        xbVar.f29000b.setText(str);
        xbVar.f29000b.setSingleLine(false);
        xbVar.f29000b.setMaxLines(2);
        return b(xbVar, 1500);
    }

    public final pc U(String str, boolean z10, Runnable runnable, Runnable runnable2) {
        mc mcVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.f6 f6Var = this.f28749c;
        if (!isEmpty) {
            mc mcVar2 = new mc(W(), f6Var);
            mcVar2.f25216b.setText(str);
            mcVar2.f25217c.setText((CharSequence) null);
            mcVar = mcVar2;
        } else {
            xb xbVar = new xb(W(), f6Var);
            xbVar.f29000b.setText(str);
            xbVar.f29000b.setSingleLine(false);
            xbVar.f29000b.setMaxLines(2);
            mcVar = xbVar;
        }
        mcVar.setTimer();
        nc ncVar = new nc(W(), f6Var, true, z10);
        ncVar.e(LocaleController.getString(R.string.UndoNoCaps));
        ncVar.f25483a = runnable;
        ncVar.f25484b = runnable2;
        mcVar.setButton(ncVar);
        return b(mcVar, 5000);
    }

    public final pc V(List list, CharSequence charSequence, CharSequence charSequence2, n7.a1 a1Var) {
        boolean z10;
        float f7;
        int i10;
        Context W = W();
        if (charSequence2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f28749c;
        oc ocVar = new oc(W, f6Var, z10);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    ocVar.f25757a.setCount(i13);
                    ocVar.f25757a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f7 = 4.0f;
            if (list.size() == 1) {
                ocVar.f25757a.setTranslationX(AndroidUtilities.dp(4.0f));
                ocVar.f25757a.setScaleX(1.2f);
                ocVar.f25757a.setScaleY(1.2f);
            } else {
                ocVar.f25757a.setScaleX(1.0f);
                ocVar.f25757a.setScaleY(1.0f);
            }
        } else {
            f7 = 4.0f;
            i10 = 0;
        }
        ocVar.f25757a.a(false);
        if (charSequence2 != null) {
            ocVar.f25758b.setSingleLine(true);
            ocVar.f25758b.setMaxLines(1);
            ocVar.f25758b.setText(charSequence);
            ocVar.f25759c.setText(charSequence2);
            ocVar.f25759c.setSingleLine(false);
            ocVar.f25759c.setMaxLines(3);
            if (ocVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) ocVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) ocVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            ocVar.f25758b.setSingleLine(false);
            ocVar.f25758b.setMaxLines(4);
            ocVar.f25758b.setText(charSequence);
            if (ocVar.f25758b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    ocVar.f25758b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f7);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) ocVar.f25758b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) ocVar.f25758b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (a1Var != null) {
            nc ncVar = new nc(W(), f6Var, true);
            ncVar.e(LocaleController.getString(R.string.UndoNoCaps));
            ncVar.f25483a = (Runnable) a1Var.f13938b;
            ncVar.f25484b = (Runnable) a1Var.f13939c;
            ocVar.setButton(ncVar);
        }
        return b(ocVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.p2 p2Var = this.f28747a;
        if (p2Var != null) {
            context = p2Var.getParentActivity();
            if (context == null && this.f28747a.getLayoutContainer() != null) {
                context = this.f28747a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f28748b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return ApplicationLoader.applicationContext;
        }
        return context;
    }

    public final pc Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.C1) {
            return new pc();
        }
        if (tL_error == null) {
            return t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
        }
        return t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final pc b(mb mbVar, int i10) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f28747a;
        if (p2Var != null) {
            return pc.g(p2Var, mbVar, i10);
        }
        return pc.f(this.f28748b, mbVar, i10);
    }

    public final pc c(CharSequence charSequence) {
        if (W() == null) {
            return new pc();
        }
        xb xbVar = new xb(W(), this.f28749c);
        xbVar.d(R.raw.ic_admin, "Shield");
        xbVar.f29000b.setSingleLine(false);
        xbVar.f29000b.setMaxLines(3);
        xbVar.f29000b.setText(charSequence);
        return b(xbVar, 2750);
    }

    public final void c0(String str, boolean z10) {
        if (!LaunchActivity.C1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            pc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
            t10.f26089r = false;
            t10.k(z10);
            return;
        }
        pc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t11.f26089r = false;
        t11.k(z10);
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z10) {
        if (LaunchActivity.C1) {
            if (tL_error == null) {
                pc t10 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t10.f26089r = false;
                t10.k(z10);
            } else if (tL_error.code != 406) {
                pc t11 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t11.f26089r = false;
                t11.k(z10);
            }
        }
    }

    public final pc e(boolean z10) {
        String string;
        xb xbVar = new xb(W(), this.f28749c);
        if (z10) {
            xbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            xbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        xbVar.f29000b.setText(AndroidUtilities.replaceTags(string));
        return b(xbVar, 1500);
    }

    public final boolean e0(int i10, long j3) {
        org.telegram.ui.ActionBar.p2 p2Var;
        SpannableStringBuilder replaceSingleTag;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (p2Var = this.f28747a) != null) {
            ac acVar = new ac(i10, p2Var);
            if (j3 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i10 <= 1) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new bi.f0(20));
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new bi.f0(20));
                }
                acVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                acVar.f29000b.setText(replaceSingleTag);
                acVar.f29000b.setSingleLine(false);
                acVar.f29000b.setMaxLines(2);
                pc b10 = b(acVar, 3500);
                acVar.setBulletin(b10);
                b10.f26089r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final pc f(int i10, Runnable runnable) {
        xb xbVar = new xb(W(), null);
        xbVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new tc(0, runnable), indexOf, indexOf2 - 1, 33);
        xbVar.f29000b.setText(valueOf);
        xbVar.f29000b.setSingleLine(false);
        xbVar.f29000b.setMaxLines(3);
        return b(xbVar, 5000);
    }

    public final pc g(String str, ArrayList arrayList) {
        oc ocVar = new oc(W(), this.f28749c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                ocVar.f25757a.setCount(i12);
                ocVar.f25757a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            ocVar.f25757a.setTranslationX(AndroidUtilities.dp(4.0f));
            ocVar.f25757a.setScaleX(1.2f);
            ocVar.f25757a.setScaleY(1.2f);
        } else {
            ocVar.f25757a.setScaleX(1.0f);
            ocVar.f25757a.setScaleY(1.0f);
        }
        ocVar.f25757a.a(false);
        ocVar.f25758b.setSingleLine(false);
        ocVar.f25758b.setMaxLines(2);
        ocVar.f25758b.setText(str);
        if (ocVar.f25758b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) ocVar.f25758b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) ocVar.f25758b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            ocVar.f25757a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(ocVar, 5000);
    }

    public final pc h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        SpannableStringBuilder spannableStringBuilder;
        r90 r90Var;
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
        org.telegram.ui.ActionBar.f6 f6Var = this.f28749c;
        if (indexOf >= 0) {
            r90Var = new r90(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), f6Var);
            spannableStringBuilder.setSpan(r90Var, indexOf, indexOf + 11, 33);
            int i12 = org.telegram.ui.ActionBar.j6.Hi;
            r90Var.a(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), 32), i0.a.k(org.telegram.ui.ActionBar.j6.v0(i12, f6Var), 72));
        } else {
            r90Var = null;
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
        ?? xbVar = new xb(W, f6Var);
        m90 m90Var = new m90(W, null);
        xbVar.d = m90Var;
        m90Var.setDisablePaddingsOffset(true);
        m90Var.setSingleLine();
        m90Var.setTypeface(Typeface.SANS_SERIF);
        m90Var.setTextSize(1, 15.0f);
        m90Var.setEllipsize(TextUtils.TruncateAt.END);
        m90Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        xbVar.f29000b.setVisibility(8);
        xbVar.addView(m90Var, w7.a6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i13 = org.telegram.ui.ActionBar.j6.Hi;
        xbVar.setTextColor(xbVar.getThemedColor(i13));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            xbVar.f28999a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, i13, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        xbVar.e(document, new String[i11]);
        xbVar.f29000b.setTextSize(1, 14.0f);
        xbVar.f29000b.setSingleLine(i11);
        xbVar.f29000b.setMaxLines(3);
        m90Var.setText(spannableStringBuilder);
        m90Var.setTextSize(1, 14.0f);
        m90Var.setSingleLine(i11);
        m90Var.setMaxLines(3);
        nc ncVar = new nc(W(), f6Var, true);
        ncVar.e(string);
        ncVar.f25483a = runnable;
        xbVar.setButton(ncVar);
        pc b10 = b(xbVar, 2750);
        if (r90Var != null) {
            tb tbVar = b10.e;
            if (tbVar instanceof vb) {
                r90Var.f26636b = ((vb) tbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new sc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final pc i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new pc();
        }
        xb xbVar = new xb(W(), null);
        xbVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        xbVar.f29000b.setText(str);
        return b(xbVar, 1500);
    }

    public final pc k(boolean z10) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new pc();
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f28749c;
        if (z10) {
            mc mcVar = new mc(W(), f6Var);
            mcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            mcVar.f25216b.setText(LocaleController.getString(R.string.LinkCopied));
            mcVar.f25217c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
            return b(mcVar, 2750);
        }
        xb xbVar = new xb(W(), f6Var);
        xbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        xbVar.f29000b.setText(LocaleController.getString(R.string.LinkCopied));
        return b(xbVar, 1500);
    }

    public final pc m(vc vcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.f6 f6Var) {
        xb xbVar;
        String string;
        if (i11 != 0 && i12 != 0) {
            xbVar = new xb(i11, i12, W(), f6Var);
        } else {
            xbVar = new xb(W(), f6Var);
        }
        uc ucVar = vcVar.d;
        xbVar.d(ucVar.f27646a, ucVar.f27647b);
        TextView textView = xbVar.f29000b;
        String str = vcVar.f27914a;
        if (vcVar.f27916c) {
            string = LocaleController.formatPluralString(str, i10, new Object[0]);
        } else {
            string = LocaleController.getString(str, vcVar.f27915b);
        }
        textView.setText(AndroidUtilities.replaceSingleTag(string, new bi.f0(21)));
        int i13 = vcVar.d.f27648c;
        if (i13 != 0) {
            xbVar.setIconPaddingBottom(i13);
        }
        return b(xbVar, 1500);
    }

    public final pc n(vc vcVar, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        return m(vcVar, i10, 0, 0, f6Var);
    }

    public final pc o(vc vcVar, org.telegram.ui.ActionBar.f6 f6Var) {
        return m(vcVar, 1, 0, 0, f6Var);
    }

    public final pc p(long j3, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f28749c;
        kc kcVar = new kc(W, f6Var);
        p5 p5Var = new p5(1, UserConfig.selectedAccount, j3);
        w9 w9Var = kcVar.f24693a;
        w9Var.setAnimatedEmojiDrawable(p5Var);
        w9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var), PorterDuff.Mode.SRC_IN));
        kcVar.f24694b.setText(str);
        kcVar.f24695c.setText(str2);
        return b(kcVar, 2750);
    }

    public final pc q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f28749c;
        xb xbVar = new xb(W, f6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            xbVar.f28999a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        xbVar.e(document, new String[0]);
        if (xbVar.f28999a.getImageReceiver() != null) {
            xbVar.f28999a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        xbVar.f29000b.setText(charSequence);
        xbVar.f29000b.setTextSize(1, 14.0f);
        xbVar.f29000b.setSingleLine(false);
        xbVar.f29000b.setMaxLines(3);
        nc ncVar = new nc(W(), f6Var, true);
        ncVar.e(str);
        ncVar.f25483a = runnable;
        xbVar.setButton(ncVar);
        return b(xbVar, 2750);
    }

    public final pc r(TLRPC.Document document, String str) {
        xb xbVar = new xb(W(), this.f28749c);
        if (MessageObject.isTextColorEmoji(document)) {
            xbVar.f28999a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        xbVar.e(document, new String[0]);
        xbVar.f29000b.setText(str);
        xbVar.f29000b.setTextSize(1, 14.0f);
        xbVar.f29000b.setSingleLine(false);
        xbVar.f29000b.setMaxLines(3);
        return b(xbVar, 2750);
    }

    public final pc s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i10;
        mc mcVar = new mc(W(), this.f28749c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        kj0 kj0Var = mcVar.f25215a;
        if (isTextColorEmoji) {
            kj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        kj0Var.setAutoRepeat(true);
        kj0Var.g(36, 36, document);
        mcVar.f25216b.setText(str);
        mcVar.f25217c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(mcVar, i10);
    }

    public final pc t(CharSequence charSequence, org.telegram.ui.ActionBar.f6 f6Var) {
        xb xbVar = new xb(W(), f6Var);
        xbVar.d(R.raw.chats_infotip, new String[0]);
        xbVar.f29000b.setText(charSequence);
        xbVar.f29000b.setSingleLine(false);
        xbVar.f29000b.setMaxLines(2);
        return b(xbVar, 1500);
    }

    public final pc u(String str, String str2, org.telegram.ui.ActionBar.f6 f6Var) {
        mc mcVar = new mc(W(), f6Var);
        mcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        mcVar.f25216b.setText(str);
        mcVar.f25217c.setText(str2);
        return b(mcVar, 1500);
    }

    public final pc w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f28749c;
        xb xbVar = new xb(W, f6Var);
        xbVar.setBackground(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Fi, f6Var), 12);
        xbVar.f28999a.setImageResource(i10);
        xbVar.f29000b.setText(charSequence);
        xbVar.f29000b.setSingleLine(false);
        xbVar.f29000b.setLines(2);
        xbVar.f29000b.setMaxLines(4);
        TextView textView = xbVar.f29000b;
        textView.setMaxWidth(bi.x4.a(textView.getText(), xbVar.f29000b.getPaint()));
        xbVar.f29000b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) xbVar.f29000b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        xbVar.setWrapWidth();
        return b(xbVar, 5000);
    }

    public final pc y(int i10, TLRPC.Document document, fg.n nVar) {
        String string;
        Context W = W();
        org.telegram.ui.ActionBar.f6 f6Var = this.f28749c;
        xb xbVar = new xb(W, f6Var);
        xbVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        xbVar.removeView(xbVar.f29000b);
        x5 x5Var = new x5(xbVar.getContext());
        xbVar.f29000b = x5Var;
        x5Var.setTypeface(Typeface.SANS_SERIF);
        xbVar.f29000b.setTextSize(1, 15.0f);
        xbVar.f29000b.setEllipsize(TextUtils.TruncateAt.END);
        xbVar.f29000b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new y5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = xbVar.f29000b;
        if (i10 > 1) {
            string = LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]);
        } else {
            string = LocaleController.getString(R.string.SavedTagMessageTagged);
        }
        textView.setText(new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) spannableString));
        if (nVar != null) {
            nc ncVar = new nc(W(), f6Var, true);
            ncVar.e(LocaleController.getString(R.string.ViewAction));
            ncVar.f25483a = nVar;
            xbVar.setButton(ncVar);
        }
        xbVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Hi, f6Var));
        xbVar.addView(xbVar.f29000b, w7.a6.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(xbVar, 2750);
    }

    public wc(FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var) {
        this.f28748b = frameLayout;
        this.f28747a = null;
        this.f28749c = f6Var;
    }
}
