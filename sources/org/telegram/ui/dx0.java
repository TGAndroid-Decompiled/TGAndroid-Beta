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
public final class dx0 extends org.telegram.ui.ActionBar.k {
    public final Context f36858a;
    public final ProfileActivity f36859b;

    public dx0(ProfileActivity profileActivity, Context context) {
        this.f36859b = profileActivity;
        this.f36858a = context;
    }

    @Override
    public final void b(int i10) {
        TLRPC.EncryptedChat encryptedChat;
        long j10;
        int i11;
        int i12;
        int i13;
        int i14;
        Integer num;
        int i15;
        boolean z10;
        int i16;
        int i17;
        TL_bots.BotInfo botInfo;
        int i18;
        String str;
        int i19;
        org.telegram.ui.Components.ur0 ur0Var;
        if (this.f36859b.getParentActivity() != null) {
            if (i10 == -1) {
                ProfileActivity profileActivity = this.f36859b;
                ix0 ix0Var = profileActivity.N;
                if (ix0Var != null && (ur0Var = ix0Var.K0) != null && ur0Var.f24182n0) {
                    profileActivity.k5();
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
                this.f36859b.A4(false);
            } else if (i10 == 1) {
                TLRPC.User Z1 = this.f36859b.getMessagesController().Z1(Long.valueOf(this.f36859b.f33796d1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", Z1.f19942id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f36859b;
                ns nsVar = new ns(bundle, profileActivity2.f33950z0);
                nsVar.O = new gv0(profileActivity2, Z1);
                profileActivity2.presentFragment(nsVar);
            } else {
                String str2 = null;
                String str3 = null;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
                if (i10 == 3) {
                    Bundle j11 = org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true);
                    j11.putString("selectAlertString", org.telegram.messenger.cd.L0(2131745647, null));
                    j11.putString("selectAlertStringGroup", org.telegram.messenger.cd.L0(2131745648, null));
                    ay ayVar = new ay(j11);
                    ProfileActivity profileActivity3 = this.f36859b;
                    ayVar.C2 = profileActivity3;
                    profileActivity3.presentFragment(ayVar);
                } else if (i10 == 4) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", this.f36859b.f33796d1);
                    ProfileActivity profileActivity4 = this.f36859b;
                    profileActivity4.presentFragment(new ns(bundle2, profileActivity4.f33950z0));
                } else if (i10 == 5) {
                    TLRPC.User Z12 = this.f36859b.getMessagesController().Z1(Long.valueOf(this.f36859b.f33796d1));
                    if (Z12 != null && this.f36859b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f36859b.getParentActivity(), this.f36859b.f33950z0);
                        alertDialog$Builder.f20134a.R = org.telegram.messenger.cd.L0(2131751553, null);
                        alertDialog$Builder.f20134a.T = org.telegram.messenger.cd.L0(2131754103, null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751599, null), new ep0(10, this, Z12));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        this.f36859b.showDialog(x1Var);
                        TextView textView = (TextView) x1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, this.f36859b.f33950z0);
                        }
                    }
                } else if (i10 == 7) {
                    this.f36859b.v4(false);
                } else if (i10 == 45) {
                    this.f36859b.v4(true);
                } else if (i10 == 46) {
                    if (!this.f36859b.getUserConfig().q()) {
                        ProfileActivity profileActivity5 = this.f36859b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i19 = ((org.telegram.ui.ActionBar.k2) this.f36859b).currentAccount;
                        new kg.i1(profileActivity5, parentActivity, i19, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f36858a;
                    org.telegram.ui.ActionBar.p6 p6Var = this.f36859b.f33950z0;
                    wv0 wv0Var = new wv0(this, 4);
                    Pattern pattern = org.telegram.ui.Components.s4.f30123a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.z2 k10 = org.telegram.messenger.m5.k(1, context, null, false);
                        mg.l1 l1Var = k10.f21621x0;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, w7.b6.t(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(2131624171, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(org.telegram.messenger.i0.o());
                        textView2.setGravity(17);
                        textView2.setText(org.telegram.messenger.cd.L0(2131751423, null));
                        textView2.setTextSize(1, 20.0f);
                        int i21 = org.telegram.ui.ActionBar.t6.G6;
                        org.telegram.ui.ActionBar.a7.V(textView2, i21, p6Var);
                        linearLayout.addView(textView2, w7.b6.t(-1, -2, 17, 20, 0, 20, 14));
                        st0 st0Var = new st0(context, p6Var);
                        st0Var.f41644a.l(org.telegram.messenger.cd.L0(2131751422, null), false);
                        st0Var.f41645b.setText(org.telegram.messenger.cd.L0(2131751419, null));
                        st0Var.d.setVisibility(8);
                        st0Var.f41646c.setImageResource(2131231846);
                        ImageView imageView2 = st0Var.f41646c;
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                        org.telegram.ui.ActionBar.a7.t(imageView2, i21, p6Var, mode);
                        linearLayout.addView(st0Var, w7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        st0 st0Var2 = new st0(context, p6Var);
                        st0Var2.f41644a.l(org.telegram.messenger.cd.L0(2131751421, null), false);
                        st0Var2.f41645b.setText(org.telegram.messenger.cd.L0(2131751418, null));
                        st0Var2.d.setVisibility(8);
                        st0Var2.f41646c.setImageResource(2131231878);
                        org.telegram.ui.ActionBar.a7.t(st0Var2.f41646c, i21, p6Var, mode);
                        linearLayout.addView(st0Var2, w7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        st0 st0Var3 = new st0(context, p6Var);
                        st0Var3.f41644a.l(org.telegram.messenger.cd.L0(2131751420, null), false);
                        st0Var3.f41645b.setText(org.telegram.messenger.cd.L0(2131751417, null));
                        st0Var3.d.setVisibility(8);
                        st0Var3.f41646c.setImageResource(2131231787);
                        org.telegram.ui.ActionBar.a7.t(st0Var3.f41646c, i21, p6Var, mode);
                        linearLayout.addView(st0Var3, w7.b6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        vh.d dVar = new vh.d(context, p6Var, true);
                        dVar.setOnClickListener(new ud(16, zArr, l1Var));
                        dVar.f();
                        dVar.i(org.telegram.messenger.cd.L0(2131751424, null), false, true);
                        linearLayout.addView(dVar, w7.b6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        k10.N = linearLayout;
                        k10.show();
                        k10.o(new zg(26, zArr, wv0Var));
                    }
                } else if (i10 == 47) {
                    ProfileActivity profileActivity6 = this.f36859b;
                    profileActivity6.getMessagesController().a5(profileActivity6.f33796d1, 0, false, new cv0(0, profileActivity6, false));
                } else if (i10 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f36859b.getParentActivity());
                    alertDialog$Builder2.f20134a.R = org.telegram.messenger.cd.J0(1, "DeleteTopics");
                    i18 = ((org.telegram.ui.ActionBar.k2) this.f36859b).currentAccount;
                    org.telegram.messenger.x00 x00Var = org.telegram.messenger.vp.r1(i18).f18891r7;
                    ProfileActivity profileActivity7 = this.f36859b;
                    TLRPC.TL_forumTopic f7 = x00Var.f(profileActivity7.f33803e1, profileActivity7.f33811f1);
                    if (f7 == null) {
                        str = "topic";
                    } else {
                        str = f7.title;
                    }
                    alertDialog$Builder2.f20134a.T = org.telegram.messenger.cd.a0("DeleteSelectedTopic", null, 2131751499, str);
                    alertDialog$Builder2.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1(this) {
                        public final dx0 f36321b;

                        {
                            this.f36321b = this;
                        }

                        @Override
                        public final void h(org.telegram.ui.ActionBar.x1 r14, int r15) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx0.h(org.telegram.ui.ActionBar.x1, int):void");
                        }
                    });
                    alertDialog$Builder2.h(org.telegram.messenger.cd.L0(2131752589, null), new org.telegram.ui.Components.z11(24));
                    org.telegram.ui.ActionBar.x1 x1Var2 = alertDialog$Builder2.f20134a;
                    x1Var2.show();
                    TextView textView3 = (TextView) x1Var2.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.a7.V(textView3, org.telegram.ui.ActionBar.t6.f21170q7, null);
                    }
                } else if (i10 == 24) {
                    ProfileActivity profileActivity8 = this.f36859b;
                    c01.K0(profileActivity8.a(), profileActivity8);
                } else if (i10 == 12) {
                    ProfileActivity profileActivity9 = this.f36859b;
                    if (profileActivity9.f33879p1) {
                        profileActivity9.presentFragment(la1.e0(profileActivity9.f33803e1, profileActivity9.f33811f1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f36859b;
                    long j12 = profileActivity10.f33803e1;
                    if (j12 != 0) {
                        bundle3.putLong("chat_id", j12);
                    } else if (profileActivity10.f33886q2) {
                        bundle3.putLong("user_id", profileActivity10.f33796d1);
                    }
                    oo ooVar = new oo(bundle3);
                    ProfileActivity profileActivity11 = this.f36859b;
                    TLRPC.ChatFull chatFull = profileActivity11.f33908t2;
                    if (chatFull != null) {
                        ooVar.p0(chatFull);
                    } else {
                        ooVar.q0(profileActivity11.f33915u2);
                    }
                    this.f36859b.presentFragment(ooVar);
                } else if (i10 == 41) {
                    this.f36859b.presentFragment(new UserInfoActivity());
                } else if (i10 == 9) {
                    TLRPC.User Z13 = this.f36859b.getMessagesController().Z1(Long.valueOf(this.f36859b.f33796d1));
                    if (Z13 != null) {
                        Bundle j13 = org.telegram.ui.Cells.f1.j(2, "onlySelect", "dialogsType", true);
                        j13.putBoolean("resetDelegate", false);
                        j13.putBoolean("closeFragment", false);
                        ay ayVar2 = new ay(j13);
                        ayVar2.C2 = new a7(this, Z13, ayVar2, 19);
                        this.f36859b.presentFragment(ayVar2);
                    }
                } else if (i10 == 10) {
                    this.f36859b.F4();
                } else if (i10 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f36859b;
                        if (profileActivity12.C2 != null) {
                            j10 = org.telegram.messenger.o5.F(encryptedChat.f19801id);
                        } else {
                            j10 = profileActivity12.f33796d1;
                            if (j10 == 0) {
                                long j14 = profileActivity12.f33803e1;
                                if (j14 != 0) {
                                    j10 = -j14;
                                } else {
                                    return;
                                }
                            }
                        }
                        org.telegram.messenger.ui mediaDataController = this.f36859b.getMediaDataController();
                        Pattern pattern2 = org.telegram.messenger.ui.R1;
                        mediaDataController.y0(j10, 0, null);
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                } else if (i10 != 15 && i10 != 16) {
                    if (i10 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f36859b.f33803e1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        pr prVar = new pr(bundle4);
                        prVar.B0(this.f36859b.f33908t2);
                        this.f36859b.presentFragment(prVar);
                    } else if (i10 == 18) {
                        this.f36859b.I4();
                    } else if (i10 == 19) {
                        this.f36859b.presentFragment(u61.f0(this.f36859b.getMessagesController().L0(Long.valueOf(this.f36859b.f33803e1)), false));
                    } else if (i10 == 22) {
                        this.f36859b.L4();
                    } else if (i10 == 38) {
                        this.f36859b.C4();
                    } else if (i10 == 48) {
                        ProfileActivity profileActivity13 = this.f36859b;
                        org.telegram.ui.Wallet.r9 r9Var = new org.telegram.ui.Wallet.r9(profileActivity13.getMessagesController().Z1(Long.valueOf(this.f36859b.f33796d1)));
                        r9Var.f35131f0 = true;
                        profileActivity13.presentFragment(r9Var);
                    } else if (i10 == 39) {
                        Bundle i22 = org.telegram.ui.Cells.f1.i(2, "type");
                        i22.putLong("dialog_id", -this.f36859b.f33803e1);
                        org.telegram.ui.Components.n90 n90Var = new org.telegram.ui.Components.n90(i22, null);
                        ProfileActivity profileActivity14 = this.f36859b;
                        n90Var.f28724c = profileActivity14.f33908t2;
                        profileActivity14.presentFragment(n90Var);
                    } else if (i10 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, this.f36859b.getParentActivity(), this.f36859b.f33950z0);
                        alertDialog$Builder3.f20134a.R = org.telegram.messenger.cd.L0(2131754078, null);
                        alertDialog$Builder3.f20134a.T = org.telegram.messenger.cd.L0(2131754079, null);
                        alertDialog$Builder3.k(org.telegram.messenger.cd.L0(2131744933, null), new org.telegram.ui.ActionBar.u1(this) {
                            public final dx0 f36321b;

                            {
                                this.f36321b = this;
                            }

                            @Override
                            public final void h(org.telegram.ui.ActionBar.x1 r14, int r15) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx0.h(org.telegram.ui.ActionBar.x1, int):void");
                            }
                        });
                        alertDialog$Builder3.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                        this.f36859b.showDialog(alertDialog$Builder3.f20134a);
                    } else if (i10 == 44) {
                        i17 = ((org.telegram.ui.ActionBar.k2) this.f36859b).currentAccount;
                        long j15 = this.f36859b.f33796d1;
                        TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(i17).a2(j15);
                        if (a2 != null && (botInfo = a2.bot_info) != null) {
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
                                        str4 = org.telegram.messenger.cd.L0(2131753098, null);
                                        break;
                                    }
                                }
                            }
                            if (str4 != null) {
                                gf.f.r(org.telegram.messenger.w0.f19025b, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                            if (T != null) {
                                if (!(T instanceof un) || ((un) T).a() != j15) {
                                    T.presentFragment(un.ha(j15));
                                }
                                org.telegram.messenger.i0.h3(new org.telegram.ui.web.l(i17, j15, 2), 150L);
                            }
                        }
                    } else if (i10 == 21) {
                        if (this.f36859b.getParentActivity() != null) {
                            if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.v2.f18449b) && this.f36859b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                this.f36859b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            kw0 kw0Var = this.f36859b.f33864n0;
                            org.telegram.messenger.ic D = kw0Var.D(kw0Var.getRealPosition());
                            if (D != null) {
                                if (D.f16109p == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i16 = ((org.telegram.ui.ActionBar.k2) this.f36859b).currentAccount;
                                org.telegram.messenger.b8.G(i16);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = D.f16100f;
                                if (z10) {
                                    str3 = "mp4";
                                }
                                File K = org.telegram.messenger.b8.K(tL_fileLocationToBeDeprecated2, str3, true, true);
                                if (z10 && !K.exists()) {
                                    K = new File(org.telegram.messenger.b8.z(0), org.telegram.messenger.b8.r("mp4", D.f16100f));
                                }
                                if (K.exists()) {
                                    MediaController.d0(K.toString(), this.f36859b.getParentActivity(), 0, null, null, new nc(4, this, z10));
                                }
                            }
                        }
                    } else if (i10 == 30) {
                        this.f36859b.presentFragment(new UserInfoActivity());
                    } else if (i10 == 40) {
                        ProfileActivity profileActivity15 = this.f36859b;
                        tn0 tn0Var = new tn0();
                        tn0Var.H = this.f36859b;
                        profileActivity15.presentFragment(tn0Var);
                    } else if (i10 == 42) {
                        TLRPC.User Z14 = this.f36859b.getMessagesController().Z1(Long.valueOf(this.f36859b.f33796d1));
                        org.telegram.messenger.i0.g(this.f36859b.getMessagesController().U2 + "/" + org.telegram.messenger.h20.n(Z14));
                    } else if (i10 == 43) {
                        this.f36859b.presentFragment(new oa(null));
                    } else if (i10 == 31) {
                        this.f36859b.presentFragment(new org.telegram.ui.ActionBar.k2(null));
                    } else if (i10 == 33) {
                        int realPosition = this.f36859b.f33864n0.getRealPosition();
                        TLRPC.Photo F = this.f36859b.f33864n0.F(realPosition);
                        if (F != null) {
                            kw0 kw0Var2 = this.f36859b.f33864n0;
                            ArrayList arrayList2 = kw0Var2.f30927b1;
                            ArrayList arrayList3 = kw0Var2.f30926a1;
                            ArrayList arrayList4 = kw0Var2.Z0;
                            ArrayList arrayList5 = kw0Var2.Y0;
                            ArrayList arrayList6 = kw0Var2.W0;
                            ArrayList arrayList7 = kw0Var2.U0;
                            ArrayList arrayList8 = kw0Var2.X0;
                            ArrayList arrayList9 = kw0Var2.V0;
                            org.telegram.messenger.dp dpVar = kw0Var2.S0;
                            if (dpVar != null) {
                                ArrayList arrayList10 = dpVar.f15288b;
                                if (realPosition >= 0 && realPosition < arrayList10.size()) {
                                    arrayList10.add(0, (TLRPC.Photo) arrayList10.remove(realPosition));
                                    dpVar.f();
                                    dpVar.h.getNotificationCenter().k(org.telegram.messenger.zs.f19605e3, dpVar);
                                }
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                kw0Var2.f30928c1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList11 = kw0Var2.T0;
                                arrayList11.add(0, (String) arrayList11.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (org.telegram.messenger.ic) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (org.telegram.messenger.ic) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (org.telegram.messenger.ic) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.g61) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                kw0Var2.P0 = (org.telegram.messenger.ic) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f19927id = tL_inputPhoto;
                            tL_inputPhoto.f19812id = F.f19817id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            org.telegram.messenger.d20 userConfig = this.f36859b.getUserConfig();
                            this.f36859b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new vp0(this, userConfig, F, 6));
                            ProfileActivity profileActivity16 = this.f36859b;
                            UndoView undoView = profileActivity16.L;
                            long j16 = profileActivity16.f33796d1;
                            if (F.video_sizes.isEmpty()) {
                                num = null;
                            } else {
                                num = 1;
                            }
                            undoView.m(j16, num, 22);
                            TLRPC.User Z15 = this.f36859b.getMessagesController().Z1(Long.valueOf(userConfig.f15165n));
                            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(F.sizes, 800, false, null, false);
                            if (Z15 != null) {
                                TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(F.sizes, 90, false, null, false);
                                TLRPC.UserProfilePhoto userProfilePhoto = Z15.photo;
                                userProfilePhoto.photo_id = F.f19817id;
                                userProfilePhoto.photo_small = w10.location;
                                userProfilePhoto.photo_big = w9.location;
                                userConfig.w(Z15);
                                userConfig.v(true);
                                i15 = ((org.telegram.ui.ActionBar.k2) this.f36859b).currentAccount;
                                org.telegram.messenger.zs.f(i15).k(org.telegram.messenger.zs.f19632j0, new Object[0]);
                                this.f36859b.H5(true);
                            }
                            kw0 kw0Var3 = this.f36859b.f33864n0;
                            kw0Var3.D0.g();
                            kw0Var3.L();
                        }
                    } else if (i10 == 34) {
                        i11 = ((org.telegram.ui.ActionBar.k2) this.f36859b).currentAccount;
                        if (org.telegram.messenger.vp.r1(i11).u2()) {
                            i14 = ((org.telegram.ui.ActionBar.k2) this.f36859b).currentAccount;
                            b.b(i14);
                            return;
                        }
                        int realPosition2 = this.f36859b.f33864n0.getRealPosition();
                        org.telegram.messenger.ic D2 = this.f36859b.f33864n0.D(realPosition2);
                        if (D2 != null) {
                            i12 = ((org.telegram.ui.ActionBar.k2) this.f36859b).currentAccount;
                            org.telegram.messenger.b8.G(i12);
                            Drawable[] drawableArr = PhotoViewer.U8;
                            File K2 = org.telegram.messenger.b8.K(D2.f16100f, PhotoViewer.s1(D2), true, true);
                            if (D2.f16109p == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                org.telegram.messenger.ic G = this.f36859b.f33864n0.G(realPosition2);
                                i13 = ((org.telegram.ui.ActionBar.k2) this.f36859b).currentAccount;
                                org.telegram.messenger.b8.G(i13);
                                if (G != null) {
                                    tL_fileLocationToBeDeprecated = G.f16100f;
                                }
                                str2 = org.telegram.messenger.b8.K(tL_fileLocationToBeDeprecated, PhotoViewer.s1(G), true, true).getAbsolutePath();
                            }
                            this.f36859b.f33884q0.p(K2.getAbsolutePath(), str2, z12);
                        }
                    } else if (i10 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.f36859b.getParentActivity(), this.f36859b.f33950z0);
                        kw0 kw0Var4 = this.f36859b.f33864n0;
                        org.telegram.messenger.ic D3 = kw0Var4.D(kw0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.f16109p == 2) {
                                alertDialog$Builder4.f20134a.R = org.telegram.messenger.cd.L0(2131754083, null);
                                alertDialog$Builder4.f20134a.T = org.telegram.messenger.cd.L0(2131754085, null);
                            } else {
                                alertDialog$Builder4.f20134a.R = org.telegram.messenger.cd.L0(2131754094, null);
                                alertDialog$Builder4.f20134a.T = org.telegram.messenger.cd.L0(2131754096, null);
                            }
                            alertDialog$Builder4.k(org.telegram.messenger.cd.L0(2131751599, null), new org.telegram.ui.ActionBar.u1(this) {
                                public final dx0 f36321b;

                                {
                                    this.f36321b = this;
                                }

                                @Override
                                public final void h(org.telegram.ui.ActionBar.x1 r14, int r15) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.bx0.h(org.telegram.ui.ActionBar.x1, int):void");
                                }
                            });
                            alertDialog$Builder4.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                            org.telegram.ui.ActionBar.x1 x1Var3 = alertDialog$Builder4.f20134a;
                            this.f36859b.showDialog(x1Var3);
                            TextView textView4 = (TextView) x1Var3.d(-1);
                            if (textView4 != null) {
                                org.telegram.ui.ActionBar.a7.V(textView4, org.telegram.ui.ActionBar.t6.f21170q7, this.f36859b.f33950z0);
                            }
                        }
                    } else if (i10 == 36) {
                        this.f36859b.H4();
                    }
                } else {
                    ProfileActivity profileActivity17 = this.f36859b;
                    if (i10 == 16) {
                        z11 = true;
                    }
                    profileActivity17.B4(z11);
                }
            }
        }
    }
}
