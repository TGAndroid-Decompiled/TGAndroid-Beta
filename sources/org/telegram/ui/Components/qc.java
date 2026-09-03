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
public final class qc {
    public final org.telegram.ui.ActionBar.p2 f30378a;
    public final FrameLayout f30379b;
    public final org.telegram.ui.ActionBar.g6 f30380c;

    public qc(org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var != null && p2Var.getLastStoryViewer() != null && p2Var.getLastStoryViewer().attachedToParent()) {
            this.f30378a = null;
            oh.f4 currentPeerView = p2Var.getLastStoryViewer().f17279k0.getCurrentPeerView();
            this.f30379b = currentPeerView != null ? currentPeerView.Z0 : null;
            this.f30380c = p2Var.getLastStoryViewer().f17306y;
            return;
        }
        this.f30378a = p2Var;
        this.f30379b = null;
        this.f30380c = p2Var != null ? p2Var.getResourceProvider() : null;
    }

    public static ic A(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        if (z4) {
            i10 = 3;
        } else {
            i10 = 4;
        }
        return z(p2Var, i10, 0, g6Var);
    }

    public static ic B(org.telegram.ui.ActionBar.p2 p2Var, boolean z4, dg.u1 u1Var, org.telegram.ui.re reVar, org.telegram.ui.ActionBar.g6 g6Var) {
        int i10;
        String str;
        int i11;
        int i12;
        qb qbVar = new qb(p2Var.getParentActivity(), g6Var);
        if (z4) {
            i10 = R.raw.ic_pin;
        } else {
            i10 = R.raw.ic_unpin;
        }
        qbVar.c(i10, 28, 28, "Pin", "Line");
        TextView textView = qbVar.f30375b;
        if (z4) {
            str = "MessagePinnedHint";
        } else {
            str = "MessageUnpinnedHint";
        }
        if (z4) {
            i11 = R.string.MessagePinnedHint;
        } else {
            i11 = R.string.MessageUnpinnedHint;
        }
        textView.setText(LocaleController.getString(str, i11));
        if (!z4) {
            gc gcVar = new gc(p2Var.getParentActivity(), g6Var, true);
            gcVar.f27139a = u1Var;
            gcVar.f27140b = reVar;
            qbVar.setButton(gcVar);
        }
        if (z4) {
            i12 = 1500;
        } else {
            i12 = 5000;
        }
        return ic.g(p2Var, qbVar, i12);
    }

    public static ic C(org.telegram.ui.ActionBar.p2 p2Var, String str) {
        qb qbVar = new qb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        qbVar.d(R.raw.ic_admin, "Shield");
        qbVar.f30375b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserSetAsAdminHint", R.string.UserSetAsAdminHint, str)));
        return ic.g(p2Var, qbVar, 1500);
    }

    public static ic D(org.telegram.ui.ActionBar.p2 p2Var, TLRPC.User user, String str) {
        String str2;
        qb qbVar = new qb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        qbVar.d(R.raw.ic_ban, "Hand");
        if (user.deleted) {
            str2 = LocaleController.formatString("HiddenName", R.string.HiddenName, new Object[0]);
        } else {
            str2 = user.first_name;
        }
        qbVar.f30375b.setText(AndroidUtilities.replaceTags(LocaleController.formatString("UserRemovedFromChatHint", R.string.UserRemovedFromChatHint, str2, str)));
        return ic.g(p2Var, qbVar, 1500);
    }

    public static ic F(FrameLayout frameLayout, boolean z4) {
        pc pcVar;
        qc qcVar = new qc(frameLayout, null);
        if (z4) {
            pcVar = pc.h;
        } else {
            pcVar = pc.f30028e;
        }
        return qcVar.m(pcVar, 1, -115203550, -1, null);
    }

    public static ic S(int i10, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        String string;
        qb qbVar = new qb(p2Var.getParentActivity(), g6Var);
        boolean z4 = true;
        if (i10 != 0) {
            if (i10 == 1) {
                string = LocaleController.getString(R.string.SoundOffHint);
                z4 = false;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            string = LocaleController.getString(R.string.SoundOnHint);
        }
        if (z4) {
            qbVar.d(R.raw.sound_on, new String[0]);
        } else {
            qbVar.d(R.raw.sound_off, new String[0]);
        }
        qbVar.f30375b.setText(string);
        return ic.g(p2Var, qbVar, 1500);
    }

    public static qc X() {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return new qc(cb.a(ApplicationLoader.applicationContext), null);
        }
        Dialog dialog = U.visibleDialog;
        if (dialog instanceof org.telegram.ui.ActionBar.h3) {
            return new qc(((org.telegram.ui.ActionBar.h3) dialog).container, U.getResourceProvider());
        }
        return a0(U);
    }

    public static qc Z(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var) {
        return new qc(frameLayout, g6Var);
    }

    public static boolean a(org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var != null && p2Var.getParentActivity() != null && p2Var.getLayoutContainer() != null) {
            return true;
        }
        return false;
    }

    public static qc a0(org.telegram.ui.ActionBar.p2 p2Var) {
        if (p2Var == null) {
            return X();
        }
        return new qc(p2Var);
    }

    public static void b0(TLRPC.TL_error tL_error) {
        if (LaunchActivity.f34135z1) {
            if (tL_error != null && tL_error.code == 406) {
                return;
            }
            X().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).j();
        }
    }

    public static ic d(org.telegram.ui.ActionBar.p2 p2Var, boolean z4) {
        String string;
        qb qbVar = new qb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        if (z4) {
            qbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            qbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        qbVar.f30375b.setText(AndroidUtilities.replaceTags(string));
        return ic.g(p2Var, qbVar, 1500);
    }

    public static ic j(org.telegram.ui.ActionBar.p2 p2Var) {
        return a0(p2Var).k(false);
    }

    public static ic l(String str, org.telegram.ui.ActionBar.p2 p2Var, boolean z4) {
        int i10;
        String string;
        int i11;
        int i12;
        qb qbVar = new qb(p2Var.getParentActivity(), p2Var.getResourceProvider());
        if (str != null) {
            if (z4) {
                i12 = R.string.DisableSharingToastDisabledPending;
            } else {
                i12 = R.string.DisableSharingToastEnabledPending;
            }
            string = LocaleController.formatString(i12, str);
        } else {
            if (z4) {
                i10 = R.string.DisableSharingToastDisabled;
            } else {
                i10 = R.string.DisableSharingToastEnabled;
            }
            string = LocaleController.getString(i10);
        }
        qbVar.f30375b.setText(AndroidUtilities.replaceTags(string));
        if (!z4 && str == null) {
            i11 = R.raw.contact_check;
        } else {
            i11 = R.raw.e_hand_2;
        }
        qbVar.d(i11, new String[0]);
        return ic.g(p2Var, qbVar, 5000);
    }

    public static ic v(Context context, org.telegram.ui.ActionBar.p2 p2Var, FrameLayout frameLayout, int i10, long j10, int i11, int i12, int i13, int i14, boolean z4, i5.v vVar) {
        org.telegram.ui.ActionBar.g6 g6Var;
        qb qbVar;
        boolean z10;
        org.telegram.ui.mp mpVar;
        SpannableStringBuilder replaceTags;
        ic g10;
        org.telegram.ui.ActionBar.g6 g6Var2;
        int i15;
        int i16;
        jc jcVar;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && p2Var != null && i10 <= 1 && j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId && !z4) {
            qbVar = new tb(i11, p2Var);
        } else {
            if (p2Var != null) {
                g6Var = p2Var.getResourceProvider();
            } else {
                g6Var = null;
            }
            qbVar = new qb(i12, i13, context, g6Var);
        }
        qb qbVar2 = qbVar;
        if (vVar == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean[] zArr = {false};
        if (vVar != null) {
            mpVar = new org.telegram.ui.mp(10, zArr, vVar);
        } else {
            mpVar = null;
        }
        if (i10 <= 1) {
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i11 <= 1) {
                    String string = LocaleController.getString(R.string.FwdMessageToSavedMessages);
                    if (z4) {
                        jcVar = new jc(2);
                    } else {
                        jcVar = new jc(0);
                    }
                    replaceTags = AndroidUtilities.replaceSingleTag(string, -1, 2, jcVar);
                } else {
                    replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new jc(0));
                }
                qbVar2.c(R.raw.saved_messages, 30, 30, new String[0]);
            } else {
                i5.v vVar2 = new i5.v(mpVar, p2Var, j10, 18);
                if (DialogObject.isChatDialog(j10)) {
                    TLRPC.Chat chat = MessagesController.getInstance(UserConfig.selectedAccount).getChat(Long.valueOf(-j10));
                    if (i11 <= 1) {
                        if (p2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title), -1, 2, vVar2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessageToGroup, chat.title));
                        }
                    } else if (p2Var != null) {
                        replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title), -1, 2, vVar2);
                    } else {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.FwdMessagesToGroup, chat.title));
                    }
                } else {
                    TLRPC.User user = MessagesController.getInstance(UserConfig.selectedAccount).getUser(Long.valueOf(j10));
                    if (i11 <= 1) {
                        if (z10) {
                            i16 = R.string.FwdMessageToUserShort;
                        } else {
                            i16 = R.string.FwdMessageToUser;
                        }
                        if (p2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i16, UserObject.getFirstName(user)), -1, 2, vVar2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i16, UserObject.getFirstName(user)));
                        }
                    } else {
                        if (z10) {
                            i15 = R.string.FwdMessagesToUserShort;
                        } else {
                            i15 = R.string.FwdMessagesToUser;
                        }
                        if (p2Var != null) {
                            replaceTags = AndroidUtilities.replaceSingleTag(LocaleController.formatString(i15, UserObject.getFirstName(user)), -1, 2, vVar2);
                        } else {
                            replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i15, UserObject.getFirstName(user)));
                        }
                    }
                }
                qbVar2.c(R.raw.forward, 30, 30, new String[0]);
            }
        } else {
            if (i11 <= 1) {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessageToManyChats", i10, new Object[0]));
            } else {
                replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("FwdMessagesToManyChats", i10, new Object[0]));
            }
            qbVar2.c(R.raw.forward, 30, 30, new String[0]);
        }
        qbVar2.f30375b.setText(replaceTags);
        if (z10) {
            Context context2 = qbVar2.getContext();
            if (p2Var != null) {
                g6Var2 = p2Var.getResourceProvider();
            } else {
                g6Var2 = null;
            }
            gc gcVar = new gc(context2, g6Var2, true, true);
            gcVar.f27139a = null;
            gcVar.f27140b = mpVar;
            qbVar2.setButton(gcVar);
        }
        qbVar2.postDelayed(new kc(qbVar2, 1), 300);
        if (frameLayout != null) {
            g10 = ic.f(frameLayout, qbVar2, i14);
        } else if (p2Var != null) {
            g10 = ic.g(p2Var, qbVar2, i14);
        } else {
            throw new IllegalArgumentException();
        }
        if (qbVar2 instanceof tb) {
            qbVar2.f30375b.setSingleLine(false);
            qbVar2.f30375b.setMaxLines(2);
            ((tb) qbVar2).setBulletin(g10);
            g10.f27786r = false;
        }
        return g10;
    }

    public static org.telegram.ui.Components.ic x(android.app.Activity r4, android.widget.FrameLayout r5, int r6, long r7, int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qc.x(android.app.Activity, android.widget.FrameLayout, int, long, int, int):org.telegram.ui.Components.ic");
    }

    public static org.telegram.ui.Components.ic z(org.telegram.ui.ActionBar.p2 r5, int r6, int r7, org.telegram.ui.ActionBar.g6 r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qc.z(org.telegram.ui.ActionBar.p2, int, int, org.telegram.ui.ActionBar.g6):org.telegram.ui.Components.ic");
    }

    public final ic E(org.telegram.ui.ActionBar.g6 g6Var) {
        qb qbVar = new qb(W(), g6Var);
        qbVar.d(R.raw.chats_infotip, new String[0]);
        qbVar.f30375b.setText(LocaleController.getString(R.string.ReportChatSent));
        return b(qbVar, 1500);
    }

    public final ic G(int i10, int i11, CharSequence charSequence) {
        int i12;
        SpannableStringBuilder spannableStringBuilder;
        qb qbVar = new qb(W(), this.f30380c);
        qbVar.c(i10, 36, 36, new String[0]);
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
        qbVar.f30375b.setSingleLine(false);
        qbVar.f30375b.setMaxLines(i11);
        qbVar.f30375b.setText(charSequence);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(qbVar, i12);
    }

    public final ic H(int i10, CharSequence charSequence) {
        return Q(i10, 36, charSequence);
    }

    public final ic I(int i10, CharSequence charSequence, CharSequence charSequence2, int i11, boolean z4, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.f30380c;
        qb qbVar = new qb(W, g6Var);
        if (i10 != 0) {
            qbVar.c(i10, 36, 36, new String[0]);
        } else {
            qbVar.f30374a.setVisibility(4);
            ((ViewGroup.MarginLayoutParams) qbVar.f30375b.getLayoutParams()).leftMargin = AndroidUtilities.dp(16.0f);
        }
        qbVar.f30375b.setTextSize(1, 14.0f);
        qbVar.f30375b.setTextDirection(5);
        qbVar.f30375b.setSingleLine(false);
        qbVar.f30375b.setMaxLines(3);
        qbVar.f30375b.setText(charSequence);
        gc gcVar = new gc(W(), g6Var, true, z4);
        gcVar.e(charSequence2);
        gcVar.f27139a = runnable;
        qbVar.setButton(gcVar);
        return b(qbVar, i11);
    }

    public final ic J(int i10, CharSequence charSequence, String str, Runnable runnable) {
        int i11;
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return I(i10, charSequence, str, i11, false, runnable);
    }

    public final ic K(int i10, String str, CharSequence charSequence, String str2, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.f30380c;
        fc fcVar = new fc(W, g6Var);
        fcVar.c(i10, 36, 36, new String[0]);
        fcVar.f26861b.setText(str);
        fcVar.f26862c.setText(charSequence);
        gc gcVar = new gc(W(), g6Var, true);
        gcVar.e(str2);
        gcVar.f27139a = runnable;
        fcVar.setButton(gcVar);
        return b(fcVar, 5000);
    }

    public final ic L(Drawable drawable, CharSequence charSequence) {
        qb qbVar = new qb(W(), this.f30380c);
        qbVar.f30374a.setImageDrawable(drawable);
        if (drawable instanceof org.telegram.ui.ip0) {
            ((org.telegram.ui.ip0) drawable).e(qbVar.f30374a);
        }
        qbVar.f30375b.setText(charSequence);
        qbVar.f30375b.setSingleLine(false);
        qbVar.f30375b.setMaxLines(2);
        return b(qbVar, 2750);
    }

    public final ic M(CharSequence charSequence, CharSequence charSequence2, int i10) {
        int i11;
        fc fcVar = new fc(W(), this.f30380c);
        fcVar.c(i10, 36, 36, new String[0]);
        fcVar.f26861b.setText(charSequence);
        fcVar.f26862c.setText(charSequence2);
        if (charSequence2.length() + charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(fcVar, i11);
    }

    public final ic N(String str, String str2) {
        fc fcVar = new fc(W(), this.f30380c);
        fcVar.f26860a.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) fcVar.d.getLayoutParams()).setMarginStart(AndroidUtilities.dp(10.0f));
        fcVar.f26861b.setText(str);
        fcVar.f26862c.setText(str2);
        return b(fcVar, 5000);
    }

    public final ic O(TLRPC.Document document, String str, String str2) {
        int i10;
        if (document == null) {
            return new ic();
        }
        ec ecVar = new ec(W(), this.f30380c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        p9 p9Var = ecVar.f26544a;
        p9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        p9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ecVar.f26545b;
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setTextSize(1, 15.0f);
        textView.setMaxLines(1);
        textView.setTypeface(AndroidUtilities.bold());
        TextView textView2 = ecVar.f26546c;
        textView2.setText(str2);
        textView2.setSingleLine(false);
        textView2.setMaxLines(5);
        if (str2.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(ecVar, i10);
    }

    public final ic P(int i10, CharSequence charSequence) {
        int i11;
        qb qbVar = new qb(W(), this.f30380c);
        qbVar.c(i10, 36, 36, new String[0]);
        qbVar.f30375b.setText(charSequence);
        qbVar.f30375b.setSingleLine(false);
        qbVar.f30375b.setTextSize(1, 14.0f);
        qbVar.f30375b.setMaxLines(4);
        if (charSequence.length() < 20) {
            i11 = 1500;
        } else {
            i11 = 2750;
        }
        return b(qbVar, i11);
    }

    public final ic Q(int i10, int i11, CharSequence charSequence) {
        int i12;
        qb qbVar = new qb(W(), this.f30380c);
        qbVar.c(i10, i11, i11, new String[0]);
        qbVar.f30375b.setText(charSequence);
        qbVar.f30375b.setSingleLine(false);
        qbVar.f30375b.setMaxLines(2);
        if (charSequence.length() < 20) {
            i12 = 1500;
        } else {
            i12 = 2750;
        }
        return b(qbVar, i12);
    }

    public final ic R(TLRPC.Document document, SpannableStringBuilder spannableStringBuilder) {
        int i10;
        if (document == null) {
            return new ic();
        }
        ec ecVar = new ec(W(), this.f30380c);
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, null, false);
        ImageLocation forDocument = ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(28.0f), true, closestPhotoSizeWithSize, true), document);
        ImageLocation forDocument2 = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
        p9 p9Var = ecVar.f26544a;
        p9Var.k(forDocument, "28_28", forDocument2, "28_28", 0L, null, null, 0);
        p9Var.getImageReceiver().setRoundRadius(AndroidUtilities.dp(5.0f));
        TextView textView = ecVar.f26545b;
        textView.setSingleLine(false);
        textView.setText(spannableStringBuilder);
        textView.setTextSize(1, 14.0f);
        textView.setMaxLines(3);
        textView.setTypeface(null);
        ecVar.f26546c.setVisibility(8);
        if (spannableStringBuilder.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(ecVar, i10);
    }

    public final ic T(String str) {
        qb qbVar = new qb(W(), null);
        qbVar.d(R.raw.contact_check, new String[0]);
        qbVar.f30375b.setText(str);
        qbVar.f30375b.setSingleLine(false);
        qbVar.f30375b.setMaxLines(2);
        return b(qbVar, 1500);
    }

    public final ic U(String str, boolean z4, Runnable runnable, Runnable runnable2) {
        fc fcVar;
        boolean isEmpty = TextUtils.isEmpty(null);
        org.telegram.ui.ActionBar.g6 g6Var = this.f30380c;
        if (!isEmpty) {
            fc fcVar2 = new fc(W(), g6Var);
            fcVar2.f26861b.setText(str);
            fcVar2.f26862c.setText((CharSequence) null);
            fcVar = fcVar2;
        } else {
            qb qbVar = new qb(W(), g6Var);
            qbVar.f30375b.setText(str);
            qbVar.f30375b.setSingleLine(false);
            qbVar.f30375b.setMaxLines(2);
            fcVar = qbVar;
        }
        fcVar.setTimer();
        gc gcVar = new gc(W(), g6Var, true, z4);
        gcVar.e(LocaleController.getString(R.string.UndoNoCaps));
        gcVar.f27139a = runnable;
        gcVar.f27140b = runnable2;
        fcVar.setButton(gcVar);
        return b(fcVar, 5000);
    }

    public final ic V(List list, CharSequence charSequence, CharSequence charSequence2, n7.qa qaVar) {
        boolean z4;
        float f10;
        int i10;
        Context W = W();
        if (charSequence2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f30380c;
        hc hcVar = new hc(W, g6Var, z4);
        if (list != null) {
            int i11 = 0;
            i10 = 0;
            for (int i12 = 3; i11 < list.size() && i10 < i12; i12 = 3) {
                TLObject tLObject = (TLObject) list.get(i11);
                if (tLObject != null) {
                    int i13 = i10 + 1;
                    hcVar.f27464a.setCount(i13);
                    hcVar.f27464a.b(i10, tLObject, UserConfig.selectedAccount);
                    i10 = i13;
                }
                i11++;
            }
            f10 = 4.0f;
            if (list.size() == 1) {
                hcVar.f27464a.setTranslationX(AndroidUtilities.dp(4.0f));
                hcVar.f27464a.setScaleX(1.2f);
                hcVar.f27464a.setScaleY(1.2f);
            } else {
                hcVar.f27464a.setScaleX(1.0f);
                hcVar.f27464a.setScaleY(1.0f);
            }
        } else {
            f10 = 4.0f;
            i10 = 0;
        }
        hcVar.f27464a.a(false);
        if (charSequence2 != null) {
            hcVar.f27465b.setSingleLine(true);
            hcVar.f27465b.setMaxLines(1);
            hcVar.f27465b.setText(charSequence);
            hcVar.f27466c.setText(charSequence2);
            hcVar.f27466c.setSingleLine(false);
            hcVar.f27466c.setMaxLines(3);
            if (hcVar.d.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    dp += AndroidUtilities.dp(f10);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) hcVar.d.getLayoutParams()).rightMargin = dp;
                } else {
                    ((ViewGroup.MarginLayoutParams) hcVar.d.getLayoutParams()).leftMargin = dp;
                }
            }
        } else {
            hcVar.f27465b.setSingleLine(false);
            hcVar.f27465b.setMaxLines(4);
            hcVar.f27465b.setText(charSequence);
            if (hcVar.f27465b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
                int dp2 = AndroidUtilities.dp(70 - ((3 - i10) * 12));
                if (i10 == 1) {
                    hcVar.f27465b.setTranslationY(-AndroidUtilities.dp(1.0f));
                    dp2 += AndroidUtilities.dp(f10);
                }
                if (LocaleController.isRTL) {
                    ((ViewGroup.MarginLayoutParams) hcVar.f27465b.getLayoutParams()).rightMargin = dp2;
                } else {
                    ((ViewGroup.MarginLayoutParams) hcVar.f27465b.getLayoutParams()).leftMargin = dp2;
                }
            }
        }
        if (qaVar != null) {
            gc gcVar = new gc(W(), g6Var, true);
            gcVar.e(LocaleController.getString(R.string.UndoNoCaps));
            gcVar.f27139a = (Runnable) qaVar.f15701b;
            gcVar.f27140b = (Runnable) qaVar.f15702c;
            hcVar.setButton(gcVar);
        }
        return b(hcVar, 5000);
    }

    public final Context W() {
        Context context;
        org.telegram.ui.ActionBar.p2 p2Var = this.f30378a;
        if (p2Var != null) {
            context = p2Var.getParentActivity();
            if (context == null && this.f30378a.getLayoutContainer() != null) {
                context = this.f30378a.getLayoutContainer().getContext();
            }
        } else {
            FrameLayout frameLayout = this.f30379b;
            context = frameLayout != null ? frameLayout.getContext() : null;
        }
        if (context == null) {
            return ApplicationLoader.applicationContext;
        }
        return context;
    }

    public final ic Y(TLRPC.TL_error tL_error) {
        if (!LaunchActivity.f34135z1) {
            return new ic();
        }
        if (tL_error == null) {
            return t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
        }
        return t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
    }

    public final ic b(eb ebVar, int i10) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f30378a;
        if (p2Var != null) {
            return ic.g(p2Var, ebVar, i10);
        }
        return ic.f(this.f30379b, ebVar, i10);
    }

    public final ic c(CharSequence charSequence) {
        if (W() == null) {
            return new ic();
        }
        qb qbVar = new qb(W(), this.f30380c);
        qbVar.d(R.raw.ic_admin, "Shield");
        qbVar.f30375b.setSingleLine(false);
        qbVar.f30375b.setMaxLines(3);
        qbVar.f30375b.setText(charSequence);
        return b(qbVar, 2750);
    }

    public final void c0(String str, boolean z4) {
        if (!LaunchActivity.f34135z1) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ic t6 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
            t6.f27786r = false;
            t6.k(z4);
            return;
        }
        ic t9 = t(LocaleController.formatString(R.string.UnknownErrorCode, str), null);
        t9.f27786r = false;
        t9.k(z4);
    }

    public final void d0(TLRPC.TL_error tL_error, boolean z4) {
        if (LaunchActivity.f34135z1) {
            if (tL_error == null) {
                ic t6 = t(LocaleController.formatString(R.string.UnknownError, new Object[0]), null);
                t6.f27786r = false;
                t6.k(z4);
            } else if (tL_error.code != 406) {
                ic t9 = t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null);
                t9.f27786r = false;
                t9.k(z4);
            }
        }
    }

    public final ic e(boolean z4) {
        String string;
        qb qbVar = new qb(W(), this.f30380c);
        if (z4) {
            qbVar.d(R.raw.ic_ban, "Hand");
            string = LocaleController.getString(R.string.UserBlocked);
        } else {
            qbVar.d(R.raw.ic_unban, "Main", "Finger 1", "Finger 2", "Finger 3", "Finger 4");
            string = LocaleController.getString(R.string.UserUnblocked);
        }
        qbVar.f30375b.setText(AndroidUtilities.replaceTags(string));
        return b(qbVar, 1500);
    }

    public final boolean e0(int i10, long j10) {
        org.telegram.ui.ActionBar.p2 p2Var;
        SpannableStringBuilder replaceSingleTag;
        if (UserConfig.getInstance(UserConfig.selectedAccount).isPremium() && (p2Var = this.f30378a) != null) {
            tb tbVar = new tb(i10, p2Var);
            if (j10 == UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                if (i10 <= 1) {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessageToSavedMessages), -1, 2, new jc(0));
                } else {
                    replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.FwdMessagesToSavedMessages), -1, 2, new jc(0));
                }
                tbVar.c(R.raw.saved_messages, 36, 36, new String[0]);
                tbVar.f30375b.setText(replaceSingleTag);
                tbVar.f30375b.setSingleLine(false);
                tbVar.f30375b.setMaxLines(2);
                ic b10 = b(tbVar, 3500);
                tbVar.setBulletin(b10);
                b10.f27786r = false;
                b10.k(true);
                return true;
            }
        }
        return false;
    }

    public final ic f(int i10, Runnable runnable) {
        qb qbVar = new qb(W(), null);
        qbVar.d(R.raw.caption_limit, new String[0]);
        String formatPluralString = LocaleController.formatPluralString("ChannelCaptionLimitPremiumPromo", i10, new Object[0]);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(AndroidUtilities.replaceTags(formatPluralString));
        int indexOf = formatPluralString.indexOf(42);
        int i11 = indexOf + 1;
        int indexOf2 = formatPluralString.indexOf(42, i11);
        valueOf.replace(indexOf, indexOf2 + 1, (CharSequence) formatPluralString.substring(i11, indexOf2));
        valueOf.setSpan(new nc(0, runnable), indexOf, indexOf2 - 1, 33);
        qbVar.f30375b.setText(valueOf);
        qbVar.f30375b.setSingleLine(false);
        qbVar.f30375b.setMaxLines(3);
        return b(qbVar, 5000);
    }

    public final ic g(String str, ArrayList arrayList) {
        hc hcVar = new hc(W(), this.f30380c, false);
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size() && i10 < 3; i11++) {
            TLObject tLObject = (TLObject) arrayList.get(i11);
            if (tLObject != null) {
                int i12 = i10 + 1;
                hcVar.f27464a.setCount(i12);
                hcVar.f27464a.b(i10, tLObject, UserConfig.selectedAccount);
                i10 = i12;
            }
        }
        if (arrayList.size() == 1) {
            hcVar.f27464a.setTranslationX(AndroidUtilities.dp(4.0f));
            hcVar.f27464a.setScaleX(1.2f);
            hcVar.f27464a.setScaleY(1.2f);
        } else {
            hcVar.f27464a.setScaleX(1.0f);
            hcVar.f27464a.setScaleY(1.0f);
        }
        hcVar.f27464a.a(false);
        hcVar.f27465b.setSingleLine(false);
        hcVar.f27465b.setMaxLines(2);
        hcVar.f27465b.setText(str);
        if (hcVar.f27465b.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dp = AndroidUtilities.dp(74 - ((3 - i10) * 12));
            if (LocaleController.isRTL) {
                ((ViewGroup.MarginLayoutParams) hcVar.f27465b.getLayoutParams()).rightMargin = dp;
            } else {
                ((ViewGroup.MarginLayoutParams) hcVar.f27465b.getLayoutParams()).leftMargin = dp;
            }
        }
        if (LocaleController.isRTL) {
            hcVar.f27464a.setTranslationX(AndroidUtilities.dp(32 - ((i10 - 1) * 12)));
        }
        return b(hcVar, 5000);
    }

    public final ic h(TLRPC.Document document, int i10, final Utilities.Callback callback) {
        SpannableStringBuilder spannableStringBuilder;
        l90 l90Var;
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f30380c;
        if (indexOf >= 0) {
            l90Var = new l90(null, AndroidUtilities.dp(100.0f), AndroidUtilities.dp(2.0f), g6Var);
            spannableStringBuilder.setSpan(l90Var, indexOf, indexOf + 11, 33);
            int i12 = org.telegram.ui.ActionBar.k6.Hi;
            l90Var.a(i0.a.k(org.telegram.ui.ActionBar.k6.v0(i12, g6Var), 32), i0.a.k(org.telegram.ui.ActionBar.k6.v0(i12, g6Var), 72));
        } else {
            l90Var = null;
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
        ?? qbVar = new qb(W, g6Var);
        g90 g90Var = new g90(W, null);
        qbVar.d = g90Var;
        g90Var.setDisablePaddingsOffset(true);
        g90Var.setSingleLine();
        g90Var.setTypeface(Typeface.SANS_SERIF);
        g90Var.setTextSize(1, 15.0f);
        g90Var.setEllipsize(TextUtils.TruncateAt.END);
        g90Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        qbVar.f30375b.setVisibility(8);
        qbVar.addView(g90Var, k7.c6.i(-2.0f, -2.0f, 8388627, 56.0f, 0.0f, 8.0f, 0.0f));
        int i13 = org.telegram.ui.ActionBar.k6.Hi;
        qbVar.setTextColor(qbVar.getThemedColor(i13));
        if (MessageObject.isTextColorEmoji(document)) {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
            qbVar.f30374a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i13, false), PorterDuff.Mode.SRC_IN));
        } else {
            inputStickerSet = inputStickerSet2;
            i11 = 0;
        }
        qbVar.e(document, new String[i11]);
        qbVar.f30375b.setTextSize(1, 14.0f);
        qbVar.f30375b.setSingleLine(i11);
        qbVar.f30375b.setMaxLines(3);
        g90Var.setText(spannableStringBuilder);
        g90Var.setTextSize(1, 14.0f);
        g90Var.setSingleLine(i11);
        g90Var.setMaxLines(3);
        gc gcVar = new gc(W(), g6Var, true);
        gcVar.e(string);
        gcVar.f27139a = runnable;
        qbVar.setButton(gcVar);
        ic b10 = b(qbVar, 2750);
        if (l90Var != null) {
            nb nbVar = b10.f27774e;
            if (nbVar instanceof pb) {
                l90Var.f28698b = ((pb) nbVar).d;
            }
        }
        MediaDataController.getInstance(UserConfig.selectedAccount).getStickerSet(inputStickerSet, null, false, new mc(i10, b10, currentTimeMillis));
        return b10;
    }

    public final ic i(String str) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new ic();
        }
        qb qbVar = new qb(W(), null);
        qbVar.c(R.raw.copy, 36, 36, "NULL ROTATION", "Back", "Front");
        qbVar.f30375b.setText(str);
        return b(qbVar, 1500);
    }

    public final ic k(boolean z4) {
        if (!AndroidUtilities.shouldShowClipboardToast()) {
            return new ic();
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f30380c;
        if (z4) {
            fc fcVar = new fc(W(), g6Var);
            fcVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
            fcVar.f26861b.setText(LocaleController.getString(R.string.LinkCopied));
            fcVar.f26862c.setText(LocaleController.getString(R.string.LinkCopiedPrivateInfo));
            return b(fcVar, 2750);
        }
        qb qbVar = new qb(W(), g6Var);
        qbVar.c(R.raw.voip_invite, 36, 36, "Wibe", "Circle");
        qbVar.f30375b.setText(LocaleController.getString(R.string.LinkCopied));
        return b(qbVar, 1500);
    }

    public final ic m(pc pcVar, int i10, int i11, int i12, org.telegram.ui.ActionBar.g6 g6Var) {
        qb qbVar;
        String string;
        if (i11 != 0 && i12 != 0) {
            qbVar = new qb(i11, i12, W(), g6Var);
        } else {
            qbVar = new qb(W(), g6Var);
        }
        oc ocVar = pcVar.d;
        qbVar.d(ocVar.f29730a, ocVar.f29731b);
        TextView textView = qbVar.f30375b;
        String str = pcVar.f30036a;
        if (pcVar.f30038c) {
            string = LocaleController.formatPluralString(str, i10, new Object[0]);
        } else {
            string = LocaleController.getString(str, pcVar.f30037b);
        }
        textView.setText(AndroidUtilities.replaceSingleTag(string, new jc(1)));
        int i13 = pcVar.d.f29732c;
        if (i13 != 0) {
            qbVar.setIconPaddingBottom(i13);
        }
        return b(qbVar, 1500);
    }

    public final ic n(pc pcVar, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        return m(pcVar, i10, 0, 0, g6Var);
    }

    public final ic o(pc pcVar, org.telegram.ui.ActionBar.g6 g6Var) {
        return m(pcVar, 1, 0, 0, g6Var);
    }

    public final ic p(long j10, String str, String str2) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.f30380c;
        dc dcVar = new dc(W, g6Var);
        l5 l5Var = new l5(1, UserConfig.selectedAccount, j10);
        p9 p9Var = dcVar.f26249a;
        p9Var.setAnimatedEmojiDrawable(l5Var);
        p9Var.setEmojiColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var), PorterDuff.Mode.SRC_IN));
        dcVar.f26250b.setText(str);
        dcVar.f26251c.setText(str2);
        return b(dcVar, 2750);
    }

    public final ic q(TLRPC.Document document, CharSequence charSequence, String str, Runnable runnable) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.f30380c;
        qb qbVar = new qb(W, g6Var);
        if (MessageObject.isTextColorEmoji(document)) {
            qbVar.f30374a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        qbVar.e(document, new String[0]);
        if (qbVar.f30374a.getImageReceiver() != null) {
            qbVar.f30374a.getImageReceiver().setRoundRadius(AndroidUtilities.dp(4.0f));
        }
        qbVar.f30375b.setText(charSequence);
        qbVar.f30375b.setTextSize(1, 14.0f);
        qbVar.f30375b.setSingleLine(false);
        qbVar.f30375b.setMaxLines(3);
        gc gcVar = new gc(W(), g6Var, true);
        gcVar.e(str);
        gcVar.f27139a = runnable;
        qbVar.setButton(gcVar);
        return b(qbVar, 2750);
    }

    public final ic r(TLRPC.Document document, String str) {
        qb qbVar = new qb(W(), this.f30380c);
        if (MessageObject.isTextColorEmoji(document)) {
            qbVar.f30374a.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        qbVar.e(document, new String[0]);
        qbVar.f30375b.setText(str);
        qbVar.f30375b.setTextSize(1, 14.0f);
        qbVar.f30375b.setSingleLine(false);
        qbVar.f30375b.setMaxLines(3);
        return b(qbVar, 2750);
    }

    public final ic s(TLRPC.Document document, String str, CharSequence charSequence) {
        int i10;
        fc fcVar = new fc(W(), this.f30380c);
        boolean isTextColorEmoji = MessageObject.isTextColorEmoji(document);
        kj0 kj0Var = fcVar.f26860a;
        if (isTextColorEmoji) {
            kj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.Hi, false), PorterDuff.Mode.SRC_IN));
        }
        kj0Var.setAutoRepeat(true);
        kj0Var.g(36, 36, document);
        fcVar.f26861b.setText(str);
        fcVar.f26862c.setText(charSequence);
        if (charSequence.length() + str.length() < 20) {
            i10 = 1500;
        } else {
            i10 = 2750;
        }
        return b(fcVar, i10);
    }

    public final ic t(CharSequence charSequence, org.telegram.ui.ActionBar.g6 g6Var) {
        qb qbVar = new qb(W(), g6Var);
        qbVar.d(R.raw.chats_infotip, new String[0]);
        qbVar.f30375b.setText(charSequence);
        qbVar.f30375b.setSingleLine(false);
        qbVar.f30375b.setMaxLines(2);
        return b(qbVar, 1500);
    }

    public final ic u(String str, String str2, org.telegram.ui.ActionBar.g6 g6Var) {
        fc fcVar = new fc(W(), g6Var);
        fcVar.c(R.raw.chats_infotip, 32, 32, new String[0]);
        fcVar.f26861b.setText(str);
        fcVar.f26862c.setText(str2);
        return b(fcVar, 1500);
    }

    public final ic w(int i10, CharSequence charSequence) {
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.f30380c;
        qb qbVar = new qb(W, g6Var);
        qbVar.setBackground(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Fi, g6Var), 12);
        qbVar.f30374a.setImageResource(i10);
        qbVar.f30375b.setText(charSequence);
        qbVar.f30375b.setSingleLine(false);
        qbVar.f30375b.setLines(2);
        qbVar.f30375b.setMaxLines(4);
        TextView textView = qbVar.f30375b;
        textView.setMaxWidth(qh.e3.a(textView.getText(), qbVar.f30375b.getPaint()));
        qbVar.f30375b.setLineSpacing(AndroidUtilities.dp(1.33f), 1.0f);
        ((ViewGroup.MarginLayoutParams) qbVar.f30375b.getLayoutParams()).rightMargin = AndroidUtilities.dp(12.0f);
        qbVar.setWrapWidth();
        return b(qbVar, 5000);
    }

    public final ic y(int i10, TLRPC.Document document, j3.v vVar) {
        String string;
        Context W = W();
        org.telegram.ui.ActionBar.g6 g6Var = this.f30380c;
        qb qbVar = new qb(W, g6Var);
        qbVar.c(R.raw.tag_icon_3, 36, 36, new String[0]);
        qbVar.removeView(qbVar.f30375b);
        t5 t5Var = new t5(qbVar.getContext());
        qbVar.f30375b = t5Var;
        t5Var.setTypeface(Typeface.SANS_SERIF);
        qbVar.f30375b.setTextSize(1, 15.0f);
        qbVar.f30375b.setEllipsize(TextUtils.TruncateAt.END);
        qbVar.f30375b.setPadding(0, 0, 0, AndroidUtilities.dp(8.0f));
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20.0f));
        SpannableString spannableString = new SpannableString("d");
        spannableString.setSpan(new u5(document, textPaint.getFontMetricsInt()), 0, spannableString.length(), 33);
        TextView textView = qbVar.f30375b;
        if (i10 > 1) {
            string = LocaleController.formatPluralString("SavedTagMessagesTagged", i10, new Object[0]);
        } else {
            string = LocaleController.getString(R.string.SavedTagMessageTagged);
        }
        textView.setText(new SpannableStringBuilder(string).append((CharSequence) " ").append((CharSequence) spannableString));
        if (vVar != null) {
            gc gcVar = new gc(W(), g6Var, true);
            gcVar.e(LocaleController.getString(R.string.ViewAction));
            gcVar.f27139a = vVar;
            qbVar.setButton(gcVar);
        }
        qbVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Hi, g6Var));
        qbVar.addView(qbVar.f30375b, k7.c6.i(-2.0f, -2.0f, 8388627, 56.0f, 2.0f, 8.0f, 0.0f));
        return b(qbVar, 2750);
    }

    public qc(FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f30379b = frameLayout;
        this.f30378a = null;
        this.f30380c = g6Var;
    }
}
