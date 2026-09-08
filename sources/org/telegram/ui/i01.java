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
public final class i01 extends org.telegram.ui.ActionBar.j {
    public final Context f37175a;
    public final ProfileActivity f37176b;

    public i01(ProfileActivity profileActivity, Context context) {
        this.f37176b = profileActivity;
        this.f37175a = context;
    }

    @Override
    public final void b(int i10) {
        TLRPC.EncryptedChat encryptedChat;
        long j3;
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
        org.telegram.ui.Components.ns0 ns0Var;
        if (this.f37176b.getParentActivity() != null) {
            if (i10 == -1) {
                ProfileActivity profileActivity = this.f37176b;
                m01 m01Var = profileActivity.O;
                if (m01Var != null && (ns0Var = m01Var.I0) != null && ns0Var.f24159n0) {
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
                this.f37176b.n4(false);
            } else if (i10 == 1) {
                TLRPC.User user = this.f37176b.getMessagesController().getUser(Long.valueOf(this.f37176b.f33915e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f20043id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f37176b;
                ss ssVar = new ss(bundle, profileActivity2.f34058z0);
                ssVar.O = new ly0(profileActivity2, user);
                profileActivity2.presentFragment(ssVar);
            } else if (i10 == 3) {
                Bundle e7 = org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true);
                e7.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
                e7.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
                uy uyVar = new uy(e7);
                ProfileActivity profileActivity3 = this.f37176b;
                uyVar.C2 = profileActivity3;
                profileActivity3.presentFragment(uyVar);
            } else if (i10 == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f37176b.f33915e1);
                ProfileActivity profileActivity4 = this.f37176b;
                profileActivity4.presentFragment(new ss(bundle2, profileActivity4.f34058z0));
            } else {
                String str3 = null;
                if (i10 == 5) {
                    TLRPC.User user2 = this.f37176b.getMessagesController().getUser(Long.valueOf(this.f37176b.f33915e1));
                    if (user2 != null && this.f37176b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f37176b.getParentActivity(), 0, this.f37176b.f34058z0);
                        alertDialog$Builder.f20225a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.f20225a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new qv0(6, this, user2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20225a;
                        this.f37176b.showDialog(b2Var);
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20925q7, this.f37176b.f34058z0));
                        }
                    }
                } else if (i10 == 7) {
                    this.f37176b.i4(false);
                } else if (i10 == 45) {
                    this.f37176b.i4(true);
                } else if (i10 == 46) {
                    if (!this.f37176b.getUserConfig().isPremium()) {
                        ProfileActivity profileActivity5 = this.f37176b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i19 = ((org.telegram.ui.ActionBar.n2) this.f37176b).currentAccount;
                        new sg.a1(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f37175a;
                    org.telegram.ui.ActionBar.f6 f6Var = this.f37176b.f34058z0;
                    f01 f01Var = new f01(this, 0);
                    Pattern pattern = org.telegram.ui.Components.e5.f25584a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.f3 i21 = org.telegram.messenger.wl.i(1, context, null, false);
                        runnable = i21.dismissRunnable;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, w7.x5.t(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(R.raw.raised_hand, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(AndroidUtilities.bold());
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.getString(R.string.DisableSharingInfoHeader));
                        textView2.setTextSize(1, 20.0f);
                        int i22 = org.telegram.ui.ActionBar.j6.G6;
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.v0(i22, f6Var));
                        linearLayout.addView(textView2, w7.x5.t(-1, -2, 17, 20, 0, 20, 14));
                        uw0 uw0Var = new uw0(context, f6Var);
                        uw0Var.f41251a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
                        uw0Var.f41252b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
                        uw0Var.d.setVisibility(8);
                        uw0Var.f41253c.setImageResource(R.drawable.menu_photo_off_24);
                        uw0Var.f41253c.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i22, f6Var));
                        linearLayout.addView(uw0Var, w7.x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        uw0 uw0Var2 = new uw0(context, f6Var);
                        uw0Var2.f41251a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
                        uw0Var2.f41252b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
                        uw0Var2.d.setVisibility(8);
                        uw0Var2.f41253c.setImageResource(R.drawable.menu_share_off_24);
                        uw0Var2.f41253c.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i22, f6Var));
                        linearLayout.addView(uw0Var2, w7.x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        uw0 uw0Var3 = new uw0(context, f6Var);
                        uw0Var3.f41251a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
                        uw0Var3.f41252b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
                        uw0Var3.d.setVisibility(8);
                        uw0Var3.f41253c.setImageResource(R.drawable.menu_download_off_24);
                        uw0Var3.f41253c.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i22, f6Var));
                        linearLayout.addView(uw0Var3, w7.x5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        di.d dVar = new di.d(context, f6Var, true);
                        dVar.setOnClickListener(new rf(15, zArr, runnable));
                        dVar.e();
                        dVar.g(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
                        linearLayout.addView(dVar, w7.x5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        i21.customView = linearLayout;
                        i21.show();
                        i21.setOnDismissListener(new fh(27, zArr, f01Var));
                    }
                } else if (i10 == 47) {
                    ProfileActivity profileActivity6 = this.f37176b;
                    profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.f33915e1, 0, false, new di.cb(false, profileActivity6, 2));
                } else if (i10 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f37176b.getParentActivity());
                    alertDialog$Builder2.f20225a.R = LocaleController.getPluralString("DeleteTopics", 1);
                    i18 = ((org.telegram.ui.ActionBar.n2) this.f37176b).currentAccount;
                    TopicsController topicsController = MessagesController.getInstance(i18).getTopicsController();
                    ProfileActivity profileActivity7 = this.f37176b;
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.f33923f1, profileActivity7.f33930g1);
                    int i23 = R.string.DeleteSelectedTopic;
                    if (findTopic == null) {
                        str2 = "topic";
                    } else {
                        str2 = findTopic.title;
                    }
                    alertDialog$Builder2.f20225a.T = LocaleController.formatString("DeleteSelectedTopic", i23, str2);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {
                        public final i01 f36547b;

                        {
                            this.f36547b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 r11, int r12) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g01.g(org.telegram.ui.ActionBar.b2, int):void");
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new sw0(2));
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20225a;
                    b2Var2.show();
                    TextView textView3 = (TextView) b2Var2.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20925q7, false));
                    }
                } else if (i10 == 24) {
                    ProfileActivity profileActivity8 = this.f37176b;
                    e41.L(profileActivity8.a(), profileActivity8);
                } else if (i10 == 12) {
                    ProfileActivity profileActivity9 = this.f37176b;
                    if (profileActivity9.f33996q1) {
                        profileActivity9.presentFragment(af1.a0(profileActivity9.f33923f1, profileActivity9.f33930g1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f37176b;
                    long j10 = profileActivity10.f33923f1;
                    if (j10 != 0) {
                        bundle3.putLong("chat_id", j10);
                    } else if (profileActivity10.f34004r2) {
                        bundle3.putLong("user_id", profileActivity10.f33915e1);
                    }
                    xo xoVar = new xo(bundle3);
                    ProfileActivity profileActivity11 = this.f37176b;
                    TLRPC.ChatFull chatFull = profileActivity11.f34026u2;
                    if (chatFull != null) {
                        xoVar.l0(chatFull);
                    } else {
                        xoVar.m0(profileActivity11.f34033v2);
                    }
                    this.f37176b.presentFragment(xoVar);
                } else if (i10 == 41) {
                    this.f37176b.presentFragment(new UserInfoActivity());
                } else if (i10 == 9) {
                    TLRPC.User user3 = this.f37176b.getMessagesController().getUser(Long.valueOf(this.f37176b.f33915e1));
                    if (user3 != null) {
                        Bundle e10 = org.telegram.messenger.w1.e(2, "onlySelect", "dialogsType", true);
                        e10.putBoolean("resetDelegate", false);
                        e10.putBoolean("closeFragment", false);
                        uy uyVar2 = new uy(e10);
                        uyVar2.C2 = new b7(this, user3, uyVar2, 19);
                        this.f37176b.presentFragment(uyVar2);
                    }
                } else if (i10 == 10) {
                    this.f37176b.s4();
                } else if (i10 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f37176b;
                        if (profileActivity12.D2 != null) {
                            j3 = DialogObject.makeEncryptedDialogId(encryptedChat.f19904id);
                        } else {
                            j3 = profileActivity12.f33915e1;
                            if (j3 == 0) {
                                long j11 = profileActivity12.f33923f1;
                                if (j11 != 0) {
                                    j3 = -j11;
                                } else {
                                    return;
                                }
                            }
                        }
                        this.f37176b.getMediaDataController().installShortcut(j3, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                } else if (i10 != 15 && i10 != 16) {
                    if (i10 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f37176b.f33923f1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        vr vrVar = new vr(bundle4);
                        vrVar.x0(this.f37176b.f34026u2);
                        this.f37176b.presentFragment(vrVar);
                    } else if (i10 == 18) {
                        this.f37176b.v4();
                    } else if (i10 == 19) {
                        this.f37176b.presentFragment(bb1.d0(this.f37176b.getMessagesController().getChat(Long.valueOf(this.f37176b.f33923f1)), false));
                    } else if (i10 == 22) {
                        this.f37176b.y4();
                    } else if (i10 == 38) {
                        this.f37176b.p4();
                    } else if (i10 == 39) {
                        Bundle e12 = org.telegram.ui.Cells.p6.e(2, "type");
                        e12.putLong("dialog_id", -this.f37176b.f33923f1);
                        org.telegram.ui.Components.ca0 ca0Var = new org.telegram.ui.Components.ca0(e12, null);
                        ProfileActivity profileActivity13 = this.f37176b;
                        ca0Var.f24976c = profileActivity13.f34026u2;
                        profileActivity13.presentFragment(ca0Var);
                    } else if (i10 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.f37176b.getParentActivity(), 0, this.f37176b.f34058z0);
                        alertDialog$Builder3.f20225a.R = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
                        alertDialog$Builder3.f20225a.T = LocaleController.getString(R.string.AreYouSureSecretChat);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.a2(this) {
                            public final i01 f36547b;

                            {
                                this.f36547b = this;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.b2 r11, int r12) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g01.g(org.telegram.ui.ActionBar.b2, int):void");
                            }
                        });
                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                        this.f37176b.showDialog(alertDialog$Builder3.f20225a);
                    } else if (i10 == 44) {
                        i17 = ((org.telegram.ui.ActionBar.n2) this.f37176b).currentAccount;
                        long j12 = this.f37176b.f33915e1;
                        TLRPC.UserFull userFull = MessagesController.getInstance(i17).getUserFull(j12);
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
                                of.f.s(ApplicationLoader.applicationContext, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                            if (U != null) {
                                if (!(U instanceof co) || ((co) U).a() != j12) {
                                    U.presentFragment(co.R9(j12));
                                }
                                AndroidUtilities.runOnUIThread(new fi.b2(i17, j12), 150L);
                            }
                        }
                    } else if (i10 == 21) {
                        if (this.f37176b.getParentActivity() != null) {
                            int i24 = Build.VERSION.SDK_INT;
                            if (i24 >= 23 && ((i24 <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.f37176b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                                this.f37176b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            qz0 qz0Var = this.f37176b.f33975n0;
                            ImageLocation D = qz0Var.D(qz0Var.getRealPosition());
                            if (D != null) {
                                if (D.imageType == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i16 = ((org.telegram.ui.ActionBar.n2) this.f37176b).currentAccount;
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
                                    MediaController.saveFile(pathToAttach.toString(), this.f37176b.getParentActivity(), 0, null, null, new bi.v2(3, this, z10));
                                }
                            }
                        }
                    } else if (i10 == 30) {
                        this.f37176b.presentFragment(new UserInfoActivity());
                    } else if (i10 == 40) {
                        ProfileActivity profileActivity14 = this.f37176b;
                        bq0 bq0Var = new bq0();
                        bq0Var.H = this.f37176b;
                        profileActivity14.presentFragment(bq0Var);
                    } else if (i10 == 42) {
                        TLRPC.User user4 = this.f37176b.getMessagesController().getUser(Long.valueOf(this.f37176b.f33915e1));
                        AndroidUtilities.addToClipboard(this.f37176b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(user4));
                    } else if (i10 == 43) {
                        this.f37176b.presentFragment(new qa(null));
                    } else if (i10 == 31) {
                        this.f37176b.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                    } else if (i10 == 33) {
                        int realPosition = this.f37176b.f33975n0.getRealPosition();
                        TLRPC.Photo F = this.f37176b.f33975n0.F(realPosition);
                        if (F != null) {
                            qz0 qz0Var2 = this.f37176b.f33975n0;
                            ArrayList arrayList2 = qz0Var2.f29082b1;
                            ArrayList arrayList3 = qz0Var2.f29081a1;
                            ArrayList arrayList4 = qz0Var2.Z0;
                            ArrayList arrayList5 = qz0Var2.Y0;
                            ArrayList arrayList6 = qz0Var2.W0;
                            ArrayList arrayList7 = qz0Var2.U0;
                            ArrayList arrayList8 = qz0Var2.X0;
                            ArrayList arrayList9 = qz0Var2.V0;
                            MessagesController.DialogPhotos dialogPhotos = qz0Var2.S0;
                            if (dialogPhotos != null) {
                                dialogPhotos.moveToStart(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                qz0Var2.f29083c1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = qz0Var2.T0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (ImageLocation) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (ImageLocation) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (ImageLocation) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.q61) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                qz0Var2.P0 = (ImageLocation) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f20028id = tL_inputPhoto;
                            tL_inputPhoto.f19915id = F.f19920id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            UserConfig userConfig = this.f37176b.getUserConfig();
                            this.f37176b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ms0(this, userConfig, F, 6));
                            ProfileActivity profileActivity15 = this.f37176b;
                            UndoView undoView = profileActivity15.M;
                            long j13 = profileActivity15.f33915e1;
                            if (F.video_sizes.isEmpty()) {
                                obj = null;
                            } else {
                                obj = 1;
                            }
                            undoView.m(j13, obj, 22);
                            TLRPC.User user5 = this.f37176b.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 800);
                            if (user5 != null) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 90);
                                TLRPC.UserProfilePhoto userProfilePhoto = user5.photo;
                                userProfilePhoto.photo_id = F.f19920id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user5);
                                userConfig.saveConfig(true);
                                i15 = ((org.telegram.ui.ActionBar.n2) this.f37176b).currentAccount;
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                this.f37176b.i5(true);
                            }
                            qz0 qz0Var3 = this.f37176b.f33975n0;
                            qz0Var3.D0.g();
                            qz0Var3.L();
                        }
                    } else if (i10 == 34) {
                        i11 = ((org.telegram.ui.ActionBar.n2) this.f37176b).currentAccount;
                        if (MessagesController.getInstance(i11).isFrozen()) {
                            i14 = ((org.telegram.ui.ActionBar.n2) this.f37176b).currentAccount;
                            b.b(i14);
                            return;
                        }
                        int realPosition2 = this.f37176b.f33975n0.getRealPosition();
                        ImageLocation D2 = this.f37176b.f33975n0.D(realPosition2);
                        if (D2 != null) {
                            i12 = ((org.telegram.ui.ActionBar.n2) this.f37176b).currentAccount;
                            FileLoader fileLoader2 = FileLoader.getInstance(i12);
                            Drawable[] drawableArr = PhotoViewer.T8;
                            File pathToAttach2 = fileLoader2.getPathToAttach(D2.location, PhotoViewer.q1(D2), true);
                            if (D2.imageType == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                ImageLocation G = this.f37176b.f33975n0.G(realPosition2);
                                i13 = ((org.telegram.ui.ActionBar.n2) this.f37176b).currentAccount;
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
                            this.f37176b.f33995q0.q(pathToAttach2.getAbsolutePath(), str, z12);
                        }
                    } else if (i10 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.f37176b.getParentActivity(), 0, this.f37176b.f34058z0);
                        qz0 qz0Var4 = this.f37176b.f33975n0;
                        ImageLocation D3 = qz0Var4.D(qz0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.imageType == 2) {
                                alertDialog$Builder4.f20225a.R = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                                alertDialog$Builder4.f20225a.T = LocaleController.getString(R.string.AreYouSureDeleteVideo);
                            } else {
                                alertDialog$Builder4.f20225a.R = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                                alertDialog$Builder4.f20225a.T = LocaleController.getString(R.string.AreYouSureDeletePhoto);
                            }
                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {
                                public final i01 f36547b;

                                {
                                    this.f36547b = this;
                                }

                                @Override
                                public final void g(org.telegram.ui.ActionBar.b2 r11, int r12) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.g01.g(org.telegram.ui.ActionBar.b2, int):void");
                                }
                            });
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.f20225a;
                            this.f37176b.showDialog(b2Var3);
                            TextView textView4 = (TextView) b2Var3.d(-1);
                            if (textView4 != null) {
                                textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20925q7, this.f37176b.f34058z0));
                            }
                        }
                    } else if (i10 == 36) {
                        this.f37176b.u4();
                    }
                } else {
                    ProfileActivity profileActivity16 = this.f37176b;
                    if (i10 == 16) {
                        z11 = true;
                    }
                    profileActivity16.o4(z11);
                }
            }
        }
    }
}
