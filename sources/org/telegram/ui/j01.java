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
public final class j01 extends org.telegram.ui.ActionBar.j {
    public final Context f34747a;
    public final ProfileActivity f34748b;

    public j01(ProfileActivity profileActivity, Context context) {
        this.f34748b = profileActivity;
        this.f34747a = context;
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
        org.telegram.ui.Components.ps0 ps0Var;
        if (this.f34748b.getParentActivity() != null) {
            if (i10 == -1) {
                ProfileActivity profileActivity = this.f34748b;
                n01 n01Var = profileActivity.O;
                if (n01Var != null && (ps0Var = n01Var.I0) != null && ps0Var.f22196n0) {
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
                this.f34748b.n4(false);
            } else if (i10 == 1) {
                TLRPC.User user = this.f34748b.getMessagesController().getUser(Long.valueOf(this.f34748b.f31286e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f18268id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f34748b;
                us usVar = new us(bundle, profileActivity2.f31429z0);
                usVar.O = new ny0(profileActivity2, user);
                profileActivity2.presentFragment(usVar);
            } else if (i10 == 3) {
                Bundle e = org.telegram.messenger.w1.e(3, "onlySelect", "dialogsType", true);
                e.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
                e.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
                wy wyVar = new wy(e);
                ProfileActivity profileActivity3 = this.f34748b;
                wyVar.C2 = profileActivity3;
                profileActivity3.presentFragment(wyVar);
            } else if (i10 == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f34748b.f31286e1);
                ProfileActivity profileActivity4 = this.f34748b;
                profileActivity4.presentFragment(new us(bundle2, profileActivity4.f31429z0));
            } else {
                String str3 = null;
                if (i10 == 5) {
                    TLRPC.User user2 = this.f34748b.getMessagesController().getUser(Long.valueOf(this.f34748b.f31286e1));
                    if (user2 != null && this.f34748b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f34748b.getParentActivity(), 0, this.f34748b.f31429z0);
                        alertDialog$Builder.f18447a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.f18447a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new tv0(5, this, user2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f18447a;
                        this.f34748b.showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19101q7, this.f34748b.f31429z0));
                        }
                    }
                } else if (i10 == 7) {
                    this.f34748b.i4(false);
                } else if (i10 == 45) {
                    this.f34748b.i4(true);
                } else if (i10 == 46) {
                    if (!this.f34748b.getUserConfig().isPremium()) {
                        ProfileActivity profileActivity5 = this.f34748b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i19 = ((org.telegram.ui.ActionBar.o2) this.f34748b).currentAccount;
                        new rg.x0(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f34747a;
                    org.telegram.ui.ActionBar.f6 f6Var = this.f34748b.f31429z0;
                    g01 g01Var = new g01(this, 0);
                    Pattern pattern = org.telegram.ui.Components.c5.f22934a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.g3 i21 = org.telegram.messenger.wl.i(1, context, null, false);
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
                        ww0 ww0Var = new ww0(context, f6Var);
                        ww0Var.f39185a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
                        ww0Var.f39186b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
                        ww0Var.d.setVisibility(8);
                        ww0Var.f39187c.setImageResource(R.drawable.menu_photo_off_24);
                        ww0Var.f39187c.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i22, f6Var));
                        linearLayout.addView(ww0Var, w7.x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        ww0 ww0Var2 = new ww0(context, f6Var);
                        ww0Var2.f39185a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
                        ww0Var2.f39186b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
                        ww0Var2.d.setVisibility(8);
                        ww0Var2.f39187c.setImageResource(R.drawable.menu_share_off_24);
                        ww0Var2.f39187c.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i22, f6Var));
                        linearLayout.addView(ww0Var2, w7.x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        ww0 ww0Var3 = new ww0(context, f6Var);
                        ww0Var3.f39185a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
                        ww0Var3.f39186b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
                        ww0Var3.d.setVisibility(8);
                        ww0Var3.f39187c.setImageResource(R.drawable.menu_download_off_24);
                        ww0Var3.f39187c.setColorFilter(org.telegram.ui.ActionBar.j6.v0(i22, f6Var));
                        linearLayout.addView(ww0Var3, w7.x5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        ci.d dVar = new ci.d(context, f6Var, true);
                        dVar.setOnClickListener(new tf(15, zArr, runnable));
                        dVar.e();
                        dVar.g(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
                        linearLayout.addView(dVar, w7.x5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        i21.customView = linearLayout;
                        i21.show();
                        i21.setOnDismissListener(new wh(21, zArr, g01Var));
                    }
                } else if (i10 == 47) {
                    ProfileActivity profileActivity6 = this.f34748b;
                    profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.f31286e1, 0, false, new ci.cb(false, profileActivity6, 2));
                } else if (i10 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f34748b.getParentActivity());
                    alertDialog$Builder2.f18447a.R = LocaleController.getPluralString("DeleteTopics", 1);
                    i18 = ((org.telegram.ui.ActionBar.o2) this.f34748b).currentAccount;
                    TopicsController topicsController = MessagesController.getInstance(i18).getTopicsController();
                    ProfileActivity profileActivity7 = this.f34748b;
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.f31294f1, profileActivity7.f31301g1);
                    int i23 = R.string.DeleteSelectedTopic;
                    if (findTopic == null) {
                        str2 = "topic";
                    } else {
                        str2 = findTopic.title;
                    }
                    alertDialog$Builder2.f18447a.T = LocaleController.formatString("DeleteSelectedTopic", i23, str2);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                        public final j01 f34088b;

                        {
                            this.f34088b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.c2 r11, int r12) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h01.f(org.telegram.ui.ActionBar.c2, int):void");
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new bs0(5));
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f18447a;
                    c2Var2.show();
                    TextView textView3 = (TextView) c2Var2.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19101q7, false));
                    }
                } else if (i10 == 24) {
                    ProfileActivity profileActivity8 = this.f34748b;
                    d41.L(profileActivity8.a(), profileActivity8);
                } else if (i10 == 12) {
                    ProfileActivity profileActivity9 = this.f34748b;
                    if (profileActivity9.f31367q1) {
                        profileActivity9.presentFragment(bf1.a0(profileActivity9.f31294f1, profileActivity9.f31301g1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f34748b;
                    long j10 = profileActivity10.f31294f1;
                    if (j10 != 0) {
                        bundle3.putLong("chat_id", j10);
                    } else if (profileActivity10.f31375r2) {
                        bundle3.putLong("user_id", profileActivity10.f31286e1);
                    }
                    wo woVar = new wo(bundle3);
                    ProfileActivity profileActivity11 = this.f34748b;
                    TLRPC.ChatFull chatFull = profileActivity11.f31397u2;
                    if (chatFull != null) {
                        woVar.l0(chatFull);
                    } else {
                        woVar.m0(profileActivity11.f31404v2);
                    }
                    this.f34748b.presentFragment(woVar);
                } else if (i10 == 41) {
                    this.f34748b.presentFragment(new UserInfoActivity());
                } else if (i10 == 9) {
                    TLRPC.User user3 = this.f34748b.getMessagesController().getUser(Long.valueOf(this.f34748b.f31286e1));
                    if (user3 != null) {
                        Bundle e7 = org.telegram.messenger.w1.e(2, "onlySelect", "dialogsType", true);
                        e7.putBoolean("resetDelegate", false);
                        e7.putBoolean("closeFragment", false);
                        wy wyVar2 = new wy(e7);
                        wyVar2.C2 = new c7(this, user3, wyVar2, 19);
                        this.f34748b.presentFragment(wyVar2);
                    }
                } else if (i10 == 10) {
                    this.f34748b.s4();
                } else if (i10 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f34748b;
                        if (profileActivity12.D2 != null) {
                            j3 = DialogObject.makeEncryptedDialogId(encryptedChat.f18129id);
                        } else {
                            j3 = profileActivity12.f31286e1;
                            if (j3 == 0) {
                                long j11 = profileActivity12.f31294f1;
                                if (j11 != 0) {
                                    j3 = -j11;
                                } else {
                                    return;
                                }
                            }
                        }
                        this.f34748b.getMediaDataController().installShortcut(j3, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                } else if (i10 != 15 && i10 != 16) {
                    if (i10 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f34748b.f31294f1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        ur urVar = new ur(bundle4);
                        urVar.x0(this.f34748b.f31397u2);
                        this.f34748b.presentFragment(urVar);
                    } else if (i10 == 18) {
                        this.f34748b.v4();
                    } else if (i10 == 19) {
                        this.f34748b.presentFragment(ab1.d0(this.f34748b.getMessagesController().getChat(Long.valueOf(this.f34748b.f31294f1)), false));
                    } else if (i10 == 22) {
                        this.f34748b.y4();
                    } else if (i10 == 38) {
                        this.f34748b.p4();
                    } else if (i10 == 39) {
                        Bundle e11 = org.telegram.ui.Cells.p6.e(2, "type");
                        e11.putLong("dialog_id", -this.f34748b.f31294f1);
                        org.telegram.ui.Components.ba0 ba0Var = new org.telegram.ui.Components.ba0(e11, null);
                        ProfileActivity profileActivity13 = this.f34748b;
                        ba0Var.f22686c = profileActivity13.f31397u2;
                        profileActivity13.presentFragment(ba0Var);
                    } else if (i10 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.f34748b.getParentActivity(), 0, this.f34748b.f31429z0);
                        alertDialog$Builder3.f18447a.R = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
                        alertDialog$Builder3.f18447a.T = LocaleController.getString(R.string.AreYouSureSecretChat);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.b2(this) {
                            public final j01 f34088b;

                            {
                                this.f34088b = this;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.c2 r11, int r12) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h01.f(org.telegram.ui.ActionBar.c2, int):void");
                            }
                        });
                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                        this.f34748b.showDialog(alertDialog$Builder3.f18447a);
                    } else if (i10 == 44) {
                        i17 = ((org.telegram.ui.ActionBar.o2) this.f34748b).currentAccount;
                        long j12 = this.f34748b.f31286e1;
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
                                nf.f.s(ApplicationLoader.applicationContext, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                            if (U != null) {
                                if (!(U instanceof bo) || ((bo) U).a() != j12) {
                                    U.presentFragment(bo.R9(j12));
                                }
                                AndroidUtilities.runOnUIThread(new ei.b2(i17, j12), 150L);
                            }
                        }
                    } else if (i10 == 21) {
                        if (this.f34748b.getParentActivity() != null) {
                            int i24 = Build.VERSION.SDK_INT;
                            if (i24 >= 23 && ((i24 <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.f34748b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                                this.f34748b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            rz0 rz0Var = this.f34748b.f31346n0;
                            ImageLocation D = rz0Var.D(rz0Var.getRealPosition());
                            if (D != null) {
                                if (D.imageType == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i16 = ((org.telegram.ui.ActionBar.o2) this.f34748b).currentAccount;
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
                                    MediaController.saveFile(pathToAttach.toString(), this.f34748b.getParentActivity(), 0, null, null, new ai.i3(3, this, z10));
                                }
                            }
                        }
                    } else if (i10 == 30) {
                        this.f34748b.presentFragment(new UserInfoActivity());
                    } else if (i10 == 40) {
                        ProfileActivity profileActivity14 = this.f34748b;
                        cq0 cq0Var = new cq0();
                        cq0Var.H = this.f34748b;
                        profileActivity14.presentFragment(cq0Var);
                    } else if (i10 == 42) {
                        TLRPC.User user4 = this.f34748b.getMessagesController().getUser(Long.valueOf(this.f34748b.f31286e1));
                        AndroidUtilities.addToClipboard(this.f34748b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(user4));
                    } else if (i10 == 43) {
                        this.f34748b.presentFragment(new sa(null));
                    } else if (i10 == 31) {
                        this.f34748b.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                    } else if (i10 == 33) {
                        int realPosition = this.f34748b.f31346n0.getRealPosition();
                        TLRPC.Photo F = this.f34748b.f31346n0.F(realPosition);
                        if (F != null) {
                            rz0 rz0Var2 = this.f34748b.f31346n0;
                            ArrayList arrayList2 = rz0Var2.f27033b1;
                            ArrayList arrayList3 = rz0Var2.f27032a1;
                            ArrayList arrayList4 = rz0Var2.Z0;
                            ArrayList arrayList5 = rz0Var2.Y0;
                            ArrayList arrayList6 = rz0Var2.W0;
                            ArrayList arrayList7 = rz0Var2.U0;
                            ArrayList arrayList8 = rz0Var2.X0;
                            ArrayList arrayList9 = rz0Var2.V0;
                            MessagesController.DialogPhotos dialogPhotos = rz0Var2.S0;
                            if (dialogPhotos != null) {
                                dialogPhotos.moveToStart(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                rz0Var2.f27034c1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = rz0Var2.T0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (ImageLocation) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (ImageLocation) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (ImageLocation) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.r61) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                rz0Var2.P0 = (ImageLocation) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f18253id = tL_inputPhoto;
                            tL_inputPhoto.f18140id = F.f18145id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            UserConfig userConfig = this.f34748b.getUserConfig();
                            this.f34748b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ps0(this, userConfig, F, 6));
                            ProfileActivity profileActivity15 = this.f34748b;
                            UndoView undoView = profileActivity15.M;
                            long j13 = profileActivity15.f31286e1;
                            if (F.video_sizes.isEmpty()) {
                                obj = null;
                            } else {
                                obj = 1;
                            }
                            undoView.m(j13, obj, 22);
                            TLRPC.User user5 = this.f34748b.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 800);
                            if (user5 != null) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 90);
                                TLRPC.UserProfilePhoto userProfilePhoto = user5.photo;
                                userProfilePhoto.photo_id = F.f18145id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user5);
                                userConfig.saveConfig(true);
                                i15 = ((org.telegram.ui.ActionBar.o2) this.f34748b).currentAccount;
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                this.f34748b.i5(true);
                            }
                            rz0 rz0Var3 = this.f34748b.f31346n0;
                            rz0Var3.D0.g();
                            rz0Var3.L();
                        }
                    } else if (i10 == 34) {
                        i11 = ((org.telegram.ui.ActionBar.o2) this.f34748b).currentAccount;
                        if (MessagesController.getInstance(i11).isFrozen()) {
                            i14 = ((org.telegram.ui.ActionBar.o2) this.f34748b).currentAccount;
                            b.b(i14);
                            return;
                        }
                        int realPosition2 = this.f34748b.f31346n0.getRealPosition();
                        ImageLocation D2 = this.f34748b.f31346n0.D(realPosition2);
                        if (D2 != null) {
                            i12 = ((org.telegram.ui.ActionBar.o2) this.f34748b).currentAccount;
                            FileLoader fileLoader2 = FileLoader.getInstance(i12);
                            Drawable[] drawableArr = PhotoViewer.U8;
                            File pathToAttach2 = fileLoader2.getPathToAttach(D2.location, PhotoViewer.q1(D2), true);
                            if (D2.imageType == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                ImageLocation G = this.f34748b.f31346n0.G(realPosition2);
                                i13 = ((org.telegram.ui.ActionBar.o2) this.f34748b).currentAccount;
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
                            this.f34748b.f31366q0.q(pathToAttach2.getAbsolutePath(), str, z12);
                        }
                    } else if (i10 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.f34748b.getParentActivity(), 0, this.f34748b.f31429z0);
                        rz0 rz0Var4 = this.f34748b.f31346n0;
                        ImageLocation D3 = rz0Var4.D(rz0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.imageType == 2) {
                                alertDialog$Builder4.f18447a.R = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                                alertDialog$Builder4.f18447a.T = LocaleController.getString(R.string.AreYouSureDeleteVideo);
                            } else {
                                alertDialog$Builder4.f18447a.R = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                                alertDialog$Builder4.f18447a.T = LocaleController.getString(R.string.AreYouSureDeletePhoto);
                            }
                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                                public final j01 f34088b;

                                {
                                    this.f34088b = this;
                                }

                                @Override
                                public final void f(org.telegram.ui.ActionBar.c2 r11, int r12) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.h01.f(org.telegram.ui.ActionBar.c2, int):void");
                                }
                            });
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder4.f18447a;
                            this.f34748b.showDialog(c2Var3);
                            TextView textView4 = (TextView) c2Var3.d(-1);
                            if (textView4 != null) {
                                textView4.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19101q7, this.f34748b.f31429z0));
                            }
                        }
                    } else if (i10 == 36) {
                        this.f34748b.u4();
                    }
                } else {
                    ProfileActivity profileActivity16 = this.f34748b;
                    if (i10 == 16) {
                        z11 = true;
                    }
                    profileActivity16.o4(z11);
                }
            }
        }
    }
}
