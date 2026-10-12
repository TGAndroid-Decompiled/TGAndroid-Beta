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
public final class n01 extends org.telegram.ui.ActionBar.j {
    public final Context f38392a;
    public final ProfileActivity f38393b;

    public n01(ProfileActivity profileActivity, Context context) {
        this.f38393b = profileActivity;
        this.f38392a = context;
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
        org.telegram.ui.Components.nt0 nt0Var;
        if (this.f38393b.getParentActivity() != null) {
            if (i10 == -1) {
                ProfileActivity profileActivity = this.f38393b;
                r01 r01Var = profileActivity.O;
                if (r01Var != null && (nt0Var = r01Var.I0) != null && nt0Var.f23303n0) {
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
                this.f38393b.n4(false);
            } else if (i10 == 1) {
                TLRPC.User user = this.f38393b.getMessagesController().getUser(Long.valueOf(this.f38393b.f32559e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f19363id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f38393b;
                ws wsVar = new ws(bundle, profileActivity2.f32703z0);
                wsVar.O = new qy0(profileActivity2, user);
                profileActivity2.presentFragment(wsVar);
            } else if (i10 == 3) {
                Bundle d = org.telegram.messenger.yh.d(3, "onlySelect", "dialogsType", true);
                d.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
                d.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
                yy yyVar = new yy(d);
                ProfileActivity profileActivity3 = this.f38393b;
                yyVar.C2 = profileActivity3;
                profileActivity3.presentFragment(yyVar);
            } else if (i10 == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f38393b.f32559e1);
                ProfileActivity profileActivity4 = this.f38393b;
                profileActivity4.presentFragment(new ws(bundle2, profileActivity4.f32703z0));
            } else {
                String str3 = null;
                if (i10 == 5) {
                    TLRPC.User user2 = this.f38393b.getMessagesController().getUser(Long.valueOf(this.f38393b.f32559e1));
                    if (user2 != null && this.f38393b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f38393b.getParentActivity(), 0, this.f38393b.f32703z0);
                        alertDialog$Builder.f19548a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new cs0(10, this, user2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f19548a;
                        this.f38393b.showDialog(a2Var);
                        TextView textView = (TextView) a2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20139q7, this.f38393b.f32703z0));
                        }
                    }
                } else if (i10 == 7) {
                    this.f38393b.i4(false);
                } else if (i10 == 45) {
                    this.f38393b.i4(true);
                } else if (i10 == 46) {
                    if (!this.f38393b.getUserConfig().isPremium()) {
                        ProfileActivity profileActivity5 = this.f38393b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i19 = ((org.telegram.ui.ActionBar.m2) this.f38393b).currentAccount;
                        new sg.y0(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f38392a;
                    org.telegram.ui.ActionBar.c6 c6Var = this.f38393b.f32703z0;
                    uz0 uz0Var = new uz0(this, 1);
                    Pattern pattern = org.telegram.ui.Components.g5.f25184a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.e3 i21 = org.telegram.messenger.yh.i(1, context, null, false);
                        runnable = i21.dismissRunnable;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, w7.a6.t(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(R.raw.raised_hand, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(AndroidUtilities.bold());
                        textView2.setGravity(17);
                        org.telegram.messenger.yh.j(20.0f, R.string.DisableSharingInfoHeader, 1, textView2);
                        int i22 = org.telegram.ui.ActionBar.g6.G6;
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(i22, c6Var));
                        linearLayout.addView(textView2, w7.a6.t(-1, -2, 17, 20, 0, 20, 14));
                        ax0 ax0Var = new ax0(context, c6Var);
                        ax0Var.f34364a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
                        ax0Var.f34365b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
                        ax0Var.d.setVisibility(8);
                        ax0Var.f34366c.setImageResource(R.drawable.menu_photo_off_24);
                        ax0Var.f34366c.setColorFilter(org.telegram.ui.ActionBar.g6.w0(i22, c6Var));
                        linearLayout.addView(ax0Var, w7.a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        ax0 ax0Var2 = new ax0(context, c6Var);
                        ax0Var2.f34364a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
                        ax0Var2.f34365b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
                        ax0Var2.d.setVisibility(8);
                        ax0Var2.f34366c.setImageResource(R.drawable.menu_share_off_24);
                        ax0Var2.f34366c.setColorFilter(org.telegram.ui.ActionBar.g6.w0(i22, c6Var));
                        linearLayout.addView(ax0Var2, w7.a6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        ax0 ax0Var3 = new ax0(context, c6Var);
                        ax0Var3.f34364a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
                        ax0Var3.f34365b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
                        ax0Var3.d.setVisibility(8);
                        ax0Var3.f34366c.setImageResource(R.drawable.menu_download_off_24);
                        ax0Var3.f34366c.setColorFilter(org.telegram.ui.ActionBar.g6.w0(i22, c6Var));
                        linearLayout.addView(ax0Var3, w7.a6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        di.d dVar = new di.d(context, c6Var, true);
                        dVar.setOnClickListener(new xf(15, zArr, runnable));
                        dVar.e();
                        dVar.g(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
                        linearLayout.addView(dVar, w7.a6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        i21.customView = linearLayout;
                        i21.show();
                        i21.setOnDismissListener(new rp(10, zArr, uz0Var));
                    }
                } else if (i10 == 47) {
                    ProfileActivity profileActivity6 = this.f38393b;
                    profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.f32559e1, 0, false, new di.ya(2, profileActivity6, false));
                } else if (i10 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f38393b.getParentActivity());
                    alertDialog$Builder2.f19548a.R = LocaleController.getPluralString("DeleteTopics", 1);
                    i18 = ((org.telegram.ui.ActionBar.m2) this.f38393b).currentAccount;
                    TopicsController topicsController = MessagesController.getInstance(i18).getTopicsController();
                    ProfileActivity profileActivity7 = this.f38393b;
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.f32567f1, profileActivity7.f32574g1);
                    int i23 = R.string.DeleteSelectedTopic;
                    if (findTopic == null) {
                        str2 = "topic";
                    } else {
                        str2 = findTopic.title;
                    }
                    alertDialog$Builder2.f19548a.T = LocaleController.formatString("DeleteSelectedTopic", i23, str2);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                        public final n01 f37800b;

                        {
                            this.f37800b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.a2 r11, int r12) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l01.g(org.telegram.ui.ActionBar.a2, int):void");
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new ul0(6));
                    org.telegram.ui.ActionBar.a2 a2Var2 = alertDialog$Builder2.f19548a;
                    a2Var2.show();
                    TextView textView3 = (TextView) a2Var2.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f20139q7, false));
                    }
                } else if (i10 == 24) {
                    ProfileActivity profileActivity8 = this.f38393b;
                    i41.M(profileActivity8.a(), profileActivity8);
                } else if (i10 == 12) {
                    ProfileActivity profileActivity9 = this.f38393b;
                    if (profileActivity9.f32641q1) {
                        profileActivity9.presentFragment(hf1.a0(profileActivity9.f32567f1, profileActivity9.f32574g1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f38393b;
                    long j11 = profileActivity10.f32567f1;
                    if (j11 != 0) {
                        bundle3.putLong("chat_id", j11);
                    } else if (profileActivity10.f32649r2) {
                        bundle3.putLong("user_id", profileActivity10.f32559e1);
                    }
                    zo zoVar = new zo(bundle3);
                    ProfileActivity profileActivity11 = this.f38393b;
                    TLRPC.ChatFull chatFull = profileActivity11.f32671u2;
                    if (chatFull != null) {
                        zoVar.l0(chatFull);
                    } else {
                        zoVar.m0(profileActivity11.f32678v2);
                    }
                    this.f38393b.presentFragment(zoVar);
                } else if (i10 == 41) {
                    this.f38393b.presentFragment(new UserInfoActivity());
                } else if (i10 == 9) {
                    TLRPC.User user3 = this.f38393b.getMessagesController().getUser(Long.valueOf(this.f38393b.f32559e1));
                    if (user3 != null) {
                        Bundle d10 = org.telegram.messenger.yh.d(2, "onlySelect", "dialogsType", true);
                        d10.putBoolean("resetDelegate", false);
                        d10.putBoolean("closeFragment", false);
                        yy yyVar2 = new yy(d10);
                        yyVar2.C2 = new f7(this, user3, yyVar2, 19);
                        this.f38393b.presentFragment(yyVar2);
                    }
                } else if (i10 == 10) {
                    this.f38393b.s4();
                } else if (i10 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f38393b;
                        if (profileActivity12.D2 != null) {
                            j10 = DialogObject.makeEncryptedDialogId(encryptedChat.f19224id);
                        } else {
                            j10 = profileActivity12.f32559e1;
                            if (j10 == 0) {
                                long j12 = profileActivity12.f32567f1;
                                if (j12 != 0) {
                                    j10 = -j12;
                                } else {
                                    return;
                                }
                            }
                        }
                        this.f38393b.getMediaDataController().installShortcut(j10, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (i10 != 15 && i10 != 16) {
                    if (i10 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f38393b.f32567f1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        yr yrVar = new yr(bundle4);
                        yrVar.x0(this.f38393b.f32671u2);
                        this.f38393b.presentFragment(yrVar);
                    } else if (i10 == 18) {
                        this.f38393b.v4();
                    } else if (i10 == 19) {
                        this.f38393b.presentFragment(hb1.d0(this.f38393b.getMessagesController().getChat(Long.valueOf(this.f38393b.f32567f1)), false));
                    } else if (i10 == 22) {
                        this.f38393b.y4();
                    } else if (i10 == 38) {
                        this.f38393b.p4();
                    } else if (i10 == 48) {
                        ProfileActivity profileActivity13 = this.f38393b;
                        org.telegram.ui.Wallet.i8 i8Var = new org.telegram.ui.Wallet.i8(profileActivity13.getMessagesController().getUser(Long.valueOf(this.f38393b.f32559e1)));
                        i8Var.f33295c0 = true;
                        profileActivity13.presentFragment(i8Var);
                    } else if (i10 == 39) {
                        Bundle g10 = org.telegram.ui.Cells.d0.g(2, "type");
                        g10.putLong("dialog_id", -this.f38393b.f32567f1);
                        org.telegram.ui.Components.cb0 cb0Var = new org.telegram.ui.Components.cb0(g10, null);
                        ProfileActivity profileActivity14 = this.f38393b;
                        cb0Var.f24020c = profileActivity14.f32671u2;
                        profileActivity14.presentFragment(cb0Var);
                    } else if (i10 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.f38393b.getParentActivity(), 0, this.f38393b.f32703z0);
                        alertDialog$Builder3.f19548a.R = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
                        alertDialog$Builder3.f19548a.T = LocaleController.getString(R.string.AreYouSureSecretChat);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.z1(this) {
                            public final n01 f37800b;

                            {
                                this.f37800b = this;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.a2 r11, int r12) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l01.g(org.telegram.ui.ActionBar.a2, int):void");
                            }
                        });
                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                        this.f38393b.showDialog(alertDialog$Builder3.f19548a);
                    } else if (i10 == 44) {
                        i17 = ((org.telegram.ui.ActionBar.m2) this.f38393b).currentAccount;
                        long j13 = this.f38393b.f32559e1;
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
                                pf.d.s(ApplicationLoader.applicationContext, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                            if (U != null) {
                                if (!(U instanceof fo) || ((fo) U).a() != j13) {
                                    U.presentFragment(fo.W9(j13));
                                }
                                AndroidUtilities.runOnUIThread(new fi.a2(i17, j13, 0), 150L);
                            }
                        }
                    } else if (i10 == 21) {
                        if (this.f38393b.getParentActivity() != null) {
                            if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.f38393b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                this.f38393b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            wz0 wz0Var = this.f38393b.f32620n0;
                            ImageLocation D = wz0Var.D(wz0Var.getRealPosition());
                            if (D != null) {
                                if (D.imageType == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i16 = ((org.telegram.ui.ActionBar.m2) this.f38393b).currentAccount;
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
                                    MediaController.saveFile(pathToAttach.toString(), this.f38393b.getParentActivity(), 0, null, null, new bi.y2(7, this, z10));
                                }
                            }
                        }
                    } else if (i10 == 30) {
                        this.f38393b.presentFragment(new UserInfoActivity());
                    } else if (i10 == 40) {
                        ProfileActivity profileActivity15 = this.f38393b;
                        gq0 gq0Var = new gq0();
                        gq0Var.H = this.f38393b;
                        profileActivity15.presentFragment(gq0Var);
                    } else if (i10 == 42) {
                        TLRPC.User user4 = this.f38393b.getMessagesController().getUser(Long.valueOf(this.f38393b.f32559e1));
                        AndroidUtilities.addToClipboard(this.f38393b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(user4));
                    } else if (i10 == 43) {
                        this.f38393b.presentFragment(new va(null));
                    } else if (i10 == 31) {
                        this.f38393b.presentFragment(new org.telegram.ui.ActionBar.m2(null));
                    } else if (i10 == 33) {
                        int realPosition = this.f38393b.f32620n0.getRealPosition();
                        TLRPC.Photo F = this.f38393b.f32620n0.F(realPosition);
                        if (F != null) {
                            wz0 wz0Var2 = this.f38393b.f32620n0;
                            ArrayList arrayList2 = wz0Var2.f28320b1;
                            ArrayList arrayList3 = wz0Var2.f28319a1;
                            ArrayList arrayList4 = wz0Var2.Z0;
                            ArrayList arrayList5 = wz0Var2.Y0;
                            ArrayList arrayList6 = wz0Var2.W0;
                            ArrayList arrayList7 = wz0Var2.U0;
                            ArrayList arrayList8 = wz0Var2.X0;
                            ArrayList arrayList9 = wz0Var2.V0;
                            MessagesController.DialogPhotos dialogPhotos = wz0Var2.S0;
                            if (dialogPhotos != null) {
                                dialogPhotos.moveToStart(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                wz0Var2.f28321c1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = wz0Var2.T0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (ImageLocation) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (ImageLocation) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (ImageLocation) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.s71) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                wz0Var2.P0 = (ImageLocation) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f19348id = tL_inputPhoto;
                            tL_inputPhoto.f19235id = F.f19240id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            UserConfig userConfig = this.f38393b.getUserConfig();
                            this.f38393b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new us0(this, userConfig, F, 6));
                            ProfileActivity profileActivity16 = this.f38393b;
                            UndoView undoView = profileActivity16.M;
                            long j14 = profileActivity16.f32559e1;
                            if (F.video_sizes.isEmpty()) {
                                obj = null;
                            } else {
                                obj = 1;
                            }
                            undoView.m(j14, obj, 22);
                            TLRPC.User user5 = this.f38393b.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 800);
                            if (user5 != null) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 90);
                                TLRPC.UserProfilePhoto userProfilePhoto = user5.photo;
                                userProfilePhoto.photo_id = F.f19240id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user5);
                                userConfig.saveConfig(true);
                                i15 = ((org.telegram.ui.ActionBar.m2) this.f38393b).currentAccount;
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                this.f38393b.i5(true);
                            }
                            wz0 wz0Var3 = this.f38393b.f32620n0;
                            wz0Var3.D0.g();
                            wz0Var3.L();
                        }
                    } else if (i10 == 34) {
                        i11 = ((org.telegram.ui.ActionBar.m2) this.f38393b).currentAccount;
                        if (MessagesController.getInstance(i11).isFrozen()) {
                            i14 = ((org.telegram.ui.ActionBar.m2) this.f38393b).currentAccount;
                            b.b(i14);
                            return;
                        }
                        int realPosition2 = this.f38393b.f32620n0.getRealPosition();
                        ImageLocation D2 = this.f38393b.f32620n0.D(realPosition2);
                        if (D2 != null) {
                            i12 = ((org.telegram.ui.ActionBar.m2) this.f38393b).currentAccount;
                            FileLoader fileLoader2 = FileLoader.getInstance(i12);
                            Drawable[] drawableArr = PhotoViewer.U8;
                            File pathToAttach2 = fileLoader2.getPathToAttach(D2.location, PhotoViewer.q1(D2), true);
                            if (D2.imageType == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                ImageLocation G = this.f38393b.f32620n0.G(realPosition2);
                                i13 = ((org.telegram.ui.ActionBar.m2) this.f38393b).currentAccount;
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
                            this.f38393b.f32640q0.p(pathToAttach2.getAbsolutePath(), str, z12);
                        }
                    } else if (i10 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.f38393b.getParentActivity(), 0, this.f38393b.f32703z0);
                        wz0 wz0Var4 = this.f38393b.f32620n0;
                        ImageLocation D3 = wz0Var4.D(wz0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.imageType == 2) {
                                alertDialog$Builder4.f19548a.R = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                                alertDialog$Builder4.f19548a.T = LocaleController.getString(R.string.AreYouSureDeleteVideo);
                            } else {
                                alertDialog$Builder4.f19548a.R = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                                alertDialog$Builder4.f19548a.T = LocaleController.getString(R.string.AreYouSureDeletePhoto);
                            }
                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.z1(this) {
                                public final n01 f37800b;

                                {
                                    this.f37800b = this;
                                }

                                @Override
                                public final void g(org.telegram.ui.ActionBar.a2 r11, int r12) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l01.g(org.telegram.ui.ActionBar.a2, int):void");
                                }
                            });
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.a2 a2Var3 = alertDialog$Builder4.f19548a;
                            this.f38393b.showDialog(a2Var3);
                            TextView textView4 = (TextView) a2Var3.d(-1);
                            if (textView4 != null) {
                                textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20139q7, this.f38393b.f32703z0));
                            }
                        }
                    } else if (i10 == 36) {
                        this.f38393b.u4();
                    }
                } else {
                    ProfileActivity profileActivity17 = this.f38393b;
                    if (i10 == 16) {
                        z11 = true;
                    }
                    profileActivity17.o4(z11);
                }
            }
        }
    }
}
