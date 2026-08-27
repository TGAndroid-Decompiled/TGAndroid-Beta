package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TopicsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

public final class dz0 extends org.telegram.ui.ActionBar.j {

    public final Context f37573a;

    public final ProfileActivity f37574b;

    public dz0(ProfileActivity profileActivity, Context context) {
        this.f37574b = profileActivity;
        this.f37573a = context;
    }

    @Override
    public final void b(int i10) {
        long jMakeEncryptedDialogId;
        String absolutePath;
        TL_bots.BotInfo botInfo;
        TLRPC.BotCommand botCommand;
        org.telegram.ui.Components.vr0 vr0Var;
        if (this.f37574b.getParentActivity() == null) {
            return;
        }
        if (i10 == -1) {
            ProfileActivity profileActivity = this.f37574b;
            hz0 hz0Var = profileActivity.K;
            if (hz0Var == null || (vr0Var = hz0Var.E0) == null || !vr0Var.f26522j0) {
                profileActivity.finishFragment();
                return;
            } else {
                profileActivity.R4();
                return;
            }
        }
        final int i11 = 2;
        boolean z10 = false;
        int i12 = 0;
        if (i10 == 2) {
            this.f37574b.n4(false);
            return;
        }
        final int i13 = 1;
        if (i10 == 1) {
            TLRPC.User user = this.f37574b.getMessagesController().getUser(Long.valueOf(this.f37574b.f35923a1));
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", user.f22527id);
            bundle.putBoolean("addContact", true);
            ProfileActivity profileActivity2 = this.f37574b;
            js jsVar = new js(bundle, profileActivity2.f36067v0);
            jsVar.K = new hx0(profileActivity2, user);
            profileActivity2.presentFragment(jsVar);
            return;
        }
        int i14 = 3;
        if (i10 == 3) {
            Bundle bundleE = org.telegram.messenger.y1.e(3, "onlySelect", "dialogsType", true);
            bundleE.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
            bundleE.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
            gy gyVar = new gy(bundleE);
            ProfileActivity profileActivity3 = this.f37574b;
            gyVar.f38621y2 = profileActivity3;
            profileActivity3.presentFragment(gyVar);
            return;
        }
        int i15 = 4;
        if (i10 == 4) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", this.f37574b.f35923a1);
            ProfileActivity profileActivity4 = this.f37574b;
            profileActivity4.presentFragment(new js(bundle2, profileActivity4.f36067v0));
            return;
        }
        int i16 = 15;
        if (i10 == 5) {
            TLRPC.User user2 = this.f37574b.getMessagesController().getUser(Long.valueOf(this.f37574b.f35923a1));
            if (user2 == null || this.f37574b.getParentActivity() == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f37574b.getParentActivity(), 0, this.f37574b.f36067v0);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteContact);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.AreYouSureDeleteContact);
            alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nl0(i16, this, user2));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            this.f37574b.showDialog(b2Var);
            TextView textView = (TextView) b2Var.d(-1);
            if (textView != null) {
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, this.f37574b.f36067v0));
                return;
            }
            return;
        }
        if (i10 == 7) {
            this.f37574b.i4(false);
            return;
        }
        if (i10 == 45) {
            this.f37574b.i4(true);
            return;
        }
        if (i10 == 46) {
            if (!this.f37574b.getUserConfig().isPremium()) {
                ProfileActivity profileActivity5 = this.f37574b;
                new ag.g2(profileActivity5, profileActivity5.getParentActivity(), ((org.telegram.ui.ActionBar.n2) this.f37574b).currentAccount, false, 41, false, null).show();
                return;
            }
            Context context = this.f37573a;
            org.telegram.ui.ActionBar.c6 c6Var = this.f37574b.f36067v0;
            ky0 ky0Var = new ky0(this, 1);
            Pattern pattern = org.telegram.ui.Components.y4.f34802a;
            if (context == null) {
                return;
            }
            boolean[] zArr = new boolean[1];
            org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, null, false, false);
            Runnable runnable = e3VarO.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            org.telegram.ui.Components.ri0 ri0Var = new org.telegram.ui.Components.ri0(context);
            linearLayout.addView(ri0Var, h7.z5.t(110, 110, 17, 0, 21, 0, 11));
            ri0Var.f(R.raw.raised_hand, 110, 110, null);
            ri0Var.setAutoRepeat(false);
            ri0Var.d();
            TextView textView2 = new TextView(context);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.DisableSharingInfoHeader));
            textView2.setTextSize(1, 20.0f);
            int i17 = org.telegram.ui.ActionBar.g6.G6;
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i17, c6Var));
            linearLayout.addView(textView2, h7.z5.t(-1, -2, 17, 20, 0, 20, 14));
            rv0 rv0Var = new rv0(context, c6Var);
            rv0Var.f42346a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
            rv0Var.f42347b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
            rv0Var.d.setVisibility(8);
            rv0Var.f42348c.setImageResource(R.drawable.menu_photo_off_24);
            rv0Var.f42348c.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i17, c6Var));
            linearLayout.addView(rv0Var, h7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            rv0 rv0Var2 = new rv0(context, c6Var);
            rv0Var2.f42346a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
            rv0Var2.f42347b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
            rv0Var2.d.setVisibility(8);
            rv0Var2.f42348c.setImageResource(R.drawable.menu_share_off_24);
            rv0Var2.f42348c.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i17, c6Var));
            linearLayout.addView(rv0Var2, h7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            rv0 rv0Var3 = new rv0(context, c6Var);
            rv0Var3.f42346a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
            rv0Var3.f42347b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
            rv0Var3.d.setVisibility(8);
            rv0Var3.f42348c.setImageResource(R.drawable.menu_download_off_24);
            rv0Var3.f42348c.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i17, c6Var));
            linearLayout.addView(rv0Var3, h7.z5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            lh.d dVar = new lh.d(context, c6Var, true);
            dVar.setOnClickListener(new org.telegram.ui.Components.q2(i14, zArr, runnable));
            dVar.e();
            dVar.g(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
            linearLayout.addView(dVar, h7.z5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            e3VarO.customView = linearLayout;
            e3VarO.show();
            e3VarO.setOnDismissListener(new yq(i14, zArr, ky0Var));
            return;
        }
        if (i10 == 47) {
            ProfileActivity profileActivity6 = this.f37574b;
            profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.f35923a1, 0, false, new lh.ia(z10, profileActivity6, i11));
            return;
        }
        if (i10 == 23) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f37574b.getParentActivity());
            alertDialog$Builder2.f22702a.N = LocaleController.getPluralString("DeleteTopics", 1);
            TopicsController topicsController = MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) this.f37574b).currentAccount).getTopicsController();
            ProfileActivity profileActivity7 = this.f37574b;
            TLRPC.TL_forumTopic tL_forumTopicFindTopic = topicsController.findTopic(profileActivity7.f35929b1, profileActivity7.f35937c1);
            final int i18 = 0;
            alertDialog$Builder2.f22702a.P = LocaleController.formatString("DeleteSelectedTopic", R.string.DeleteSelectedTopic, tL_forumTopicFindTopic == null ? "topic" : tL_forumTopicFindTopic.title);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {

                public final dz0 f36899b;

                {
                    this.f36899b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i19) {
                    boolean zIsEmpty;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i20 = i18;
                    dz0 dz0Var = this.f36899b;
                    switch (i20) {
                        case 0:
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            ProfileActivity profileActivity8 = dz0Var.f37574b;
                            arrayList.add(Integer.valueOf((int) profileActivity8.f35937c1));
                            profileActivity8.getMessagesController().getTopicsController().deleteTopics(profileActivity8.f35929b1, arrayList);
                            profileActivity8.F1 = 0;
                            if (((org.telegram.ui.ActionBar.n2) profileActivity8).parentLayout != null && ((org.telegram.ui.ActionBar.n2) profileActivity8).parentLayout.getFragmentStack() != null) {
                                for (int i21 = 0; i21 < ((org.telegram.ui.ActionBar.n2) profileActivity8).parentLayout.getFragmentStack().size(); i21++) {
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) ((org.telegram.ui.ActionBar.n2) profileActivity8).parentLayout.getFragmentStack().get(i21);
                                    if ((n2Var instanceof rn) && ((rn) n2Var).b() == profileActivity8.f35937c1) {
                                        n2Var.removeSelfFromStack();
                                    }
                                }
                            }
                            profileActivity8.finishFragment();
                            Activity parentActivity = profileActivity8.getParentActivity();
                            if (parentActivity != null) {
                                new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(parentActivity), profileActivity8.f36067v0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            b2Var2.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity9 = dz0Var.f37574b;
                            if (MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) profileActivity9).currentAccount).isFrozen()) {
                                b.b(((org.telegram.ui.ActionBar.n2) profileActivity9).currentAccount);
                            } else {
                                profileActivity9.f35960f1 = true;
                                profileActivity9.getSecretChatHelper().startSecretChat(profileActivity9.getParentActivity(), profileActivity9.getMessagesController().getUser(Long.valueOf(profileActivity9.f35923a1)));
                            }
                            break;
                        default:
                            ProfileActivity profileActivity10 = dz0Var.f37574b;
                            int realPosition = profileActivity10.f35987j0.getRealPosition();
                            TLRPC.Photo photoF = profileActivity10.f35987j0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity10.f36043r2;
                            if (profileActivity10.E2 == null || realPosition != 0) {
                                if (profileActivity10.f36005l5 && photoF != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.f22404id == photoF.f22404id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity10.getMessagesStorage().updateUserInfo(userFull, true);
                                    profileActivity10.i5(false);
                                }
                                if (profileActivity10.f35987j0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity10, true);
                                }
                                if (photoF == null || profileActivity10.f35987j0.getRealPosition() == 0) {
                                    TLRPC.Photo photoF2 = profileActivity10.f35987j0.F(1);
                                    if (photoF2 != null) {
                                        profileActivity10.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoF2.sizes, 90);
                                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photoF2.sizes, 1000);
                                        if (closestPhotoSizeWithSize != null && closestPhotoSizeWithSize2 != null) {
                                            profileActivity10.getUserConfig().getCurrentUser().photo.photo_small = closestPhotoSizeWithSize.location;
                                            profileActivity10.getUserConfig().getCurrentUser().photo.photo_big = closestPhotoSizeWithSize2.location;
                                        }
                                    } else {
                                        profileActivity10.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity10.getMessagesController().deleteUserPhoto(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.f22399id = photoF.f22404id;
                                    tL_inputPhoto.access_hash = photoF.access_hash;
                                    byte[] bArr = photoF.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity10.getMessagesController().deleteUserPhoto(tL_inputPhoto);
                                    profileActivity10.getMessagesStorage().clearUserPhoto(profileActivity10.f35923a1, photoF.f22404id);
                                }
                                my0 my0Var = profileActivity10.f35987j0;
                                ArrayList arrayList2 = my0Var.T0;
                                ArrayList arrayList3 = my0Var.R0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    zIsEmpty = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (dialogPhotos = my0Var.O0) == null) {
                                        arrayList3.remove(realPosition);
                                        my0Var.Q0.remove(realPosition);
                                        my0Var.P0.remove(realPosition);
                                        my0Var.S0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        my0Var.U0.remove(realPosition);
                                        my0Var.V0.remove(realPosition);
                                        my0Var.W0.remove(realPosition);
                                        my0Var.Z0.delete(realPosition);
                                        my0Var.X0.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            my0Var.L0 = (ImageLocation) arrayList2.get(0);
                                            my0Var.M0 = null;
                                            my0Var.N0 = null;
                                        }
                                        my0Var.f27451z0.g();
                                        zIsEmpty = arrayList3.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.f22404id);
                                        zIsEmpty = true;
                                    }
                                }
                                if (zIsEmpty || profileActivity10.f35987j0.getRealCount() <= 0) {
                                    profileActivity10.f35987j0.setVisibility(8);
                                    profileActivity10.f35922a0.setForegroundAlpha(1.0f);
                                    profileActivity10.U.setVisibility(0);
                                    profileActivity10.D0 = true;
                                    View viewM = profileActivity10.f35935c.m(0);
                                    if (viewM != null) {
                                        profileActivity10.f35921a.v0(0, viewM.getTop() - profileActivity10.T3(), org.telegram.ui.Components.er.h);
                                    }
                                }
                            } else {
                                profileActivity10.m0.c();
                                if (profileActivity10.O5 != 0) {
                                    profileActivity10.getConnectionsManager().cancelRequest(profileActivity10.O5, true);
                                }
                                profileActivity10.f35996k2 = (AndroidUtilities.isTablet() || profileActivity10.f35989j2 || !profileActivity10.f35922a0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity10.E2 = null;
                                profileActivity10.F2 = null;
                                my0 my0Var2 = profileActivity10.f35987j0;
                                my0Var2.D0 = true;
                                my0Var2.G0 = profileActivity10.G2;
                                my0Var2.f27443m1 = null;
                                my0Var2.f27444n1 = null;
                                my0Var2.setCreateThumbFromParent(false);
                                profileActivity10.i5(true);
                                profileActivity10.P4(false, true);
                                profileActivity10.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                                profileActivity10.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                profileActivity10.getUserConfig().saveConfig(true);
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new j70(12));
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
            b2Var2.show();
            TextView textView3 = (TextView) b2Var2.d(-1);
            if (textView3 != null) {
                textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23284q7, false));
                return;
            }
            return;
        }
        if (i10 == 24) {
            ProfileActivity profileActivity8 = this.f37574b;
            x21.L(profileActivity8.a(), profileActivity8);
            return;
        }
        if (i10 == 12) {
            ProfileActivity profileActivity9 = this.f37574b;
            if (profileActivity9.f36007m1) {
                profileActivity9.presentFragment(sd1.a0(profileActivity9.f35929b1, profileActivity9.f35937c1));
                return;
            }
            Bundle bundle3 = new Bundle();
            ProfileActivity profileActivity10 = this.f37574b;
            long j10 = profileActivity10.f35929b1;
            if (j10 != 0) {
                bundle3.putLong("chat_id", j10);
            } else if (profileActivity10.f36016n2) {
                bundle3.putLong("user_id", profileActivity10.f35923a1);
            }
            jo joVar = new jo(bundle3);
            ProfileActivity profileActivity11 = this.f37574b;
            TLRPC.ChatFull chatFull = profileActivity11.f36036q2;
            if (chatFull != null) {
                joVar.l0(chatFull);
            } else {
                joVar.m0(profileActivity11.f36043r2);
            }
            this.f37574b.presentFragment(joVar);
            return;
        }
        if (i10 == 41) {
            this.f37574b.presentFragment(new UserInfoActivity());
            return;
        }
        int i19 = 19;
        if (i10 == 9) {
            TLRPC.User user3 = this.f37574b.getMessagesController().getUser(Long.valueOf(this.f37574b.f35923a1));
            if (user3 == null) {
                return;
            }
            Bundle bundleE2 = org.telegram.messenger.y1.e(2, "onlySelect", "dialogsType", true);
            bundleE2.putBoolean("resetDelegate", false);
            bundleE2.putBoolean("closeFragment", false);
            gy gyVar2 = new gy(bundleE2);
            gyVar2.f38621y2 = new b7(this, user3, gyVar2, i19);
            this.f37574b.presentFragment(gyVar2);
            return;
        }
        if (i10 == 10) {
            this.f37574b.s4();
            return;
        }
        if (i10 == 14) {
            try {
                ProfileActivity profileActivity12 = this.f37574b;
                TLRPC.EncryptedChat encryptedChat = profileActivity12.f36095z2;
                if (encryptedChat != null) {
                    jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f22388id);
                } else {
                    jMakeEncryptedDialogId = profileActivity12.f35923a1;
                    if (jMakeEncryptedDialogId == 0) {
                        long j11 = profileActivity12.f35929b1;
                        if (j11 == 0) {
                            return;
                        } else {
                            jMakeEncryptedDialogId = -j11;
                        }
                    }
                }
                this.f37574b.getMediaDataController().installShortcut(jMakeEncryptedDialogId, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                return;
            } catch (Exception e9) {
                FileLog.e(e9);
                return;
            }
        }
        if (i10 == 15 || i10 == 16) {
            this.f37574b.o4(i10 == 16);
            return;
        }
        if (i10 == 17) {
            Bundle bundle4 = new Bundle();
            bundle4.putLong("chat_id", this.f37574b.f35929b1);
            bundle4.putInt("type", 2);
            bundle4.putBoolean("open_search", true);
            lr lrVar = new lr(bundle4);
            lrVar.x0(this.f37574b.f36036q2);
            this.f37574b.presentFragment(lrVar);
            return;
        }
        if (i10 == 18) {
            this.f37574b.v4();
            return;
        }
        if (i10 == 19) {
            this.f37574b.presentFragment(q91.d0(this.f37574b.getMessagesController().getChat(Long.valueOf(this.f37574b.f35929b1)), false));
            return;
        }
        if (i10 == 22) {
            this.f37574b.y4();
            return;
        }
        if (i10 == 38) {
            this.f37574b.p4();
            return;
        }
        if (i10 == 39) {
            Bundle bundleG = a9.p.g(2, "type");
            bundleG.putLong("dialog_id", -this.f37574b.f35929b1);
            org.telegram.ui.Components.o90 o90Var = new org.telegram.ui.Components.o90(bundleG, null);
            ProfileActivity profileActivity13 = this.f37574b;
            o90Var.f31238c = profileActivity13.f36036q2;
            profileActivity13.presentFragment(o90Var);
            return;
        }
        if (i10 == 20) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.f37574b.getParentActivity(), 0, this.f37574b.f36067v0);
            alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
            alertDialog$Builder3.f22702a.P = LocaleController.getString(R.string.AreYouSureSecretChat);
            alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.a2(this) {

                public final dz0 f36899b;

                {
                    this.f36899b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var3, int i110) {
                    boolean zIsEmpty;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i20 = i13;
                    dz0 dz0Var = this.f36899b;
                    switch (i20) {
                        case 0:
                            ArrayList<Integer> arrayList = new ArrayList<>();
                            ProfileActivity profileActivity14 = dz0Var.f37574b;
                            arrayList.add(Integer.valueOf((int) profileActivity14.f35937c1));
                            profileActivity14.getMessagesController().getTopicsController().deleteTopics(profileActivity14.f35929b1, arrayList);
                            profileActivity14.F1 = 0;
                            if (((org.telegram.ui.ActionBar.n2) profileActivity14).parentLayout != null && ((org.telegram.ui.ActionBar.n2) profileActivity14).parentLayout.getFragmentStack() != null) {
                                for (int i21 = 0; i21 < ((org.telegram.ui.ActionBar.n2) profileActivity14).parentLayout.getFragmentStack().size(); i21++) {
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) ((org.telegram.ui.ActionBar.n2) profileActivity14).parentLayout.getFragmentStack().get(i21);
                                    if ((n2Var instanceof rn) && ((rn) n2Var).b() == profileActivity14.f35937c1) {
                                        n2Var.removeSelfFromStack();
                                    }
                                }
                            }
                            profileActivity14.finishFragment();
                            Activity parentActivity = profileActivity14.getParentActivity();
                            if (parentActivity != null) {
                                new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(parentActivity), profileActivity14.f36067v0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            b2Var3.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity15 = dz0Var.f37574b;
                            if (MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) profileActivity15).currentAccount).isFrozen()) {
                                b.b(((org.telegram.ui.ActionBar.n2) profileActivity15).currentAccount);
                            } else {
                                profileActivity15.f35960f1 = true;
                                profileActivity15.getSecretChatHelper().startSecretChat(profileActivity15.getParentActivity(), profileActivity15.getMessagesController().getUser(Long.valueOf(profileActivity15.f35923a1)));
                            }
                            break;
                        default:
                            ProfileActivity profileActivity16 = dz0Var.f37574b;
                            int realPosition = profileActivity16.f35987j0.getRealPosition();
                            TLRPC.Photo photoF = profileActivity16.f35987j0.F(realPosition);
                            TLRPC.UserFull userFull = profileActivity16.f36043r2;
                            if (profileActivity16.E2 == null || realPosition != 0) {
                                if (profileActivity16.f36005l5 && photoF != null && userFull != null && (photo = userFull.fallback_photo) != null && photo.f22404id == photoF.f22404id) {
                                    userFull.fallback_photo = null;
                                    userFull.flags &= -4194305;
                                    profileActivity16.getMessagesStorage().updateUserInfo(userFull, true);
                                    profileActivity16.i5(false);
                                }
                                if (profileActivity16.f35987j0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity16, true);
                                }
                                if (photoF == null || profileActivity16.f35987j0.getRealPosition() == 0) {
                                    TLRPC.Photo photoF2 = profileActivity16.f35987j0.F(1);
                                    if (photoF2 != null) {
                                        profileActivity16.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoF2.sizes, 90);
                                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photoF2.sizes, 1000);
                                        if (closestPhotoSizeWithSize != null && closestPhotoSizeWithSize2 != null) {
                                            profileActivity16.getUserConfig().getCurrentUser().photo.photo_small = closestPhotoSizeWithSize.location;
                                            profileActivity16.getUserConfig().getCurrentUser().photo.photo_big = closestPhotoSizeWithSize2.location;
                                        }
                                    } else {
                                        profileActivity16.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity16.getMessagesController().deleteUserPhoto(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.f22399id = photoF.f22404id;
                                    tL_inputPhoto.access_hash = photoF.access_hash;
                                    byte[] bArr = photoF.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity16.getMessagesController().deleteUserPhoto(tL_inputPhoto);
                                    profileActivity16.getMessagesStorage().clearUserPhoto(profileActivity16.f35923a1, photoF.f22404id);
                                }
                                my0 my0Var = profileActivity16.f35987j0;
                                ArrayList arrayList2 = my0Var.T0;
                                ArrayList arrayList3 = my0Var.R0;
                                if (realPosition < 0 || realPosition >= arrayList3.size()) {
                                    zIsEmpty = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList3.get(realPosition);
                                    if (photo2 == null || (dialogPhotos = my0Var.O0) == null) {
                                        arrayList3.remove(realPosition);
                                        my0Var.Q0.remove(realPosition);
                                        my0Var.P0.remove(realPosition);
                                        my0Var.S0.remove(realPosition);
                                        arrayList2.remove(realPosition);
                                        my0Var.U0.remove(realPosition);
                                        my0Var.V0.remove(realPosition);
                                        my0Var.W0.remove(realPosition);
                                        my0Var.Z0.delete(realPosition);
                                        my0Var.X0.remove(realPosition);
                                        if (realPosition == 0 && !arrayList2.isEmpty()) {
                                            my0Var.L0 = (ImageLocation) arrayList2.get(0);
                                            my0Var.M0 = null;
                                            my0Var.N0 = null;
                                        }
                                        my0Var.f27451z0.g();
                                        zIsEmpty = arrayList3.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.f22404id);
                                        zIsEmpty = true;
                                    }
                                }
                                if (zIsEmpty || profileActivity16.f35987j0.getRealCount() <= 0) {
                                    profileActivity16.f35987j0.setVisibility(8);
                                    profileActivity16.f35922a0.setForegroundAlpha(1.0f);
                                    profileActivity16.U.setVisibility(0);
                                    profileActivity16.D0 = true;
                                    View viewM = profileActivity16.f35935c.m(0);
                                    if (viewM != null) {
                                        profileActivity16.f35921a.v0(0, viewM.getTop() - profileActivity16.T3(), org.telegram.ui.Components.er.h);
                                    }
                                }
                            } else {
                                profileActivity16.m0.c();
                                if (profileActivity16.O5 != 0) {
                                    profileActivity16.getConnectionsManager().cancelRequest(profileActivity16.O5, true);
                                }
                                profileActivity16.f35996k2 = (AndroidUtilities.isTablet() || profileActivity16.f35989j2 || !profileActivity16.f35922a0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity16.E2 = null;
                                profileActivity16.F2 = null;
                                my0 my0Var2 = profileActivity16.f35987j0;
                                my0Var2.D0 = true;
                                my0Var2.G0 = profileActivity16.G2;
                                my0Var2.f27443m1 = null;
                                my0Var2.f27444n1 = null;
                                my0Var2.setCreateThumbFromParent(false);
                                profileActivity16.i5(true);
                                profileActivity16.P4(false, true);
                                profileActivity16.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                                profileActivity16.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                profileActivity16.getUserConfig().saveConfig(true);
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
            this.f37574b.showDialog(alertDialog$Builder3.f22702a);
            return;
        }
        if (i10 == 44) {
            int i20 = ((org.telegram.ui.ActionBar.n2) this.f37574b).currentAccount;
            long j12 = this.f37574b.f35923a1;
            TLRPC.UserFull userFull = MessagesController.getInstance(i20).getUserFull(j12);
            if (userFull == null || (botInfo = userFull.bot_info) == null) {
                return;
            }
            String string = botInfo.privacy_policy_url;
            if (string == null && string == null) {
                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                int size = arrayList.size();
                do {
                    if (i12 >= size) {
                        string = LocaleController.getString(R.string.BotDefaultPrivacyPolicy);
                        break;
                    } else {
                        botCommand = arrayList.get(i12);
                        i12++;
                    }
                } while (!"privacy".equals(botCommand.command));
            }
            if (string != null) {
                we.e.s(ApplicationLoader.applicationContext, string);
                return;
            }
            org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
            if (n2VarU == null) {
                return;
            }
            if (!(n2VarU instanceof rn) || ((rn) n2VarU).a() != j12) {
                n2VarU.presentFragment(rn.R9(j12));
            }
            AndroidUtilities.runOnUIThread(new hh.c8(i20, j12), 150L);
            return;
        }
        if (i10 == 21) {
            if (this.f37574b.getParentActivity() == null) {
                return;
            }
            int i21 = Build.VERSION.SDK_INT;
            if (i21 >= 23 && ((i21 <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.f37574b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                this.f37574b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                return;
            }
            my0 my0Var = this.f37574b.f35987j0;
            ImageLocation imageLocationD = my0Var.D(my0Var.getRealPosition());
            if (imageLocationD == null) {
                return;
            }
            boolean z11 = imageLocationD.imageType == 2;
            File pathToAttach = FileLoader.getInstance(((org.telegram.ui.ActionBar.n2) this.f37574b).currentAccount).getPathToAttach(imageLocationD.location, z11 ? "mp4" : null, true);
            if (z11 && !pathToAttach.exists()) {
                pathToAttach = new File(FileLoader.getDirectory(0), FileLoader.getAttachFileName(imageLocationD.location, "mp4"));
            }
            if (pathToAttach.exists()) {
                MediaController.saveFile(pathToAttach.toString(), this.f37574b.getParentActivity(), 0, null, null, new hh.o6(i15, this, z11));
                return;
            }
            return;
        }
        if (i10 == 30) {
            this.f37574b.presentFragment(new UserInfoActivity());
            return;
        }
        if (i10 == 40) {
            ProfileActivity profileActivity14 = this.f37574b;
            ap0 ap0Var = new ap0();
            ap0Var.f36594x = this.f37574b;
            profileActivity14.presentFragment(ap0Var);
            return;
        }
        if (i10 == 42) {
            AndroidUtilities.addToClipboard(this.f37574b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(this.f37574b.getMessagesController().getUser(Long.valueOf(this.f37574b.f35923a1))));
            return;
        }
        if (i10 == 43) {
            this.f37574b.presentFragment(new na(null));
            return;
        }
        if (i10 == 31) {
            this.f37574b.presentFragment(new kg0(null));
            return;
        }
        if (i10 != 33) {
            if (i10 == 34) {
                if (MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) this.f37574b).currentAccount).isFrozen()) {
                    b.b(((org.telegram.ui.ActionBar.n2) this.f37574b).currentAccount);
                    return;
                }
                int realPosition = this.f37574b.f35987j0.getRealPosition();
                ImageLocation imageLocationD2 = this.f37574b.f35987j0.D(realPosition);
                if (imageLocationD2 == null) {
                    return;
                }
                FileLoader fileLoader = FileLoader.getInstance(((org.telegram.ui.ActionBar.n2) this.f37574b).currentAccount);
                Drawable[] drawableArr = PhotoViewer.P8;
                File pathToAttach2 = fileLoader.getPathToAttach(imageLocationD2.location, PhotoViewer.q1(imageLocationD2), true);
                boolean z12 = imageLocationD2.imageType == 2;
                if (z12) {
                    ImageLocation imageLocationG = this.f37574b.f35987j0.G(realPosition);
                    absolutePath = FileLoader.getInstance(((org.telegram.ui.ActionBar.n2) this.f37574b).currentAccount).getPathToAttach(imageLocationG == null ? null : imageLocationG.location, PhotoViewer.q1(imageLocationG), true).getAbsolutePath();
                } else {
                    absolutePath = null;
                }
                this.f37574b.m0.q(pathToAttach2.getAbsolutePath(), absolutePath, z12);
                return;
            }
            if (i10 != 35) {
                if (i10 == 36) {
                    this.f37574b.u4();
                    return;
                }
                return;
            }
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.f37574b.getParentActivity(), 0, this.f37574b.f36067v0);
            my0 my0Var2 = this.f37574b.f35987j0;
            ImageLocation imageLocationD3 = my0Var2.D(my0Var2.getRealPosition());
            if (imageLocationD3 == null) {
                return;
            }
            if (imageLocationD3.imageType == 2) {
                alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.AreYouSureDeleteVideo);
            } else {
                alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.AreYouSureDeletePhoto);
            }
            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {

                public final dz0 f36899b;

                {
                    this.f36899b = this;
                }

                @Override
                public final void f(org.telegram.ui.ActionBar.b2 b2Var3, int i110) {
                    boolean zIsEmpty;
                    MessagesController.DialogPhotos dialogPhotos;
                    TLRPC.Photo photo;
                    int i22 = i11;
                    dz0 dz0Var = this.f36899b;
                    switch (i22) {
                        case 0:
                            ArrayList<Integer> arrayList2 = new ArrayList<>();
                            ProfileActivity profileActivity15 = dz0Var.f37574b;
                            arrayList2.add(Integer.valueOf((int) profileActivity15.f35937c1));
                            profileActivity15.getMessagesController().getTopicsController().deleteTopics(profileActivity15.f35929b1, arrayList2);
                            profileActivity15.F1 = 0;
                            if (((org.telegram.ui.ActionBar.n2) profileActivity15).parentLayout != null && ((org.telegram.ui.ActionBar.n2) profileActivity15).parentLayout.getFragmentStack() != null) {
                                for (int i23 = 0; i23 < ((org.telegram.ui.ActionBar.n2) profileActivity15).parentLayout.getFragmentStack().size(); i23++) {
                                    org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) ((org.telegram.ui.ActionBar.n2) profileActivity15).parentLayout.getFragmentStack().get(i23);
                                    if ((n2Var instanceof rn) && ((rn) n2Var).b() == profileActivity15.f35937c1) {
                                        n2Var.removeSelfFromStack();
                                    }
                                }
                            }
                            profileActivity15.finishFragment();
                            Activity parentActivity = profileActivity15.getParentActivity();
                            if (parentActivity != null) {
                                new org.telegram.ui.Components.mc(org.telegram.ui.Components.ab.a(parentActivity), profileActivity15.f36067v0).Q(R.raw.ic_delete, 36, LocaleController.getPluralString("TopicsDeleted", 1)).j();
                            }
                            b2Var3.dismiss();
                            break;
                        case 1:
                            ProfileActivity profileActivity16 = dz0Var.f37574b;
                            if (MessagesController.getInstance(((org.telegram.ui.ActionBar.n2) profileActivity16).currentAccount).isFrozen()) {
                                b.b(((org.telegram.ui.ActionBar.n2) profileActivity16).currentAccount);
                            } else {
                                profileActivity16.f35960f1 = true;
                                profileActivity16.getSecretChatHelper().startSecretChat(profileActivity16.getParentActivity(), profileActivity16.getMessagesController().getUser(Long.valueOf(profileActivity16.f35923a1)));
                            }
                            break;
                        default:
                            ProfileActivity profileActivity17 = dz0Var.f37574b;
                            int realPosition2 = profileActivity17.f35987j0.getRealPosition();
                            TLRPC.Photo photoF = profileActivity17.f35987j0.F(realPosition2);
                            TLRPC.UserFull userFull2 = profileActivity17.f36043r2;
                            if (profileActivity17.E2 == null || realPosition2 != 0) {
                                if (profileActivity17.f36005l5 && photoF != null && userFull2 != null && (photo = userFull2.fallback_photo) != null && photo.f22404id == photoF.f22404id) {
                                    userFull2.fallback_photo = null;
                                    userFull2.flags &= -4194305;
                                    profileActivity17.getMessagesStorage().updateUserInfo(userFull2, true);
                                    profileActivity17.i5(false);
                                }
                                if (profileActivity17.f35987j0.getRealCount() == 1) {
                                    ProfileActivity.s3(profileActivity17, true);
                                }
                                if (photoF == null || profileActivity17.f35987j0.getRealPosition() == 0) {
                                    TLRPC.Photo photoF2 = profileActivity17.f35987j0.F(1);
                                    if (photoF2 != null) {
                                        profileActivity17.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhoto();
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoF2.sizes, 90);
                                        TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photoF2.sizes, 1000);
                                        if (closestPhotoSizeWithSize != null && closestPhotoSizeWithSize2 != null) {
                                            profileActivity17.getUserConfig().getCurrentUser().photo.photo_small = closestPhotoSizeWithSize.location;
                                            profileActivity17.getUserConfig().getCurrentUser().photo.photo_big = closestPhotoSizeWithSize2.location;
                                        }
                                    } else {
                                        profileActivity17.getUserConfig().getCurrentUser().photo = new TLRPC.TL_userProfilePhotoEmpty();
                                    }
                                    profileActivity17.getMessagesController().deleteUserPhoto(null);
                                } else {
                                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                                    tL_inputPhoto.f22399id = photoF.f22404id;
                                    tL_inputPhoto.access_hash = photoF.access_hash;
                                    byte[] bArr = photoF.file_reference;
                                    tL_inputPhoto.file_reference = bArr;
                                    if (bArr == null) {
                                        tL_inputPhoto.file_reference = new byte[0];
                                    }
                                    profileActivity17.getMessagesController().deleteUserPhoto(tL_inputPhoto);
                                    profileActivity17.getMessagesStorage().clearUserPhoto(profileActivity17.f35923a1, photoF.f22404id);
                                }
                                my0 my0Var3 = profileActivity17.f35987j0;
                                ArrayList arrayList3 = my0Var3.T0;
                                ArrayList arrayList4 = my0Var3.R0;
                                if (realPosition2 < 0 || realPosition2 >= arrayList4.size()) {
                                    zIsEmpty = false;
                                } else {
                                    TLRPC.Photo photo2 = (TLRPC.Photo) arrayList4.get(realPosition2);
                                    if (photo2 == null || (dialogPhotos = my0Var3.O0) == null) {
                                        arrayList4.remove(realPosition2);
                                        my0Var3.Q0.remove(realPosition2);
                                        my0Var3.P0.remove(realPosition2);
                                        my0Var3.S0.remove(realPosition2);
                                        arrayList3.remove(realPosition2);
                                        my0Var3.U0.remove(realPosition2);
                                        my0Var3.V0.remove(realPosition2);
                                        my0Var3.W0.remove(realPosition2);
                                        my0Var3.Z0.delete(realPosition2);
                                        my0Var3.X0.remove(realPosition2);
                                        if (realPosition2 == 0 && !arrayList3.isEmpty()) {
                                            my0Var3.L0 = (ImageLocation) arrayList3.get(0);
                                            my0Var3.M0 = null;
                                            my0Var3.N0 = null;
                                        }
                                        my0Var3.f27451z0.g();
                                        zIsEmpty = arrayList4.isEmpty();
                                    } else {
                                        dialogPhotos.removePhoto(photo2.f22404id);
                                        zIsEmpty = true;
                                    }
                                }
                                if (zIsEmpty || profileActivity17.f35987j0.getRealCount() <= 0) {
                                    profileActivity17.f35987j0.setVisibility(8);
                                    profileActivity17.f35922a0.setForegroundAlpha(1.0f);
                                    profileActivity17.U.setVisibility(0);
                                    profileActivity17.D0 = true;
                                    View viewM = profileActivity17.f35935c.m(0);
                                    if (viewM != null) {
                                        profileActivity17.f35921a.v0(0, viewM.getTop() - profileActivity17.T3(), org.telegram.ui.Components.er.h);
                                    }
                                }
                            } else {
                                profileActivity17.m0.c();
                                if (profileActivity17.O5 != 0) {
                                    profileActivity17.getConnectionsManager().cancelRequest(profileActivity17.O5, true);
                                }
                                profileActivity17.f35996k2 = (AndroidUtilities.isTablet() || profileActivity17.f35989j2 || !profileActivity17.f35922a0.getImageReceiver().hasNotThumb() || AndroidUtilities.isAccessibilityScreenReaderEnabled()) ? false : true;
                                profileActivity17.E2 = null;
                                profileActivity17.F2 = null;
                                my0 my0Var4 = profileActivity17.f35987j0;
                                my0Var4.D0 = true;
                                my0Var4.G0 = profileActivity17.G2;
                                my0Var4.f27443m1 = null;
                                my0Var4.f27444n1 = null;
                                my0Var4.setCreateThumbFromParent(false);
                                profileActivity17.i5(true);
                                profileActivity17.P4(false, true);
                                profileActivity17.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_ALL));
                                profileActivity17.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                profileActivity17.getUserConfig().saveConfig(true);
                            }
                            break;
                    }
                }
            });
            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.f22702a;
            this.f37574b.showDialog(b2Var3);
            TextView textView4 = (TextView) b2Var3.d(-1);
            if (textView4 != null) {
                textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, this.f37574b.f36067v0));
                return;
            }
            return;
        }
        int realPosition2 = this.f37574b.f35987j0.getRealPosition();
        TLRPC.Photo photoF = this.f37574b.f35987j0.F(realPosition2);
        if (photoF == null) {
            return;
        }
        my0 my0Var3 = this.f37574b.f35987j0;
        ArrayList arrayList2 = my0Var3.X0;
        ArrayList arrayList3 = my0Var3.W0;
        ArrayList arrayList4 = my0Var3.V0;
        ArrayList arrayList5 = my0Var3.U0;
        ArrayList arrayList6 = my0Var3.S0;
        ArrayList arrayList7 = my0Var3.Q0;
        ArrayList arrayList8 = my0Var3.T0;
        ArrayList arrayList9 = my0Var3.R0;
        MessagesController.DialogPhotos dialogPhotos = my0Var3.O0;
        if (dialogPhotos != null) {
            dialogPhotos.moveToStart(realPosition2);
        } else if (realPosition2 > 0 && realPosition2 < arrayList9.size()) {
            my0Var3.Y0++;
            TLRPC.Photo photo = (TLRPC.Photo) arrayList9.get(realPosition2);
            arrayList9.remove(realPosition2);
            arrayList9.add(0, photo);
            String str = (String) arrayList7.get(realPosition2);
            arrayList7.remove(realPosition2);
            arrayList7.add(0, str);
            ArrayList arrayList10 = my0Var3.P0;
            arrayList10.add(0, (String) arrayList10.remove(realPosition2));
            ImageLocation imageLocation = (ImageLocation) arrayList6.get(realPosition2);
            arrayList6.remove(realPosition2);
            arrayList6.add(0, imageLocation);
            ImageLocation imageLocation2 = (ImageLocation) arrayList8.get(realPosition2);
            arrayList8.remove(realPosition2);
            arrayList8.add(0, imageLocation2);
            ImageLocation imageLocation3 = (ImageLocation) arrayList5.get(realPosition2);
            arrayList5.remove(realPosition2);
            arrayList5.add(0, imageLocation3);
            org.telegram.ui.Components.w51 w51Var = (org.telegram.ui.Components.w51) arrayList4.get(realPosition2);
            arrayList4.remove(realPosition2);
            arrayList4.add(0, w51Var);
            Integer num = (Integer) arrayList3.get(realPosition2);
            arrayList3.remove(realPosition2);
            arrayList3.add(0, num);
            Float f10 = (Float) arrayList2.get(realPosition2);
            arrayList2.remove(realPosition2);
            arrayList2.add(0, f10);
            my0Var3.L0 = (ImageLocation) arrayList8.get(0);
        }
        TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
        TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
        tL_photos_updateProfilePhoto.f22512id = tL_inputPhoto;
        tL_inputPhoto.f22399id = photoF.f22404id;
        tL_inputPhoto.access_hash = photoF.access_hash;
        tL_inputPhoto.file_reference = photoF.file_reference;
        UserConfig userConfig = this.f37574b.getUserConfig();
        this.f37574b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new lr0(this, userConfig, photoF, 6));
        ProfileActivity profileActivity15 = this.f37574b;
        profileActivity15.I.m(profileActivity15.f35923a1, photoF.video_sizes.isEmpty() ? null : 1, 22);
        TLRPC.User user4 = this.f37574b.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(photoF.sizes, 800);
        if (user4 != null) {
            TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(photoF.sizes, 90);
            TLRPC.UserProfilePhoto userProfilePhoto = user4.photo;
            userProfilePhoto.photo_id = photoF.f22404id;
            userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
            userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
            userConfig.setCurrentUser(user4);
            userConfig.saveConfig(true);
            NotificationCenter.getInstance(((org.telegram.ui.ActionBar.n2) this.f37574b).currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
            this.f37574b.i5(true);
        }
        my0 my0Var4 = this.f37574b.f35987j0;
        my0Var4.f27451z0.g();
        my0Var4.L();
    }
}
