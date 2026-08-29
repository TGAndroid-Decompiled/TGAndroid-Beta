package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class dz0 extends org.telegram.ui.ActionBar.k {
    public final Context f37654a;
    public final ProfileActivity f37655b;

    public dz0(ProfileActivity profileActivity, Context context) {
        this.f37655b = profileActivity;
        this.f37654a = context;
    }

    @Override
    public final void b(int i10) {
        TLRPC.EncryptedChat encryptedChat;
        long j10;
        int i11;
        int i12;
        String str;
        int i13;
        TLObject tLObject;
        int i14;
        Object obj;
        int i15;
        boolean z10;
        int i16;
        int i17;
        TL_bots.BotInfo botInfo;
        int i18;
        String str2;
        Runnable runnable;
        int i19;
        org.telegram.ui.Components.fs0 fs0Var;
        if (this.f37655b.getParentActivity() != null) {
            if (i10 == -1) {
                ProfileActivity profileActivity = this.f37655b;
                hz0 hz0Var = profileActivity.K;
                if (hz0Var != null && (fs0Var = hz0Var.E0) != null && fs0Var.f26537j0) {
                    profileActivity.R4();
                    return;
                } else {
                    profileActivity.finishFragment();
                    return;
                }
            }
            boolean z11 = false;
            int i20 = 0;
            boolean z12 = false;
            if (i10 == 2) {
                this.f37655b.n4(false);
            } else if (i10 == 1) {
                TLRPC.User user = this.f37655b.getMessagesController().getUser(Long.valueOf(this.f37655b.f35986a1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f22539id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f37655b;
                hs hsVar = new hs(bundle, profileActivity2.f36129v0);
                hsVar.K = new fx0(profileActivity2, user);
                profileActivity2.presentFragment(hsVar);
            } else if (i10 == 3) {
                Bundle e10 = org.telegram.messenger.x3.e(3, "onlySelect", "dialogsType", true);
                e10.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
                e10.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
                fy fyVar = new fy(e10);
                ProfileActivity profileActivity3 = this.f37655b;
                fyVar.f38379y2 = profileActivity3;
                profileActivity3.presentFragment(fyVar);
            } else if (i10 == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f37655b.f35986a1);
                ProfileActivity profileActivity4 = this.f37655b;
                profileActivity4.presentFragment(new hs(bundle2, profileActivity4.f36129v0));
            } else {
                String str3 = null;
                if (i10 == 5) {
                    TLRPC.User user2 = this.f37655b.getMessagesController().getUser(Long.valueOf(this.f37655b.f35986a1));
                    if (user2 != null && this.f37655b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f37655b.getParentActivity(), 0, this.f37655b.f36129v0);
                        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new kl0(15, this, user2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                        this.f37655b.showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, this.f37655b.f36129v0));
                        }
                    }
                } else if (i10 == 7) {
                    this.f37655b.i4(false);
                } else if (i10 == 45) {
                    this.f37655b.i4(true);
                } else if (i10 == 46) {
                    if (!this.f37655b.getUserConfig().isPremium()) {
                        ProfileActivity profileActivity5 = this.f37655b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i19 = ((org.telegram.ui.ActionBar.o2) this.f37655b).currentAccount;
                        new cg.p1(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f37654a;
                    org.telegram.ui.ActionBar.c6 c6Var = this.f37655b.f36129v0;
                    ky0 ky0Var = new ky0(this, 1);
                    Pattern pattern = org.telegram.ui.Components.c5.f27308a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, null, false, false);
                        runnable = q6.dismissRunnable;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, i7.f6.t(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(R.raw.raised_hand, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(AndroidUtilities.bold());
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.getString(R.string.DisableSharingInfoHeader));
                        textView2.setTextSize(1, 20.0f);
                        int i21 = org.telegram.ui.ActionBar.g6.G6;
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i21, c6Var));
                        linearLayout.addView(textView2, i7.f6.t(-1, -2, 17, 20, 0, 20, 14));
                        qv0 qv0Var = new qv0(context, c6Var);
                        qv0Var.f41784a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
                        qv0Var.f41785b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
                        qv0Var.d.setVisibility(8);
                        qv0Var.f41786c.setImageResource(R.drawable.menu_photo_off_24);
                        qv0Var.f41786c.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i21, c6Var));
                        linearLayout.addView(qv0Var, i7.f6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        qv0 qv0Var2 = new qv0(context, c6Var);
                        qv0Var2.f41784a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
                        qv0Var2.f41785b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
                        qv0Var2.d.setVisibility(8);
                        qv0Var2.f41786c.setImageResource(R.drawable.menu_share_off_24);
                        qv0Var2.f41786c.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i21, c6Var));
                        linearLayout.addView(qv0Var2, i7.f6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        qv0 qv0Var3 = new qv0(context, c6Var);
                        qv0Var3.f41784a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
                        qv0Var3.f41785b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
                        qv0Var3.d.setVisibility(8);
                        qv0Var3.f41786c.setImageResource(R.drawable.menu_download_off_24);
                        qv0Var3.f41786c.setColorFilter(org.telegram.ui.ActionBar.g6.v0(i21, c6Var));
                        linearLayout.addView(qv0Var3, i7.f6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        nh.d dVar = new nh.d(context, c6Var, true);
                        dVar.setOnClickListener(new org.telegram.ui.Components.t2(3, zArr, runnable));
                        dVar.e();
                        dVar.g(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
                        linearLayout.addView(dVar, i7.f6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        q6.customView = linearLayout;
                        q6.show();
                        q6.setOnDismissListener(new org.telegram.ui.Components.z2(0, zArr, ky0Var));
                    }
                } else if (i10 == 47) {
                    ProfileActivity profileActivity6 = this.f37655b;
                    profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.f35986a1, 0, false, new nh.w9(false, profileActivity6, 1));
                } else if (i10 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f37655b.getParentActivity());
                    alertDialog$Builder2.f22714a.N = LocaleController.getPluralString("DeleteTopics", 1);
                    i18 = ((org.telegram.ui.ActionBar.o2) this.f37655b).currentAccount;
                    TopicsController topicsController = MessagesController.getInstance(i18).getTopicsController();
                    ProfileActivity profileActivity7 = this.f37655b;
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.f35993b1, profileActivity7.f36001c1);
                    int i22 = R.string.DeleteSelectedTopic;
                    if (findTopic == null) {
                        str2 = "topic";
                    } else {
                        str2 = findTopic.title;
                    }
                    alertDialog$Builder2.f22714a.P = LocaleController.formatString("DeleteSelectedTopic", i22, str2);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                        public final dz0 f36946b;

                        {
                            this.f36946b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.c2 r11, int r12) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bz0.g(org.telegram.ui.ActionBar.c2, int):void");
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new xx0(1));
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                    c2Var2.show();
                    TextView textView3 = (TextView) c2Var2.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23295q7, false));
                    }
                } else if (i10 == 24) {
                    ProfileActivity profileActivity8 = this.f37655b;
                    y21.K(profileActivity8.a(), profileActivity8);
                } else if (i10 == 12) {
                    ProfileActivity profileActivity9 = this.f37655b;
                    if (profileActivity9.f36069m1) {
                        profileActivity9.presentFragment(td1.a0(profileActivity9.f35993b1, profileActivity9.f36001c1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f37655b;
                    long j11 = profileActivity10.f35993b1;
                    if (j11 != 0) {
                        bundle3.putLong("chat_id", j11);
                    } else if (profileActivity10.f36078n2) {
                        bundle3.putLong("user_id", profileActivity10.f35986a1);
                    }
                    ko koVar = new ko(bundle3);
                    ProfileActivity profileActivity11 = this.f37655b;
                    TLRPC.ChatFull chatFull = profileActivity11.f36099q2;
                    if (chatFull != null) {
                        koVar.l0(chatFull);
                    } else {
                        koVar.m0(profileActivity11.f36106r2);
                    }
                    this.f37655b.presentFragment(koVar);
                } else if (i10 == 41) {
                    this.f37655b.presentFragment(new UserInfoActivity());
                } else if (i10 == 9) {
                    TLRPC.User user3 = this.f37655b.getMessagesController().getUser(Long.valueOf(this.f37655b.f35986a1));
                    if (user3 != null) {
                        Bundle e11 = org.telegram.messenger.x3.e(2, "onlySelect", "dialogsType", true);
                        e11.putBoolean("resetDelegate", false);
                        e11.putBoolean("closeFragment", false);
                        fy fyVar2 = new fy(e11);
                        fyVar2.f38379y2 = new z6(this, user3, fyVar2, 19);
                        this.f37655b.presentFragment(fyVar2);
                    }
                } else if (i10 == 10) {
                    this.f37655b.s4();
                } else if (i10 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f37655b;
                        if (profileActivity12.f36157z2 != null) {
                            j10 = DialogObject.makeEncryptedDialogId(encryptedChat.f22400id);
                        } else {
                            j10 = profileActivity12.f35986a1;
                            if (j10 == 0) {
                                long j12 = profileActivity12.f35993b1;
                                if (j12 != 0) {
                                    j10 = -j12;
                                } else {
                                    return;
                                }
                            }
                        }
                        this.f37655b.getMediaDataController().installShortcut(j10, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                } else if (i10 != 15 && i10 != 16) {
                    if (i10 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f37655b.f35993b1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        jr jrVar = new jr(bundle4);
                        jrVar.x0(this.f37655b.f36099q2);
                        this.f37655b.presentFragment(jrVar);
                    } else if (i10 == 18) {
                        this.f37655b.v4();
                    } else if (i10 == 19) {
                        this.f37655b.presentFragment(t91.d0(this.f37655b.getMessagesController().getChat(Long.valueOf(this.f37655b.f35993b1)), false));
                    } else if (i10 == 22) {
                        this.f37655b.y4();
                    } else if (i10 == 38) {
                        this.f37655b.p4();
                    } else if (i10 == 39) {
                        Bundle h = a4.w.h(2, "type");
                        h.putLong("dialog_id", -this.f37655b.f35993b1);
                        org.telegram.ui.Components.y90 y90Var = new org.telegram.ui.Components.y90(h, null);
                        ProfileActivity profileActivity13 = this.f37655b;
                        y90Var.f34996c = profileActivity13.f36099q2;
                        profileActivity13.presentFragment(y90Var);
                    } else if (i10 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.f37655b.getParentActivity(), 0, this.f37655b.f36129v0);
                        alertDialog$Builder3.f22714a.N = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
                        alertDialog$Builder3.f22714a.P = LocaleController.getString(R.string.AreYouSureSecretChat);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.b2(this) {
                            public final dz0 f36946b;

                            {
                                this.f36946b = this;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 r11, int r12) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bz0.g(org.telegram.ui.ActionBar.c2, int):void");
                            }
                        });
                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                        this.f37655b.showDialog(alertDialog$Builder3.f22714a);
                    } else if (i10 == 44) {
                        i17 = ((org.telegram.ui.ActionBar.o2) this.f37655b).currentAccount;
                        long j13 = this.f37655b.f35986a1;
                        TLRPC.UserFull userFull = MessagesController.getInstance(i17).getUserFull(j13);
                        if (userFull != null && (botInfo = userFull.bot_info) != null) {
                            String str4 = botInfo.privacy_policy_url;
                            if (str4 == null && str4 == null) {
                                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                                int size = arrayList.size();
                                while (true) {
                                    if (i20 < size) {
                                        TLRPC.BotCommand botCommand = arrayList.get(i20);
                                        i20++;
                                        if ("privacy".equals(botCommand.command)) {
                                            break;
                                        }
                                    } else {
                                        str4 = LocaleController.getString(R.string.BotDefaultPrivacyPolicy);
                                        break;
                                    }
                                }
                            }
                            if (str4 != null) {
                                ye.d.s(ApplicationLoader.applicationContext, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                            if (U != null) {
                                if (!(U instanceof tn) || ((tn) U).a() != j13) {
                                    U.presentFragment(tn.R9(j13));
                                }
                                AndroidUtilities.runOnUIThread(new jh.a8(i17, j13), 150L);
                            }
                        }
                    } else if (i10 == 21) {
                        if (this.f37655b.getParentActivity() != null) {
                            int i23 = Build.VERSION.SDK_INT;
                            if (i23 >= 23 && ((i23 <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.f37655b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                                this.f37655b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            my0 my0Var = this.f37655b.f36049j0;
                            ImageLocation D = my0Var.D(my0Var.getRealPosition());
                            if (D != null) {
                                if (D.imageType == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i16 = ((org.telegram.ui.ActionBar.o2) this.f37655b).currentAccount;
                                FileLoader fileLoader = FileLoader.getInstance(i16);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = D.location;
                                if (z10) {
                                    str3 = "mp4";
                                }
                                File pathToAttach = fileLoader.getPathToAttach(tL_fileLocationToBeDeprecated, str3, true);
                                if (z10 && !pathToAttach.exists()) {
                                    pathToAttach = new File(FileLoader.getDirectory(0), FileLoader.getAttachFileName(D.location, "mp4"));
                                }
                                if (pathToAttach.exists()) {
                                    MediaController.saveFile(pathToAttach.toString(), this.f37655b.getParentActivity(), 0, null, null, new jh.m6(4, this, z10));
                                }
                            }
                        }
                    } else if (i10 == 30) {
                        this.f37655b.presentFragment(new UserInfoActivity());
                    } else if (i10 == 40) {
                        ProfileActivity profileActivity14 = this.f37655b;
                        yo0 yo0Var = new yo0();
                        yo0Var.f44950x = this.f37655b;
                        profileActivity14.presentFragment(yo0Var);
                    } else if (i10 == 42) {
                        TLRPC.User user4 = this.f37655b.getMessagesController().getUser(Long.valueOf(this.f37655b.f35986a1));
                        AndroidUtilities.addToClipboard(this.f37655b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(user4));
                    } else if (i10 == 43) {
                        this.f37655b.presentFragment(new la(null));
                    } else if (i10 == 31) {
                        this.f37655b.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                    } else if (i10 == 33) {
                        int realPosition = this.f37655b.f36049j0.getRealPosition();
                        TLRPC.Photo F = this.f37655b.f36049j0.F(realPosition);
                        if (F != null) {
                            my0 my0Var2 = this.f37655b.f36049j0;
                            ArrayList arrayList2 = my0Var2.X0;
                            ArrayList arrayList3 = my0Var2.W0;
                            ArrayList arrayList4 = my0Var2.V0;
                            ArrayList arrayList5 = my0Var2.U0;
                            ArrayList arrayList6 = my0Var2.S0;
                            ArrayList arrayList7 = my0Var2.Q0;
                            ArrayList arrayList8 = my0Var2.T0;
                            ArrayList arrayList9 = my0Var2.R0;
                            MessagesController.DialogPhotos dialogPhotos = my0Var2.O0;
                            if (dialogPhotos != null) {
                                dialogPhotos.moveToStart(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                my0Var2.Y0++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = my0Var2.P0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (ImageLocation) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (ImageLocation) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (ImageLocation) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.h61) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                my0Var2.L0 = (ImageLocation) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f22524id = tL_inputPhoto;
                            tL_inputPhoto.f22411id = F.f22416id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            UserConfig userConfig = this.f37655b.getUserConfig();
                            this.f37655b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new jr0(this, userConfig, F, 6));
                            ProfileActivity profileActivity15 = this.f37655b;
                            UndoView undoView = profileActivity15.I;
                            long j14 = profileActivity15.f35986a1;
                            if (F.video_sizes.isEmpty()) {
                                obj = null;
                            } else {
                                obj = 1;
                            }
                            undoView.m(j14, obj, 22);
                            TLRPC.User user5 = this.f37655b.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 800);
                            if (user5 != null) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 90);
                                TLRPC.UserProfilePhoto userProfilePhoto = user5.photo;
                                userProfilePhoto.photo_id = F.f22416id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user5);
                                userConfig.saveConfig(true);
                                i15 = ((org.telegram.ui.ActionBar.o2) this.f37655b).currentAccount;
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                this.f37655b.i5(true);
                            }
                            my0 my0Var3 = this.f37655b.f36049j0;
                            my0Var3.f30065z0.g();
                            my0Var3.L();
                        }
                    } else if (i10 == 34) {
                        i11 = ((org.telegram.ui.ActionBar.o2) this.f37655b).currentAccount;
                        if (MessagesController.getInstance(i11).isFrozen()) {
                            i14 = ((org.telegram.ui.ActionBar.o2) this.f37655b).currentAccount;
                            c.b(i14);
                            return;
                        }
                        int realPosition2 = this.f37655b.f36049j0.getRealPosition();
                        ImageLocation D2 = this.f37655b.f36049j0.D(realPosition2);
                        if (D2 != null) {
                            i12 = ((org.telegram.ui.ActionBar.o2) this.f37655b).currentAccount;
                            FileLoader fileLoader2 = FileLoader.getInstance(i12);
                            Drawable[] drawableArr = PhotoViewer.P8;
                            File pathToAttach2 = fileLoader2.getPathToAttach(D2.location, PhotoViewer.q1(D2), true);
                            if (D2.imageType == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                ImageLocation G = this.f37655b.f36049j0.G(realPosition2);
                                i13 = ((org.telegram.ui.ActionBar.o2) this.f37655b).currentAccount;
                                FileLoader fileLoader3 = FileLoader.getInstance(i13);
                                if (G == null) {
                                    tLObject = null;
                                } else {
                                    tLObject = G.location;
                                }
                                str = fileLoader3.getPathToAttach(tLObject, PhotoViewer.q1(G), true).getAbsolutePath();
                            } else {
                                str = null;
                            }
                            this.f37655b.m0.q(pathToAttach2.getAbsolutePath(), str, z12);
                        }
                    } else if (i10 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.f37655b.getParentActivity(), 0, this.f37655b.f36129v0);
                        my0 my0Var4 = this.f37655b.f36049j0;
                        ImageLocation D3 = my0Var4.D(my0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.imageType == 2) {
                                alertDialog$Builder4.f22714a.N = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                                alertDialog$Builder4.f22714a.P = LocaleController.getString(R.string.AreYouSureDeleteVideo);
                            } else {
                                alertDialog$Builder4.f22714a.N = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                                alertDialog$Builder4.f22714a.P = LocaleController.getString(R.string.AreYouSureDeletePhoto);
                            }
                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                                public final dz0 f36946b;

                                {
                                    this.f36946b = this;
                                }

                                @Override
                                public final void g(org.telegram.ui.ActionBar.c2 r11, int r12) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bz0.g(org.telegram.ui.ActionBar.c2, int):void");
                                }
                            });
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder4.f22714a;
                            this.f37655b.showDialog(c2Var3);
                            TextView textView4 = (TextView) c2Var3.d(-1);
                            if (textView4 != null) {
                                textView4.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, this.f37655b.f36129v0));
                            }
                        }
                    } else if (i10 == 36) {
                        this.f37655b.u4();
                    }
                } else {
                    ProfileActivity profileActivity16 = this.f37655b;
                    if (i10 == 16) {
                        z11 = true;
                    }
                    profileActivity16.o4(z11);
                }
            }
        }
    }
}
