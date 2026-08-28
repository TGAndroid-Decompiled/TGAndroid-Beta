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
public final class dz0 extends org.telegram.ui.ActionBar.j {
    public final Context f37760a;
    public final ProfileActivity f37761b;

    public dz0(ProfileActivity profileActivity, Context context) {
        this.f37761b = profileActivity;
        this.f37760a = context;
    }

    @Override
    public final void b(int i9) {
        TLRPC.EncryptedChat encryptedChat;
        long j10;
        int i10;
        int i11;
        String str;
        int i12;
        TLObject tLObject;
        int i13;
        Object obj;
        int i14;
        boolean z10;
        int i15;
        int i16;
        TL_bots.BotInfo botInfo;
        int i17;
        String str2;
        Runnable runnable;
        int i18;
        org.telegram.ui.Components.ur0 ur0Var;
        if (this.f37761b.getParentActivity() != null) {
            if (i9 == -1) {
                ProfileActivity profileActivity = this.f37761b;
                hz0 hz0Var = profileActivity.K;
                if (hz0Var != null && (ur0Var = hz0Var.E0) != null && ur0Var.f26526j0) {
                    profileActivity.R4();
                    return;
                } else {
                    profileActivity.finishFragment();
                    return;
                }
            }
            boolean z11 = false;
            int i19 = 0;
            boolean z12 = false;
            if (i9 == 2) {
                this.f37761b.n4(false);
            } else if (i9 == 1) {
                TLRPC.User user = this.f37761b.getMessagesController().getUser(Long.valueOf(this.f37761b.f35920a1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", user.f22527id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f37761b;
                is isVar = new is(bundle, profileActivity2.f36064v0);
                isVar.K = new gx0(profileActivity2, user);
                profileActivity2.presentFragment(isVar);
            } else if (i9 == 3) {
                Bundle e10 = org.telegram.messenger.l0.e(3, "onlySelect", "dialogsType", true);
                e10.putString("selectAlertString", LocaleController.getString(R.string.SendContactToText));
                e10.putString("selectAlertStringGroup", LocaleController.getString(R.string.SendContactToGroupText));
                dy dyVar = new dy(e10);
                ProfileActivity profileActivity3 = this.f37761b;
                dyVar.f37752y2 = profileActivity3;
                profileActivity3.presentFragment(dyVar);
            } else if (i9 == 4) {
                Bundle bundle2 = new Bundle();
                bundle2.putLong("user_id", this.f37761b.f35920a1);
                ProfileActivity profileActivity4 = this.f37761b;
                profileActivity4.presentFragment(new is(bundle2, profileActivity4.f36064v0));
            } else {
                String str3 = null;
                if (i9 == 5) {
                    TLRPC.User user2 = this.f37761b.getMessagesController().getUser(Long.valueOf(this.f37761b.f35920a1));
                    if (user2 != null && this.f37761b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(this.f37761b.getParentActivity(), 0, this.f37761b.f36064v0);
                        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DeleteContact);
                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.AreYouSureDeleteContact);
                        alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new nl0(15, this, user2));
                        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                        this.f37761b.showDialog(c2Var);
                        TextView textView = (TextView) c2Var.d(-1);
                        if (textView != null) {
                            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, this.f37761b.f36064v0));
                        }
                    }
                } else if (i9 == 7) {
                    this.f37761b.i4(false);
                } else if (i9 == 45) {
                    this.f37761b.i4(true);
                } else if (i9 == 46) {
                    if (!this.f37761b.getUserConfig().isPremium()) {
                        ProfileActivity profileActivity5 = this.f37761b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i18 = ((org.telegram.ui.ActionBar.o2) this.f37761b).currentAccount;
                        new zf.x0(profileActivity5, parentActivity, i18, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f37760a;
                    org.telegram.ui.ActionBar.b6 b6Var = this.f37761b.f36064v0;
                    ky0 ky0Var = new ky0(this, 1);
                    Pattern pattern = org.telegram.ui.Components.y4.f34847a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.f3 j11 = org.telegram.messenger.ll.j(context, null, false, false);
                        runnable = j11.dismissRunnable;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, g7.e6.t(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(R.raw.raised_hand, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(AndroidUtilities.bold());
                        textView2.setGravity(17);
                        textView2.setText(LocaleController.getString(R.string.DisableSharingInfoHeader));
                        textView2.setTextSize(1, 20.0f);
                        int i20 = org.telegram.ui.ActionBar.f6.G6;
                        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i20, b6Var));
                        linearLayout.addView(textView2, g7.e6.t(-1, -2, 17, 20, 0, 20, 14));
                        qv0 qv0Var = new qv0(context, b6Var);
                        qv0Var.f42205a.l(LocaleController.getString(R.string.DisableSharingInfoHeader1), false);
                        qv0Var.f42206b.setText(LocaleController.getString(R.string.DisableSharingInfoText1));
                        qv0Var.d.setVisibility(8);
                        qv0Var.f42207c.setImageResource(R.drawable.menu_photo_off_24);
                        qv0Var.f42207c.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i20, b6Var));
                        linearLayout.addView(qv0Var, g7.e6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        qv0 qv0Var2 = new qv0(context, b6Var);
                        qv0Var2.f42205a.l(LocaleController.getString(R.string.DisableSharingInfoHeader2), false);
                        qv0Var2.f42206b.setText(LocaleController.getString(R.string.DisableSharingInfoText2));
                        qv0Var2.d.setVisibility(8);
                        qv0Var2.f42207c.setImageResource(R.drawable.menu_share_off_24);
                        qv0Var2.f42207c.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i20, b6Var));
                        linearLayout.addView(qv0Var2, g7.e6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        qv0 qv0Var3 = new qv0(context, b6Var);
                        qv0Var3.f42205a.l(LocaleController.getString(R.string.DisableSharingInfoHeader3), false);
                        qv0Var3.f42206b.setText(LocaleController.getString(R.string.DisableSharingInfoText3));
                        qv0Var3.d.setVisibility(8);
                        qv0Var3.f42207c.setImageResource(R.drawable.menu_download_off_24);
                        qv0Var3.f42207c.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i20, b6Var));
                        linearLayout.addView(qv0Var3, g7.e6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        kh.d dVar = new kh.d(context, b6Var, true);
                        dVar.setOnClickListener(new org.telegram.ui.Components.s2(2, zArr, runnable));
                        dVar.e();
                        dVar.g(LocaleController.getString(R.string.DisableSharingInfoButton), false, true);
                        linearLayout.addView(dVar, g7.e6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        j11.customView = linearLayout;
                        j11.show();
                        j11.setOnDismissListener(new wq(3, zArr, ky0Var));
                    }
                } else if (i9 == 47) {
                    ProfileActivity profileActivity6 = this.f37761b;
                    profileActivity6.getMessagesController().toggleChatNoForwards(profileActivity6.f35920a1, 0, false, new kh.la(false, profileActivity6, 2));
                } else if (i9 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f37761b.getParentActivity());
                    alertDialog$Builder2.f22702a.N = LocaleController.getPluralString("DeleteTopics", 1);
                    i17 = ((org.telegram.ui.ActionBar.o2) this.f37761b).currentAccount;
                    TopicsController topicsController = MessagesController.getInstance(i17).getTopicsController();
                    ProfileActivity profileActivity7 = this.f37761b;
                    TLRPC.TL_forumTopic findTopic = topicsController.findTopic(profileActivity7.f35926b1, profileActivity7.f35934c1);
                    int i21 = R.string.DeleteSelectedTopic;
                    if (findTopic == null) {
                        str2 = "topic";
                    } else {
                        str2 = findTopic.title;
                    }
                    alertDialog$Builder2.f22702a.P = LocaleController.formatString("DeleteSelectedTopic", i21, str2);
                    alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                        public final dz0 f37016b;

                        {
                            this.f37016b = this;
                        }

                        @Override
                        public final void f(org.telegram.ui.ActionBar.c2 r11, int r12) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bz0.f(org.telegram.ui.ActionBar.c2, int):void");
                        }
                    });
                    alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new fk0(7));
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                    c2Var2.show();
                    TextView textView3 = (TextView) c2Var2.d(-1);
                    if (textView3 != null) {
                        textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23230q7, false));
                    }
                } else if (i9 == 24) {
                    ProfileActivity profileActivity8 = this.f37761b;
                    y21.K(profileActivity8.a(), profileActivity8);
                } else if (i9 == 12) {
                    ProfileActivity profileActivity9 = this.f37761b;
                    if (profileActivity9.f36004m1) {
                        profileActivity9.presentFragment(rd1.Z(profileActivity9.f35926b1, profileActivity9.f35934c1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f37761b;
                    long j12 = profileActivity10.f35926b1;
                    if (j12 != 0) {
                        bundle3.putLong("chat_id", j12);
                    } else if (profileActivity10.f36013n2) {
                        bundle3.putLong("user_id", profileActivity10.f35920a1);
                    }
                    ho hoVar = new ho(bundle3);
                    ProfileActivity profileActivity11 = this.f37761b;
                    TLRPC.ChatFull chatFull = profileActivity11.f36032q2;
                    if (chatFull != null) {
                        hoVar.k0(chatFull);
                    } else {
                        hoVar.l0(profileActivity11.f36040r2);
                    }
                    this.f37761b.presentFragment(hoVar);
                } else if (i9 == 41) {
                    this.f37761b.presentFragment(new UserInfoActivity());
                } else if (i9 == 9) {
                    TLRPC.User user3 = this.f37761b.getMessagesController().getUser(Long.valueOf(this.f37761b.f35920a1));
                    if (user3 != null) {
                        Bundle e11 = org.telegram.messenger.l0.e(2, "onlySelect", "dialogsType", true);
                        e11.putBoolean("resetDelegate", false);
                        e11.putBoolean("closeFragment", false);
                        dy dyVar2 = new dy(e11);
                        dyVar2.f37752y2 = new a7(this, user3, dyVar2, 19);
                        this.f37761b.presentFragment(dyVar2);
                    }
                } else if (i9 == 10) {
                    this.f37761b.s4();
                } else if (i9 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f37761b;
                        if (profileActivity12.f36092z2 != null) {
                            j10 = DialogObject.makeEncryptedDialogId(encryptedChat.f22388id);
                        } else {
                            j10 = profileActivity12.f35920a1;
                            if (j10 == 0) {
                                long j13 = profileActivity12.f35926b1;
                                if (j13 != 0) {
                                    j10 = -j13;
                                } else {
                                    return;
                                }
                            }
                        }
                        this.f37761b.getMediaDataController().installShortcut(j10, MediaDataController.SHORTCUT_TYPE_USER_OR_CHAT);
                    } catch (Exception e12) {
                        FileLog.e(e12);
                    }
                } else if (i9 != 15 && i9 != 16) {
                    if (i9 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f37761b.f35926b1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        jr jrVar = new jr(bundle4);
                        jrVar.w0(this.f37761b.f36032q2);
                        this.f37761b.presentFragment(jrVar);
                    } else if (i9 == 18) {
                        this.f37761b.v4();
                    } else if (i9 == 19) {
                        this.f37761b.presentFragment(s91.c0(this.f37761b.getMessagesController().getChat(Long.valueOf(this.f37761b.f35926b1)), false));
                    } else if (i9 == 22) {
                        this.f37761b.y4();
                    } else if (i9 == 38) {
                        this.f37761b.p4();
                    } else if (i9 == 39) {
                        Bundle h = aa.d.h(2, "type");
                        h.putLong("dialog_id", -this.f37761b.f35926b1);
                        org.telegram.ui.Components.k90 k90Var = new org.telegram.ui.Components.k90(h, null);
                        ProfileActivity profileActivity13 = this.f37761b;
                        k90Var.f30034c = profileActivity13.f36032q2;
                        profileActivity13.presentFragment(k90Var);
                    } else if (i9 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(this.f37761b.getParentActivity(), 0, this.f37761b.f36064v0);
                        alertDialog$Builder3.f22702a.N = LocaleController.getString(R.string.AreYouSureSecretChatTitle);
                        alertDialog$Builder3.f22702a.P = LocaleController.getString(R.string.AreYouSureSecretChat);
                        alertDialog$Builder3.k(LocaleController.getString(R.string.Start), new org.telegram.ui.ActionBar.b2(this) {
                            public final dz0 f37016b;

                            {
                                this.f37016b = this;
                            }

                            @Override
                            public final void f(org.telegram.ui.ActionBar.c2 r11, int r12) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bz0.f(org.telegram.ui.ActionBar.c2, int):void");
                            }
                        });
                        alertDialog$Builder3.h(LocaleController.getString(R.string.Cancel), null);
                        this.f37761b.showDialog(alertDialog$Builder3.f22702a);
                    } else if (i9 == 44) {
                        i16 = ((org.telegram.ui.ActionBar.o2) this.f37761b).currentAccount;
                        long j14 = this.f37761b.f35920a1;
                        TLRPC.UserFull userFull = MessagesController.getInstance(i16).getUserFull(j14);
                        if (userFull != null && (botInfo = userFull.bot_info) != null) {
                            String str4 = botInfo.privacy_policy_url;
                            if (str4 == null && str4 == null) {
                                ArrayList<TLRPC.BotCommand> arrayList = botInfo.commands;
                                int size = arrayList.size();
                                while (true) {
                                    if (i19 < size) {
                                        TLRPC.BotCommand botCommand = arrayList.get(i19);
                                        i19++;
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
                                ve.e.s(ApplicationLoader.applicationContext, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                            if (U != null) {
                                if (!(U instanceof qn) || ((qn) U).a() != j14) {
                                    U.presentFragment(qn.R9(j14));
                                }
                                AndroidUtilities.runOnUIThread(new gh.d8(i16, j14), 150L);
                            }
                        }
                    } else if (i9 == 21) {
                        if (this.f37761b.getParentActivity() != null) {
                            int i22 = Build.VERSION.SDK_INT;
                            if (i22 >= 23 && ((i22 <= 28 || BuildVars.NO_SCOPED_STORAGE) && this.f37761b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0)) {
                                this.f37761b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            my0 my0Var = this.f37761b.f35984j0;
                            ImageLocation D = my0Var.D(my0Var.getRealPosition());
                            if (D != null) {
                                if (D.imageType == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i15 = ((org.telegram.ui.ActionBar.o2) this.f37761b).currentAccount;
                                FileLoader fileLoader = FileLoader.getInstance(i15);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = D.location;
                                if (z10) {
                                    str3 = "mp4";
                                }
                                File pathToAttach = fileLoader.getPathToAttach(tL_fileLocationToBeDeprecated, str3, true);
                                if (z10 && !pathToAttach.exists()) {
                                    pathToAttach = new File(FileLoader.getDirectory(0), FileLoader.getAttachFileName(D.location, "mp4"));
                                }
                                if (pathToAttach.exists()) {
                                    MediaController.saveFile(pathToAttach.toString(), this.f37761b.getParentActivity(), 0, null, null, new gh.p6(4, this, z10));
                                }
                            }
                        }
                    } else if (i9 == 30) {
                        this.f37761b.presentFragment(new UserInfoActivity());
                    } else if (i9 == 40) {
                        ProfileActivity profileActivity14 = this.f37761b;
                        zo0 zo0Var = new zo0();
                        zo0Var.f45201x = this.f37761b;
                        profileActivity14.presentFragment(zo0Var);
                    } else if (i9 == 42) {
                        TLRPC.User user4 = this.f37761b.getMessagesController().getUser(Long.valueOf(this.f37761b.f35920a1));
                        AndroidUtilities.addToClipboard(this.f37761b.getMessagesController().linkPrefix + "/" + UserObject.getPublicUsername(user4));
                    } else if (i9 == 43) {
                        this.f37761b.presentFragment(new ma(null));
                    } else if (i9 == 31) {
                        this.f37761b.presentFragment(new org.telegram.ui.ActionBar.o2(null));
                    } else if (i9 == 33) {
                        int realPosition = this.f37761b.f35984j0.getRealPosition();
                        TLRPC.Photo F = this.f37761b.f35984j0.F(realPosition);
                        if (F != null) {
                            my0 my0Var2 = this.f37761b.f35984j0;
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
                                arrayList4.add(0, (org.telegram.ui.Components.u51) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                my0Var2.L0 = (ImageLocation) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f22512id = tL_inputPhoto;
                            tL_inputPhoto.f22399id = F.f22404id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            UserConfig userConfig = this.f37761b.getUserConfig();
                            this.f37761b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new kr0(this, userConfig, F, 6));
                            ProfileActivity profileActivity15 = this.f37761b;
                            UndoView undoView = profileActivity15.I;
                            long j15 = profileActivity15.f35920a1;
                            if (F.video_sizes.isEmpty()) {
                                obj = null;
                            } else {
                                obj = 1;
                            }
                            undoView.m(j15, obj, 22);
                            TLRPC.User user5 = this.f37761b.getMessagesController().getUser(Long.valueOf(userConfig.clientUserId));
                            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 800);
                            if (user5 != null) {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(F.sizes, 90);
                                TLRPC.UserProfilePhoto userProfilePhoto = user5.photo;
                                userProfilePhoto.photo_id = F.f22404id;
                                userProfilePhoto.photo_small = closestPhotoSizeWithSize2.location;
                                userProfilePhoto.photo_big = closestPhotoSizeWithSize.location;
                                userConfig.setCurrentUser(user5);
                                userConfig.saveConfig(true);
                                i14 = ((org.telegram.ui.ActionBar.o2) this.f37761b).currentAccount;
                                NotificationCenter.getInstance(i14).lambda$postNotificationNameOnUIThread$1(NotificationCenter.mainUserInfoChanged, new Object[0]);
                                this.f37761b.i5(true);
                            }
                            my0 my0Var3 = this.f37761b.f35984j0;
                            my0Var3.f26814z0.g();
                            my0Var3.L();
                        }
                    } else if (i9 == 34) {
                        i10 = ((org.telegram.ui.ActionBar.o2) this.f37761b).currentAccount;
                        if (MessagesController.getInstance(i10).isFrozen()) {
                            i13 = ((org.telegram.ui.ActionBar.o2) this.f37761b).currentAccount;
                            b.b(i13);
                            return;
                        }
                        int realPosition2 = this.f37761b.f35984j0.getRealPosition();
                        ImageLocation D2 = this.f37761b.f35984j0.D(realPosition2);
                        if (D2 != null) {
                            i11 = ((org.telegram.ui.ActionBar.o2) this.f37761b).currentAccount;
                            FileLoader fileLoader2 = FileLoader.getInstance(i11);
                            Drawable[] drawableArr = PhotoViewer.P8;
                            File pathToAttach2 = fileLoader2.getPathToAttach(D2.location, PhotoViewer.q1(D2), true);
                            if (D2.imageType == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                ImageLocation G = this.f37761b.f35984j0.G(realPosition2);
                                i12 = ((org.telegram.ui.ActionBar.o2) this.f37761b).currentAccount;
                                FileLoader fileLoader3 = FileLoader.getInstance(i12);
                                if (G == null) {
                                    tLObject = null;
                                } else {
                                    tLObject = G.location;
                                }
                                str = fileLoader3.getPathToAttach(tLObject, PhotoViewer.q1(G), true).getAbsolutePath();
                            } else {
                                str = null;
                            }
                            this.f37761b.m0.q(pathToAttach2.getAbsolutePath(), str, z12);
                        }
                    } else if (i9 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(this.f37761b.getParentActivity(), 0, this.f37761b.f36064v0);
                        my0 my0Var4 = this.f37761b.f35984j0;
                        ImageLocation D3 = my0Var4.D(my0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.imageType == 2) {
                                alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.AreYouSureDeleteVideoTitle);
                                alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.AreYouSureDeleteVideo);
                            } else {
                                alertDialog$Builder4.f22702a.N = LocaleController.getString(R.string.AreYouSureDeletePhotoTitle);
                                alertDialog$Builder4.f22702a.P = LocaleController.getString(R.string.AreYouSureDeletePhoto);
                            }
                            alertDialog$Builder4.k(LocaleController.getString(R.string.Delete), new org.telegram.ui.ActionBar.b2(this) {
                                public final dz0 f37016b;

                                {
                                    this.f37016b = this;
                                }

                                @Override
                                public final void f(org.telegram.ui.ActionBar.c2 r11, int r12) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bz0.f(org.telegram.ui.ActionBar.c2, int):void");
                                }
                            });
                            alertDialog$Builder4.h(LocaleController.getString(R.string.Cancel), null);
                            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder4.f22702a;
                            this.f37761b.showDialog(c2Var3);
                            TextView textView4 = (TextView) c2Var3.d(-1);
                            if (textView4 != null) {
                                textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, this.f37761b.f36064v0));
                            }
                        }
                    } else if (i9 == 36) {
                        this.f37761b.u4();
                    }
                } else {
                    ProfileActivity profileActivity16 = this.f37761b;
                    if (i9 == 16) {
                        z11 = true;
                    }
                    profileActivity16.o4(z11);
                }
            }
        }
    }
}
