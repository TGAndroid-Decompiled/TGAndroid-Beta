package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.Switch;
public final class ot0 extends org.telegram.ui.Components.oj0 {
    public final Context f48544c;
    public final PrivacySettingsActivity d;

    public ot0(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.f48544c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
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
        int b10 = d1Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        i7 = privacySettingsActivity.passcodeRow;
        if (b10 != i7) {
            i10 = privacySettingsActivity.passwordRow;
            if (b10 != i10) {
                i11 = privacySettingsActivity.passkeysRow;
                if (b10 != i11) {
                    i12 = privacySettingsActivity.blockedRow;
                    if (b10 != i12 && b10 != privacySettingsActivity.f41683s) {
                        i13 = privacySettingsActivity.secretWebpageRow;
                        if (b10 != i13) {
                            i14 = privacySettingsActivity.webSessionsRow;
                            if (b10 != i14 && (b10 != privacySettingsActivity.f41681n || privacySettingsActivity.getContactsController().t(1))) {
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
                                                                            if (b10 != i26 || privacySettingsActivity.getContactsController().G != 2) {
                                                                                i27 = privacySettingsActivity.newChatsRow;
                                                                                if (b10 != i27 || privacySettingsActivity.getContactsController().F != 2) {
                                                                                    i28 = privacySettingsActivity.emailLoginRow;
                                                                                    if (b10 != i28) {
                                                                                        i29 = privacySettingsActivity.paymentsClearRow;
                                                                                        if (b10 != i29) {
                                                                                            i30 = privacySettingsActivity.secretMapRow;
                                                                                            if (b10 != i30) {
                                                                                                i31 = privacySettingsActivity.contactsSyncRow;
                                                                                                if (b10 != i31 && b10 != privacySettingsActivity.G) {
                                                                                                    i32 = privacySettingsActivity.contactsDeleteRow;
                                                                                                    if (b10 != i32) {
                                                                                                        i33 = privacySettingsActivity.contactsSuggestRow;
                                                                                                        if (b10 != i33) {
                                                                                                            i34 = privacySettingsActivity.autoDeleteMesages;
                                                                                                            if (b10 != i34 && b10 != privacySettingsActivity.H) {
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
        return this.d.O;
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
        if (i7 != privacySettingsActivity.G) {
            i10 = privacySettingsActivity.lastSeenRow;
            if (i7 != i10) {
                i11 = privacySettingsActivity.phoneNumberRow;
                if (i7 != i11) {
                    i12 = privacySettingsActivity.deleteAccountRow;
                    if (i7 != i12) {
                        i13 = privacySettingsActivity.webSessionsRow;
                        if (i7 != i13 && i7 != privacySettingsActivity.f41681n) {
                            i14 = privacySettingsActivity.paymentsClearRow;
                            if (i7 != i14) {
                                i15 = privacySettingsActivity.secretMapRow;
                                if (i7 != i15) {
                                    i16 = privacySettingsActivity.contactsDeleteRow;
                                    if (i7 != i16 && i7 != privacySettingsActivity.H) {
                                        if (i7 != privacySettingsActivity.h && i7 != privacySettingsActivity.E && i7 != privacySettingsActivity.f41682r && i7 != privacySettingsActivity.f41684w && i7 != privacySettingsActivity.N && i7 != privacySettingsActivity.I && i7 != privacySettingsActivity.L && i7 != privacySettingsActivity.f41686y) {
                                            if (i7 != 0 && i7 != privacySettingsActivity.D && i7 != privacySettingsActivity.f41680f && i7 != privacySettingsActivity.M && i7 != privacySettingsActivity.F && i7 != privacySettingsActivity.K && i7 != privacySettingsActivity.f41685x) {
                                                i17 = privacySettingsActivity.secretWebpageRow;
                                                if (i7 != i17) {
                                                    i18 = privacySettingsActivity.contactsSyncRow;
                                                    if (i7 != i18) {
                                                        i19 = privacySettingsActivity.contactsSuggestRow;
                                                        if (i7 != i19) {
                                                            i20 = privacySettingsActivity.newChatsRow;
                                                            if (i7 != i20) {
                                                                if (i7 != privacySettingsActivity.J) {
                                                                    i21 = privacySettingsActivity.autoDeleteMesages;
                                                                    if (i7 != i21 && i7 != privacySettingsActivity.f41683s) {
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
    public final void t(v4.d1 d1Var, int i7) {
        boolean z9;
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
        boolean z10;
        CharSequence z02;
        int i26;
        boolean z11;
        CharSequence C0;
        boolean z12;
        int i27;
        boolean z13;
        String C02;
        String C03;
        boolean z14;
        String C04;
        String C05;
        float f10;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z15;
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
        boolean z16;
        String str4;
        String format2;
        String str5;
        String M05;
        String str6;
        int i39 = d1Var.f56955f;
        View view = d1Var.f56951a;
        String str7 = null;
        boolean z17 = false;
        boolean z18 = true;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i39 != 0) {
            if (i39 != 1) {
                if (i39 != 2) {
                    if (i39 != 3) {
                        if (i39 == 5) {
                            org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                            if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i7) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            view.setTag(Integer.valueOf(i7));
                            m8Var.setPrioritizeTitleOverValue(false);
                            org.telegram.ui.Components.j6 j6Var = m8Var.f29566c;
                            i32 = privacySettingsActivity.autoDeleteMesages;
                            if (i7 == i32) {
                                int i40 = privacySettingsActivity.getUserConfig().f24489p0;
                                if (i40 == -1) {
                                    str6 = null;
                                    z17 = true;
                                } else {
                                    if (i40 > 0) {
                                        M05 = org.telegram.messenger.hd.c0(i40 * 60);
                                    } else {
                                        M05 = org.telegram.messenger.hd.M0(2131747438, "PasswordOff");
                                    }
                                    str6 = M05;
                                }
                                m8Var.u(org.telegram.messenger.hd.M0(2131753850, "AutoDeleteMessages"), str6, true, 2131232018, true);
                            } else {
                                String str8 = "";
                                if (i7 != privacySettingsActivity.f41683s) {
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
                                                        int i41 = privacySettingsActivity.getMessagesController().H0;
                                                        if (i41 == 0) {
                                                            format = org.telegram.messenger.hd.M0(2131753682, "BlockedEmpty");
                                                        } else if (i41 <= 0) {
                                                            str = "";
                                                            z17 = true;
                                                            m8Var.u(org.telegram.messenger.hd.M0(2131753681, "BlockedUsers"), str, true, 2131232020, true);
                                                        } else {
                                                            format = String.format(org.telegram.messenger.hd.E0().f22906y, "%d", Integer.valueOf(i41));
                                                        }
                                                        str = format;
                                                        m8Var.u(org.telegram.messenger.hd.M0(2131753681, "BlockedUsers"), str, true, 2131232020, true);
                                                    }
                                                } else {
                                                    if (org.telegram.messenger.iz.f23413s.length() != 0) {
                                                        M02 = org.telegram.messenger.hd.M0(2131747437, null);
                                                    } else {
                                                        M02 = org.telegram.messenger.hd.M0(2131747438, null);
                                                    }
                                                    m8Var.u(org.telegram.messenger.hd.M0(2131747656, null), M02, true, 2131232036, true);
                                                }
                                            } else {
                                                ArrayList arrayList = privacySettingsActivity.f41679e;
                                                if (arrayList == null) {
                                                    str2 = "";
                                                    z17 = true;
                                                } else {
                                                    if (arrayList.size() == 1 && j6Var.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.f41679e.get(0)).name) < org.telegram.messenger.g0.f22544q.x / 3.0f) {
                                                        M03 = ((TL_account.Passkey) privacySettingsActivity.f41679e.get(0)).name;
                                                    } else if (privacySettingsActivity.f41679e.size() > 0) {
                                                        M03 = privacySettingsActivity.f41679e.size() + "";
                                                    } else {
                                                        M03 = org.telegram.messenger.hd.M0(2131747438, null);
                                                    }
                                                    str2 = M03;
                                                }
                                                m8Var.u(org.telegram.messenger.hd.M0(2131747650, null), str2, true, 2131232033, true);
                                            }
                                        } else {
                                            TL_account.Password password = privacySettingsActivity.d;
                                            int i42 = 2131231761;
                                            if (password == null) {
                                                i38 = 2131231761;
                                                str3 = "";
                                                z17 = true;
                                            } else {
                                                if (password.has_password) {
                                                    M04 = org.telegram.messenger.hd.M0(2131747437, null);
                                                    i42 = 2131231762;
                                                } else {
                                                    M04 = org.telegram.messenger.hd.M0(2131747438, null);
                                                }
                                                i38 = i42;
                                                str3 = M04;
                                            }
                                            m8Var.u(org.telegram.messenger.hd.M0(2131743939, null), str3, true, i38, true);
                                        }
                                    } else {
                                        TL_account.Password password2 = privacySettingsActivity.d;
                                        if (password2 == null) {
                                            z16 = true;
                                            str4 = str8;
                                        } else {
                                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(password2.login_email_pattern);
                                            int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                                            int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                                            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                                ?? obj = new Object();
                                                obj.f38751a |= 256;
                                                obj.f38752b = indexOf;
                                                int i43 = lastIndexOf + 1;
                                                obj.f38753c = i43;
                                                valueOf.setSpan(new org.telegram.ui.Components.vy0(obj, 0), indexOf, i43, 0);
                                            }
                                            z16 = false;
                                            str4 = valueOf;
                                        }
                                        m8Var.setPrioritizeTitleOverValue(true);
                                        String M06 = org.telegram.messenger.hd.M0(2131751203, null);
                                        m8Var.f29573x = m8Var.getDefaultImageLeft();
                                        m8Var.f29571s = m8Var.c(false);
                                        org.telegram.ui.ActionBar.k5 k5Var = m8Var.f29564a;
                                        k5Var.l(M06, false);
                                        k5Var.i(null);
                                        org.telegram.ui.ActionBar.k5 k5Var2 = m8Var.d;
                                        k5Var2.setVisibility(0);
                                        k5Var2.l(str4, false);
                                        j6Var.setVisibility(8);
                                        m8Var.h.setVisibility(8);
                                        org.telegram.ui.Components.ch0 ch0Var = m8Var.f29567e;
                                        ch0Var.setVisibility(0);
                                        ch0Var.setTranslationX(0.0f);
                                        ch0Var.setTranslationY(0.0f);
                                        ch0Var.setPadding(0, org.telegram.messenger.g0.L(7.0f), 0, 0);
                                        ch0Var.setImageResource(2131232026);
                                        m8Var.f29570r = true;
                                        m8Var.setWillNotDraw(false);
                                        Switch r02 = m8Var.f29568f;
                                        if (r02 != null) {
                                            r02.setVisibility(8);
                                        }
                                        org.telegram.ui.Components.g5 g5Var = m8Var.K;
                                        if (g5Var != null) {
                                            g5Var.g(null, false);
                                        }
                                        z17 = z16;
                                    }
                                } else {
                                    if (privacySettingsActivity.f41674a0.o0() == 0) {
                                        if (privacySettingsActivity.getMessagesController().f24721a == 0) {
                                            str5 = "";
                                            z17 = true;
                                            privacySettingsActivity.getMessagesController().f24721a = privacySettingsActivity.f41674a0.o0();
                                            m8Var.u(org.telegram.messenger.hd.M0(2131745552, null), str5, true, 2131232024, false);
                                        } else {
                                            format2 = String.format(org.telegram.messenger.hd.E0().f22906y, "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().f24721a));
                                        }
                                    } else {
                                        format2 = String.format(org.telegram.messenger.hd.E0().f22906y, "%d", Integer.valueOf(privacySettingsActivity.f41674a0.o0()));
                                    }
                                    str5 = format2;
                                    privacySettingsActivity.getMessagesController().f24721a = privacySettingsActivity.f41674a0.o0();
                                    m8Var.u(org.telegram.messenger.hd.M0(2131745552, null), str5, true, 2131232024, false);
                                }
                            }
                            m8Var.h(16, z17, z15);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                    i28 = privacySettingsActivity.secretWebpageRow;
                    if (i7 != i28) {
                        i29 = privacySettingsActivity.contactsSyncRow;
                        if (i7 != i29) {
                            i30 = privacySettingsActivity.contactsSuggestRow;
                            if (i7 != i30) {
                                i31 = privacySettingsActivity.newChatsRow;
                                if (i7 == i31) {
                                    r8Var.f(org.telegram.messenger.hd.M0(2131754171, "ArchiveAndMute"), privacySettingsActivity.W, false);
                                    return;
                                }
                                return;
                            }
                            r8Var.f(org.telegram.messenger.hd.M0(2131744413, "SuggestContacts"), privacySettingsActivity.V, false);
                            return;
                        }
                        r8Var.f(org.telegram.messenger.hd.M0(2131744299, "SyncContacts"), privacySettingsActivity.T, true);
                        return;
                    }
                    String M07 = org.telegram.messenger.hd.M0(2131745685, "SecretWebPage");
                    if (privacySettingsActivity.getMessagesController().G2 != 1) {
                        z18 = false;
                    }
                    r8Var.f(M07, z18, false);
                    return;
                }
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                if (i7 == privacySettingsActivity.f41680f) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746768, "PrivacyTitle"));
                    return;
                } else if (i7 == 0) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131745683, "SecurityTitle"));
                    return;
                } else if (i7 == privacySettingsActivity.D) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131751519, "DeleteMyAccount"));
                    return;
                } else if (i7 == privacySettingsActivity.M) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131745696, "SecretChat"));
                    return;
                } else if (i7 == privacySettingsActivity.F) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131746849, "PrivacyBots"));
                    return;
                } else if (i7 == privacySettingsActivity.K) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131751780, "Contacts"));
                    return;
                } else if (i7 == privacySettingsActivity.f41685x) {
                    n4Var.setText(org.telegram.messenger.hd.M0(2131748284, "NewChatsFromNonContacts"));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            if (i7 == privacySettingsActivity.E) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131751598, "DeleteAccountHelp"));
                return;
            } else if (i7 == privacySettingsActivity.f41682r) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131749380, "GroupsAndChannelsHelp"));
                return;
            } else if (i7 == privacySettingsActivity.f41684w) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131745553, "SessionsSettingsInfo"));
                return;
            } else if (i7 == privacySettingsActivity.N) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131745684, "SecretWebPageInfo"));
                return;
            } else if (i7 == privacySettingsActivity.I) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131746848, "PrivacyBotsInfo"));
                return;
            } else if (i7 == privacySettingsActivity.h) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131746815, null));
                return;
            } else if (i7 == privacySettingsActivity.L) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131744411, "SuggestContactsInfo"));
                return;
            } else if (i7 == privacySettingsActivity.f41686y) {
                z8Var.setText(org.telegram.messenger.hd.M0(2131754170, "ArchiveAndMuteInfo"));
                return;
            } else {
                return;
            }
        }
        int i44 = 16;
        if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i7) {
            z9 = true;
        } else {
            z9 = false;
        }
        view.setTag(Integer.valueOf(i7));
        org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
        w9Var.setBetterLayout(true);
        i10 = privacySettingsActivity.webSessionsRow;
        if (i7 != i10) {
            i11 = privacySettingsActivity.phoneNumberRow;
            if (i7 != i11) {
                i12 = privacySettingsActivity.lastSeenRow;
                if (i7 == i12) {
                    if (privacySettingsActivity.getContactsController().t(0)) {
                        z10 = true;
                        i44 = 30;
                    } else {
                        str7 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 0);
                        z10 = false;
                    }
                    w9Var.c(org.telegram.messenger.hd.M0(2131746814, "PrivacyLastSeen"), str7, false, true);
                } else {
                    if (i7 != privacySettingsActivity.f41681n) {
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
                                                    int i45 = 2131747752;
                                                    if (i7 != i20) {
                                                        i21 = privacySettingsActivity.noncontactsRow;
                                                        if (i7 == i21) {
                                                            if (privacySettingsActivity.Y) {
                                                                i45 = 2131751779;
                                                            } else if (privacySettingsActivity.X) {
                                                                i45 = 2131751778;
                                                            }
                                                            String M08 = org.telegram.messenger.hd.M0(i45, null);
                                                            if (privacySettingsActivity.getMessagesController().J5 && !privacySettingsActivity.getMessagesController().L6) {
                                                                z02 = org.telegram.messenger.hd.M0(2131746809, null);
                                                            } else {
                                                                z02 = PrivacySettingsActivity.z0(privacySettingsActivity, org.telegram.messenger.hd.M0(2131746809, null));
                                                            }
                                                            i26 = privacySettingsActivity.musicRow;
                                                            if (i26 != -1) {
                                                                z11 = true;
                                                            } else {
                                                                z11 = false;
                                                            }
                                                            w9Var.c(z02, M08, false, z11);
                                                        } else if (i7 != privacySettingsActivity.G) {
                                                            i22 = privacySettingsActivity.deleteAccountRow;
                                                            if (i7 != i22) {
                                                                i23 = privacySettingsActivity.paymentsClearRow;
                                                                if (i7 == i23) {
                                                                    w9Var.b(org.telegram.messenger.hd.M0(2131746796, "PrivacyPaymentsClear"), true);
                                                                } else if (i7 != privacySettingsActivity.H) {
                                                                    i24 = privacySettingsActivity.secretMapRow;
                                                                    if (i7 != i24) {
                                                                        i25 = privacySettingsActivity.contactsDeleteRow;
                                                                        if (i7 == i25) {
                                                                            w9Var.b(org.telegram.messenger.hd.M0(2131744297, "SyncContactsDelete"), true);
                                                                        }
                                                                    } else {
                                                                        int i46 = org.telegram.messenger.iz.f23402o0;
                                                                        if (i46 != 0) {
                                                                            if (i46 != 1) {
                                                                                if (i46 != 2) {
                                                                                    M0 = org.telegram.messenger.hd.M0(2131748683, "MapPreviewProviderYandex");
                                                                                } else {
                                                                                    M0 = org.telegram.messenger.hd.M0(2131748686, "MapPreviewProviderNobody");
                                                                                }
                                                                            } else {
                                                                                M0 = org.telegram.messenger.hd.M0(2131748687, "MapPreviewProviderGoogle");
                                                                            }
                                                                        } else {
                                                                            M0 = org.telegram.messenger.hd.M0(2131748685, "MapPreviewProviderTelegram");
                                                                        }
                                                                        w9Var.c(org.telegram.messenger.hd.M0(2131748688, "MapPreviewProvider"), M0, privacySettingsActivity.R, true);
                                                                        privacySettingsActivity.R = false;
                                                                    }
                                                                } else {
                                                                    w9Var.b(org.telegram.messenger.hd.M0(2131746861, null), true);
                                                                }
                                                            } else {
                                                                if (privacySettingsActivity.getContactsController().G != 2) {
                                                                    z10 = true;
                                                                } else {
                                                                    int i47 = privacySettingsActivity.getContactsController().H;
                                                                    if (i47 <= 182) {
                                                                        str7 = org.telegram.messenger.hd.G(i47 / 30, "Months", new Object[0]);
                                                                    } else if (i47 == 365) {
                                                                        str7 = org.telegram.messenger.hd.G(12, "Months", new Object[0]);
                                                                    } else if (i47 == 548) {
                                                                        str7 = org.telegram.messenger.hd.G(18, "Months", new Object[0]);
                                                                    } else if (i47 == 730) {
                                                                        str7 = org.telegram.messenger.hd.G(24, "Months", new Object[0]);
                                                                    } else if (i47 > 30) {
                                                                        str7 = org.telegram.messenger.hd.G((int) Math.round(i47 / 30.0d), "Months", new Object[0]);
                                                                    } else {
                                                                        str7 = org.telegram.messenger.hd.G(i47, "Days", new Object[0]);
                                                                    }
                                                                    z10 = false;
                                                                }
                                                                w9Var.c(org.telegram.messenger.hd.M0(2131751596, "DeleteAccountIfAwayFor3"), str7, privacySettingsActivity.Q, false);
                                                                privacySettingsActivity.Q = false;
                                                            }
                                                        } else {
                                                            w9Var.b(org.telegram.messenger.hd.M0(2131744238, "TelegramPassport"), true);
                                                        }
                                                    } else {
                                                        if (privacySettingsActivity.getContactsController().t(8)) {
                                                            C0 = null;
                                                            z12 = true;
                                                            i44 = 30;
                                                        } else {
                                                            if (!privacySettingsActivity.getUserConfig().q()) {
                                                                C0 = org.telegram.messenger.hd.M0(2131747752, null);
                                                            } else {
                                                                C0 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 8);
                                                            }
                                                            z12 = false;
                                                        }
                                                        SpannableStringBuilder z03 = PrivacySettingsActivity.z0(privacySettingsActivity, org.telegram.messenger.hd.M0(2131746757, null));
                                                        i27 = privacySettingsActivity.noncontactsRow;
                                                        if (i27 != -1) {
                                                            z13 = true;
                                                        } else {
                                                            z13 = false;
                                                        }
                                                        w9Var.c(z03, C0, false, z13);
                                                        org.telegram.ui.ActionBar.r6.t(w9Var.getValueImageView(), org.telegram.ui.ActionBar.k6.f28014m6, null, PorterDuff.Mode.MULTIPLY);
                                                    }
                                                } else {
                                                    if (privacySettingsActivity.getContactsController().t(5)) {
                                                        z10 = true;
                                                        i44 = 30;
                                                    } else {
                                                        str7 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 5);
                                                        z10 = false;
                                                    }
                                                    w9Var.c(org.telegram.messenger.hd.M0(2131746836, "PrivacyForwards"), str7, false, true);
                                                }
                                            } else {
                                                if (privacySettingsActivity.getContactsController().t(12)) {
                                                    C02 = null;
                                                    z12 = true;
                                                    i44 = 30;
                                                } else {
                                                    C02 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 12);
                                                    z12 = false;
                                                }
                                                w9Var.c(org.telegram.messenger.hd.M0(2131746828, null), C02, false, true);
                                            }
                                            z17 = z12;
                                        } else {
                                            if (privacySettingsActivity.getContactsController().t(11)) {
                                                C03 = null;
                                                z14 = true;
                                                i44 = 30;
                                            } else {
                                                C03 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 11);
                                                z14 = false;
                                            }
                                            w9Var.c(org.telegram.messenger.hd.M0(2131746859, null), C03, false, true);
                                        }
                                    } else {
                                        if (privacySettingsActivity.getContactsController().t(14)) {
                                            C04 = null;
                                            z14 = true;
                                            i44 = 30;
                                        } else {
                                            C04 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 14);
                                            z14 = false;
                                        }
                                        w9Var.c(org.telegram.messenger.hd.M0(2131746803, null), C04, false, true);
                                    }
                                } else {
                                    if (privacySettingsActivity.getContactsController().t(9)) {
                                        z10 = true;
                                        i44 = 30;
                                    } else {
                                        str7 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 9);
                                        z10 = false;
                                    }
                                    w9Var.c(org.telegram.messenger.hd.M0(2131746866, "PrivacyBio"), str7, false, true);
                                }
                            } else {
                                if (privacySettingsActivity.getContactsController().t(4)) {
                                    z10 = true;
                                    i44 = 30;
                                } else {
                                    str7 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 4);
                                    z10 = false;
                                }
                                w9Var.c(org.telegram.messenger.hd.M0(2131746776, "PrivacyProfilePhoto"), str7, false, true);
                            }
                        } else {
                            if (privacySettingsActivity.getContactsController().t(2)) {
                                z10 = true;
                                i44 = 30;
                            } else {
                                str7 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 2);
                                z10 = false;
                            }
                            w9Var.c(org.telegram.messenger.hd.M0(2131752596, "Calls"), str7, false, true);
                        }
                    } else {
                        if (privacySettingsActivity.getContactsController().t(1)) {
                            C05 = null;
                            z14 = true;
                            i44 = 30;
                        } else {
                            C05 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 1);
                            z14 = false;
                        }
                        w9Var.c(org.telegram.messenger.hd.M0(2131746816, null), C05, false, false);
                    }
                    z17 = z14;
                }
            } else {
                if (privacySettingsActivity.getContactsController().t(6)) {
                    z10 = true;
                    i44 = 30;
                } else {
                    str7 = PrivacySettingsActivity.C0(privacySettingsActivity.getAccountInstance(), 6);
                    z10 = false;
                }
                w9Var.c(org.telegram.messenger.hd.M0(2131746789, "PrivacyPhone"), str7, false, true);
            }
            z17 = z10;
        } else {
            w9Var.b(org.telegram.messenger.hd.M0(2131742912, "WebSessionsTitle"), false);
        }
        w9Var.f30748r = z17;
        w9Var.D = i44;
        if (!z9) {
            if (z17) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            w9Var.f30752y = f10;
        } else {
            w9Var.E = true;
        }
        w9Var.invalidate();
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        View w9Var;
        Context context = this.f48544c;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            w9Var = new org.telegram.ui.Cells.r8(context);
                        } else {
                            w9Var = new org.telegram.ui.Cells.m8(context);
                        }
                    } else {
                        w9Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                    }
                } else {
                    w9Var = new org.telegram.ui.Cells.n4(context);
                }
            } else {
                w9Var = new org.telegram.ui.Cells.z8(context);
            }
        } else {
            w9Var = new org.telegram.ui.Cells.w9(context);
        }
        return new v4.d1(w9Var);
    }
}
