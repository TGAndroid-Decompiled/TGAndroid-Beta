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
public final class jz0 extends org.telegram.ui.ActionBar.j {
    public final Context f38379a;
    public final ProfileActivity f38380b;

    public jz0(ProfileActivity profileActivity, Context context) {
        this.f38380b = profileActivity;
        this.f38379a = context;
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
        org.telegram.ui.Components.kt0 kt0Var;
        if (this.f38380b.getParentActivity() != null) {
            if (i10 == -1) {
                ProfileActivity profileActivity = this.f38380b;
                nz0 nz0Var = profileActivity.O;
                if (nz0Var != null && (kt0Var = nz0Var.I0) != null && kt0Var.f24362n0) {
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
                this.f38380b.n4(false);
            } else if (i10 == 1) {
                TLRPC.User user = this.f38380b.getMessagesController().getUser(Long.valueOf(this.f38380b.f33620f1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f20423id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f38380b;
                fs fsVar = new fs(bundle, profileActivity2.A0);
                fsVar.O = new nx0(profileActivity2, user);
                profileActivity2.presentFragment(fsVar);
            } else if (i10 == 3) {
                Bundle d = org.telegram.messenger.mk.d(3, "onlySelect", "dialogsType", true);
                d.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
                d.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
                cy cyVar = new cy(d);
                ProfileActivity profileActivity3 = this.f38380b;
                cyVar.C2 = profileActivity3;
                profileActivity3.presentFragment(cyVar);
            } else if (i10 == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f38380b.f33620f1);
                ProfileActivity profileActivity4 = this.f38380b;
                profileActivity4.presentFragment(new fs(bundle2, profileActivity4.A0));
            } else {
                String str3 = null;
                if (i10 == 5) {
                    TLRPC.User user2 = this.f38380b.getMessagesController().getUser(Long.valueOf(this.f38380b.f33620f1));
                    if (user2 != null && this.f38380b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f38380b.getParentActivity(), 0, this.f38380b.A0);
                        alertDialog$Builder.f20605a.R = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.f20605a.T = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new en0(11, this, user2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20605a;
                        this.f38380b.showDialog(b2Var);
                        TextView textView = (TextView) b2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21228q7, this.f38380b.A0));
                        }
                    }
                } else if (i10 == 7) {
                    this.f38380b.i4(false);
                } else if (i10 == 45) {
                    this.f38380b.i4(true);
                } else if (i10 == 46) {
                    if (!this.f38380b.getUserConfig().isPremium()) {
                        ProfileActivity profileActivity5 = this.f38380b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i19 = ((org.telegram.ui.ActionBar.n2) this.f38380b).currentAccount;
                        new sg.y0(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f38379a;
                    org.telegram.ui.ActionBar.d6 d6Var = this.f38380b.A0;
                    qy0 qy0Var = new qy0(this, 1);
                    Pattern pattern = org.telegram.ui.Components.f5.f26077a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.f3 i21 = org.telegram.messenger.mk.i(1, context, null, false);
                        runnable = i21.dismissRunnable;
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
                        org.telegram.messenger.mk.j(20.0f, R.string.DisableSharingInfoHeader, 1, textView2);
                        int i22 = org.telegram.ui.ActionBar.h6.G6;
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i22, d6Var));
                        linearLayout.addView(textView2, w7.z5.t(-1, -2, 17, 20, 0, 20, 14));
                        yv0 yv0Var = new yv0(context, d6Var);
                        yv0Var.f43563a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
                        yv0Var.f43564b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
                        yv0Var.d.setVisibility(8);
                        yv0Var.f43565c.setImageResource(R.drawable.menu_photo_off_24);
                        yv0Var.f43565c.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i22, d6Var));
                        linearLayout.addView(yv0Var, w7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        yv0 yv0Var2 = new yv0(context, d6Var);
                        yv0Var2.f43563a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
                        yv0Var2.f43564b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
                        yv0Var2.d.setVisibility(8);
                        yv0Var2.f43565c.setImageResource(R.drawable.menu_share_off_24);
                        yv0Var2.f43565c.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i22, d6Var));
                        linearLayout.addView(yv0Var2, w7.z5.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        yv0 yv0Var3 = new yv0(context, d6Var);
                        yv0Var3.f43563a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
                        yv0Var3.f43564b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
                        yv0Var3.d.setVisibility(8);
                        yv0Var3.f43565c.setImageResource(R.drawable.menu_download_off_24);
                        yv0Var3.f43565c.setColorFilter(org.telegram.ui.ActionBar.h6.w0(i22, d6Var));
                        linearLayout.addView(yv0Var3, w7.z5.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        ei.d dVar = new ei.d(context, d6Var, true);
                        dVar.setOnClickListener(new org.telegram.ui.ActionBar.s1(25, zArr, runnable));
                        dVar.e();
                        dVar.g(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
                        linearLayout.addView(dVar, w7.z5.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        i21.customView = linearLayout;
                        i21.show();
                        i21.setOnDismissListener(new eh(24, zArr, qy0Var));
                    }
                } else if (i10 == 47) {
                    ProfileActivity profileActivity6 = this.f38380b;
                    profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.f33620f1, 0, false, new ei.ka(2, profileActivity6, false));
                } else if (i10 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f38380b.getParentActivity());
                    alertDialog$Builder2.f20605a.R = LocaleController.getPluralString("DeleteTopics", 1);
                    i18 = ((org.telegram.ui.ActionBar.n2) this.f38380b).currentAccount;
                    TopicsController topicsController = MessagesController.getInstance(i18).getTopicsController();
                    ProfileActivity profileActivity7 = this.f38380b;
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.f33627g1, profileActivity7.f33634h1);
                    int i23 = R.string.DeleteSelectedTopic;
                    if (findTopic == null) {
                        str2 = "topic";
                    } else {
                        str2 = findTopic.title;
                    }
                    alertDialog$Builder2.f20605a.T = LocaleController.formatString("DeleteSelectedTopic", i23, str2);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {
                        public final jz0 f37821b;

                        {
                            this.f37821b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.b2 r11, int r12) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hz0.g(org.telegram.ui.ActionBar.b2, int):void");
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new fk0(7));
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20605a;
                    b2Var2.show();
                    TextView textView3 = (TextView) b2Var2.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21228q7, false));
                    }
                } else if (i10 == 24) {
                    ProfileActivity profileActivity8 = this.f38380b;
                    o21.M(profileActivity8.a(), profileActivity8);
                } else if (i10 == 12) {
                    ProfileActivity profileActivity9 = this.f38380b;
                    if (profileActivity9.f33701r1) {
                        profileActivity9.presentFragment(nd1.a0(profileActivity9.f33627g1, profileActivity9.f33634h1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f38380b;
                    long j11 = profileActivity10.f33627g1;
                    if (j11 != 0) {
                        bundle3.putLong("chat_id", j11);
                    } else if (profileActivity10.f33710s2) {
                        bundle3.putLong("user_id", profileActivity10.f33620f1);
                    }
                    io ioVar = new io(bundle3);
                    ProfileActivity profileActivity11 = this.f38380b;
                    TLRPC.ChatFull chatFull = profileActivity11.f33731v2;
                    if (chatFull != null) {
                        ioVar.l0(chatFull);
                    } else {
                        ioVar.m0(profileActivity11.f33739w2);
                    }
                    this.f38380b.presentFragment(ioVar);
                } else if (i10 == 41) {
                    this.f38380b.presentFragment(new UserInfoActivity());
                } else if (i10 == 9) {
                    TLRPC.User user3 = this.f38380b.getMessagesController().getUser(Long.valueOf(this.f38380b.f33620f1));
                    if (user3 != null) {
                        Bundle d10 = org.telegram.messenger.mk.d(2, "onlySelect", "dialogsType", true);
                        d10.putBoolean("resetDelegate", false);
                        d10.putBoolean("closeFragment", false);
                        cy cyVar2 = new cy(d10);
                        cyVar2.C2 = new e7(this, user3, cyVar2, 19);
                        this.f38380b.presentFragment(cyVar2);
                    }
                } else if (i10 == 10) {
                    this.f38380b.s4();
                } else if (i10 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f38380b;
                        if (profileActivity12.E2 != null) {
                            j10 = DialogObject.makeEncryptedDialogId(encryptedChat.f20284id);
                        } else {
                            j10 = profileActivity12.f33620f1;
                            if (j10 == 0) {
                                long j12 = profileActivity12.f33627g1;
                                if (j12 != 0) {
                                    j10 = -j12;
                                } else {
                                    return;
                                }
                            }
                        }
                        this.f38380b.getMediaDataController().installShortcut(j10, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else if (i10 != 15 && i10 != 16) {
                    if (i10 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f38380b.f33627g1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        hr hrVar = new hr(bundle4);
                        hrVar.x0(this.f38380b.f33731v2);
                        this.f38380b.presentFragment(hrVar);
                    } else if (i10 == 18) {
                        this.f38380b.v4();
                    } else if (i10 == 19) {
                        this.f38380b.presentFragment(p91.d0(this.f38380b.getMessagesController().getChat(Long.valueOf(this.f38380b.f33627g1)), false));
                    } else if (i10 == 22) {
                        this.f38380b.y4();
                    } else if (i10 == 38) {
                        this.f38380b.p4();
                    } else if (i10 == 48) {
                        ProfileActivity profileActivity13 = this.f38380b;
                        org.telegram.ui.Wallet.i9 i9Var = new org.telegram.ui.Wallet.i9(profileActivity13.getMessagesController().getUser(Long.valueOf(this.f38380b.f33620f1)));
                        i9Var.f34347c0 = true;
                        profileActivity13.presentFragment(i9Var);
                    } else if (i10 == 39) {
                        Bundle i24 = org.telegram.ui.Cells.c1.i(2, "type");
                        i24.putLong("dialog_id", -this.f38380b.f33627g1);
                        org.telegram.ui.Components.wa0 wa0Var = new org.telegram.ui.Components.wa0(i24, null);
                        ProfileActivity profileActivity14 = this.f38380b;
                        wa0Var.f32045c = profileActivity14.f33731v2;
                        profileActivity14.presentFragment(wa0Var);
                    } else if (i10 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.f38380b.getParentActivity(), 0, this.f38380b.A0);
                        alertDialog$Builder3.f20605a.R = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
                        alertDialog$Builder3.f20605a.T = LocaleController.getString(R.string.AreYouSureSecretChat);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.a2(this) {
                            public final jz0 f37821b;

                            {
                                this.f37821b = this;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.b2 r11, int r12) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hz0.g(org.telegram.ui.ActionBar.b2, int):void");
                            }
                        });
                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                        this.f38380b.showDialog(alertDialog$Builder3.f20605a);
                    } else if (i10 == 44) {
                        i17 = ((org.telegram.ui.ActionBar.n2) this.f38380b).currentAccount;
                        long j13 = this.f38380b.f33620f1;
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
                                pf.d.r(ApplicationLoader.applicationContext, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                            if (U != null) {
                                if (!(U instanceof qn) || ((qn) U).a() != j13) {
                                    U.presentFragment(qn.W9(j13));
                                }
                                AndroidUtilities.runOnUIThread(new ai.qa(i17, j13, 1), 150L);
                            }
                        }
                    } else if (i10 == 21) {
                        if (this.f38380b.getParentActivity() != null) {
                            if ((Build.VERSION.SDK_INT <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.f38380b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                this.f38380b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            sy0 sy0Var = this.f38380b.f33680o0;
                            ImageLocation D = sy0Var.D(sy0Var.getRealPosition());
                            if (D != null) {
                                if (D.imageType == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i16 = ((org.telegram.ui.ActionBar.n2) this.f38380b).currentAccount;
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
                                    MediaController.saveFile(pathToAttach.toString(), this.f38380b.getParentActivity(), 0, null, null, new ai.y8(8, this, z10));
                                }
                            }
                        }
                    } else if (i10 == 30) {
                        this.f38380b.presentFragment(new UserInfoActivity());
                    } else if (i10 == 40) {
                        ProfileActivity profileActivity15 = this.f38380b;
                        ip0 ip0Var = new ip0();
                        ip0Var.H = this.f38380b;
                        profileActivity15.presentFragment(ip0Var);
                    } else if (i10 == 42) {
                        TLRPC.User user4 = this.f38380b.getMessagesController().getUser(Long.valueOf(this.f38380b.f33620f1));
                        AndroidUtilities.addToClipboard(this.f38380b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(user4));
                    } else if (i10 == 43) {
                        this.f38380b.presentFragment(new sa(null));
                    } else if (i10 == 31) {
                        this.f38380b.presentFragment(new org.telegram.ui.ActionBar.n2(null));
                    } else if (i10 == 33) {
                        int realPosition = this.f38380b.f33680o0.getRealPosition();
                        TLRPC.Photo F = this.f38380b.f33680o0.F(realPosition);
                        if (F != null) {
                            sy0 sy0Var2 = this.f38380b.f33680o0;
                            ArrayList arrayList2 = sy0Var2.f28177b1;
                            ArrayList arrayList3 = sy0Var2.f28176a1;
                            ArrayList arrayList4 = sy0Var2.Z0;
                            ArrayList arrayList5 = sy0Var2.Y0;
                            ArrayList arrayList6 = sy0Var2.W0;
                            ArrayList arrayList7 = sy0Var2.U0;
                            ArrayList arrayList8 = sy0Var2.X0;
                            ArrayList arrayList9 = sy0Var2.V0;
                            MessagesController.DialogPhotos dialogPhotos = sy0Var2.S0;
                            if (dialogPhotos != null) {
                                dialogPhotos.moveToStart(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                sy0Var2.f28178c1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = sy0Var2.T0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (ImageLocation) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (ImageLocation) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (ImageLocation) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.n71) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                sy0Var2.P0 = (ImageLocation) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f20408id = tL_inputPhoto;
                            tL_inputPhoto.f20295id = F.f20300id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            UserConfig userConfig = this.f38380b.getUserConfig();
                            this.f38380b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new tr0(this, userConfig, F, 6));
                            ProfileActivity profileActivity16 = this.f38380b;
                            UndoView undoView = profileActivity16.M;
                            long j14 = profileActivity16.f33620f1;
                            if (F.video_sizes.isEmpty()) {
                                obj = null;
                            } else {
                                obj = 1;
                            }
                            undoView.m(j14, obj, 22);
                            TLRPC.User user5 = this.f38380b.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 800);
                            if (user5 != null) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 90);
                                TLRPC.UserProfilePhoto userProfilePhoto = user5.photo;
                                userProfilePhoto.photo_id = F.f20300id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user5);
                                userConfig.saveConfig(true);
                                i15 = ((org.telegram.ui.ActionBar.n2) this.f38380b).currentAccount;
                                NotificationCenter.getInstance(i15).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                this.f38380b.i5(true);
                            }
                            sy0 sy0Var3 = this.f38380b.f33680o0;
                            sy0Var3.D0.g();
                            sy0Var3.L();
                        }
                    } else if (i10 == 34) {
                        i11 = ((org.telegram.ui.ActionBar.n2) this.f38380b).currentAccount;
                        if (MessagesController.getInstance(i11).isFrozen()) {
                            i14 = ((org.telegram.ui.ActionBar.n2) this.f38380b).currentAccount;
                            b.b(i14);
                            return;
                        }
                        int realPosition2 = this.f38380b.f33680o0.getRealPosition();
                        ImageLocation D2 = this.f38380b.f33680o0.D(realPosition2);
                        if (D2 != null) {
                            i12 = ((org.telegram.ui.ActionBar.n2) this.f38380b).currentAccount;
                            FileLoader fileLoader2 = FileLoader.getInstance(i12);
                            Drawable[] drawableArr = PhotoViewer.U8;
                            File pathToAttach2 = fileLoader2.getPathToAttach(D2.location, PhotoViewer.r1(D2), true);
                            if (D2.imageType == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                ImageLocation G = this.f38380b.f33680o0.G(realPosition2);
                                i13 = ((org.telegram.ui.ActionBar.n2) this.f38380b).currentAccount;
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
                            this.f38380b.f33700r0.p(pathToAttach2.getAbsolutePath(), str, z12);
                        }
                    } else if (i10 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.f38380b.getParentActivity(), 0, this.f38380b.A0);
                        sy0 sy0Var4 = this.f38380b.f33680o0;
                        ImageLocation D3 = sy0Var4.D(sy0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.imageType == 2) {
                                alertDialog$Builder4.f20605a.R = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                                alertDialog$Builder4.f20605a.T = LocaleController.getString(R.string.AreYouSureDeleteVideo);
                            } else {
                                alertDialog$Builder4.f20605a.R = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                                alertDialog$Builder4.f20605a.T = LocaleController.getString(R.string.AreYouSureDeletePhoto);
                            }
                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.a2(this) {
                                public final jz0 f37821b;

                                {
                                    this.f37821b = this;
                                }

                                @Override
                                public final void g(org.telegram.ui.ActionBar.b2 r11, int r12) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.hz0.g(org.telegram.ui.ActionBar.b2, int):void");
                                }
                            });
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder4.f20605a;
                            this.f38380b.showDialog(b2Var3);
                            TextView textView4 = (TextView) b2Var3.d(-1);
                            if (textView4 != null) {
                                textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21228q7, this.f38380b.A0));
                            }
                        }
                    } else if (i10 == 36) {
                        this.f38380b.u4();
                    }
                } else {
                    ProfileActivity profileActivity17 = this.f38380b;
                    if (i10 == 16) {
                        z11 = true;
                    }
                    profileActivity17.o4(z11);
                }
            }
        }
    }
}
