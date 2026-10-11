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
public final class f01 extends org.telegram.ui.ActionBar.j {
    public final Context f37498a;
    public final ProfileActivity f37499b;

    public f01(ProfileActivity profileActivity, Context context) {
        this.f37499b = profileActivity;
        this.f37498a = context;
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
        org.telegram.ui.Components.tt0 tt0Var;
        if (this.f37499b.getParentActivity() != null) {
            if (i10 == -1) {
                ProfileActivity profileActivity = this.f37499b;
                j01 j01Var = profileActivity.O;
                if (j01Var != null && (tt0Var = j01Var.I0) != null && tt0Var.f24314n0) {
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
                this.f37499b.n4(false);
            } else if (i10 == 1) {
                TLRPC.User user = this.f37499b.getMessagesController().getUser(Long.valueOf(this.f37499b.f34271e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f20179id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f37499b;
                ps psVar = new ps(bundle, profileActivity2.f34414z0);
                psVar.O = new jy0(profileActivity2, user);
                profileActivity2.presentFragment(psVar);
            } else if (i10 == 3) {
                Bundle d = org.telegram.messenger.ai.d(3, "onlySelect", "dialogsType", true);
                d.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
                d.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
                sy syVar = new sy(d);
                ProfileActivity profileActivity3 = this.f37499b;
                syVar.C2 = profileActivity3;
                profileActivity3.presentFragment(syVar);
            } else if (i10 == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f37499b.f34271e1);
                ProfileActivity profileActivity4 = this.f37499b;
                profileActivity4.presentFragment(new ps(bundle2, profileActivity4.f34414z0));
            } else {
                String str3 = null;
                if (i10 == 5) {
                    TLRPC.User user2 = this.f37499b.getMessagesController().getUser(Long.valueOf(this.f37499b.f34271e1));
                    if (user2 != null && this.f37499b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f37499b.getParentActivity(), 0, this.f37499b.f34414z0);
                        alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new js0(8, this, user2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                        this.f37499b.showDialog(a2Var);
                        TextView textView = (TextView) a2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21026q7, this.f37499b.f34414z0));
                        }
                    }
                } else if (i10 == 7) {
                    this.f37499b.i4(false);
                } else if (i10 == 45) {
                    this.f37499b.i4(true);
                } else if (i10 == 46) {
                    if (!this.f37499b.getUserConfig().isPremium()) {
                        ProfileActivity profileActivity5 = this.f37499b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i19 = ((org.telegram.ui.ActionBar.m2) this.f37499b).currentAccount;
                        new rg.y0(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f37498a;
                    org.telegram.ui.ActionBar.d6 d6Var = this.f37499b.f34414z0;
                    mz0 mz0Var = new mz0(this, 1);
                    Pattern pattern = org.telegram.ui.Components.g5.f26605a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.e3 i21 = org.telegram.messenger.ai.i(1, context, null, false);
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
                        org.telegram.messenger.ai.j(20.0f, R.string.DisableSharingInfoHeader, 1, textView2);
                        int i22 = org.telegram.ui.ActionBar.h6.G6;
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i22, d6Var));
                        linearLayout.addView(textView2, w7.x5.t(-1, -2, 17, 20, 0, 20, 14));
                        tw0 tw0Var = new tw0(context, d6Var);
                        tw0Var.f42281a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
                        tw0Var.f42282b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
                        tw0Var.d.setVisibility(8);
                        tw0Var.f42283c.setImageResource(R.drawable.menu_photo_off_24);
                        tw0Var.f42283c.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i22, d6Var));
                        linearLayout.addView(tw0Var, w7.x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        tw0 tw0Var2 = new tw0(context, d6Var);
                        tw0Var2.f42281a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
                        tw0Var2.f42282b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
                        tw0Var2.d.setVisibility(8);
                        tw0Var2.f42283c.setImageResource(R.drawable.menu_share_off_24);
                        tw0Var2.f42283c.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i22, d6Var));
                        linearLayout.addView(tw0Var2, w7.x5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        tw0 tw0Var3 = new tw0(context, d6Var);
                        tw0Var3.f42281a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
                        tw0Var3.f42282b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
                        tw0Var3.d.setVisibility(8);
                        tw0Var3.f42283c.setImageResource(R.drawable.menu_download_off_24);
                        tw0Var3.f42283c.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i22, d6Var));
                        linearLayout.addView(tw0Var3, w7.x5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        ci.d dVar = new ci.d(context, d6Var, true);
                        dVar.setOnClickListener(new rf(15, zArr, runnable));
                        dVar.e();
                        dVar.g(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
                        linearLayout.addView(dVar, w7.x5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        i21.customView = linearLayout;
                        i21.show();
                        i21.setOnDismissListener(new ug(28, zArr, mz0Var));
                    }
                } else if (i10 == 47) {
                    ProfileActivity profileActivity6 = this.f37499b;
                    profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.f34271e1, 0, false, new ci.za(2, profileActivity6, false));
                } else if (i10 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f37499b.getParentActivity());
                    alertDialog$Builder2.f20368a.R = LocaleController.getPluralString("DeleteTopics", 1);
                    i18 = ((org.telegram.ui.ActionBar.m2) this.f37499b).currentAccount;
                    TopicsController topicsController = MessagesController.getInstance(i18).getTopicsController();
                    ProfileActivity profileActivity7 = this.f37499b;
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.f34279f1, profileActivity7.f34286g1);
                    int i23 = R.string.DeleteSelectedTopic;
                    if (findTopic == null) {
                        str2 = "topic";
                    } else {
                        str2 = findTopic.title;
                    }
                    alertDialog$Builder2.f20368a.T = LocaleController.formatString("DeleteSelectedTopic", i23, str2);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                        public final f01 f36865b;

                        {
                            this.f36865b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.a2 r11, int r12) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d01.f(org.telegram.ui.ActionBar.a2, int):void");
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new v20(13));
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f20368a;
                    a2Var2.show();
                    TextView textView3 = (TextView) a2Var2.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21026q7, false));
                    }
                } else if (i10 == 24) {
                    ProfileActivity profileActivity8 = this.f37499b;
                    b41.M(profileActivity8.a(), profileActivity8);
                } else if (i10 == 12) {
                    ProfileActivity profileActivity9 = this.f37499b;
                    if (profileActivity9.f34352q1) {
                        profileActivity9.presentFragment(af1.a0(profileActivity9.f34279f1, profileActivity9.f34286g1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f37499b;
                    long j10 = profileActivity10.f34279f1;
                    if (j10 != 0) {
                        bundle3.putLong("chat_id", j10);
                    } else if (profileActivity10.f34360r2) {
                        bundle3.putLong("user_id", profileActivity10.f34271e1);
                    }
                    uo uoVar = new uo(bundle3);
                    ProfileActivity profileActivity11 = this.f37499b;
                    TLRPC.ChatFull chatFull = profileActivity11.f34382u2;
                    if (chatFull != null) {
                        uoVar.l0(chatFull);
                    } else {
                        uoVar.m0(profileActivity11.f34389v2);
                    }
                    this.f37499b.presentFragment(uoVar);
                } else if (i10 == 41) {
                    this.f37499b.presentFragment(new UserInfoActivity());
                } else if (i10 == 9) {
                    TLRPC.User user3 = this.f37499b.getMessagesController().getUser(Long.valueOf(this.f37499b.f34271e1));
                    if (user3 != null) {
                        Bundle d10 = org.telegram.messenger.ai.d(2, "onlySelect", "dialogsType", true);
                        d10.putBoolean("resetDelegate", false);
                        d10.putBoolean("closeFragment", false);
                        sy syVar2 = new sy(d10);
                        syVar2.C2 = new z6(this, user3, syVar2, 19);
                        this.f37499b.presentFragment(syVar2);
                    }
                } else if (i10 == 10) {
                    this.f37499b.s4();
                } else if (i10 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f37499b;
                        if (profileActivity12.D2 != null) {
                            j3 = DialogObject.makeEncryptedDialogId(encryptedChat.f20040id);
                        } else {
                            j3 = profileActivity12.f34271e1;
                            if (j3 == 0) {
                                long j11 = profileActivity12.f34279f1;
                                if (j11 != 0) {
                                    j3 = -j11;
                                } else {
                                    return;
                                }
                            }
                        }
                        this.f37499b.getMediaDataController().installShortcut(j3, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                } else if (i10 != 15 && i10 != 16) {
                    if (i10 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f37499b.f34279f1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        sr srVar = new sr(bundle4);
                        srVar.x0(this.f37499b.f34382u2);
                        this.f37499b.presentFragment(srVar);
                    } else if (i10 == 18) {
                        this.f37499b.v4();
                    } else if (i10 == 19) {
                        this.f37499b.presentFragment(ab1.d0(this.f37499b.getMessagesController().getChat(Long.valueOf(this.f37499b.f34279f1)), false));
                    } else if (i10 == 22) {
                        this.f37499b.y4();
                    } else if (i10 == 38) {
                        this.f37499b.p4();
                    } else if (i10 == 48) {
                        ProfileActivity profileActivity13 = this.f37499b;
                        org.telegram.ui.Wallet.l8 l8Var = new org.telegram.ui.Wallet.l8(profileActivity13.getMessagesController().getUser(Long.valueOf(this.f37499b.f34271e1)));
                        l8Var.f35232c0 = true;
                        profileActivity13.presentFragment(l8Var);
                    } else if (i10 == 39) {
                        Bundle f7 = org.telegram.ui.Cells.c1.f(2, "type");
                        f7.putLong("dialog_id", -this.f37499b.f34279f1);
                        org.telegram.ui.Components.eb0 eb0Var = new org.telegram.ui.Components.eb0(f7, null);
                        ProfileActivity profileActivity14 = this.f37499b;
                        eb0Var.f25959c = profileActivity14.f34382u2;
                        profileActivity14.presentFragment(eb0Var);
                    } else if (i10 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.f37499b.getParentActivity(), 0, this.f37499b.f34414z0);
                        alertDialog$Builder3.f20368a.R = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
                        alertDialog$Builder3.f20368a.T = LocaleController.getString(R.string.AreYouSureSecretChat);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.z1(this) {
                            public final f01 f36865b;

                            {
                                this.f36865b = this;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.a2 r11, int r12) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d01.f(org.telegram.ui.ActionBar.a2, int):void");
                            }
                        });
                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                        this.f37499b.showDialog(alertDialog$Builder3.f20368a);
                    } else if (i10 == 44) {
                        i17 = ((org.telegram.ui.ActionBar.m2) this.f37499b).currentAccount;
                        long j12 = this.f37499b.f34271e1;
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
                            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                            if (U != null) {
                                if (!(U instanceof zn) || ((zn) U).a() != j12) {
                                    U.presentFragment(zn.W9(j12));
                                }
                                AndroidUtilities.runOnUIThread(new ei.b2(i17, j12, 0), 150L);
                            }
                        }
                    } else if (i10 == 21) {
                        if (this.f37499b.getParentActivity() != null) {
                            if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.f37499b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                this.f37499b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            oz0 oz0Var = this.f37499b.f34331n0;
                            ImageLocation D = oz0Var.D(oz0Var.getRealPosition());
                            if (D != null) {
                                if (D.imageType == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i16 = ((org.telegram.ui.ActionBar.m2) this.f37499b).currentAccount;
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
                                    MediaController.saveFile(pathToAttach.toString(), this.f37499b.getParentActivity(), 0, null, null, new ai.j3(7, this, z10));
                                }
                            }
                        }
                    } else if (i10 == 30) {
                        this.f37499b.presentFragment(new UserInfoActivity());
                    } else if (i10 == 40) {
                        ProfileActivity profileActivity15 = this.f37499b;
                        zp0 zp0Var = new zp0();
                        zp0Var.H = this.f37499b;
                        profileActivity15.presentFragment(zp0Var);
                    } else if (i10 == 42) {
                        TLRPC.User user4 = this.f37499b.getMessagesController().getUser(Long.valueOf(this.f37499b.f34271e1));
                        AndroidUtilities.addToClipboard(this.f37499b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(user4));
                    } else if (i10 == 43) {
                        this.f37499b.presentFragment(new qa(null));
                    } else if (i10 == 31) {
                        this.f37499b.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                    } else if (i10 == 33) {
                        int realPosition = this.f37499b.f34331n0.getRealPosition();
                        TLRPC.Photo F = this.f37499b.f34331n0.F(realPosition);
                        if (F != null) {
                            oz0 oz0Var2 = this.f37499b.f34331n0;
                            ArrayList arrayList2 = oz0Var2.f31804b1;
                            ArrayList arrayList3 = oz0Var2.f31803a1;
                            ArrayList arrayList4 = oz0Var2.Z0;
                            ArrayList arrayList5 = oz0Var2.Y0;
                            ArrayList arrayList6 = oz0Var2.W0;
                            ArrayList arrayList7 = oz0Var2.U0;
                            ArrayList arrayList8 = oz0Var2.X0;
                            ArrayList arrayList9 = oz0Var2.V0;
                            MessagesController.DialogPhotos dialogPhotos = oz0Var2.S0;
                            if (dialogPhotos != null) {
                                dialogPhotos.moveToStart(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                oz0Var2.f31805c1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = oz0Var2.T0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (ImageLocation) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (ImageLocation) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (ImageLocation) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.x71) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                oz0Var2.P0 = (ImageLocation) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f20164id = tL_inputPhoto;
                            tL_inputPhoto.f20051id = F.f20056id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            UserConfig userConfig = this.f37499b.getUserConfig();
                            this.f37499b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new ms0(this, userConfig, F, 6));
                            ProfileActivity profileActivity16 = this.f37499b;
                            UndoView undoView = profileActivity16.M;
                            long j13 = profileActivity16.f34271e1;
                            if (F.video_sizes.isEmpty()) {
                                obj = null;
                            } else {
                                obj = 1;
                            }
                            undoView.m(j13, obj, 22);
                            TLRPC.User user5 = this.f37499b.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 800);
                            if (user5 != null) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 90);
                                TLRPC.UserProfilePhoto userProfilePhoto = user5.photo;
                                userProfilePhoto.photo_id = F.f20056id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user5);
                                userConfig.saveConfig(true);
                                i15 = ((org.telegram.ui.ActionBar.m2) this.f37499b).currentAccount;
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                this.f37499b.i5(true);
                            }
                            oz0 oz0Var3 = this.f37499b.f34331n0;
                            oz0Var3.D0.g();
                            oz0Var3.L();
                        }
                    } else if (i10 == 34) {
                        i11 = ((org.telegram.ui.ActionBar.m2) this.f37499b).currentAccount;
                        if (MessagesController.getInstance(i11).isFrozen()) {
                            i14 = ((org.telegram.ui.ActionBar.m2) this.f37499b).currentAccount;
                            b.b(i14);
                            return;
                        }
                        int realPosition2 = this.f37499b.f34331n0.getRealPosition();
                        ImageLocation D2 = this.f37499b.f34331n0.D(realPosition2);
                        if (D2 != null) {
                            i12 = ((org.telegram.ui.ActionBar.m2) this.f37499b).currentAccount;
                            FileLoader fileLoader2 = FileLoader.getInstance(i12);
                            Drawable[] drawableArr = PhotoViewer.U8;
                            File pathToAttach2 = fileLoader2.getPathToAttach(D2.location, PhotoViewer.q1(D2), true);
                            if (D2.imageType == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                ImageLocation G = this.f37499b.f34331n0.G(realPosition2);
                                i13 = ((org.telegram.ui.ActionBar.m2) this.f37499b).currentAccount;
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
                            this.f37499b.f34351q0.p(pathToAttach2.getAbsolutePath(), str, z12);
                        }
                    } else if (i10 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.f37499b.getParentActivity(), 0, this.f37499b.f34414z0);
                        oz0 oz0Var4 = this.f37499b.f34331n0;
                        ImageLocation D3 = oz0Var4.D(oz0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.imageType == 2) {
                                alertDialog$Builder4.f20368a.R = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                                alertDialog$Builder4.f20368a.T = LocaleController.getString(R.string.AreYouSureDeleteVideo);
                            } else {
                                alertDialog$Builder4.f20368a.R = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                                alertDialog$Builder4.f20368a.T = LocaleController.getString(R.string.AreYouSureDeletePhoto);
                            }
                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                                public final f01 f36865b;

                                {
                                    this.f36865b = this;
                                }

                                @Override
                                public final void f(org.telegram.ui.ActionBar.a2 r11, int r12) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d01.f(org.telegram.ui.ActionBar.a2, int):void");
                                }
                            });
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder4.f20368a;
                            this.f37499b.showDialog(a2Var3);
                            TextView textView4 = (TextView) a2Var3.d(-1);
                            if (textView4 != null) {
                                textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21026q7, this.f37499b.f34414z0));
                            }
                        }
                    } else if (i10 == 36) {
                        this.f37499b.u4();
                    }
                } else {
                    ProfileActivity profileActivity17 = this.f37499b;
                    if (i10 == 16) {
                        z11 = true;
                    }
                    profileActivity17.o4(z11);
                }
            }
        }
    }
}
