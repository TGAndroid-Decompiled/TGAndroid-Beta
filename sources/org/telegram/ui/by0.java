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
public final class by0 extends org.telegram.ui.Components.qm0 {
    public final Context f36502c;
    public final PrivacySettingsActivity d;

    public by0(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.f36502c = context;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
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
        int b10 = d1Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        i10 = privacySettingsActivity.passcodeRow;
        if (b10 != i10) {
            i11 = privacySettingsActivity.passwordRow;
            if (b10 != i11) {
                i12 = privacySettingsActivity.passkeysRow;
                if (b10 != i12) {
                    i13 = privacySettingsActivity.blockedRow;
                    if (b10 != i13 && b10 != privacySettingsActivity.f34269s) {
                        i14 = privacySettingsActivity.secretWebpageRow;
                        if (b10 != i14) {
                            i15 = privacySettingsActivity.webSessionsRow;
                            if (b10 != i15 && (b10 != privacySettingsActivity.f34267n || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1))) {
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
                                                                                                if (b10 != i32 && b10 != privacySettingsActivity.G) {
                                                                                                    i33 = privacySettingsActivity.contactsDeleteRow;
                                                                                                    if (b10 != i33) {
                                                                                                        i34 = privacySettingsActivity.contactsSuggestRow;
                                                                                                        if (b10 != i34) {
                                                                                                            i35 = privacySettingsActivity.autoDeleteMesages;
                                                                                                            if (b10 != i35 && b10 != privacySettingsActivity.H) {
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
        return this.d.O;
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
        if (i10 != privacySettingsActivity.G) {
            i11 = privacySettingsActivity.lastSeenRow;
            if (i10 != i11) {
                i12 = privacySettingsActivity.phoneNumberRow;
                if (i10 != i12) {
                    i13 = privacySettingsActivity.deleteAccountRow;
                    if (i10 != i13) {
                        i14 = privacySettingsActivity.webSessionsRow;
                        if (i10 != i14 && i10 != privacySettingsActivity.f34267n) {
                            i15 = privacySettingsActivity.paymentsClearRow;
                            if (i10 != i15) {
                                i16 = privacySettingsActivity.secretMapRow;
                                if (i10 != i16) {
                                    i17 = privacySettingsActivity.contactsDeleteRow;
                                    if (i10 != i17 && i10 != privacySettingsActivity.H) {
                                        if (i10 != privacySettingsActivity.h && i10 != privacySettingsActivity.E && i10 != privacySettingsActivity.f34268r && i10 != privacySettingsActivity.v && i10 != privacySettingsActivity.N && i10 != privacySettingsActivity.I && i10 != privacySettingsActivity.L && i10 != privacySettingsActivity.f34271x) {
                                            if (i10 != 0 && i10 != privacySettingsActivity.f34272y && i10 != privacySettingsActivity.f34266f && i10 != privacySettingsActivity.M && i10 != privacySettingsActivity.F && i10 != privacySettingsActivity.K && i10 != privacySettingsActivity.f34270w) {
                                                i18 = privacySettingsActivity.secretWebpageRow;
                                                if (i10 != i18) {
                                                    i19 = privacySettingsActivity.contactsSyncRow;
                                                    if (i10 != i19) {
                                                        i20 = privacySettingsActivity.contactsSuggestRow;
                                                        if (i10 != i20) {
                                                            i21 = privacySettingsActivity.newChatsRow;
                                                            if (i10 != i21) {
                                                                if (i10 != privacySettingsActivity.J) {
                                                                    i22 = privacySettingsActivity.autoDeleteMesages;
                                                                    if (i10 != i22 && i10 != privacySettingsActivity.f34269s) {
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
    public final void v(s4.d1 d1Var, int i10) {
        boolean z10;
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
        boolean z11;
        int i27;
        CharSequence u02;
        int i28;
        boolean z12;
        CharSequence x02;
        boolean z13;
        int i29;
        boolean z14;
        float f7;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z15;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        String str;
        String string2;
        int i40;
        String str2;
        String str3;
        int i41;
        String str4;
        boolean z16;
        String str5;
        String str6;
        String string3;
        String str7;
        int i42 = d1Var.f47786f;
        View view = d1Var.f47782a;
        int i43 = 16;
        String str8 = null;
        boolean z17 = false;
        boolean z18 = true;
        PrivacySettingsActivity privacySettingsActivity = this.d;
        if (i42 != 0) {
            if (i42 != 1) {
                if (i42 != 2) {
                    if (i42 != 3) {
                        if (i42 == 5) {
                            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                            if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i10) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            view.setTag(Integer.valueOf(i10));
                            r8Var.setPrioritizeTitleOverValue(false);
                            org.telegram.ui.Components.r6 r6Var = r8Var.f22747c;
                            i34 = privacySettingsActivity.autoDeleteMesages;
                            if (i10 == i34) {
                                int globalTTl = privacySettingsActivity.getUserConfig().getGlobalTTl();
                                if (globalTTl == -1) {
                                    str7 = null;
                                    z17 = true;
                                } else {
                                    if (globalTTl > 0) {
                                        string3 = LocaleController.formatTTLString(globalTTl * 60);
                                    } else {
                                        string3 = LocaleController.getString("PasswordOff", R.string.PasswordOff);
                                    }
                                    str7 = string3;
                                }
                                r8Var.s(LocaleController.getString("AutoDeleteMessages", R.string.AutoDeleteMessages), str7, true, R.drawable.msg2_autodelete, true);
                            } else {
                                String str9 = "";
                                if (i10 != privacySettingsActivity.f34269s) {
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
                                                            str = LocaleController.getString("BlockedEmpty", R.string.BlockedEmpty);
                                                        } else if (i44 > 0) {
                                                            str = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(i44));
                                                        } else {
                                                            z17 = true;
                                                            str = str9;
                                                        }
                                                        r8Var.s(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                                                    }
                                                } else {
                                                    if (SharedConfig.passcodeHash.length() != 0) {
                                                        string2 = LocaleController.getString(R.string.PasswordOn);
                                                        i40 = R.drawable.msg2_secret;
                                                    } else {
                                                        string2 = LocaleController.getString(R.string.PasswordOff);
                                                        i40 = R.drawable.msg2_secret;
                                                    }
                                                    r8Var.s(LocaleController.getString(R.string.Passcode), string2, true, i40, true);
                                                }
                                            } else {
                                                ArrayList arrayList = privacySettingsActivity.f34265e;
                                                if (arrayList == null) {
                                                    z17 = true;
                                                    str2 = str9;
                                                } else if (arrayList.size() == 1 && r6Var.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.f34265e.get(0)).name) < AndroidUtilities.displaySize.x / 3.0f) {
                                                    str2 = ((TL_account.Passkey) privacySettingsActivity.f34265e.get(0)).name;
                                                } else if (privacySettingsActivity.f34265e.size() > 0) {
                                                    str2 = privacySettingsActivity.f34265e.size() + "";
                                                } else {
                                                    str2 = LocaleController.getString(R.string.PasswordOff);
                                                }
                                                r8Var.s(LocaleController.getString(R.string.Passkey), str2, true, R.drawable.msg2_permissions, true);
                                            }
                                        } else {
                                            int i45 = R.drawable.menu_2sv;
                                            TL_account.Password password = privacySettingsActivity.d;
                                            if (password == null) {
                                                i41 = i45;
                                                z17 = true;
                                                str4 = str9;
                                            } else {
                                                if (password.has_password) {
                                                    i45 = R.drawable.menu_2sv_on;
                                                    str3 = LocaleController.getString(R.string.PasswordOn);
                                                } else {
                                                    str3 = LocaleController.getString(R.string.PasswordOff);
                                                }
                                                i41 = i45;
                                                str4 = str3;
                                            }
                                            r8Var.s(LocaleController.getString(R.string.TwoStepVerification), str4, true, i41, true);
                                        }
                                    } else {
                                        TL_account.Password password2 = privacySettingsActivity.d;
                                        if (password2 == null) {
                                            z16 = true;
                                            str5 = str9;
                                        } else {
                                            SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(password2.login_email_pattern);
                                            int indexOf = privacySettingsActivity.d.login_email_pattern.indexOf(42);
                                            int lastIndexOf = privacySettingsActivity.d.login_email_pattern.lastIndexOf(42);
                                            if (indexOf != lastIndexOf && indexOf != -1 && lastIndexOf != -1) {
                                                ?? obj = new Object();
                                                obj.f31418a |= 256;
                                                obj.f31419b = indexOf;
                                                int i46 = lastIndexOf + 1;
                                                obj.f31420c = i46;
                                                valueOf.setSpan(new org.telegram.ui.Components.v11(obj, 0), indexOf, i46, 0);
                                            }
                                            z16 = false;
                                            str5 = valueOf;
                                        }
                                        r8Var.setPrioritizeTitleOverValue(true);
                                        String string4 = LocaleController.getString(R.string.EmailLogin);
                                        int i47 = R.drawable.msg2_email;
                                        r8Var.f22753w = 16;
                                        r8Var.f22752s = 58;
                                        org.telegram.ui.ActionBar.h5 h5Var = r8Var.f22745a;
                                        h5Var.l(string4, false);
                                        h5Var.i(null);
                                        org.telegram.ui.ActionBar.h5 h5Var2 = r8Var.d;
                                        h5Var2.setVisibility(0);
                                        h5Var2.l(str5, false);
                                        r6Var.setVisibility(8);
                                        r8Var.h.setVisibility(8);
                                        org.telegram.ui.Components.gk0 gk0Var = r8Var.f22748e;
                                        gk0Var.setVisibility(0);
                                        gk0Var.setTranslationX(0.0f);
                                        gk0Var.setTranslationY(0.0f);
                                        gk0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                                        gk0Var.setImageResource(i47);
                                        r8Var.f22751r = true;
                                        r8Var.setWillNotDraw(false);
                                        Switch r02 = r8Var.f22749f;
                                        if (r02 != null) {
                                            r02.setVisibility(8);
                                        }
                                        org.telegram.ui.Components.q5 q5Var = r8Var.K;
                                        if (q5Var != null) {
                                            q5Var.g(null, false);
                                        }
                                        z17 = z16;
                                    }
                                } else {
                                    if (privacySettingsActivity.f34260a0.j0() == 0) {
                                        if (privacySettingsActivity.getMessagesController().lastKnownSessionsCount == 0) {
                                            z17 = true;
                                            str6 = str9;
                                        } else {
                                            str6 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().lastKnownSessionsCount));
                                        }
                                    } else {
                                        str6 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.f34260a0.j0()));
                                    }
                                    String str10 = str6;
                                    privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.f34260a0.j0();
                                    r8Var.s(LocaleController.getString(R.string.SessionsTitle), str10, true, R.drawable.msg2_devices, false);
                                }
                            }
                            r8Var.f(16, z17, z15);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.w8 w8Var = (org.telegram.ui.Cells.w8) view;
                    i30 = privacySettingsActivity.secretWebpageRow;
                    if (i10 != i30) {
                        i31 = privacySettingsActivity.contactsSyncRow;
                        if (i10 != i31) {
                            i32 = privacySettingsActivity.contactsSuggestRow;
                            if (i10 != i32) {
                                i33 = privacySettingsActivity.newChatsRow;
                                if (i10 == i33) {
                                    w8Var.f(LocaleController.getString("ArchiveAndMute", R.string.ArchiveAndMute), privacySettingsActivity.W, false);
                                    return;
                                }
                                return;
                            }
                            w8Var.f(LocaleController.getString("SuggestContacts", R.string.SuggestContacts), privacySettingsActivity.V, false);
                            return;
                        }
                        w8Var.f(LocaleController.getString("SyncContacts", R.string.SyncContacts), privacySettingsActivity.T, true);
                        return;
                    }
                    String string5 = LocaleController.getString("SecretWebPage", R.string.SecretWebPage);
                    if (privacySettingsActivity.getMessagesController().secretWebpagePreview != 1) {
                        z18 = false;
                    }
                    w8Var.f(string5, z18, false);
                    return;
                }
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                if (i10 == privacySettingsActivity.f34266f) {
                    m4Var.setText(LocaleController.getString("PrivacyTitle", R.string.PrivacyTitle));
                    return;
                } else if (i10 == 0) {
                    m4Var.setText(LocaleController.getString("SecurityTitle", R.string.SecurityTitle));
                    return;
                } else if (i10 == privacySettingsActivity.f34272y) {
                    m4Var.setText(LocaleController.getString("DeleteMyAccount", R.string.DeleteMyAccount));
                    return;
                } else if (i10 == privacySettingsActivity.M) {
                    m4Var.setText(LocaleController.getString("SecretChat", R.string.SecretChat));
                    return;
                } else if (i10 == privacySettingsActivity.F) {
                    m4Var.setText(LocaleController.getString("PrivacyBots", R.string.PrivacyBots));
                    return;
                } else if (i10 == privacySettingsActivity.K) {
                    m4Var.setText(LocaleController.getString("Contacts", R.string.Contacts));
                    return;
                } else if (i10 == privacySettingsActivity.f34270w) {
                    m4Var.setText(LocaleController.getString("NewChatsFromNonContacts", R.string.NewChatsFromNonContacts));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
            if (i10 == privacySettingsActivity.E) {
                e9Var.setText(LocaleController.getString("DeleteAccountHelp", R.string.DeleteAccountHelp));
                return;
            } else if (i10 == privacySettingsActivity.f34268r) {
                e9Var.setText(LocaleController.getString("GroupsAndChannelsHelp", R.string.GroupsAndChannelsHelp));
                return;
            } else if (i10 == privacySettingsActivity.v) {
                e9Var.setText(LocaleController.getString("SessionsSettingsInfo", R.string.SessionsSettingsInfo));
                return;
            } else if (i10 == privacySettingsActivity.N) {
                e9Var.setText(LocaleController.getString("SecretWebPageInfo", R.string.SecretWebPageInfo));
                return;
            } else if (i10 == privacySettingsActivity.I) {
                e9Var.setText(LocaleController.getString("PrivacyBotsInfo", R.string.PrivacyBotsInfo));
                return;
            } else if (i10 == privacySettingsActivity.h) {
                e9Var.setText(LocaleController.getString(R.string.PrivacyInvitesInfo));
                return;
            } else if (i10 == privacySettingsActivity.L) {
                e9Var.setText(LocaleController.getString("SuggestContactsInfo", R.string.SuggestContactsInfo));
                return;
            } else if (i10 == privacySettingsActivity.f34271x) {
                e9Var.setText(LocaleController.getString("ArchiveAndMuteInfo", R.string.ArchiveAndMuteInfo));
                return;
            } else {
                return;
            }
        }
        if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setTag(Integer.valueOf(i10));
        org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
        caVar.setBetterLayout(true);
        i11 = privacySettingsActivity.webSessionsRow;
        if (i10 != i11) {
            i12 = privacySettingsActivity.phoneNumberRow;
            if (i10 != i12) {
                i13 = privacySettingsActivity.lastSeenRow;
                if (i10 == i13) {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(0)) {
                        z11 = true;
                        i43 = 30;
                    } else {
                        str8 = PrivacySettingsActivity.x0(0, privacySettingsActivity.getAccountInstance());
                        z11 = false;
                    }
                    caVar.c(LocaleController.getString("PrivacyLastSeen", R.string.PrivacyLastSeen), str8, false, true);
                } else if (i10 != privacySettingsActivity.f34267n) {
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
                                                        if (privacySettingsActivity.Y) {
                                                            i27 = R.string.ContactsAndFee;
                                                        } else if (privacySettingsActivity.X) {
                                                            i27 = R.string.ContactsAndPremium;
                                                        } else {
                                                            i27 = R.string.P2PEverybody;
                                                        }
                                                        String string6 = LocaleController.getString(i27);
                                                        if (privacySettingsActivity.getMessagesController().newNoncontactPeersRequirePremiumWithoutOwnpremium && !privacySettingsActivity.getMessagesController().starsPaidMessagesAvailable) {
                                                            u02 = LocaleController.getString(R.string.PrivacyMessages);
                                                        } else {
                                                            u02 = PrivacySettingsActivity.u0(privacySettingsActivity, LocaleController.getString(R.string.PrivacyMessages));
                                                        }
                                                        i28 = privacySettingsActivity.musicRow;
                                                        if (i28 != -1) {
                                                            z12 = true;
                                                        } else {
                                                            z12 = false;
                                                        }
                                                        caVar.c(u02, string6, false, z12);
                                                    } else if (i10 != privacySettingsActivity.G) {
                                                        i23 = privacySettingsActivity.deleteAccountRow;
                                                        if (i10 != i23) {
                                                            i24 = privacySettingsActivity.paymentsClearRow;
                                                            if (i10 == i24) {
                                                                caVar.b(LocaleController.getString("PrivacyPaymentsClear", R.string.PrivacyPaymentsClear), true);
                                                            } else if (i10 != privacySettingsActivity.H) {
                                                                i25 = privacySettingsActivity.secretMapRow;
                                                                if (i10 != i25) {
                                                                    i26 = privacySettingsActivity.contactsDeleteRow;
                                                                    if (i10 == i26) {
                                                                        caVar.b(LocaleController.getString("SyncContactsDelete", R.string.SyncContactsDelete), true);
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
                                                                    caVar.c(LocaleController.getString("MapPreviewProvider", R.string.MapPreviewProvider), string, privacySettingsActivity.R, true);
                                                                    privacySettingsActivity.R = false;
                                                                }
                                                            } else {
                                                                caVar.b(LocaleController.getString(R.string.PrivacyBiometryBotsButton), true);
                                                            }
                                                        } else {
                                                            if (privacySettingsActivity.getContactsController().getLoadingDeleteInfo()) {
                                                                z11 = true;
                                                            } else {
                                                                int deleteAccountTTL = privacySettingsActivity.getContactsController().getDeleteAccountTTL();
                                                                if (deleteAccountTTL <= 182) {
                                                                    str8 = LocaleController.formatPluralString("Months", deleteAccountTTL / 30, new Object[0]);
                                                                } else if (deleteAccountTTL == 365) {
                                                                    str8 = LocaleController.formatPluralString("Months", 12, new Object[0]);
                                                                } else if (deleteAccountTTL == 548) {
                                                                    str8 = LocaleController.formatPluralString("Months", 18, new Object[0]);
                                                                } else if (deleteAccountTTL == 730) {
                                                                    str8 = LocaleController.formatPluralString("Months", 24, new Object[0]);
                                                                } else if (deleteAccountTTL > 30) {
                                                                    str8 = LocaleController.formatPluralString("Months", (int) Math.round(deleteAccountTTL / 30.0d), new Object[0]);
                                                                } else {
                                                                    str8 = LocaleController.formatPluralString("Days", deleteAccountTTL, new Object[0]);
                                                                }
                                                                z11 = false;
                                                            }
                                                            caVar.c(LocaleController.getString("DeleteAccountIfAwayFor3", R.string.DeleteAccountIfAwayFor3), str8, privacySettingsActivity.Q, false);
                                                            privacySettingsActivity.Q = false;
                                                        }
                                                    } else {
                                                        caVar.b(LocaleController.getString("TelegramPassport", R.string.TelegramPassport), true);
                                                    }
                                                } else {
                                                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(8)) {
                                                        x02 = null;
                                                        z13 = true;
                                                        i43 = 30;
                                                    } else {
                                                        if (!privacySettingsActivity.getUserConfig().isPremium()) {
                                                            x02 = LocaleController.getString(R.string.P2PEverybody);
                                                        } else {
                                                            x02 = PrivacySettingsActivity.x0(8, privacySettingsActivity.getAccountInstance());
                                                        }
                                                        z13 = false;
                                                    }
                                                    SpannableStringBuilder u03 = PrivacySettingsActivity.u0(privacySettingsActivity, LocaleController.getString(R.string.PrivacyVoiceMessages));
                                                    i29 = privacySettingsActivity.noncontactsRow;
                                                    if (i29 != -1) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    caVar.c(u03, x02, false, z14);
                                                    caVar.getValueImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987m6, false), PorterDuff.Mode.MULTIPLY));
                                                    z17 = z13;
                                                }
                                            } else {
                                                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(5)) {
                                                    z11 = true;
                                                    i43 = 30;
                                                } else {
                                                    str8 = PrivacySettingsActivity.x0(5, privacySettingsActivity.getAccountInstance());
                                                    z11 = false;
                                                }
                                                caVar.c(LocaleController.getString("PrivacyForwards", R.string.PrivacyForwards), str8, false, true);
                                            }
                                        } else {
                                            if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) {
                                                z11 = true;
                                                i43 = 30;
                                            } else {
                                                str8 = PrivacySettingsActivity.x0(12, privacySettingsActivity.getAccountInstance());
                                                z11 = false;
                                            }
                                            caVar.c(LocaleController.getString(R.string.PrivacyGifts), str8, false, true);
                                        }
                                    } else {
                                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) {
                                            z11 = true;
                                            i43 = 30;
                                        } else {
                                            str8 = PrivacySettingsActivity.x0(11, privacySettingsActivity.getAccountInstance());
                                            z11 = false;
                                        }
                                        caVar.c(LocaleController.getString(R.string.PrivacyBirthday), str8, false, true);
                                    }
                                } else {
                                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) {
                                        z11 = true;
                                        i43 = 30;
                                    } else {
                                        str8 = PrivacySettingsActivity.x0(14, privacySettingsActivity.getAccountInstance());
                                        z11 = false;
                                    }
                                    caVar.c(LocaleController.getString(R.string.PrivacyMusic), str8, false, true);
                                }
                            } else {
                                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) {
                                    z11 = true;
                                    i43 = 30;
                                } else {
                                    str8 = PrivacySettingsActivity.x0(9, privacySettingsActivity.getAccountInstance());
                                    z11 = false;
                                }
                                caVar.c(LocaleController.getString("PrivacyBio", R.string.PrivacyBio), str8, false, true);
                            }
                        } else {
                            if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) {
                                z11 = true;
                                i43 = 30;
                            } else {
                                str8 = PrivacySettingsActivity.x0(4, privacySettingsActivity.getAccountInstance());
                                z11 = false;
                            }
                            caVar.c(LocaleController.getString("PrivacyProfilePhoto", R.string.PrivacyProfilePhoto), str8, false, true);
                        }
                    } else {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) {
                            z11 = true;
                            i43 = 30;
                        } else {
                            str8 = PrivacySettingsActivity.x0(2, privacySettingsActivity.getAccountInstance());
                            z11 = false;
                        }
                        caVar.c(LocaleController.getString("Calls", R.string.Calls), str8, false, true);
                    }
                } else {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1)) {
                        z11 = true;
                        i43 = 30;
                    } else {
                        str8 = PrivacySettingsActivity.x0(1, privacySettingsActivity.getAccountInstance());
                        z11 = false;
                    }
                    caVar.c(LocaleController.getString(R.string.PrivacyInvites), str8, false, false);
                }
            } else {
                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) {
                    z11 = true;
                    i43 = 30;
                } else {
                    str8 = PrivacySettingsActivity.x0(6, privacySettingsActivity.getAccountInstance());
                    z11 = false;
                }
                caVar.c(LocaleController.getString("PrivacyPhone", R.string.PrivacyPhone), str8, false, true);
            }
            z17 = z11;
        } else {
            caVar.b(LocaleController.getString("WebSessionsTitle", R.string.WebSessionsTitle), false);
        }
        caVar.f21971r = z17;
        caVar.f21975y = i43;
        if (!z10) {
            if (z17) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            caVar.f21974x = f7;
        } else {
            caVar.E = true;
        }
        caVar.invalidate();
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        View caVar;
        Context context = this.f36502c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            caVar = new org.telegram.ui.Cells.w8(context);
                        } else {
                            caVar = new org.telegram.ui.Cells.r8(context);
                        }
                    } else {
                        caVar = new org.telegram.ui.Cells.b7(context, (org.telegram.ui.Cells.c1) null);
                    }
                } else {
                    caVar = new org.telegram.ui.Cells.m4(context);
                }
            } else {
                caVar = new org.telegram.ui.Cells.e9(context);
            }
        } else {
            caVar = new org.telegram.ui.Cells.ca(context);
        }
        return new s4.d1(caVar);
    }
}
