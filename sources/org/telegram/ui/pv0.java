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
public final class pv0 extends org.telegram.ui.ActionBar.j {
    public final Context f50373a;
    public final ProfileActivity f50374b;

    public pv0(ProfileActivity profileActivity, Context context) {
        this.f50374b = profileActivity;
        this.f50373a = context;
    }

    @Override
    public final void b(int i7) {
        TLRPC.EncryptedChat encryptedChat;
        long j3;
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
        org.telegram.ui.Components.vq0 vq0Var;
        if (this.f50374b.getParentActivity() != null) {
            if (i7 == -1) {
                ProfileActivity profileActivity = this.f50374b;
                uv0 uv0Var = profileActivity.O;
                if (uv0Var != null && (vq0Var = uv0Var.L0) != null && vq0Var.f32719o0) {
                    profileActivity.n5();
                    return;
                } else {
                    profileActivity.finishFragment();
                    return;
                }
            }
            boolean z11 = false;
            int i19 = 0;
            boolean z12 = false;
            if (i7 == 2) {
                this.f50374b.D4(false);
            } else if (i7 == 1) {
                TLRPC.User a22 = this.f50374b.getMessagesController().a2(Long.valueOf(this.f50374b.f43094e1));
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", a22.f28200id);
                bundle.putBoolean("addContact", true);
                ProfileActivity profileActivity2 = this.f50374b;
                pr prVar = new pr(bundle, profileActivity2.A0);
                prVar.P = new ut0(profileActivity2, a22);
                profileActivity2.presentFragment(prVar);
            } else {
                String str2 = null;
                String str3 = null;
                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = null;
                if (i7 == 3) {
                    Bundle j10 = org.telegram.ui.Cells.y0.j(3, "onlySelect", "dialogsType", true);
                    j10.putString("selectAlertString", org.telegram.messenger.hd.M0(2131745630, null));
                    j10.putString("selectAlertStringGroup", org.telegram.messenger.hd.M0(2131745631, null));
                    yw ywVar = new yw(j10);
                    ProfileActivity profileActivity3 = this.f50374b;
                    ywVar.E2 = profileActivity3;
                    profileActivity3.presentFragment(ywVar);
                } else if (i7 == 4) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", this.f50374b.f43094e1);
                    ProfileActivity profileActivity4 = this.f50374b;
                    profileActivity4.presentFragment(new pr(bundle2, profileActivity4.A0));
                } else if (i7 == 5) {
                    TLRPC.User a23 = this.f50374b.getMessagesController().a2(Long.valueOf(this.f50374b.f43094e1));
                    if (a23 != null && this.f50374b.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.f50374b.getParentActivity(), this.f50374b.A0);
                        alertDialog$Builder.f28392a.S = org.telegram.messenger.hd.M0(2131751552, null);
                        alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.M0(2131754103, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new xi0(15, this, a23));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        this.f50374b.showDialog(t1Var);
                        TextView textView = (TextView) t1Var.d(-1);
                        if (textView != null) {
                            org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.f29090q7, this.f50374b.A0);
                        }
                    }
                } else if (i7 == 7) {
                    this.f50374b.y4(false);
                } else if (i7 == 45) {
                    this.f50374b.y4(true);
                } else if (i7 == 46) {
                    if (!this.f50374b.getUserConfig().q()) {
                        ProfileActivity profileActivity5 = this.f50374b;
                        Activity parentActivity = profileActivity5.getParentActivity();
                        i18 = ((org.telegram.ui.ActionBar.e2) this.f50374b).currentAccount;
                        new ug.x0(profileActivity5, parentActivity, i18, false, 41, false, null).show();
                        return;
                    }
                    Context context = this.f50373a;
                    org.telegram.ui.ActionBar.e6 e6Var = this.f50374b.A0;
                    pu0 pu0Var = new pu0(this, 2);
                    Pattern pattern = org.telegram.ui.Components.t4.f39505a;
                    if (context != null) {
                        boolean[] zArr = new boolean[1];
                        org.telegram.ui.ActionBar.u2 k10 = org.telegram.messenger.k5.k(1, context, null, false);
                        org.telegram.ui.ActionBar.f2 f2Var = k10.f29724y0;
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.setClipChildren(false);
                        linearLayout.setClipToPadding(false);
                        ?? imageView = new ImageView(context);
                        linearLayout.addView((View) imageView, c8.ja.t(110, 110, 17, 0, 21, 0, 11));
                        imageView.f(2131624174, 110, 110, null);
                        imageView.setAutoRepeat(false);
                        imageView.d();
                        TextView textView2 = new TextView(context);
                        textView2.setTypeface(org.telegram.messenger.g0.o());
                        textView2.setGravity(17);
                        textView2.setText(org.telegram.messenger.hd.M0(2131751422, null));
                        textView2.setTextSize(1, 20.0f);
                        int i20 = org.telegram.ui.ActionBar.j6.G6;
                        org.telegram.ui.ActionBar.q6.U(textView2, i20, e6Var);
                        linearLayout.addView(textView2, c8.ja.t(-1, -2, 17, 20, 0, 20, 14));
                        fs0 fs0Var = new fs0(context, e6Var);
                        fs0Var.f47176a.l(org.telegram.messenger.hd.M0(2131751421, null), false);
                        fs0Var.f47177b.setText(org.telegram.messenger.hd.M0(2131751418, null));
                        fs0Var.d.setVisibility(8);
                        fs0Var.f47178c.setImageResource(2131231847);
                        ImageView imageView2 = fs0Var.f47178c;
                        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
                        org.telegram.ui.ActionBar.q6.s(imageView2, i20, e6Var, mode);
                        linearLayout.addView(fs0Var, c8.ja.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        fs0 fs0Var2 = new fs0(context, e6Var);
                        fs0Var2.f47176a.l(org.telegram.messenger.hd.M0(2131751420, null), false);
                        fs0Var2.f47177b.setText(org.telegram.messenger.hd.M0(2131751417, null));
                        fs0Var2.d.setVisibility(8);
                        fs0Var2.f47178c.setImageResource(2131231879);
                        org.telegram.ui.ActionBar.q6.s(fs0Var2.f47178c, i20, e6Var, mode);
                        linearLayout.addView(fs0Var2, c8.ja.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
                        fs0 fs0Var3 = new fs0(context, e6Var);
                        fs0Var3.f47176a.l(org.telegram.messenger.hd.M0(2131751419, null), false);
                        fs0Var3.f47177b.setText(org.telegram.messenger.hd.M0(2131751416, null));
                        fs0Var3.d.setVisibility(8);
                        fs0Var3.f47178c.setImageResource(2131231788);
                        org.telegram.ui.ActionBar.q6.s(fs0Var3.f47178c, i20, e6Var, mode);
                        linearLayout.addView(fs0Var3, c8.ja.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
                        hi.d dVar = new hi.d(context, e6Var, true);
                        dVar.setOnClickListener(new org.telegram.ui.Components.n2(1, zArr, f2Var));
                        dVar.f();
                        dVar.i(org.telegram.messenger.hd.M0(2131751423, null), false, true);
                        linearLayout.addView(dVar, c8.ja.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
                        k10.O = linearLayout;
                        k10.show();
                        k10.n(new zg(21, zArr, pu0Var));
                    }
                } else if (i7 == 47) {
                    ProfileActivity profileActivity6 = this.f50374b;
                    profileActivity6.getMessagesController().e5(profileActivity6.f43094e1, 0, false, new hi.j9(2, profileActivity6, false));
                } else if (i7 == 23) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(this.f50374b.getParentActivity());
                    alertDialog$Builder2.f28392a.S = org.telegram.messenger.hd.K0(1, "DeleteTopics");
                    i17 = ((org.telegram.ui.ActionBar.e2) this.f50374b).currentAccount;
                    org.telegram.messenger.h00 h00Var = org.telegram.messenger.np.s1(i17).f25386r7;
                    ProfileActivity profileActivity7 = this.f50374b;
                    TLRPC.TL_forumTopic f10 = h00Var.f(profileActivity7.f43102f1, profileActivity7.f43109g1);
                    if (f10 == null) {
                        str = "topic";
                    } else {
                        str = f10.title;
                    }
                    alertDialog$Builder2.f28392a.U = org.telegram.messenger.hd.a0("DeleteSelectedTopic", null, 2131751498, str);
                    alertDialog$Builder2.k(org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.ActionBar.q1(this) {
                        public final pv0 f49694b;

                        {
                            this.f49694b = this;
                        }

                        @Override
                        public final void h(org.telegram.ui.ActionBar.t1 r14, int r15) {
                            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nv0.h(org.telegram.ui.ActionBar.t1, int):void");
                        }
                    });
                    alertDialog$Builder2.h(org.telegram.messenger.hd.M0(2131752589, null), new t70(10));
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder2.f28392a;
                    t1Var2.show();
                    TextView textView3 = (TextView) t1Var2.d(-1);
                    if (textView3 != null) {
                        org.telegram.ui.ActionBar.q6.U(textView3, org.telegram.ui.ActionBar.j6.f29090q7, null);
                    }
                } else if (i7 == 24) {
                    ProfileActivity profileActivity8 = this.f50374b;
                    my0.K0(profileActivity8.a(), profileActivity8);
                } else if (i7 == 12) {
                    ProfileActivity profileActivity9 = this.f50374b;
                    if (profileActivity9.f43175q1) {
                        profileActivity9.presentFragment(s81.f0(profileActivity9.f43102f1, profileActivity9.f43109g1));
                        return;
                    }
                    Bundle bundle3 = new Bundle();
                    ProfileActivity profileActivity10 = this.f50374b;
                    long j11 = profileActivity10.f43102f1;
                    if (j11 != 0) {
                        bundle3.putLong("chat_id", j11);
                    } else if (profileActivity10.f43192s2) {
                        bundle3.putLong("user_id", profileActivity10.f43094e1);
                    }
                    qn qnVar = new qn(bundle3);
                    ProfileActivity profileActivity11 = this.f50374b;
                    TLRPC.ChatFull chatFull = profileActivity11.f43211v2;
                    if (chatFull != null) {
                        qnVar.q0(chatFull);
                    } else {
                        qnVar.r0(profileActivity11.f43219w2);
                    }
                    this.f50374b.presentFragment(qnVar);
                } else if (i7 == 41) {
                    this.f50374b.presentFragment(new UserInfoActivity());
                } else if (i7 == 9) {
                    TLRPC.User a24 = this.f50374b.getMessagesController().a2(Long.valueOf(this.f50374b.f43094e1));
                    if (a24 != null) {
                        Bundle j12 = org.telegram.ui.Cells.y0.j(2, "onlySelect", "dialogsType", true);
                        j12.putBoolean("resetDelegate", false);
                        j12.putBoolean("closeFragment", false);
                        yw ywVar2 = new yw(j12);
                        ywVar2.E2 = new a7(this, a24, ywVar2, 19);
                        this.f50374b.presentFragment(ywVar2);
                    }
                } else if (i7 == 10) {
                    this.f50374b.I4();
                } else if (i7 == 14) {
                    try {
                        ProfileActivity profileActivity12 = this.f50374b;
                        if (profileActivity12.E2 != null) {
                            j3 = org.telegram.messenger.m5.F(encryptedChat.f28059id);
                        } else {
                            j3 = profileActivity12.f43094e1;
                            if (j3 == 0) {
                                long j13 = profileActivity12.f43102f1;
                                if (j13 != 0) {
                                    j3 = -j13;
                                } else {
                                    return;
                                }
                            }
                        }
                        org.telegram.messenger.si mediaDataController = this.f50374b.getMediaDataController();
                        Pattern pattern2 = org.telegram.messenger.si.S1;
                        mediaDataController.y0(j3, 0, null);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else if (i7 != 15 && i7 != 16) {
                    if (i7 == 17) {
                        Bundle bundle4 = new Bundle();
                        bundle4.putLong("chat_id", this.f50374b.f43102f1);
                        bundle4.putInt("type", 2);
                        bundle4.putBoolean("open_search", true);
                        qq qqVar = new qq(bundle4);
                        qqVar.C0(this.f50374b.f43211v2);
                        this.f50374b.presentFragment(qqVar);
                    } else if (i7 == 18) {
                        this.f50374b.L4();
                    } else if (i7 == 19) {
                        this.f50374b.presentFragment(z41.g0(this.f50374b.getMessagesController().M0(Long.valueOf(this.f50374b.f43102f1)), false));
                    } else if (i7 == 22) {
                        this.f50374b.O4();
                    } else if (i7 == 38) {
                        this.f50374b.F4();
                    } else if (i7 == 48) {
                        ProfileActivity profileActivity13 = this.f50374b;
                        org.telegram.ui.Wallet.p9 p9Var = new org.telegram.ui.Wallet.p9(profileActivity13.getMessagesController().a2(Long.valueOf(this.f50374b.f43094e1)));
                        p9Var.f44341g0 = true;
                        profileActivity13.presentFragment(p9Var);
                    } else if (i7 == 39) {
                        Bundle f11 = r.b.f(2, "type");
                        f11.putLong("dialog_id", -this.f50374b.f43102f1);
                        org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(f11, null);
                        ProfileActivity profileActivity14 = this.f50374b;
                        y80Var.f41933c = profileActivity14.f43211v2;
                        profileActivity14.presentFragment(y80Var);
                    } else if (i7 == 20) {
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, this.f50374b.getParentActivity(), this.f50374b.A0);
                        alertDialog$Builder3.f28392a.S = org.telegram.messenger.hd.M0(2131754078, null);
                        alertDialog$Builder3.f28392a.U = org.telegram.messenger.hd.M0(2131754079, null);
                        alertDialog$Builder3.k(org.telegram.messenger.hd.M0(2131744915, null), new org.telegram.ui.ActionBar.q1(this) {
                            public final pv0 f49694b;

                            {
                                this.f49694b = this;
                            }

                            @Override
                            public final void h(org.telegram.ui.ActionBar.t1 r14, int r15) {
                                throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nv0.h(org.telegram.ui.ActionBar.t1, int):void");
                            }
                        });
                        alertDialog$Builder3.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                        this.f50374b.showDialog(alertDialog$Builder3.f28392a);
                    } else if (i7 == 44) {
                        i16 = ((org.telegram.ui.ActionBar.e2) this.f50374b).currentAccount;
                        long j14 = this.f50374b.f43094e1;
                        TLRPC.UserFull b22 = org.telegram.messenger.np.s1(i16).b2(j14);
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
                                        str4 = org.telegram.messenger.hd.M0(2131753098, null);
                                        break;
                                    }
                                }
                            }
                            if (str4 != null) {
                                vf.c.t(org.telegram.messenger.t0.f26609b, str4);
                                return;
                            }
                            org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                            if (T != null) {
                                if (!(T instanceof an) || ((an) T).a() != j14) {
                                    T.presentFragment(an.ua(j14));
                                }
                                org.telegram.messenger.g0.i3(new di.i9(i16, j14, 2), 150L);
                            }
                        }
                    } else if (i7 == 21) {
                        if (this.f50374b.getParentActivity() != null) {
                            if ((Build.VERSION.SDK_INT <= 28 || org.telegram.messenger.r2.f26207b) && this.f50374b.getParentActivity().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                                this.f50374b.getParentActivity().requestPermissions(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 4);
                                return;
                            }
                            yu0 yu0Var = this.f50374b.f43161o0;
                            org.telegram.messenger.gc D = yu0Var.D(yu0Var.getRealPosition());
                            if (D != null) {
                                if (D.f23726p == 2) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i15 = ((org.telegram.ui.ActionBar.e2) this.f50374b).currentAccount;
                                org.telegram.messenger.w7.G(i15);
                                TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = D.f23717f;
                                if (z10) {
                                    str3 = "mp4";
                                }
                                File J = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated2, str3, true, true);
                                if (z10 && !J.exists()) {
                                    J = new File(org.telegram.messenger.w7.z(0), org.telegram.messenger.w7.r("mp4", D.f23717f));
                                }
                                if (J.exists()) {
                                    MediaController.d0(J.toString(), this.f50374b.getParentActivity(), 0, null, null, new ai.u2(9, this, z10));
                                }
                            }
                        }
                    } else if (i7 == 30) {
                        this.f50374b.presentFragment(new UserInfoActivity());
                    } else if (i7 == 40) {
                        ProfileActivity profileActivity15 = this.f50374b;
                        jm0 jm0Var = new jm0();
                        jm0Var.I = this.f50374b;
                        profileActivity15.presentFragment(jm0Var);
                    } else if (i7 == 42) {
                        TLRPC.User a25 = this.f50374b.getMessagesController().a2(Long.valueOf(this.f50374b.f43094e1));
                        if (org.telegram.messenger.g0.g(this.f50374b.getMessagesController().V2 + "/" + org.telegram.messenger.q10.n(a25))) {
                            org.telegram.ui.Components.cc.a0(this.f50374b).k(false).j();
                        }
                    } else if (i7 == 43) {
                        this.f50374b.presentFragment(new la(null));
                    } else if (i7 == 31) {
                        this.f50374b.presentFragment(new org.telegram.ui.ActionBar.e2(null));
                    } else if (i7 == 33) {
                        int realPosition = this.f50374b.f43161o0.getRealPosition();
                        TLRPC.Photo F = this.f50374b.f43161o0.F(realPosition);
                        if (F != null) {
                            yu0 yu0Var2 = this.f50374b.f43161o0;
                            ArrayList arrayList2 = yu0Var2.f40395c1;
                            ArrayList arrayList3 = yu0Var2.f40394b1;
                            ArrayList arrayList4 = yu0Var2.f40393a1;
                            ArrayList arrayList5 = yu0Var2.Z0;
                            ArrayList arrayList6 = yu0Var2.X0;
                            ArrayList arrayList7 = yu0Var2.V0;
                            ArrayList arrayList8 = yu0Var2.Y0;
                            ArrayList arrayList9 = yu0Var2.W0;
                            org.telegram.messenger.vo voVar = yu0Var2.T0;
                            if (voVar != null) {
                                voVar.c(realPosition);
                            } else if (realPosition > 0 && realPosition < arrayList9.size()) {
                                yu0Var2.f40396d1++;
                                arrayList9.remove(realPosition);
                                arrayList9.add(0, (TLRPC.Photo) arrayList9.get(realPosition));
                                arrayList7.remove(realPosition);
                                arrayList7.add(0, (String) arrayList7.get(realPosition));
                                ArrayList arrayList10 = yu0Var2.U0;
                                arrayList10.add(0, (String) arrayList10.remove(realPosition));
                                arrayList6.remove(realPosition);
                                arrayList6.add(0, (org.telegram.messenger.gc) arrayList6.get(realPosition));
                                arrayList8.remove(realPosition);
                                arrayList8.add(0, (org.telegram.messenger.gc) arrayList8.get(realPosition));
                                arrayList5.remove(realPosition);
                                arrayList5.add(0, (org.telegram.messenger.gc) arrayList5.get(realPosition));
                                arrayList4.remove(realPosition);
                                arrayList4.add(0, (org.telegram.ui.Components.g51) arrayList4.get(realPosition));
                                arrayList3.remove(realPosition);
                                arrayList3.add(0, (Integer) arrayList3.get(realPosition));
                                arrayList2.remove(realPosition);
                                arrayList2.add(0, (Float) arrayList2.get(realPosition));
                                yu0Var2.Q0 = (org.telegram.messenger.gc) arrayList8.get(0);
                            }
                            TLRPC.TL_photos_updateProfilePhoto tL_photos_updateProfilePhoto = new TLRPC.TL_photos_updateProfilePhoto();
                            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                            tL_photos_updateProfilePhoto.f28185id = tL_inputPhoto;
                            tL_inputPhoto.f28070id = F.f28075id;
                            tL_inputPhoto.access_hash = F.access_hash;
                            tL_inputPhoto.file_reference = F.file_reference;
                            org.telegram.messenger.m10 userConfig = this.f50374b.getUserConfig();
                            this.f50374b.getConnectionsManager().sendRequest(tL_photos_updateProfilePhoto, new jo0(this, userConfig, F, 6));
                            ProfileActivity profileActivity16 = this.f50374b;
                            UndoView undoView = profileActivity16.M;
                            long j15 = profileActivity16.f43094e1;
                            if (F.video_sizes.isEmpty()) {
                                num = null;
                            } else {
                                num = 1;
                            }
                            undoView.m(j15, num, 22);
                            TLRPC.User a26 = this.f50374b.getMessagesController().a2(Long.valueOf(userConfig.f24959n));
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(F.sizes, 800, false, null, false);
                            if (a26 != null) {
                                TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(F.sizes, 90, false, null, false);
                                TLRPC.UserProfilePhoto userProfilePhoto = a26.photo;
                                userProfilePhoto.photo_id = F.f28075id;
                                userProfilePhoto.photo_small = w11.location;
                                userProfilePhoto.photo_big = w10.location;
                                userConfig.w(a26);
                                userConfig.v(true);
                                i14 = ((org.telegram.ui.ActionBar.e2) this.f50374b).currentAccount;
                                org.telegram.messenger.ns.f(i14).k(org.telegram.messenger.ns.f25517j0, new Object[0]);
                                this.f50374b.L5(true);
                            }
                            yu0 yu0Var3 = this.f50374b.f43161o0;
                            yu0Var3.E0.g();
                            yu0Var3.L();
                        }
                    } else if (i7 == 34) {
                        i10 = ((org.telegram.ui.ActionBar.e2) this.f50374b).currentAccount;
                        if (org.telegram.messenger.np.s1(i10).v2()) {
                            i13 = ((org.telegram.ui.ActionBar.e2) this.f50374b).currentAccount;
                            b.b(i13);
                            return;
                        }
                        int realPosition2 = this.f50374b.f43161o0.getRealPosition();
                        org.telegram.messenger.gc D2 = this.f50374b.f43161o0.D(realPosition2);
                        if (D2 != null) {
                            i11 = ((org.telegram.ui.ActionBar.e2) this.f50374b).currentAccount;
                            org.telegram.messenger.w7.G(i11);
                            Drawable[] drawableArr = PhotoViewer.Z8;
                            File J2 = org.telegram.messenger.w7.J(D2.f23717f, PhotoViewer.m1(D2), true, true);
                            if (D2.f23726p == 2) {
                                z12 = true;
                            }
                            if (z12) {
                                org.telegram.messenger.gc G = this.f50374b.f43161o0.G(realPosition2);
                                i12 = ((org.telegram.ui.ActionBar.e2) this.f50374b).currentAccount;
                                org.telegram.messenger.w7.G(i12);
                                if (G != null) {
                                    tL_fileLocationToBeDeprecated = G.f23717f;
                                }
                                str2 = org.telegram.messenger.w7.J(tL_fileLocationToBeDeprecated, PhotoViewer.m1(G), true, true).getAbsolutePath();
                            }
                            this.f50374b.f43182r0.p(J2.getAbsolutePath(), str2, z12);
                        }
                    } else if (i7 == 35) {
                        AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, this.f50374b.getParentActivity(), this.f50374b.A0);
                        yu0 yu0Var4 = this.f50374b.f43161o0;
                        org.telegram.messenger.gc D3 = yu0Var4.D(yu0Var4.getRealPosition());
                        if (D3 != null) {
                            if (D3.f23726p == 2) {
                                alertDialog$Builder4.f28392a.S = org.telegram.messenger.hd.M0(2131754083, null);
                                alertDialog$Builder4.f28392a.U = org.telegram.messenger.hd.M0(2131754085, null);
                            } else {
                                alertDialog$Builder4.f28392a.S = org.telegram.messenger.hd.M0(2131754094, null);
                                alertDialog$Builder4.f28392a.U = org.telegram.messenger.hd.M0(2131754096, null);
                            }
                            alertDialog$Builder4.k(org.telegram.messenger.hd.M0(2131751598, null), new org.telegram.ui.ActionBar.q1(this) {
                                public final pv0 f49694b;

                                {
                                    this.f49694b = this;
                                }

                                @Override
                                public final void h(org.telegram.ui.ActionBar.t1 r14, int r15) {
                                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.nv0.h(org.telegram.ui.ActionBar.t1, int):void");
                                }
                            });
                            alertDialog$Builder4.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                            org.telegram.ui.ActionBar.t1 t1Var3 = alertDialog$Builder4.f28392a;
                            this.f50374b.showDialog(t1Var3);
                            TextView textView4 = (TextView) t1Var3.d(-1);
                            if (textView4 != null) {
                                org.telegram.ui.ActionBar.q6.U(textView4, org.telegram.ui.ActionBar.j6.f29090q7, this.f50374b.A0);
                            }
                        }
                    } else if (i7 == 36) {
                        this.f50374b.K4();
                    }
                } else {
                    ProfileActivity profileActivity17 = this.f50374b;
                    if (i7 == 16) {
                        z11 = true;
                    }
                    profileActivity17.E4(z11);
                }
            }
        }
    }
}
