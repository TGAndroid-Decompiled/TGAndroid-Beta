package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.Switch;
public final class px0 extends org.telegram.ui.Components.rl0 {
    public final Context f40144c;
    public final PrivacySettingsActivity d;

    public px0(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.f40144c = context;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
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
        int i35;
        int b10 = m1Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        i10 = privacySettingsActivity.passcodeRow;
        if (b10 != i10) {
            i11 = privacySettingsActivity.passwordRow;
            if (b10 != i11) {
                i12 = privacySettingsActivity.passkeysRow;
                if (b10 != i12) {
                    i13 = privacySettingsActivity.blockedRow;
                    if (b10 != i13 && b10 != privacySettingsActivity.f34556s) {
                        i14 = privacySettingsActivity.secretWebpageRow;
                        if (b10 != i14) {
                            i15 = privacySettingsActivity.webSessionsRow;
                            if (b10 != i15 && (b10 != privacySettingsActivity.f34554n || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1))) {
                                i16 = privacySettingsActivity.lastSeenRow;
                                if (b10 != i16 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) {
                                    i17 = privacySettingsActivity.callsRow;
                                    if (b10 != i17 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) {
                                        i18 = privacySettingsActivity.profilePhotoRow;
                                        if (b10 != i18 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) {
                                            i19 = privacySettingsActivity.bioRow;
                                            if (b10 != i19 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) {
                                                i20 = privacySettingsActivity.musicRow;
                                                if (b10 != i20 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) {
                                                    i21 = privacySettingsActivity.birthdayRow;
                                                    if (b10 != i21 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) {
                                                        i22 = privacySettingsActivity.giftsRow;
                                                        if (b10 != i22 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) {
                                                            i23 = privacySettingsActivity.forwardsRow;
                                                            if (b10 != i23 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) {
                                                                i24 = privacySettingsActivity.phoneNumberRow;
                                                                if (b10 != i24 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) {
                                                                    i25 = privacySettingsActivity.voicesRow;
                                                                    if (b10 != i25 || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) {
                                                                        i26 = privacySettingsActivity.noncontactsRow;
                                                                        if (b10 != i26) {
                                                                            i27 = privacySettingsActivity.deleteAccountRow;
                                                                            if (b10 != i27 || privacySettingsActivity.getContactsController().getLoadingDeleteInfo()) {
                                                                                i28 = privacySettingsActivity.newChatsRow;
                                                                                if (b10 != i28 || privacySettingsActivity.getContactsController().getLoadingGlobalSettings()) {
                                                                                    i29 = privacySettingsActivity.emailLoginRow;
                                                                                    if (b10 != i29) {
                                                                                        i30 = privacySettingsActivity.paymentsClearRow;
                                                                                        if (b10 != i30) {
                                                                                            i31 = privacySettingsActivity.secretMapRow;
                                                                                            if (b10 != i31) {
                                                                                                i32 = privacySettingsActivity.contactsSyncRow;
                                                                                                if (b10 != i32 && b10 != privacySettingsActivity.D) {
                                                                                                    i33 = privacySettingsActivity.contactsDeleteRow;
                                                                                                    if (b10 != i33) {
                                                                                                        i34 = privacySettingsActivity.contactsSuggestRow;
                                                                                                        if (b10 != i34) {
                                                                                                            i35 = privacySettingsActivity.autoDeleteMesages;
                                                                                                            if (b10 != i35 && b10 != privacySettingsActivity.E) {
                                                                                                                return false;
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
    public final int h() {
        return this.d.L;
    }

    @Override
    public final int j(int i10) {
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
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i10 != privacySettingsActivity.D) {
            i11 = privacySettingsActivity.lastSeenRow;
            if (i10 != i11) {
                i12 = privacySettingsActivity.phoneNumberRow;
                if (i10 != i12) {
                    i13 = privacySettingsActivity.deleteAccountRow;
                    if (i10 != i13) {
                        i14 = privacySettingsActivity.webSessionsRow;
                        if (i10 != i14 && i10 != privacySettingsActivity.f34554n) {
                            i15 = privacySettingsActivity.paymentsClearRow;
                            if (i10 != i15) {
                                i16 = privacySettingsActivity.secretMapRow;
                                if (i10 != i16) {
                                    i17 = privacySettingsActivity.contactsDeleteRow;
                                    if (i10 != i17 && i10 != privacySettingsActivity.E) {
                                        if (i10 != privacySettingsActivity.h && i10 != privacySettingsActivity.B && i10 != privacySettingsActivity.f34555r && i10 != privacySettingsActivity.v && i10 != privacySettingsActivity.K && i10 != privacySettingsActivity.F && i10 != privacySettingsActivity.I && i10 != privacySettingsActivity.f34558x) {
                                            if (i10 != 0 && i10 != privacySettingsActivity.f34559y && i10 != privacySettingsActivity.f34553f && i10 != privacySettingsActivity.J && i10 != privacySettingsActivity.C && i10 != privacySettingsActivity.H && i10 != privacySettingsActivity.f34557w) {
                                                i18 = privacySettingsActivity.secretWebpageRow;
                                                if (i10 != i18) {
                                                    i19 = privacySettingsActivity.contactsSyncRow;
                                                    if (i10 != i19) {
                                                        i20 = privacySettingsActivity.contactsSuggestRow;
                                                        if (i10 != i20) {
                                                            i21 = privacySettingsActivity.newChatsRow;
                                                            if (i10 != i21) {
                                                                if (i10 != privacySettingsActivity.G) {
                                                                    i22 = privacySettingsActivity.autoDeleteMesages;
                                                                    if (i10 != i22 && i10 != privacySettingsActivity.f34556s) {
                                                                        i23 = privacySettingsActivity.emailLoginRow;
                                                                        if (i10 != i23) {
                                                                            i24 = privacySettingsActivity.passwordRow;
                                                                            if (i10 != i24) {
                                                                                i25 = privacySettingsActivity.passkeysRow;
                                                                                if (i10 != i25) {
                                                                                    i26 = privacySettingsActivity.passcodeRow;
                                                                                    if (i10 != i26) {
                                                                                        i27 = privacySettingsActivity.blockedRow;
                                                                                        if (i10 == i27) {
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
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
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
        String string;
        boolean z10;
        int i27;
        CharSequence u02;
        int i28;
        boolean z11;
        CharSequence x02;
        boolean z12;
        int i29;
        boolean z13;
        float f10;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z14;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        String str;
        String format;
        String string2;
        int i40;
        String string3;
        String str2;
        String string4;
        int i41;
        String str3;
        boolean z15;
        String str4;
        String format2;
        String str5;
        String string5;
        String str6;
        int i42 = m1Var.f5879f;
        View view = m1Var.f5875a;
        int i43 = 16;
        String str7 = null;
        boolean z16 = false;
        boolean z17 = true;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i42 != 0) {
            if (i42 != 1) {
                if (i42 != 2) {
                    if (i42 != 3) {
                        if (i42 == 5) {
                            org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                            if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i10) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            view.setTag(Integer.valueOf(i10));
                            o8Var.setPrioritizeTitleOverValue(false);
                            org.telegram.ui.Components.k6 k6Var = o8Var.f23314c;
                            i34 = privacySettingsActivity.autoDeleteMesages;
                            if (i10 == i34) {
                                int globalTTl = privacySettingsActivity.getUserConfig().getGlobalTTl();
                                if (globalTTl == -1) {
                                    str6 = null;
                                    z16 = true;
                                } else {
                                    if (globalTTl > 0) {
                                        string5 = LocaleController.formatTTLString(globalTTl * 60);
                                    } else {
                                        string5 = LocaleController.getString("PasswordOff", R.string.PasswordOff);
                                    }
                                    str6 = string5;
                                }
                                o8Var.s(LocaleController.getString("AutoDeleteMessages", R.string.AutoDeleteMessages), str6, true, R.drawable.msg2_autodelete, true);
                            } else {
                                String str8 = "";
                                if (i10 != privacySettingsActivity.f34556s) {
                                    i35 = privacySettingsActivity.emailLoginRow;
                                    if (i10 != i35) {
                                        i36 = privacySettingsActivity.passwordRow;
                                        if (i10 != i36) {
                                            i37 = privacySettingsActivity.passkeysRow;
                                            if (i10 != i37) {
                                                i38 = privacySettingsActivity.passcodeRow;
                                                if (i10 != i38) {
                                                    i39 = privacySettingsActivity.blockedRow;
                                                    if (i10 == i39) {
                                                        int i44 = privacySettingsActivity.getMessagesController().totalBlockedCount;
                                                        if (i44 == 0) {
                                                            format = LocaleController.getString("BlockedEmpty", R.string.BlockedEmpty);
                                                        } else if (i44 <= 0) {
                                                            str = "";
                                                            z16 = true;
                                                            o8Var.s(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                                                        } else {
                                                            format = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(i44));
                                                        }
                                                        str = format;
                                                        o8Var.s(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                                                    }
                                                } else {
                                                    if (SharedConfig.passcodeHash.length() != 0) {
                                                        string2 = LocaleController.getString(R.string.PasswordOn);
                                                        i40 = R.drawable.msg2_secret;
                                                    } else {
                                                        string2 = LocaleController.getString(R.string.PasswordOff);
                                                        i40 = R.drawable.msg2_secret;
                                                    }
                                                    o8Var.s(LocaleController.getString(R.string.Passcode), string2, true, i40, true);
                                                }
                                            } else {
                                                ArrayList arrayList = privacySettingsActivity.f34552e;
                                                if (arrayList == null) {
                                                    str2 = "";
                                                    z16 = true;
                                                } else {
                                                    if (arrayList.size() == 1 && k6Var.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.f34552e.get(0)).name) < AndroidUtilities.displaySize.x / 3.0f) {
                                                        string3 = ((TL_account.Passkey) privacySettingsActivity.f34552e.get(0)).name;
                                                    } else if (privacySettingsActivity.f34552e.size() > 0) {
                                                        string3 = privacySettingsActivity.f34552e.size() + "";
                                                    } else {
                                                        string3 = LocaleController.getString(R.string.PasswordOff);
                                                    }
                                                    str2 = string3;
                                                }
                                                o8Var.s(LocaleController.getString(R.string.Passkey), str2, true, R.drawable.msg2_permissions, true);
                                            }
                                        } else {
                                            int i45 = R.drawable.menu_2sv;
                                            TL_account.Password password = privacySettingsActivity.d;
                                            if (password == null) {
                                                i41 = i45;
                                                str3 = "";
                                                z16 = true;
                                            } else {
                                                if (password.has_password) {
                                                    i45 = R.drawable.menu_2sv_on;
                                                    string4 = LocaleController.getString(R.string.PasswordOn);
                                                } else {
                                                    string4 = LocaleController.getString(R.string.PasswordOff);
                                                }
                                                i41 = i45;
                                                str3 = string4;
                                            }
                                            o8Var.s(LocaleController.getString(R.string.TwoStepVerification), str3, true, i41, true);
                                        }
                                    } else {
                                        TL_account.Password password2 = privacySettingsActivity.d;
                                        if (password2 == null) {
                                            z15 = true;
                                            str4 = str8;
                                        } else {
                                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(password2.login_email_pattern);
                                            int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                                            int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                                            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                                ?? obj = new Object();
                                                obj.f30949a |= 256;
                                                obj.f30950b = indexOf;
                                                int i46 = lastIndexOf + 1;
                                                obj.f30951c = i46;
                                                valueOf.setSpan(new org.telegram.ui.Components.t01(obj, 0), indexOf, i46, 0);
                                            }
                                            z15 = false;
                                            str4 = valueOf;
                                        }
                                        o8Var.setPrioritizeTitleOverValue(true);
                                        String string6 = LocaleController.getString(R.string.EmailLogin);
                                        int i47 = R.drawable.msg2_email;
                                        o8Var.f23320w = 16;
                                        o8Var.f23319s = 58;
                                        org.telegram.ui.ActionBar.l5 l5Var = o8Var.f23312a;
                                        l5Var.l(string6, false);
                                        l5Var.i(null);
                                        org.telegram.ui.ActionBar.l5 l5Var2 = o8Var.d;
                                        l5Var2.setVisibility(0);
                                        l5Var2.l(str4, false);
                                        k6Var.setVisibility(8);
                                        o8Var.h.setVisibility(8);
                                        org.telegram.ui.Components.kj0 kj0Var = o8Var.f23315e;
                                        kj0Var.setVisibility(0);
                                        kj0Var.setTranslationX(0.0f);
                                        kj0Var.setTranslationY(0.0f);
                                        kj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                                        kj0Var.setImageResource(i47);
                                        o8Var.f23318r = true;
                                        o8Var.setWillNotDraw(false);
                                        Switch r02 = o8Var.f23316f;
                                        if (r02 != null) {
                                            r02.setVisibility(8);
                                        }
                                        org.telegram.ui.Components.j5 j5Var = o8Var.H;
                                        if (j5Var != null) {
                                            j5Var.g(null, false);
                                        }
                                        z16 = z15;
                                    }
                                } else {
                                    if (privacySettingsActivity.X.j0() == 0) {
                                        if (privacySettingsActivity.getMessagesController().lastKnownSessionsCount == 0) {
                                            str5 = "";
                                            z16 = true;
                                            privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.X.j0();
                                            o8Var.s(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
                                        } else {
                                            format2 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().lastKnownSessionsCount));
                                        }
                                    } else {
                                        format2 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.X.j0()));
                                    }
                                    str5 = format2;
                                    privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.X.j0();
                                    o8Var.s(LocaleController.getString(R.string.SessionsTitle), str5, true, R.drawable.msg2_devices, false);
                                }
                            }
                            o8Var.f(16, z16, z14);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                    i30 = privacySettingsActivity.secretWebpageRow;
                    if (i10 != i30) {
                        i31 = privacySettingsActivity.contactsSyncRow;
                        if (i10 != i31) {
                            i32 = privacySettingsActivity.contactsSuggestRow;
                            if (i10 != i32) {
                                i33 = privacySettingsActivity.newChatsRow;
                                if (i10 == i33) {
                                    s8Var.f(LocaleController.getString("ArchiveAndMute", R.string.ArchiveAndMute), privacySettingsActivity.T, false);
                                    return;
                                }
                                return;
                            }
                            s8Var.f(LocaleController.getString("SuggestContacts", R.string.SuggestContacts), privacySettingsActivity.S, false);
                            return;
                        }
                        s8Var.f(LocaleController.getString("SyncContacts", R.string.SyncContacts), privacySettingsActivity.Q, true);
                        return;
                    }
                    String string7 = LocaleController.getString("SecretWebPage", R.string.SecretWebPage);
                    if (privacySettingsActivity.getMessagesController().secretWebpagePreview != 1) {
                        z17 = false;
                    }
                    s8Var.f(string7, z17, false);
                    return;
                }
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == privacySettingsActivity.f34553f) {
                    m4Var.setText(LocaleController.getString("PrivacyTitle", R.string.PrivacyTitle));
                    return;
                } else if (i10 == 0) {
                    m4Var.setText(LocaleController.getString("SecurityTitle", R.string.SecurityTitle));
                    return;
                } else if (i10 == privacySettingsActivity.f34559y) {
                    m4Var.setText(LocaleController.getString("DeleteMyAccount", R.string.DeleteMyAccount));
                    return;
                } else if (i10 == privacySettingsActivity.J) {
                    m4Var.setText(LocaleController.getString("SecretChat", R.string.SecretChat));
                    return;
                } else if (i10 == privacySettingsActivity.C) {
                    m4Var.setText(LocaleController.getString("PrivacyBots", R.string.PrivacyBots));
                    return;
                } else if (i10 == privacySettingsActivity.H) {
                    m4Var.setText(LocaleController.getString("Contacts", R.string.Contacts));
                    return;
                } else if (i10 == privacySettingsActivity.f34557w) {
                    m4Var.setText(LocaleController.getString("NewChatsFromNonContacts", R.string.NewChatsFromNonContacts));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            if (i10 == privacySettingsActivity.B) {
                a9Var.setText(LocaleController.getString("DeleteAccountHelp", R.string.DeleteAccountHelp));
                return;
            } else if (i10 == privacySettingsActivity.f34555r) {
                a9Var.setText(LocaleController.getString("GroupsAndChannelsHelp", R.string.GroupsAndChannelsHelp));
                return;
            } else if (i10 == privacySettingsActivity.v) {
                a9Var.setText(LocaleController.getString("SessionsSettingsInfo", R.string.SessionsSettingsInfo));
                return;
            } else if (i10 == privacySettingsActivity.K) {
                a9Var.setText(LocaleController.getString("SecretWebPageInfo", R.string.SecretWebPageInfo));
                return;
            } else if (i10 == privacySettingsActivity.F) {
                a9Var.setText(LocaleController.getString("PrivacyBotsInfo", R.string.PrivacyBotsInfo));
                return;
            } else if (i10 == privacySettingsActivity.h) {
                a9Var.setText(LocaleController.getString(R.string.PrivacyInvitesInfo));
                return;
            } else if (i10 == privacySettingsActivity.I) {
                a9Var.setText(LocaleController.getString("SuggestContactsInfo", R.string.SuggestContactsInfo));
                return;
            } else if (i10 == privacySettingsActivity.f34558x) {
                a9Var.setText(LocaleController.getString("ArchiveAndMuteInfo", R.string.ArchiveAndMuteInfo));
                return;
            } else {
                return;
            }
        }
        if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i10) {
            z4 = true;
        } else {
            z4 = false;
        }
        view.setTag(Integer.valueOf(i10));
        org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
        aaVar.setBetterLayout(true);
        i11 = privacySettingsActivity.webSessionsRow;
        if (i10 != i11) {
            i12 = privacySettingsActivity.phoneNumberRow;
            if (i10 != i12) {
                i13 = privacySettingsActivity.lastSeenRow;
                if (i10 == i13) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) {
                        z10 = true;
                        i43 = 30;
                    } else {
                        str7 = PrivacySettingsActivity.x0(0, privacySettingsActivity.getAccountInstance());
                        z10 = false;
                    }
                    aaVar.c(LocaleController.getString("PrivacyLastSeen", R.string.PrivacyLastSeen), str7, false, true);
                } else if (i10 != privacySettingsActivity.f34554n) {
                    i14 = privacySettingsActivity.callsRow;
                    if (i10 != i14) {
                        i15 = privacySettingsActivity.profilePhotoRow;
                        if (i10 != i15) {
                            i16 = privacySettingsActivity.bioRow;
                            if (i10 != i16) {
                                i17 = privacySettingsActivity.musicRow;
                                if (i10 != i17) {
                                    i18 = privacySettingsActivity.birthdayRow;
                                    if (i10 != i18) {
                                        i19 = privacySettingsActivity.giftsRow;
                                        if (i10 != i19) {
                                            i20 = privacySettingsActivity.forwardsRow;
                                            if (i10 != i20) {
                                                i21 = privacySettingsActivity.voicesRow;
                                                if (i10 != i21) {
                                                    i22 = privacySettingsActivity.noncontactsRow;
                                                    if (i10 == i22) {
                                                        if (privacySettingsActivity.V) {
                                                            i27 = R.string.ContactsAndFee;
                                                        } else if (privacySettingsActivity.U) {
                                                            i27 = R.string.ContactsAndPremium;
                                                        } else {
                                                            i27 = R.string.P2PEverybody;
                                                        }
                                                        String string8 = LocaleController.getString(i27);
                                                        if (privacySettingsActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacySettingsActivity.getMessagesController().starsPaidMessagesAvailable) {
                                                            u02 = LocaleController.getString(R.string.PrivacyMessages);
                                                        } else {
                                                            u02 = PrivacySettingsActivity.u0(privacySettingsActivity, LocaleController.getString(R.string.PrivacyMessages));
                                                        }
                                                        i28 = privacySettingsActivity.musicRow;
                                                        if (i28 != -1) {
                                                            z11 = true;
                                                        } else {
                                                            z11 = false;
                                                        }
                                                        aaVar.c(u02, string8, false, z11);
                                                    } else if (i10 != privacySettingsActivity.D) {
                                                        i23 = privacySettingsActivity.deleteAccountRow;
                                                        if (i10 != i23) {
                                                            i24 = privacySettingsActivity.paymentsClearRow;
                                                            if (i10 == i24) {
                                                                aaVar.b(LocaleController.getString("PrivacyPaymentsClear", R.string.PrivacyPaymentsClear), true);
                                                            } else if (i10 != privacySettingsActivity.E) {
                                                                i25 = privacySettingsActivity.secretMapRow;
                                                                if (i10 != i25) {
                                                                    i26 = privacySettingsActivity.contactsDeleteRow;
                                                                    if (i10 == i26) {
                                                                        aaVar.b(LocaleController.getString("SyncContactsDelete", R.string.SyncContactsDelete), true);
                                                                    }
                                                                } else {
                                                                    int i48 = SharedConfig.mapPreviewType;
                                                                    if (i48 != 0) {
                                                                        if (i48 != 1) {
                                                                            if (i48 != 2) {
                                                                                string = LocaleController.getString("MapPreviewProviderYandex", R.string.MapPreviewProviderYandex);
                                                                            } else {
                                                                                string = LocaleController.getString("MapPreviewProviderNobody", R.string.MapPreviewProviderNobody);
                                                                            }
                                                                        } else {
                                                                            string = LocaleController.getString("MapPreviewProviderGoogle", R.string.MapPreviewProviderGoogle);
                                                                        }
                                                                    } else {
                                                                        string = LocaleController.getString("MapPreviewProviderTelegram", R.string.MapPreviewProviderTelegram);
                                                                    }
                                                                    aaVar.c(LocaleController.getString("MapPreviewProvider", R.string.MapPreviewProvider), string, privacySettingsActivity.O, true);
                                                                    privacySettingsActivity.O = false;
                                                                }
                                                            } else {
                                                                aaVar.b(LocaleController.getString(R.string.PrivacyBiometryBotsButton), true);
                                                            }
                                                        } else {
                                                            if (privacySettingsActivity.getContactsController().getLoadingDeleteInfo()) {
                                                                z10 = true;
                                                            } else {
                                                                int deleteAccountTTL = privacySettingsActivity.getContactsController().getDeleteAccountTTL();
                                                                if (deleteAccountTTL <= 182) {
                                                                    str7 = LocaleController.formatPluralString("Months", deleteAccountTTL / 30, new Object[0]);
                                                                } else if (deleteAccountTTL == 365) {
                                                                    str7 = LocaleController.formatPluralString("Months", 12, new Object[0]);
                                                                } else if (deleteAccountTTL == 548) {
                                                                    str7 = LocaleController.formatPluralString("Months", 18, new Object[0]);
                                                                } else if (deleteAccountTTL == 730) {
                                                                    str7 = LocaleController.formatPluralString("Months", 24, new Object[0]);
                                                                } else if (deleteAccountTTL > 30) {
                                                                    str7 = LocaleController.formatPluralString("Months", (int) Math.round(deleteAccountTTL / 30.0d), new Object[0]);
                                                                } else {
                                                                    str7 = LocaleController.formatPluralString("Days", deleteAccountTTL, new Object[0]);
                                                                }
                                                                z10 = false;
                                                            }
                                                            aaVar.c(LocaleController.getString("DeleteAccountIfAwayFor3", R.string.DeleteAccountIfAwayFor3), str7, privacySettingsActivity.N, false);
                                                            privacySettingsActivity.N = false;
                                                        }
                                                    } else {
                                                        aaVar.b(LocaleController.getString("TelegramPassport", R.string.TelegramPassport), true);
                                                    }
                                                } else {
                                                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) {
                                                        x02 = null;
                                                        z12 = true;
                                                        i43 = 30;
                                                    } else {
                                                        if (!privacySettingsActivity.getUserConfig().isPremium()) {
                                                            x02 = LocaleController.getString(R.string.P2PEverybody);
                                                        } else {
                                                            x02 = PrivacySettingsActivity.x0(8, privacySettingsActivity.getAccountInstance());
                                                        }
                                                        z12 = false;
                                                    }
                                                    SpannableStringBuilder u03 = PrivacySettingsActivity.u0(privacySettingsActivity, LocaleController.getString(R.string.PrivacyVoiceMessages));
                                                    i29 = privacySettingsActivity.noncontactsRow;
                                                    if (i29 != -1) {
                                                        z13 = true;
                                                    } else {
                                                        z13 = false;
                                                    }
                                                    aaVar.c(u03, x02, false, z13);
                                                    aaVar.getValueImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21823m6, false), PorterDuff.Mode.MULTIPLY));
                                                    z16 = z12;
                                                }
                                            } else {
                                                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) {
                                                    z10 = true;
                                                    i43 = 30;
                                                } else {
                                                    str7 = PrivacySettingsActivity.x0(5, privacySettingsActivity.getAccountInstance());
                                                    z10 = false;
                                                }
                                                aaVar.c(LocaleController.getString("PrivacyForwards", R.string.PrivacyForwards), str7, false, true);
                                            }
                                        } else {
                                            if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) {
                                                z10 = true;
                                                i43 = 30;
                                            } else {
                                                str7 = PrivacySettingsActivity.x0(12, privacySettingsActivity.getAccountInstance());
                                                z10 = false;
                                            }
                                            aaVar.c(LocaleController.getString(R.string.PrivacyGifts), str7, false, true);
                                        }
                                    } else {
                                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) {
                                            z10 = true;
                                            i43 = 30;
                                        } else {
                                            str7 = PrivacySettingsActivity.x0(11, privacySettingsActivity.getAccountInstance());
                                            z10 = false;
                                        }
                                        aaVar.c(LocaleController.getString(R.string.PrivacyBirthday), str7, false, true);
                                    }
                                } else {
                                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) {
                                        z10 = true;
                                        i43 = 30;
                                    } else {
                                        str7 = PrivacySettingsActivity.x0(14, privacySettingsActivity.getAccountInstance());
                                        z10 = false;
                                    }
                                    aaVar.c(LocaleController.getString(R.string.PrivacyMusic), str7, false, true);
                                }
                            } else {
                                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) {
                                    z10 = true;
                                    i43 = 30;
                                } else {
                                    str7 = PrivacySettingsActivity.x0(9, privacySettingsActivity.getAccountInstance());
                                    z10 = false;
                                }
                                aaVar.c(LocaleController.getString("PrivacyBio", R.string.PrivacyBio), str7, false, true);
                            }
                        } else {
                            if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) {
                                z10 = true;
                                i43 = 30;
                            } else {
                                str7 = PrivacySettingsActivity.x0(4, privacySettingsActivity.getAccountInstance());
                                z10 = false;
                            }
                            aaVar.c(LocaleController.getString("PrivacyProfilePhoto", R.string.PrivacyProfilePhoto), str7, false, true);
                        }
                    } else {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) {
                            z10 = true;
                            i43 = 30;
                        } else {
                            str7 = PrivacySettingsActivity.x0(2, privacySettingsActivity.getAccountInstance());
                            z10 = false;
                        }
                        aaVar.c(LocaleController.getString("Calls", R.string.Calls), str7, false, true);
                    }
                } else {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1)) {
                        z10 = true;
                        i43 = 30;
                    } else {
                        str7 = PrivacySettingsActivity.x0(1, privacySettingsActivity.getAccountInstance());
                        z10 = false;
                    }
                    aaVar.c(LocaleController.getString(R.string.PrivacyInvites), str7, false, false);
                }
            } else {
                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) {
                    z10 = true;
                    i43 = 30;
                } else {
                    str7 = PrivacySettingsActivity.x0(6, privacySettingsActivity.getAccountInstance());
                    z10 = false;
                }
                aaVar.c(LocaleController.getString("PrivacyPhone", R.string.PrivacyPhone), str7, false, true);
            }
            z16 = z10;
        } else {
            aaVar.b(LocaleController.getString("WebSessionsTitle", R.string.WebSessionsTitle), false);
        }
        aaVar.f22574r = z16;
        aaVar.f22578y = i43;
        if (!z4) {
            if (z16) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            aaVar.f22577x = f10;
        } else {
            aaVar.B = true;
        }
        aaVar.invalidate();
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        View aaVar;
        Context context = this.f40144c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            aaVar = new org.telegram.ui.Cells.s8(context);
                        } else {
                            aaVar = new org.telegram.ui.Cells.o8(context);
                        }
                    } else {
                        aaVar = new org.telegram.ui.Cells.z6(context, (b) null);
                    }
                } else {
                    aaVar = new org.telegram.ui.Cells.m4(context);
                }
            } else {
                aaVar = new org.telegram.ui.Cells.a9(context);
            }
        } else {
            aaVar = new org.telegram.ui.Cells.aa(context);
        }
        return new f2.m1(aaVar);
    }
}
