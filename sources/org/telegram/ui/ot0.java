package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.Switch;
public final class ot0 extends org.telegram.ui.Components.bk0 {
    public final Context f50617c;
    public final PrivacySettingsActivity d;

    public ot0(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.f50617c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int b10 = f1Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        i7 = privacySettingsActivity.passcodeRow;
        if (b10 != i7) {
            i10 = privacySettingsActivity.passwordRow;
            if (b10 != i10) {
                i11 = privacySettingsActivity.passkeysRow;
                if (b10 != i11) {
                    i12 = privacySettingsActivity.blockedRow;
                    if (b10 != i12 && b10 != privacySettingsActivity.f43503s) {
                        i13 = privacySettingsActivity.secretWebpageRow;
                        if (b10 != i13) {
                            i14 = privacySettingsActivity.webSessionsRow;
                            if (b10 != i14 && (b10 != privacySettingsActivity.f43501n || privacySettingsActivity.getContactsController().t(1))) {
                                i15 = privacySettingsActivity.lastSeenRow;
                                if (b10 != i15 || privacySettingsActivity.getContactsController().t(0)) {
                                    i16 = privacySettingsActivity.callsRow;
                                    if (b10 != i16 || privacySettingsActivity.getContactsController().t(2)) {
                                        i17 = privacySettingsActivity.profilePhotoRow;
                                        if (b10 != i17 || privacySettingsActivity.getContactsController().t(4)) {
                                            i18 = privacySettingsActivity.bioRow;
                                            if (b10 != i18 || privacySettingsActivity.getContactsController().t(9)) {
                                                i19 = privacySettingsActivity.musicRow;
                                                if (b10 != i19 || privacySettingsActivity.getContactsController().t(14)) {
                                                    i20 = privacySettingsActivity.birthdayRow;
                                                    if (b10 != i20 || privacySettingsActivity.getContactsController().t(11)) {
                                                        i21 = privacySettingsActivity.giftsRow;
                                                        if (b10 != i21 || privacySettingsActivity.getContactsController().t(12)) {
                                                            i22 = privacySettingsActivity.forwardsRow;
                                                            if (b10 != i22 || privacySettingsActivity.getContactsController().t(5)) {
                                                                i23 = privacySettingsActivity.phoneNumberRow;
                                                                if (b10 != i23 || privacySettingsActivity.getContactsController().t(6)) {
                                                                    i24 = privacySettingsActivity.voicesRow;
                                                                    if (b10 != i24 || privacySettingsActivity.getContactsController().t(8)) {
                                                                        i25 = privacySettingsActivity.noncontactsRow;
                                                                        if (b10 != i25) {
                                                                            i26 = privacySettingsActivity.deleteAccountRow;
                                                                            if (b10 != i26 || privacySettingsActivity.getContactsController().H != 2) {
                                                                                i27 = privacySettingsActivity.newChatsRow;
                                                                                if (b10 != i27 || privacySettingsActivity.getContactsController().G != 2) {
                                                                                    i28 = privacySettingsActivity.emailLoginRow;
                                                                                    if (b10 != i28) {
                                                                                        i29 = privacySettingsActivity.paymentsClearRow;
                                                                                        if (b10 != i29) {
                                                                                            i30 = privacySettingsActivity.secretMapRow;
                                                                                            if (b10 != i30) {
                                                                                                i31 = privacySettingsActivity.contactsSyncRow;
                                                                                                if (b10 != i31 && b10 != privacySettingsActivity.H) {
                                                                                                    i32 = privacySettingsActivity.contactsDeleteRow;
                                                                                                    if (b10 != i32) {
                                                                                                        i33 = privacySettingsActivity.contactsSuggestRow;
                                                                                                        if (b10 != i33) {
                                                                                                            i34 = privacySettingsActivity.autoDeleteMesages;
                                                                                                            if (b10 != i34 && b10 != privacySettingsActivity.I) {
                                                                                                                return false;
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                return true;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    @Override
    public final int b() {
        return this.d.P;
    }

    @Override
    public final int d(int i7) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i7 != privacySettingsActivity.H) {
            i10 = privacySettingsActivity.lastSeenRow;
            if (i7 != i10) {
                i11 = privacySettingsActivity.phoneNumberRow;
                if (i7 != i11) {
                    i12 = privacySettingsActivity.deleteAccountRow;
                    if (i7 != i12) {
                        i13 = privacySettingsActivity.webSessionsRow;
                        if (i7 != i13 && i7 != privacySettingsActivity.f43501n) {
                            i14 = privacySettingsActivity.paymentsClearRow;
                            if (i7 != i14) {
                                i15 = privacySettingsActivity.secretMapRow;
                                if (i7 != i15) {
                                    i16 = privacySettingsActivity.contactsDeleteRow;
                                    if (i7 != i16 && i7 != privacySettingsActivity.I) {
                                        if (i7 != privacySettingsActivity.h && i7 != privacySettingsActivity.F && i7 != privacySettingsActivity.f43502r && i7 != privacySettingsActivity.f43504w && i7 != privacySettingsActivity.O && i7 != privacySettingsActivity.J && i7 != privacySettingsActivity.M && i7 != privacySettingsActivity.f43506y) {
                                            if (i7 != 0 && i7 != privacySettingsActivity.E && i7 != privacySettingsActivity.f43500f && i7 != privacySettingsActivity.N && i7 != privacySettingsActivity.G && i7 != privacySettingsActivity.L && i7 != privacySettingsActivity.f43505x) {
                                                i17 = privacySettingsActivity.secretWebpageRow;
                                                if (i7 != i17) {
                                                    i18 = privacySettingsActivity.contactsSyncRow;
                                                    if (i7 != i18) {
                                                        i19 = privacySettingsActivity.contactsSuggestRow;
                                                        if (i7 != i19) {
                                                            i20 = privacySettingsActivity.newChatsRow;
                                                            if (i7 != i20) {
                                                                if (i7 != privacySettingsActivity.K) {
                                                                    i21 = privacySettingsActivity.autoDeleteMesages;
                                                                    if (i7 != i21 && i7 != privacySettingsActivity.f43503s) {
                                                                        i22 = privacySettingsActivity.emailLoginRow;
                                                                        if (i7 != i22) {
                                                                            i23 = privacySettingsActivity.passwordRow;
                                                                            if (i7 != i23) {
                                                                                i24 = privacySettingsActivity.passkeysRow;
                                                                                if (i7 != i24) {
                                                                                    i25 = privacySettingsActivity.passcodeRow;
                                                                                    if (i7 != i25) {
                                                                                        i26 = privacySettingsActivity.blockedRow;
                                                                                        if (i7 == i26) {
                                                                                            return 5;
                                                                                        }
                                                                                        return 0;
                                                                                    }
                                                                                    return 5;
                                                                                }
                                                                                return 5;
                                                                            }
                                                                            return 5;
                                                                        }
                                                                        return 5;
                                                                    }
                                                                    return 5;
                                                                }
                                                                return 4;
                                                            }
                                                            return 3;
                                                        }
                                                        return 3;
                                                    }
                                                    return 3;
                                                }
                                                return 3;
                                            }
                                            return 2;
                                        }
                                        return 1;
                                    }
                                    return 0;
                                }
                                return 0;
                            }
                            return 0;
                        }
                        return 0;
                    }
                    return 0;
                }
                return 0;
            }
            return 0;
        }
        return 0;
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        String M0;
        boolean z11;
        CharSequence z02;
        int i26;
        boolean z12;
        CharSequence C0;
        boolean z13;
        int i27;
        boolean z14;
        String C02;
        String C03;
        boolean z15;
        String C04;
        String C05;
        float f10;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z16;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        String str;
        String format;
        String M02;
        String M03;
        String str2;
        String M04;
        int i38;
        String str3;
        boolean z17;
        String str4;
        String format2;
        String str5;
        String M05;
        String str6;
        int i39 = f1Var.f59127f;
        View view = f1Var.f59123a;
        String str7 = null;
        boolean z18 = false;
        boolean z19 = true;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i39 != 0) {
            if (i39 != 1) {
                if (i39 != 2) {
                    if (i39 != 3) {
                        if (i39 == 5) {
                            org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                            if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i7) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            view.setTag(Integer.valueOf(i7));
                            n8Var.setPrioritizeTitleOverValue(false);
                            org.telegram.ui.Components.n6 n6Var = n8Var.f31136c;
                            i32 = privacySettingsActivity.autoDeleteMesages;
                            if (i7 == i32) {
                                int i40 = privacySettingsActivity.getUserConfig().f24793q0;
                                if (i40 == -1) {
                                    str6 = null;
                                    z18 = true;
                                } else {
                                    if (i40 > 0) {
                                        M05 = org.telegram.messenger.gd.c0(i40 * 60);
                                    } else {
                                        M05 = org.telegram.messenger.gd.M0(2131747246, "PasswordOff");
                                    }
                                    str6 = M05;
                                }
                                n8Var.u(org.telegram.messenger.gd.M0(2131753848, "AutoDeleteMessages"), str6, true, 2131232019, true);
                            } else {
                                String str8 = "";
                                if (i7 != privacySettingsActivity.f43503s) {
                                    i33 = privacySettingsActivity.emailLoginRow;
                                    if (i7 != i33) {
                                        i34 = privacySettingsActivity.passwordRow;
                                        if (i7 != i34) {
                                            i35 = privacySettingsActivity.passkeysRow;
                                            if (i7 != i35) {
                                                i36 = privacySettingsActivity.passcodeRow;
                                                if (i7 != i36) {
                                                    i37 = privacySettingsActivity.blockedRow;
                                                    if (i7 == i37) {
                                                        int i41 = privacySettingsActivity.getMessagesController().I0;
                                                        if (i41 == 0) {
                                                            format = org.telegram.messenger.gd.M0(2131753680, "BlockedEmpty");
                                                        } else if (i41 <= 0) {
                                                            str = "";
                                                            z18 = true;
                                                            n8Var.u(org.telegram.messenger.gd.M0(2131753679, "BlockedUsers"), str, true, 2131232021, true);
                                                        } else {
                                                            format = String.format(org.telegram.messenger.gd.E0().f24241y, "%d", Integer.valueOf(i41));
                                                        }
                                                        str = format;
                                                        n8Var.u(org.telegram.messenger.gd.M0(2131753679, "BlockedUsers"), str, true, 2131232021, true);
                                                    }
                                                } else {
                                                    if (org.telegram.messenger.bz.f23194s.length() != 0) {
                                                        M02 = org.telegram.messenger.gd.M0(2131747245, null);
                                                    } else {
                                                        M02 = org.telegram.messenger.gd.M0(2131747246, null);
                                                    }
                                                    n8Var.u(org.telegram.messenger.gd.M0(2131747464, null), M02, true, 2131232037, true);
                                                }
                                            } else {
                                                ArrayList arrayList = privacySettingsActivity.f43499e;
                                                if (arrayList == null) {
                                                    str2 = "";
                                                    z18 = true;
                                                } else {
                                                    if (arrayList.size() == 1 && n6Var.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.f43499e.get(0)).name) < org.telegram.messenger.g0.f24118q.x / 3.0f) {
                                                        M03 = ((TL_account.Passkey) privacySettingsActivity.f43499e.get(0)).name;
                                                    } else if (privacySettingsActivity.f43499e.size() > 0) {
                                                        M03 = privacySettingsActivity.f43499e.size() + "";
                                                    } else {
                                                        M03 = org.telegram.messenger.gd.M0(2131747246, null);
                                                    }
                                                    str2 = M03;
                                                }
                                                n8Var.u(org.telegram.messenger.gd.M0(2131747458, null), str2, true, 2131232034, true);
                                            }
                                        } else {
                                            TL_account.Password password = privacySettingsActivity.d;
                                            int i42 = 2131231762;
                                            if (password == null) {
                                                i38 = 2131231762;
                                                str3 = "";
                                                z18 = true;
                                            } else {
                                                if (password.has_password) {
                                                    M04 = org.telegram.messenger.gd.M0(2131747245, null);
                                                    i42 = 2131231763;
                                                } else {
                                                    M04 = org.telegram.messenger.gd.M0(2131747246, null);
                                                }
                                                i38 = i42;
                                                str3 = M04;
                                            }
                                            n8Var.u(org.telegram.messenger.gd.M0(2131743701, null), str3, true, i38, true);
                                        }
                                    } else {
                                        TL_account.Password password2 = privacySettingsActivity.d;
                                        if (password2 == null) {
                                            z17 = true;
                                            str4 = str8;
                                        } else {
                                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(password2.login_email_pattern);
                                            int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                                            int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                                            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                                ?? obj = new Object();
                                                obj.f34537a |= 256;
                                                obj.f34538b = indexOf;
                                                int i43 = lastIndexOf + 1;
                                                obj.f34539c = i43;
                                                valueOf.setSpan(new org.telegram.ui.Components.ez0(obj, 0), indexOf, i43, 0);
                                            }
                                            z17 = false;
                                            str4 = valueOf;
                                        }
                                        n8Var.setPrioritizeTitleOverValue(true);
                                        String M06 = org.telegram.messenger.gd.M0(2131751191, null);
                                        n8Var.f31143x = n8Var.getDefaultImageLeft();
                                        n8Var.f31141s = n8Var.c(false);
                                        org.telegram.ui.ActionBar.n5 n5Var = n8Var.f31134a;
                                        n5Var.l(M06, false);
                                        n5Var.i(null);
                                        org.telegram.ui.ActionBar.n5 n5Var2 = n8Var.d;
                                        n5Var2.setVisibility(0);
                                        n5Var2.l(str4, false);
                                        n6Var.setVisibility(8);
                                        n8Var.h.setVisibility(8);
                                        org.telegram.ui.Components.ph0 ph0Var = n8Var.f31137e;
                                        ph0Var.setVisibility(0);
                                        ph0Var.setTranslationX(0.0f);
                                        ph0Var.setTranslationY(0.0f);
                                        ph0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
                                        ph0Var.setImageResource(2131232027);
                                        n8Var.f31140r = true;
                                        n8Var.setWillNotDraw(false);
                                        Switch r02 = n8Var.f31138f;
                                        if (r02 != null) {
                                            r02.setVisibility(8);
                                        }
                                        org.telegram.ui.Components.m5 m5Var = n8Var.L;
                                        if (m5Var != null) {
                                            m5Var.g(null, false);
                                        }
                                        z18 = z17;
                                    }
                                } else {
                                    if (privacySettingsActivity.f43495b0.o0() == 0) {
                                        if (privacySettingsActivity.getMessagesController().f25593a == 0) {
                                            str5 = "";
                                            z18 = true;
                                            privacySettingsActivity.getMessagesController().f25593a = privacySettingsActivity.f43495b0.o0();
                                            n8Var.u(org.telegram.messenger.gd.M0(2131745356, null), str5, true, 2131232025, false);
                                        } else {
                                            format2 = String.format(org.telegram.messenger.gd.E0().f24241y, "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().f25593a));
                                        }
                                    } else {
                                        format2 = String.format(org.telegram.messenger.gd.E0().f24241y, "%d", Integer.valueOf(privacySettingsActivity.f43495b0.o0()));
                                    }
                                    str5 = format2;
                                    privacySettingsActivity.getMessagesController().f25593a = privacySettingsActivity.f43495b0.o0();
                                    n8Var.u(org.telegram.messenger.gd.M0(2131745356, null), str5, true, 2131232025, false);
                                }
                            }
                            n8Var.h(16, z18, z16);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    i28 = privacySettingsActivity.secretWebpageRow;
                    if (i7 != i28) {
                        i29 = privacySettingsActivity.contactsSyncRow;
                        if (i7 != i29) {
                            i30 = privacySettingsActivity.contactsSuggestRow;
                            if (i7 != i30) {
                                i31 = privacySettingsActivity.newChatsRow;
                                if (i7 == i31) {
                                    s8Var.f(org.telegram.messenger.gd.M0(2131754169, "ArchiveAndMute"), privacySettingsActivity.X, false);
                                    return;
                                }
                                return;
                            }
                            s8Var.f(org.telegram.messenger.gd.M0(2131744177, "SuggestContacts"), privacySettingsActivity.W, false);
                            return;
                        }
                        s8Var.f(org.telegram.messenger.gd.M0(2131744063, "SyncContacts"), privacySettingsActivity.U, true);
                        return;
                    }
                    String M07 = org.telegram.messenger.gd.M0(2131745489, "SecretWebPage");
                    if (privacySettingsActivity.getMessagesController().J2 != 1) {
                        z19 = false;
                    }
                    s8Var.f(M07, z19, false);
                    return;
                }
                org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                if (i7 == privacySettingsActivity.f43500f) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131746576, "PrivacyTitle"));
                    return;
                } else if (i7 == 0) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131745487, "SecurityTitle"));
                    return;
                } else if (i7 == privacySettingsActivity.E) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131751507, "DeleteMyAccount"));
                    return;
                } else if (i7 == privacySettingsActivity.N) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131745500, "SecretChat"));
                    return;
                } else if (i7 == privacySettingsActivity.G) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131746657, "PrivacyBots"));
                    return;
                } else if (i7 == privacySettingsActivity.L) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131751769, "Contacts"));
                    return;
                } else if (i7 == privacySettingsActivity.f43505x) {
                    o4Var.setText(org.telegram.messenger.gd.M0(2131748093, "NewChatsFromNonContacts"));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i7 == privacySettingsActivity.F) {
                a9Var.setText(org.telegram.messenger.gd.M0(2131751586, "DeleteAccountHelp"));
                return;
            } else if (i7 == privacySettingsActivity.f43502r) {
                a9Var.setText(org.telegram.messenger.gd.M0(2131749189, "GroupsAndChannelsHelp"));
                return;
            } else if (i7 == privacySettingsActivity.f43504w) {
                a9Var.setText(org.telegram.messenger.gd.M0(2131745357, "SessionsSettingsInfo"));
                return;
            } else if (i7 == privacySettingsActivity.O) {
                a9Var.setText(org.telegram.messenger.gd.M0(2131745488, "SecretWebPageInfo"));
                return;
            } else if (i7 == privacySettingsActivity.J) {
                a9Var.setText(org.telegram.messenger.gd.M0(2131746656, "PrivacyBotsInfo"));
                return;
            } else if (i7 == privacySettingsActivity.h) {
                a9Var.setText(org.telegram.messenger.gd.M0(2131746623, null));
                return;
            } else if (i7 == privacySettingsActivity.M) {
                a9Var.setText(org.telegram.messenger.gd.M0(2131744175, "SuggestContactsInfo"));
                return;
            } else if (i7 == privacySettingsActivity.f43506y) {
                a9Var.setText(org.telegram.messenger.gd.M0(2131754168, "ArchiveAndMuteInfo"));
                return;
            } else {
                return;
            }
        }
        int i44 = 16;
        if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i7) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setTag(Integer.valueOf(i7));
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
        x9Var.setBetterLayout(true);
        i10 = privacySettingsActivity.webSessionsRow;
        if (i7 != i10) {
            i11 = privacySettingsActivity.phoneNumberRow;
            if (i7 != i11) {
                i12 = privacySettingsActivity.lastSeenRow;
                if (i7 == i12) {
                    if (privacySettingsActivity.getContactsController().t(0)) {
                        z11 = true;
                        i44 = 30;
                    } else {
                        str7 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 0);
                        z11 = false;
                    }
                    x9Var.c(org.telegram.messenger.gd.M0(2131746622, "PrivacyLastSeen"), str7, false, true);
                } else {
                    if (i7 != privacySettingsActivity.f43501n) {
                        i13 = privacySettingsActivity.callsRow;
                        if (i7 != i13) {
                            i14 = privacySettingsActivity.profilePhotoRow;
                            if (i7 != i14) {
                                i15 = privacySettingsActivity.bioRow;
                                if (i7 != i15) {
                                    i16 = privacySettingsActivity.musicRow;
                                    if (i7 != i16) {
                                        i17 = privacySettingsActivity.birthdayRow;
                                        if (i7 != i17) {
                                            i18 = privacySettingsActivity.giftsRow;
                                            if (i7 != i18) {
                                                i19 = privacySettingsActivity.forwardsRow;
                                                if (i7 != i19) {
                                                    i20 = privacySettingsActivity.voicesRow;
                                                    int i45 = 2131747560;
                                                    if (i7 != i20) {
                                                        i21 = privacySettingsActivity.noncontactsRow;
                                                        if (i7 == i21) {
                                                            if (privacySettingsActivity.Z) {
                                                                i45 = 2131751768;
                                                            } else if (privacySettingsActivity.Y) {
                                                                i45 = 2131751767;
                                                            }
                                                            String M08 = org.telegram.messenger.gd.M0(i45, null);
                                                            if (privacySettingsActivity.getMessagesController().M5 && !privacySettingsActivity.getMessagesController().O6) {
                                                                z02 = org.telegram.messenger.gd.M0(2131746617, null);
                                                            } else {
                                                                z02 = PrivacySettingsActivity.z0(privacySettingsActivity, org.telegram.messenger.gd.M0(2131746617, null));
                                                            }
                                                            i26 = privacySettingsActivity.musicRow;
                                                            if (i26 != -1) {
                                                                z12 = true;
                                                            } else {
                                                                z12 = false;
                                                            }
                                                            x9Var.c(z02, M08, false, z12);
                                                        } else if (i7 != privacySettingsActivity.H) {
                                                            i22 = privacySettingsActivity.deleteAccountRow;
                                                            if (i7 != i22) {
                                                                i23 = privacySettingsActivity.paymentsClearRow;
                                                                if (i7 == i23) {
                                                                    x9Var.b(org.telegram.messenger.gd.M0(2131746604, "PrivacyPaymentsClear"), true);
                                                                } else if (i7 != privacySettingsActivity.I) {
                                                                    i24 = privacySettingsActivity.secretMapRow;
                                                                    if (i7 != i24) {
                                                                        i25 = privacySettingsActivity.contactsDeleteRow;
                                                                        if (i7 == i25) {
                                                                            x9Var.b(org.telegram.messenger.gd.M0(2131744061, "SyncContactsDelete"), true);
                                                                        }
                                                                    } else {
                                                                        int i46 = org.telegram.messenger.bz.f23183o0;
                                                                        if (i46 != 0) {
                                                                            if (i46 != 1) {
                                                                                if (i46 != 2) {
                                                                                    M0 = org.telegram.messenger.gd.M0(2131748492, "MapPreviewProviderYandex");
                                                                                } else {
                                                                                    M0 = org.telegram.messenger.gd.M0(2131748495, "MapPreviewProviderNobody");
                                                                                }
                                                                            } else {
                                                                                M0 = org.telegram.messenger.gd.M0(2131748496, "MapPreviewProviderGoogle");
                                                                            }
                                                                        } else {
                                                                            M0 = org.telegram.messenger.gd.M0(2131748494, "MapPreviewProviderTelegram");
                                                                        }
                                                                        x9Var.c(org.telegram.messenger.gd.M0(2131748497, "MapPreviewProvider"), M0, privacySettingsActivity.S, true);
                                                                        privacySettingsActivity.S = false;
                                                                    }
                                                                } else {
                                                                    x9Var.b(org.telegram.messenger.gd.M0(2131746669, null), true);
                                                                }
                                                            } else {
                                                                if (privacySettingsActivity.getContactsController().H != 2) {
                                                                    z11 = true;
                                                                } else {
                                                                    int i47 = privacySettingsActivity.getContactsController().I;
                                                                    if (i47 <= 182) {
                                                                        str7 = org.telegram.messenger.gd.G(i47 / 30, "Months", new Object[0]);
                                                                    } else if (i47 == 365) {
                                                                        str7 = org.telegram.messenger.gd.G(12, "Months", new Object[0]);
                                                                    } else if (i47 == 548) {
                                                                        str7 = org.telegram.messenger.gd.G(18, "Months", new Object[0]);
                                                                    } else if (i47 == 730) {
                                                                        str7 = org.telegram.messenger.gd.G(24, "Months", new Object[0]);
                                                                    } else if (i47 > 30) {
                                                                        str7 = org.telegram.messenger.gd.G((int) Math.round(i47 / 30.0d), "Months", new Object[0]);
                                                                    } else {
                                                                        str7 = org.telegram.messenger.gd.G(i47, "Days", new Object[0]);
                                                                    }
                                                                    z11 = false;
                                                                }
                                                                x9Var.c(org.telegram.messenger.gd.M0(2131751584, "DeleteAccountIfAwayFor3"), str7, privacySettingsActivity.R, false);
                                                                privacySettingsActivity.R = false;
                                                            }
                                                        } else {
                                                            x9Var.b(org.telegram.messenger.gd.M0(2131744002, "TelegramPassport"), true);
                                                        }
                                                    } else {
                                                        if (privacySettingsActivity.getContactsController().t(8)) {
                                                            C0 = null;
                                                            z13 = true;
                                                            i44 = 30;
                                                        } else {
                                                            if (!privacySettingsActivity.getUserConfig().q()) {
                                                                C0 = org.telegram.messenger.gd.M0(2131747560, null);
                                                            } else {
                                                                C0 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 8);
                                                            }
                                                            z13 = false;
                                                        }
                                                        SpannableStringBuilder z03 = PrivacySettingsActivity.z0(privacySettingsActivity, org.telegram.messenger.gd.M0(2131746565, null));
                                                        i27 = privacySettingsActivity.noncontactsRow;
                                                        if (i27 != -1) {
                                                            z14 = true;
                                                        } else {
                                                            z14 = false;
                                                        }
                                                        x9Var.c(z03, C0, false, z14);
                                                        org.telegram.ui.ActionBar.u6.s(x9Var.getValueImageView(), org.telegram.ui.ActionBar.n6.f29559m6, null, PorterDuff.Mode.MULTIPLY);
                                                    }
                                                } else {
                                                    if (privacySettingsActivity.getContactsController().t(5)) {
                                                        z11 = true;
                                                        i44 = 30;
                                                    } else {
                                                        str7 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 5);
                                                        z11 = false;
                                                    }
                                                    x9Var.c(org.telegram.messenger.gd.M0(2131746644, "PrivacyForwards"), str7, false, true);
                                                }
                                            } else {
                                                if (privacySettingsActivity.getContactsController().t(12)) {
                                                    C02 = null;
                                                    z13 = true;
                                                    i44 = 30;
                                                } else {
                                                    C02 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 12);
                                                    z13 = false;
                                                }
                                                x9Var.c(org.telegram.messenger.gd.M0(2131746636, null), C02, false, true);
                                            }
                                            z18 = z13;
                                        } else {
                                            if (privacySettingsActivity.getContactsController().t(11)) {
                                                C03 = null;
                                                z15 = true;
                                                i44 = 30;
                                            } else {
                                                C03 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 11);
                                                z15 = false;
                                            }
                                            x9Var.c(org.telegram.messenger.gd.M0(2131746667, null), C03, false, true);
                                        }
                                    } else {
                                        if (privacySettingsActivity.getContactsController().t(14)) {
                                            C04 = null;
                                            z15 = true;
                                            i44 = 30;
                                        } else {
                                            C04 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 14);
                                            z15 = false;
                                        }
                                        x9Var.c(org.telegram.messenger.gd.M0(2131746611, null), C04, false, true);
                                    }
                                } else {
                                    if (privacySettingsActivity.getContactsController().t(9)) {
                                        z11 = true;
                                        i44 = 30;
                                    } else {
                                        str7 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 9);
                                        z11 = false;
                                    }
                                    x9Var.c(org.telegram.messenger.gd.M0(2131746674, "PrivacyBio"), str7, false, true);
                                }
                            } else {
                                if (privacySettingsActivity.getContactsController().t(4)) {
                                    z11 = true;
                                    i44 = 30;
                                } else {
                                    str7 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 4);
                                    z11 = false;
                                }
                                x9Var.c(org.telegram.messenger.gd.M0(2131746584, "PrivacyProfilePhoto"), str7, false, true);
                            }
                        } else {
                            if (privacySettingsActivity.getContactsController().t(2)) {
                                z11 = true;
                                i44 = 30;
                            } else {
                                str7 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 2);
                                z11 = false;
                            }
                            x9Var.c(org.telegram.messenger.gd.M0(2131752585, "Calls"), str7, false, true);
                        }
                    } else {
                        if (privacySettingsActivity.getContactsController().t(1)) {
                            C05 = null;
                            z15 = true;
                            i44 = 30;
                        } else {
                            C05 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 1);
                            z15 = false;
                        }
                        x9Var.c(org.telegram.messenger.gd.M0(2131746624, null), C05, false, false);
                    }
                    z18 = z15;
                }
            } else {
                if (privacySettingsActivity.getContactsController().t(6)) {
                    z11 = true;
                    i44 = 30;
                } else {
                    str7 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 6);
                    z11 = false;
                }
                x9Var.c(org.telegram.messenger.gd.M0(2131746597, "PrivacyPhone"), str7, false, true);
            }
            z18 = z11;
        } else {
            x9Var.b(org.telegram.messenger.gd.M0(2131742653, "WebSessionsTitle"), false);
        }
        x9Var.f32335r = z18;
        x9Var.E = i44;
        if (!z10) {
            if (z18) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            x9Var.f32339y = f10;
        } else {
            x9Var.F = true;
        }
        x9Var.invalidate();
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        View x9Var;
        Context context = this.f50617c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            x9Var = new org.telegram.ui.Cells.s8(context);
                        } else {
                            x9Var = new org.telegram.ui.Cells.n8(context);
                        }
                    } else {
                        x9Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                    }
                } else {
                    x9Var = new org.telegram.ui.Cells.o4(context);
                }
            } else {
                x9Var = new org.telegram.ui.Cells.a9(context);
            }
        } else {
            x9Var = new org.telegram.ui.Cells.x9(context);
        }
        return new v4.f1(x9Var);
    }
}
