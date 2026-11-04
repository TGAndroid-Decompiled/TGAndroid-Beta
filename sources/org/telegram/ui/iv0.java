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
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.UndoView;
public final class iv0 extends org.telegram.ui.ActionBar.j {
    public final Context f46426a;
    public final ProfileActivity f46427b;

    public iv0(ProfileActivity profileActivity, Context context) {
        this.f46427b = profileActivity;
        this.f46426a = context;
    }

    @Override
    public final void b(int i3) {
        TLRPC.EncryptedChat encryptedChat;
        long j10;
        int i10;
        int i11;
        int i12;
        int i13;
        Integer num;
        int i14;
        boolean z10;
        int i15;
        int i16;
        TL_bots.BotInfo botInfo;
        int i17;
        String str;
        int i18;
        org.telegram.ui.Components.tq0 tq0Var;
        if (this.f46427b.getParentActivity() != null) {
            if (i3 == -1) {
                ProfileActivity profileActivity = this.f46427b;
                mv0 mv0Var = profileActivity.O;
                if (mv0Var != null && (tq0Var = mv0Var.L0) != null && tq0Var.f31612o0) {
                    profileActivity.l5();
                    return;
                } else {
                    profileActivity.finishFragment();
                    return;
                }
            }
            boolean z11 = false;
            int i19 = 0;
            boolean z12 = false;
            if (i3 == 2) {
                this.f46427b.B4(false);
            } else if (i3 == 1) {
                TLRPC.User a22 = this.f46427b.getMessagesController().a2(Long.valueOf(this.f46427b.f41751e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", a22.f27150id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f46427b;
                lr lrVar = new lr(bundle, profileActivity2.A0);
                lrVar.P = new nt0(profileActivity2, a22);
                profileActivity2.presentFragment(lrVar);
            } else {
                String str2 = null;
                String str3 = null;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
                if (i3 == 3) {
                    Bundle l10 = org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true);
                    l10.putString("selectAlertString", org.telegram.messenger.bd.M0(2131745640, null));
                    l10.putString("selectAlertStringGroup", org.telegram.messenger.bd.M0(2131745641, null));
                    uw uwVar = new uw(l10);
                    ProfileActivity profileActivity3 = this.f46427b;
                    uwVar.D2 = profileActivity3;
                    profileActivity3.presentFragment(uwVar);
                } else if (i3 == 4) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", this.f46427b.f41751e1);
                    ProfileActivity profileActivity4 = this.f46427b;
                    profileActivity4.presentFragment(new lr(bundle2, profileActivity4.A0));
                } else if (i3 == 5) {
                    TLRPC.User a23 = this.f46427b.getMessagesController().a2(Long.valueOf(this.f46427b.f41751e1));
                    if (a23 != null && this.f46427b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f46427b.getParentActivity(), this.f46427b.A0);
                        alertDialog$Builder.f27343a.S = org.telegram.messenger.bd.M0(2131751553, null);
                        alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.M0(2131754103, null);
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new rb0(19, this, a23));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                        this.f46427b.showDialog(s1Var);
                        TextView textView = (TextView) s1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, this.f46427b.A0);
                        }
                    }
                } else if (i3 == 7) {
                    this.f46427b.w4(false);
                } else if (i3 == 45) {
                    this.f46427b.w4(true);
                } else if (i3 == 46) {
                    if (!this.f46427b.getUserConfig().q()) {
                        ProfileActivity profileActivity5 = this.f46427b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i18 = ((org.telegram.ui.ActionBar.d2) this.f46427b).currentAccount;
                        new vg.v0(profileActivity5, parentActivity, i18, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f46426a;
                    org.telegram.ui.ActionBar.e6 e6Var = this.f46427b.A0;
                    pu0 pu0Var = new pu0(this, 1);
                    Pattern pattern = org.telegram.ui.Components.t4.f38241a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.t2 l11 = org.telegram.messenger.k5.l(1, context, null, false);
                        org.telegram.ui.ActionBar.e2 e2Var = l11.f28625y0;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, b8.mf.t(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(2131624173, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(org.telegram.messenger.g0.o());
                        textView2.setGravity(17);
                        textView2.setText(org.telegram.messenger.bd.M0(2131751423, null));
                        textView2.setTextSize(1, 20.0f);
                        int i20 = org.telegram.ui.ActionBar.k6.G6;
                        org.telegram.ui.ActionBar.r6.V(textView2, i20, e6Var);
                        linearLayout.addView(textView2, b8.mf.t(-1, -2, 17, 20, 0, 20, 14));
                        yr0 yr0Var = new yr0(context, e6Var);
                        yr0Var.f52386a.l(org.telegram.messenger.bd.M0(2131751422, null), false);
                        yr0Var.f52387b.setText(org.telegram.messenger.bd.M0(2131751419, null));
                        yr0Var.d.setVisibility(8);
                        yr0Var.f52388c.setImageResource(2131231847);
                        ImageView imageView2 = yr0Var.f52388c;
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                        org.telegram.ui.ActionBar.r6.t(imageView2, i20, e6Var, mode);
                        linearLayout.addView(yr0Var, b8.mf.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        yr0 yr0Var2 = new yr0(context, e6Var);
                        yr0Var2.f52386a.l(org.telegram.messenger.bd.M0(2131751421, null), false);
                        yr0Var2.f52387b.setText(org.telegram.messenger.bd.M0(2131751418, null));
                        yr0Var2.d.setVisibility(8);
                        yr0Var2.f52388c.setImageResource(2131231879);
                        org.telegram.ui.ActionBar.r6.t(yr0Var2.f52388c, i20, e6Var, mode);
                        linearLayout.addView(yr0Var2, b8.mf.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        yr0 yr0Var3 = new yr0(context, e6Var);
                        yr0Var3.f52386a.l(org.telegram.messenger.bd.M0(2131751420, null), false);
                        yr0Var3.f52387b.setText(org.telegram.messenger.bd.M0(2131751417, null));
                        yr0Var3.d.setVisibility(8);
                        yr0Var3.f52388c.setImageResource(2131231788);
                        org.telegram.ui.ActionBar.r6.t(yr0Var3.f52388c, i20, e6Var, mode);
                        linearLayout.addView(yr0Var3, b8.mf.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        gi.d dVar = new gi.d(context, e6Var, true);
                        dVar.setOnClickListener(new org.telegram.ui.Components.q2(0, zArr, e2Var));
                        dVar.f();
                        dVar.i(org.telegram.messenger.bd.M0(2131751424, null), false, true);
                        linearLayout.addView(dVar, b8.mf.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        l11.O = linearLayout;
                        l11.show();
                        l11.n(new lo(7, zArr, pu0Var));
                    }
                } else if (i3 == 47) {
                    ProfileActivity profileActivity6 = this.f46427b;
                    profileActivity6.getMessagesController().d5(profileActivity6.f41751e1, 0, false, new gi.m9(2, profileActivity6, false));
                } else if (i3 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f46427b.getParentActivity());
                    alertDialog$Builder2.f27343a.S = org.telegram.messenger.bd.K0(1, "DeleteTopics");
                    i17 = ((org.telegram.ui.ActionBar.d2) this.f46427b).currentAccount;
                    org.telegram.messenger.c00 c00Var = org.telegram.messenger.hp.s1(i17).f23102q7;
                    ProfileActivity profileActivity7 = this.f46427b;
                    TLRPC.TL_forumTopic f10 = c00Var.f(profileActivity7.f41759f1, profileActivity7.f41766g1);
                    if (f10 == null) {
                        str = "topic";
                    } else {
                        str = f10.title;
                    }
                    alertDialog$Builder2.f27343a.U = org.telegram.messenger.bd.a0("DeleteSelectedTopic", null, 2131751499, str);
                    alertDialog$Builder2.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1(this) {
                        public final iv0 f45722b;

                        {
                            this.f45722b = this;
                        }

                        @Override
                        public final void g(org.telegram.ui.ActionBar.s1 r14, int r15) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gv0.g(org.telegram.ui.ActionBar.s1, int):void");
                        }
                    });
                    alertDialog$Builder2.h(org.telegram.messenger.bd.M0(2131752589, null), new u70(9));
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder2.f27343a;
                    s1Var2.show();
                    TextView textView3 = (TextView) s1Var2.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.r6.V(textView3, org.telegram.ui.ActionBar.k6.f28122q7, null);
                    }
                } else if (i3 == 24) {
                    ProfileActivity profileActivity8 = this.f46427b;
                    ey0.K0(profileActivity8.a(), profileActivity8);
                } else if (i3 == 12) {
                    ProfileActivity profileActivity9 = this.f46427b;
                    if (profileActivity9.f41832q1) {
                        profileActivity9.presentFragment(l81.f0(profileActivity9.f41759f1, profileActivity9.f41766g1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f46427b;
                    long j11 = profileActivity10.f41759f1;
                    if (j11 != 0) {
                        bundle3.putLong("chat_id", j11);
                    } else if (profileActivity10.f41841r2) {
                        bundle3.putLong("user_id", profileActivity10.f41751e1);
                    }
                    ln lnVar = new ln(bundle3);
                    ProfileActivity profileActivity11 = this.f46427b;
                    TLRPC.ChatFull chatFull = profileActivity11.f41861u2;
                    if (chatFull != null) {
                        lnVar.q0(chatFull);
                    } else {
                        lnVar.r0(profileActivity11.f41868v2);
                    }
                    this.f46427b.presentFragment(lnVar);
                } else if (i3 == 41) {
                    this.f46427b.presentFragment(new UserInfoActivity());
                } else if (i3 == 9) {
                    TLRPC.User a24 = this.f46427b.getMessagesController().a2(Long.valueOf(this.f46427b.f41751e1));
                    if (a24 != null) {
                        Bundle l12 = org.telegram.ui.Cells.f1.l(2, "onlySelect", "dialogsType", true);
                        l12.putBoolean("resetDelegate", false);
                        l12.putBoolean("closeFragment", false);
                        uw uwVar2 = new uw(l12);
                        uwVar2.D2 = new b7(this, a24, uwVar2, 19);
                        this.f46427b.presentFragment(uwVar2);
                    }
                } else if (i3 == 10) {
                    this.f46427b.G4();
                } else if (i3 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f46427b;
                        if (profileActivity12.D2 != null) {
                            j10 = org.telegram.messenger.m5.F(encryptedChat.f27009id);
                        } else {
                            j10 = profileActivity12.f41751e1;
                            if (j10 == 0) {
                                long j12 = profileActivity12.f41759f1;
                                if (j12 != 0) {
                                    j10 = -j12;
                                } else {
                                    return;
                                }
                            }
                        }
                        org.telegram.messenger.li mediaDataController = this.f46427b.getMediaDataController();
                        Pattern pattern2 = org.telegram.messenger.li.S1;
                        mediaDataController.y0(j10, 0, null);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (i3 != 15 && i3 != 16) {
                    if (i3 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f46427b.f41759f1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        nq nqVar = new nq(bundle4);
                        nqVar.C0(this.f46427b.f41861u2);
                        this.f46427b.presentFragment(nqVar);
                    } else if (i3 == 18) {
                        this.f46427b.J4();
                    } else if (i3 == 19) {
                        this.f46427b.presentFragment(r41.g0(this.f46427b.getMessagesController().M0(Long.valueOf(this.f46427b.f41759f1)), false));
                    } else if (i3 == 22) {
                        this.f46427b.M4();
                    } else if (i3 == 38) {
                        this.f46427b.D4();
                    } else if (i3 == 48) {
                        ProfileActivity profileActivity13 = this.f46427b;
                        org.telegram.ui.Wallet.m9 m9Var = new org.telegram.ui.Wallet.m9(profileActivity13.getMessagesController().a2(Long.valueOf(this.f46427b.f41751e1)));
                        m9Var.f42877g0 = true;
                        profileActivity13.presentFragment(m9Var);
                    } else if (i3 == 39) {
                        Bundle k10 = org.telegram.ui.Cells.f1.k(2, "type");
                        k10.putLong("dialog_id", -this.f46427b.f41759f1);
                        org.telegram.ui.Components.r80 r80Var = new org.telegram.ui.Components.r80(k10, null);
                        ProfileActivity profileActivity14 = this.f46427b;
                        r80Var.f37683c = profileActivity14.f41861u2;
                        profileActivity14.presentFragment(r80Var);
                    } else if (i3 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, this.f46427b.getParentActivity(), this.f46427b.A0);
                        alertDialog$Builder3.f27343a.S = org.telegram.messenger.bd.M0(2131754078, null);
                        alertDialog$Builder3.f27343a.U = org.telegram.messenger.bd.M0(2131754079, null);
                        alertDialog$Builder3.k(org.telegram.messenger.bd.M0(2131744925, null), new org.telegram.ui.ActionBar.p1(this) {
                            public final iv0 f45722b;

                            {
                                this.f45722b = this;
                            }

                            @Override
                            public final void g(org.telegram.ui.ActionBar.s1 r14, int r15) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gv0.g(org.telegram.ui.ActionBar.s1, int):void");
                            }
                        });
                        alertDialog$Builder3.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                        this.f46427b.showDialog(alertDialog$Builder3.f27343a);
                    } else if (i3 == 44) {
                        i16 = ((org.telegram.ui.ActionBar.d2) this.f46427b).currentAccount;
                        long j13 = this.f46427b.f41751e1;
                        TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(i16).b2(j13);
                        if (b22 != null && (botInfo = b22.bot_info) != null) {
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
                                        str4 = org.telegram.messenger.bd.M0(2131753098, null);
                                        break;
                                    }
                                }
                            }
                            if (str4 != null) {
                                sf.c.t(org.telegram.messenger.t0.f25457b, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                            if (T != null) {
                                if (!(T instanceof wm) || ((wm) T).a() != j13) {
                                    T.presentFragment(wm.ra(j13));
                                }
                                org.telegram.messenger.g0.i3(new ci.s9(i16, j13, 1), 150L);
                            }
                        }
                    } else if (i3 == 21) {
                        if (this.f46427b.getParentActivity() != null) {
                            if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.f25041b) && this.f46427b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                this.f46427b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            ru0 ru0Var = this.f46427b.f41817o0;
                            org.telegram.messenger.ac D = ru0Var.D(ru0Var.getRealPosition());
                            if (D != null) {
                                if (D.f21497p == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i15 = ((org.telegram.ui.ActionBar.d2) this.f46427b).currentAccount;
                                org.telegram.messenger.w7.G(i15);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = D.f21488f;
                                if (z10) {
                                    str3 = "mp4";
                                }
                                File K = org.telegram.messenger.w7.K(tL_fileLocationToBeDeprecated2, str3, true, true);
                                if (z10 && !K.exists()) {
                                    K = new File(org.telegram.messenger.w7.z(0), org.telegram.messenger.w7.r("mp4", D.f21488f));
                                }
                                if (K.exists()) {
                                    MediaController.d0(K.toString(), this.f46427b.getParentActivity(), 0, null, null, new ci.b8(8, this, z10));
                                }
                            }
                        }
                    } else if (i3 == 30) {
                        this.f46427b.presentFragment(new UserInfoActivity());
                    } else if (i3 == 40) {
                        ProfileActivity profileActivity15 = this.f46427b;
                        cm0 cm0Var = new cm0();
                        cm0Var.I = this.f46427b;
                        profileActivity15.presentFragment(cm0Var);
                    } else if (i3 == 42) {
                        TLRPC.User a25 = this.f46427b.getMessagesController().a2(Long.valueOf(this.f46427b.f41751e1));
                        if (org.telegram.messenger.g0.g(this.f46427b.getMessagesController().V2 + "/" + org.telegram.messenger.l10.n(a25))) {
                            org.telegram.ui.Components.fc.a0(this.f46427b).k(false).j();
                        }
                    } else if (i3 == 43) {
                        this.f46427b.presentFragment(new ka(null));
                    } else if (i3 == 31) {
                        this.f46427b.presentFragment(new org.telegram.ui.ActionBar.d2(null));
                    } else if (i3 == 33) {
                        int realPosition = this.f46427b.f41817o0.getRealPosition();
                        TLRPC.Photo F = this.f46427b.f41817o0.F(realPosition);
                        if (F != null) {
                            ru0 ru0Var2 = this.f46427b.f41817o0;
                            ArrayList arrayList2 = ru0Var2.f39094c1;
                            ArrayList arrayList3 = ru0Var2.f39093b1;
                            ArrayList arrayList4 = ru0Var2.f39092a1;
                            ArrayList arrayList5 = ru0Var2.Z0;
                            ArrayList arrayList6 = ru0Var2.X0;
                            ArrayList arrayList7 = ru0Var2.V0;
                            ArrayList arrayList8 = ru0Var2.Y0;
                            ArrayList arrayList9 = ru0Var2.W0;
                            org.telegram.messenger.po poVar = ru0Var2.T0;
                            if (poVar != null) {
                                poVar.c(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                ru0Var2.f39095d1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = ru0Var2.U0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (org.telegram.messenger.ac) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (org.telegram.messenger.ac) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (org.telegram.messenger.ac) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.x41) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                ru0Var2.Q0 = (org.telegram.messenger.ac) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f27135id = tL_inputPhoto;
                            tL_inputPhoto.f27020id = F.f27025id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            org.telegram.messenger.h10 userConfig = this.f46427b.getUserConfig();
                            this.f46427b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new co0(this, userConfig, F, 6));
                            ProfileActivity profileActivity16 = this.f46427b;
                            UndoView undoView = profileActivity16.M;
                            long j14 = profileActivity16.f41751e1;
                            if (F.video_sizes.isEmpty()) {
                                num = null;
                            } else {
                                num = 1;
                            }
                            undoView.m(j14, num, 22);
                            TLRPC.User a26 = this.f46427b.getMessagesController().a2(Long.valueOf(userConfig.f22848n));
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F.sizes, 800, false, null, false);
                            if (a26 != null) {
                                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F.sizes, 90, false, null, false);
                                TLRPC.UserProfilePhoto userProfilePhoto = a26.photo;
                                userProfilePhoto.photo_id = F.f27025id;
                                userProfilePhoto.photo_small = w11.location;
                                userProfilePhoto.photo_big = w10.location;
                                userConfig.w(a26);
                                userConfig.v(true);
                                i14 = ((org.telegram.ui.ActionBar.d2) this.f46427b).currentAccount;
                                org.telegram.messenger.hs.f(i14).k(org.telegram.messenger.hs.f23248j0, new Object[0]);
                                this.f46427b.I5(true);
                            }
                            ru0 ru0Var3 = this.f46427b.f41817o0;
                            ru0Var3.E0.g();
                            ru0Var3.L();
                        }
                    } else if (i3 == 34) {
                        i10 = ((org.telegram.ui.ActionBar.d2) this.f46427b).currentAccount;
                        if (org.telegram.messenger.hp.s1(i10).v2()) {
                            i13 = ((org.telegram.ui.ActionBar.d2) this.f46427b).currentAccount;
                            b.b(i13);
                            return;
                        }
                        int realPosition2 = this.f46427b.f41817o0.getRealPosition();
                        org.telegram.messenger.ac D2 = this.f46427b.f41817o0.D(realPosition2);
                        if (D2 != null) {
                            i11 = ((org.telegram.ui.ActionBar.d2) this.f46427b).currentAccount;
                            org.telegram.messenger.w7.G(i11);
                            Drawable[] drawableArr = PhotoViewer.V8;
                            File K2 = org.telegram.messenger.w7.K(D2.f21488f, PhotoViewer.s1(D2), true, true);
                            if (D2.f21497p == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                org.telegram.messenger.ac G = this.f46427b.f41817o0.G(realPosition2);
                                i12 = ((org.telegram.ui.ActionBar.d2) this.f46427b).currentAccount;
                                org.telegram.messenger.w7.G(i12);
                                if (G != null) {
                                    tL_fileLocationToBeDeprecated = G.f21488f;
                                }
                                str2 = org.telegram.messenger.w7.K(tL_fileLocationToBeDeprecated, PhotoViewer.s1(G), true, true).getAbsolutePath();
                            }
                            this.f46427b.f41839r0.p(K2.getAbsolutePath(), str2, z12);
                        }
                    } else if (i3 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.f46427b.getParentActivity(), this.f46427b.A0);
                        ru0 ru0Var4 = this.f46427b.f41817o0;
                        org.telegram.messenger.ac D3 = ru0Var4.D(ru0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.f21497p == 2) {
                                alertDialog$Builder4.f27343a.S = org.telegram.messenger.bd.M0(2131754083, null);
                                alertDialog$Builder4.f27343a.U = org.telegram.messenger.bd.M0(2131754085, null);
                            } else {
                                alertDialog$Builder4.f27343a.S = org.telegram.messenger.bd.M0(2131754094, null);
                                alertDialog$Builder4.f27343a.U = org.telegram.messenger.bd.M0(2131754096, null);
                            }
                            alertDialog$Builder4.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.ActionBar.p1(this) {
                                public final iv0 f45722b;

                                {
                                    this.f45722b = this;
                                }

                                @Override
                                public final void g(org.telegram.ui.ActionBar.s1 r14, int r15) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.gv0.g(org.telegram.ui.ActionBar.s1, int):void");
                                }
                            });
                            alertDialog$Builder4.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.s1 s1Var3 = alertDialog$Builder4.f27343a;
                            this.f46427b.showDialog(s1Var3);
                            TextView textView4 = (TextView) s1Var3.d(-1);
                            if (textView4 != null) {
                                org.telegram.ui.ActionBar.r6.V(textView4, org.telegram.ui.ActionBar.k6.f28122q7, this.f46427b.A0);
                            }
                        }
                    } else if (i3 == 36) {
                        this.f46427b.I4();
                    }
                } else {
                    ProfileActivity profileActivity17 = this.f46427b;
                    if (i3 == 16) {
                        z11 = true;
                    }
                    profileActivity17.C4(z11);
                }
            }
        }
    }
}
