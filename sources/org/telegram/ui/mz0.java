package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
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
public final class mz0 extends org.telegram.ui.ActionBar.j {
    public final Context f39678a;
    public final ProfileActivity f39679b;

    public mz0(ProfileActivity profileActivity, Context context) {
        this.f39679b = profileActivity;
        this.f39678a = context;
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
        org.telegram.ui.Components.mt0 mt0Var;
        if (this.f39679b.getParentActivity() != null) {
            if (i10 == -1) {
                ProfileActivity profileActivity = this.f39679b;
                qz0 qz0Var = profileActivity.O;
                if (qz0Var != null && (mt0Var = qz0Var.I0) != null && mt0Var.f24509n0) {
                    profileActivity.U4();
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
                this.f39679b.p4(false);
            } else if (i10 == 1) {
                TLRPC.User user = this.f39679b.getMessagesController().getUser(Long.valueOf(this.f39679b.f33923f1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f20491id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f39679b;
                hs hsVar = new hs(bundle, profileActivity2.A0);
                hsVar.O = new qx0(profileActivity2, user);
                profileActivity2.presentFragment(hsVar);
            } else if (i10 == 3) {
                Bundle e = org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true);
                e.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
                e.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
                ey eyVar = new ey(e);
                ProfileActivity profileActivity3 = this.f39679b;
                eyVar.C2 = profileActivity3;
                profileActivity3.presentFragment(eyVar);
            } else if (i10 == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f39679b.f33923f1);
                ProfileActivity profileActivity4 = this.f39679b;
                profileActivity4.presentFragment(new hs(bundle2, profileActivity4.A0));
            } else {
                String str3 = null;
                if (i10 == 5) {
                    TLRPC.User user2 = this.f39679b.getMessagesController().getUser(Long.valueOf(this.f39679b.f33923f1));
                    if (user2 != null && this.f39679b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f39679b.getParentActivity(), 0, this.f39679b.A0);
                        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new pl0(13, this, user2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                        this.f39679b.showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, this.f39679b.A0);
                        }
                    }
                } else if (i10 == 7) {
                    this.f39679b.k4(false);
                } else if (i10 == 45) {
                    this.f39679b.k4(true);
                } else if (i10 == 46) {
                    if (!this.f39679b.getUserConfig().isPremium()) {
                        ProfileActivity profileActivity5 = this.f39679b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i19 = ((org.telegram.ui.ActionBar.o2) this.f39679b).currentAccount;
                        new sg.y0(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f39678a;
                    org.telegram.ui.ActionBar.g6 g6Var = this.f39679b.A0;
                    ly0 ly0Var = new ly0(this, 2);
                    Pattern pattern = org.telegram.ui.Components.d5.f25562a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.h3 j11 = org.telegram.messenger.tl.j(1, context, null, false);
                        runnable = j11.dismissRunnable;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, w7.z5.t(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(R.raw.raised_hand, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(AndroidUtilities.bold());
                        textView2.setGravity(17);
                        org.telegram.messenger.tl.n(R.string.DisableSharingInfoHeader, textView2, 1, 20.0f);
                        int i21 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.W(textView2, i21, g6Var);
                        linearLayout.addView(textView2, w7.z5.t(-1, -2, 17, 20, 0, 20, 14));
                        bw0 bw0Var = new bw0(context, g6Var);
                        bw0Var.f36150a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
                        bw0Var.f36151b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
                        bw0Var.d.setVisibility(8);
                        bw0Var.f36152c.setImageResource(R.drawable.menu_photo_off_24);
                        ImageView imageView2 = bw0Var.f36152c;
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                        org.telegram.ui.ActionBar.r6.t(imageView2, i21, g6Var, mode);
                        linearLayout.addView(bw0Var, w7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        bw0 bw0Var2 = new bw0(context, g6Var);
                        bw0Var2.f36150a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
                        bw0Var2.f36151b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
                        bw0Var2.d.setVisibility(8);
                        bw0Var2.f36152c.setImageResource(R.drawable.menu_share_off_24);
                        org.telegram.ui.ActionBar.r6.t(bw0Var2.f36152c, i21, g6Var, mode);
                        linearLayout.addView(bw0Var2, w7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        bw0 bw0Var3 = new bw0(context, g6Var);
                        bw0Var3.f36150a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
                        bw0Var3.f36151b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
                        bw0Var3.d.setVisibility(8);
                        bw0Var3.f36152c.setImageResource(R.drawable.menu_download_off_24);
                        org.telegram.ui.ActionBar.r6.t(bw0Var3.f36152c, i21, g6Var, mode);
                        linearLayout.addView(bw0Var3, w7.z5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        ei.d dVar = new ei.d(context, g6Var, true);
                        dVar.setOnClickListener(new org.telegram.ui.ActionBar.s1(25, zArr, runnable));
                        dVar.f();
                        dVar.i(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
                        linearLayout.addView(dVar, w7.z5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        j11.customView = linearLayout;
                        j11.show();
                        j11.setOnDismissListener(new eh(24, zArr, ly0Var));
                    }
                } else if (i10 == 47) {
                    ProfileActivity profileActivity6 = this.f39679b;
                    profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.f33923f1, 0, false, new ei.ka(2, profileActivity6, false));
                } else if (i10 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f39679b.getParentActivity());
                    alertDialog$Builder2.f20679a.R = LocaleController.getPluralString("DeleteTopics", 1);
                    i18 = ((org.telegram.ui.ActionBar.o2) this.f39679b).currentAccount;
                    TopicsController topicsController = MessagesController.getInstance(i18).getTopicsController();
                    ProfileActivity profileActivity7 = this.f39679b;
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.f33930g1, profileActivity7.f33937h1);
                    int i22 = R.string.DeleteSelectedTopic;
                    if (findTopic == null) {
                        str2 = "topic";
                    } else {
                        str2 = findTopic.title;
                    }
                    alertDialog$Builder2.f20679a.T = LocaleController.formatString("DeleteSelectedTopic", i22, str2);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                        public final mz0 f39074b;

                        {
                            this.f39074b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.c2 r11, int r12) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kz0.g(org.telegram.ui.ActionBar.c2, int):void");
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new wv(17));
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
                    c2Var2.show();
                    TextView textView3 = (TextView) c2Var2.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.r6.W(textView3, org.telegram.ui.ActionBar.k6.f21422q7, null);
                    }
                } else if (i10 == 24) {
                    ProfileActivity profileActivity8 = this.f39679b;
                    r21.O(profileActivity8.a(), profileActivity8);
                } else if (i10 == 12) {
                    ProfileActivity profileActivity9 = this.f39679b;
                    if (profileActivity9.f34004r1) {
                        profileActivity9.presentFragment(sd1.a0(profileActivity9.f33930g1, profileActivity9.f33937h1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f39679b;
                    long j12 = profileActivity10.f33930g1;
                    if (j12 != 0) {
                        bundle3.putLong("chat_id", j12);
                    } else if (profileActivity10.f34013s2) {
                        bundle3.putLong("user_id", profileActivity10.f33923f1);
                    }
                    ko koVar = new ko(bundle3);
                    ProfileActivity profileActivity11 = this.f39679b;
                    TLRPC.ChatFull chatFull = profileActivity11.f34034v2;
                    if (chatFull != null) {
                        koVar.l0(chatFull);
                    } else {
                        koVar.m0(profileActivity11.f34042w2);
                    }
                    this.f39679b.presentFragment(koVar);
                } else if (i10 == 41) {
                    this.f39679b.presentFragment(new UserInfoActivity());
                } else if (i10 == 9) {
                    TLRPC.User user3 = this.f39679b.getMessagesController().getUser(Long.valueOf(this.f39679b.f33923f1));
                    if (user3 != null) {
                        Bundle e7 = org.telegram.messenger.v0.e(2, "onlySelect", "dialogsType", true);
                        e7.putBoolean("resetDelegate", false);
                        e7.putBoolean("closeFragment", false);
                        ey eyVar2 = new ey(e7);
                        eyVar2.C2 = new e7(this, user3, eyVar2, 19);
                        this.f39679b.presentFragment(eyVar2);
                    }
                } else if (i10 == 10) {
                    this.f39679b.u4();
                } else if (i10 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f39679b;
                        if (profileActivity12.E2 != null) {
                            j10 = DialogObject.makeEncryptedDialogId(encryptedChat.f20352id);
                        } else {
                            j10 = profileActivity12.f33923f1;
                            if (j10 == 0) {
                                long j13 = profileActivity12.f33930g1;
                                if (j13 != 0) {
                                    j10 = -j13;
                                } else {
                                    return;
                                }
                            }
                        }
                        this.f39679b.getMediaDataController().installShortcut(j10, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                } else if (i10 != 15 && i10 != 16) {
                    if (i10 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f39679b.f33930g1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        jr jrVar = new jr(bundle4);
                        jrVar.x0(this.f39679b.f34034v2);
                        this.f39679b.presentFragment(jrVar);
                    } else if (i10 == 18) {
                        this.f39679b.x4();
                    } else if (i10 == 19) {
                        this.f39679b.presentFragment(t91.d0(this.f39679b.getMessagesController().getChat(Long.valueOf(this.f39679b.f33930g1)), false));
                    } else if (i10 == 22) {
                        this.f39679b.A4();
                    } else if (i10 == 38) {
                        this.f39679b.r4();
                    } else if (i10 == 48) {
                        ProfileActivity profileActivity13 = this.f39679b;
                        org.telegram.ui.Wallet.j9 j9Var = new org.telegram.ui.Wallet.j9(profileActivity13.getMessagesController().getUser(Long.valueOf(this.f39679b.f33923f1)));
                        j9Var.f34663e0 = true;
                        profileActivity13.presentFragment(j9Var);
                    } else if (i10 == 39) {
                        Bundle i23 = org.telegram.ui.Cells.b1.i(2, "type");
                        i23.putLong("dialog_id", -this.f39679b.f33930g1);
                        org.telegram.ui.Components.va0 va0Var = new org.telegram.ui.Components.va0(i23, null);
                        ProfileActivity profileActivity14 = this.f39679b;
                        va0Var.f31396c = profileActivity14.f34034v2;
                        profileActivity14.presentFragment(va0Var);
                    } else if (i10 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.f39679b.getParentActivity(), 0, this.f39679b.A0);
                        alertDialog$Builder3.f20679a.R = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
                        alertDialog$Builder3.f20679a.T = LocaleController.getString(R.string.AreYouSureSecretChat);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.z1(this) {
                            public final mz0 f39074b;

                            {
                                this.f39074b = this;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.c2 r11, int r12) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kz0.g(org.telegram.ui.ActionBar.c2, int):void");
                            }
                        });
                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                        this.f39679b.showDialog(alertDialog$Builder3.f20679a);
                    } else if (i10 == 44) {
                        i17 = ((org.telegram.ui.ActionBar.o2) this.f39679b).currentAccount;
                        long j14 = this.f39679b.f33923f1;
                        TLRPC.UserFull userFull = MessagesController.getInstance(i17).getUserFull(j14);
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
                                pf.d.r(ApplicationLoader.applicationContext, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                            if (U != null) {
                                if (!(U instanceof sn) || ((sn) U).a() != j14) {
                                    U.presentFragment(sn.W9(j14));
                                }
                                AndroidUtilities.runOnUIThread(new ai.ra(i17, j14, 1), 150L);
                            }
                        }
                    } else if (i10 == 21) {
                        if (this.f39679b.getParentActivity() != null) {
                            if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.f39679b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                this.f39679b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            vy0 vy0Var = this.f39679b.f33983o0;
                            ImageLocation D = vy0Var.D(vy0Var.getRealPosition());
                            if (D != null) {
                                if (D.imageType == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i16 = ((org.telegram.ui.ActionBar.o2) this.f39679b).currentAccount;
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
                                    MediaController.saveFile(pathToAttach.toString(), this.f39679b.getParentActivity(), 0, null, null, new ai.y8(8, this, z10));
                                }
                            }
                        }
                    } else if (i10 == 30) {
                        this.f39679b.presentFragment(new UserInfoActivity());
                    } else if (i10 == 40) {
                        ProfileActivity profileActivity15 = this.f39679b;
                        kp0 kp0Var = new kp0();
                        kp0Var.H = this.f39679b;
                        profileActivity15.presentFragment(kp0Var);
                    } else if (i10 == 42) {
                        TLRPC.User user4 = this.f39679b.getMessagesController().getUser(Long.valueOf(this.f39679b.f33923f1));
                        AndroidUtilities.addToClipboard(this.f39679b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(user4));
                    } else if (i10 == 43) {
                        this.f39679b.presentFragment(new sa(null));
                    } else if (i10 == 31) {
                        this.f39679b.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                    } else if (i10 == 33) {
                        int realPosition = this.f39679b.f33983o0.getRealPosition();
                        TLRPC.Photo F = this.f39679b.f33983o0.F(realPosition);
                        if (F != null) {
                            vy0 vy0Var2 = this.f39679b.f33983o0;
                            ArrayList arrayList2 = vy0Var2.f28920b1;
                            ArrayList arrayList3 = vy0Var2.f28919a1;
                            ArrayList arrayList4 = vy0Var2.Z0;
                            ArrayList arrayList5 = vy0Var2.Y0;
                            ArrayList arrayList6 = vy0Var2.W0;
                            ArrayList arrayList7 = vy0Var2.U0;
                            ArrayList arrayList8 = vy0Var2.X0;
                            ArrayList arrayList9 = vy0Var2.V0;
                            MessagesController.DialogPhotos dialogPhotos = vy0Var2.S0;
                            if (dialogPhotos != null) {
                                dialogPhotos.moveToStart(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                vy0Var2.f28921c1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = vy0Var2.T0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (ImageLocation) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (ImageLocation) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (ImageLocation) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.t71) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                vy0Var2.P0 = (ImageLocation) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f20476id = tL_inputPhoto;
                            tL_inputPhoto.f20363id = F.f20368id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            UserConfig userConfig = this.f39679b.getUserConfig();
                            this.f39679b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new vr0(this, userConfig, F, 6));
                            ProfileActivity profileActivity16 = this.f39679b;
                            UndoView undoView = profileActivity16.M;
                            long j15 = profileActivity16.f33923f1;
                            if (F.video_sizes.isEmpty()) {
                                obj = null;
                            } else {
                                obj = 1;
                            }
                            undoView.m(j15, obj, 22);
                            TLRPC.User user5 = this.f39679b.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 800);
                            if (user5 != null) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 90);
                                TLRPC.UserProfilePhoto userProfilePhoto = user5.photo;
                                userProfilePhoto.photo_id = F.f20368id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user5);
                                userConfig.saveConfig(true);
                                i15 = ((org.telegram.ui.ActionBar.o2) this.f39679b).currentAccount;
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                this.f39679b.m5(true);
                            }
                            vy0 vy0Var3 = this.f39679b.f33983o0;
                            vy0Var3.D0.g();
                            vy0Var3.L();
                        }
                    } else if (i10 == 34) {
                        i11 = ((org.telegram.ui.ActionBar.o2) this.f39679b).currentAccount;
                        if (MessagesController.getInstance(i11).isFrozen()) {
                            i14 = ((org.telegram.ui.ActionBar.o2) this.f39679b).currentAccount;
                            b.b(i14);
                            return;
                        }
                        int realPosition2 = this.f39679b.f33983o0.getRealPosition();
                        ImageLocation D2 = this.f39679b.f33983o0.D(realPosition2);
                        if (D2 != null) {
                            i12 = ((org.telegram.ui.ActionBar.o2) this.f39679b).currentAccount;
                            FileLoader fileLoader2 = FileLoader.getInstance(i12);
                            Drawable[] drawableArr = PhotoViewer.U8;
                            File pathToAttach2 = fileLoader2.getPathToAttach(D2.location, PhotoViewer.r1(D2), true);
                            if (D2.imageType == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                ImageLocation G = this.f39679b.f33983o0.G(realPosition2);
                                i13 = ((org.telegram.ui.ActionBar.o2) this.f39679b).currentAccount;
                                FileLoader fileLoader3 = FileLoader.getInstance(i13);
                                if (G == null) {
                                    tLObject = null;
                                } else {
                                    tLObject = G.location;
                                }
                                str = fileLoader3.getPathToAttach(tLObject, PhotoViewer.r1(G), true).getAbsolutePath();
                            } else {
                                str = null;
                            }
                            this.f39679b.f34003r0.p(pathToAttach2.getAbsolutePath(), str, z12);
                        }
                    } else if (i10 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.f39679b.getParentActivity(), 0, this.f39679b.A0);
                        vy0 vy0Var4 = this.f39679b.f33983o0;
                        ImageLocation D3 = vy0Var4.D(vy0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.imageType == 2) {
                                alertDialog$Builder4.f20679a.R = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                                alertDialog$Builder4.f20679a.T = LocaleController.getString(R.string.AreYouSureDeleteVideo);
                            } else {
                                alertDialog$Builder4.f20679a.R = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                                alertDialog$Builder4.f20679a.T = LocaleController.getString(R.string.AreYouSureDeletePhoto);
                            }
                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                                public final mz0 f39074b;

                                {
                                    this.f39074b = this;
                                }

                                @Override
                                public final void g(org.telegram.ui.ActionBar.c2 r11, int r12) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.kz0.g(org.telegram.ui.ActionBar.c2, int):void");
                                }
                            });
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder4.f20679a;
                            this.f39679b.showDialog(c2Var3);
                            TextView textView4 = (TextView) c2Var3.d(-1);
                            if (textView4 != null) {
                                org.telegram.ui.ActionBar.r6.W(textView4, org.telegram.ui.ActionBar.k6.f21422q7, this.f39679b.A0);
                            }
                        }
                    } else if (i10 == 36) {
                        this.f39679b.w4();
                    }
                } else {
                    ProfileActivity profileActivity17 = this.f39679b;
                    if (i10 == 16) {
                        z11 = true;
                    }
                    profileActivity17.q4(z11);
                }
            }
        }
    }
}
