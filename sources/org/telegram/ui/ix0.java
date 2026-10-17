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
public final class ix0 extends org.telegram.ui.Components.hm0 {
    public final Context f37993c;
    public final PrivacySettingsActivity d;

    public ix0(PrivacySettingsActivity privacySettingsActivity, Context context) {
        this.d = privacySettingsActivity;
        this.f37993c = context;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
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
        int b10 = b1Var.b();
        PrivacySettingsActivity privacySettingsActivity = this.d;
        i10 = privacySettingsActivity.passcodeRow;
        if (b10 != i10) {
            i11 = privacySettingsActivity.passwordRow;
            if (b10 != i11) {
                i12 = privacySettingsActivity.passkeysRow;
                if (b10 != i12) {
                    i13 = privacySettingsActivity.blockedRow;
                    if (b10 != i13 && b10 != privacySettingsActivity.f33564s) {
                        i14 = privacySettingsActivity.secretWebpageRow;
                        if (b10 != i14) {
                            i15 = privacySettingsActivity.webSessionsRow;
                            if (b10 != i15 && (b10 != privacySettingsActivity.f33562n || privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1))) {
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
                        if (i10 != i14 && i10 != privacySettingsActivity.f33562n) {
                            i15 = privacySettingsActivity.paymentsClearRow;
                            if (i10 != i15) {
                                i16 = privacySettingsActivity.secretMapRow;
                                if (i10 != i16) {
                                    i17 = privacySettingsActivity.contactsDeleteRow;
                                    if (i10 != i17 && i10 != privacySettingsActivity.H) {
                                        if (i10 != privacySettingsActivity.h && i10 != privacySettingsActivity.E && i10 != privacySettingsActivity.f33563r && i10 != privacySettingsActivity.v && i10 != privacySettingsActivity.N && i10 != privacySettingsActivity.I && i10 != privacySettingsActivity.L && i10 != privacySettingsActivity.f33566x) {
                                            if (i10 != 0 && i10 != privacySettingsActivity.f33567y && i10 != privacySettingsActivity.f33561f && i10 != privacySettingsActivity.M && i10 != privacySettingsActivity.F && i10 != privacySettingsActivity.K && i10 != privacySettingsActivity.f33565w) {
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
                                                                    if (i10 != i22 && i10 != privacySettingsActivity.f33564s) {
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
    public final void v(s4.b1 b1Var, int i10) {
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
        int i42 = b1Var.f45941f;
        View view = b1Var.f45938a;
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
                            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                            if (view.getTag() != null && ((Integer) view.getTag()).intValue() == i10) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            view.setTag(Integer.valueOf(i10));
                            q8Var.setPrioritizeTitleOverValue(false);
                            org.telegram.ui.Components.q6 q6Var = q8Var.f22783c;
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
                                q8Var.s(LocaleController.getString("AutoDeleteMessages", R.string.AutoDeleteMessages), str7, true, R.drawable.msg2_autodelete, true);
                            } else {
                                String str9 = "";
                                if (i10 != privacySettingsActivity.f33564s) {
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
                                                        q8Var.s(LocaleController.getString("BlockedUsers", R.string.BlockedUsers), str, true, R.drawable.msg2_block2, true);
                                                    }
                                                } else {
                                                    if (SharedConfig.passcodeHash.length() != 0) {
                                                        string2 = LocaleController.getString(R.string.PasswordOn);
                                                        i40 = R.drawable.msg2_secret;
                                                    } else {
                                                        string2 = LocaleController.getString(R.string.PasswordOff);
                                                        i40 = R.drawable.msg2_secret;
                                                    }
                                                    q8Var.s(LocaleController.getString(R.string.Passcode), string2, true, i40, true);
                                                }
                                            } else {
                                                ArrayList arrayList = privacySettingsActivity.e;
                                                if (arrayList == null) {
                                                    z17 = true;
                                                    str2 = str9;
                                                } else if (arrayList.size() == 1 && q6Var.getPaint().measureText(((TL_account.Passkey) privacySettingsActivity.e.get(0)).name) < AndroidUtilities.displaySize.x / 3.0f) {
                                                    str2 = ((TL_account.Passkey) privacySettingsActivity.e.get(0)).name;
                                                } else if (privacySettingsActivity.e.size() > 0) {
                                                    str2 = privacySettingsActivity.e.size() + "";
                                                } else {
                                                    str2 = LocaleController.getString(R.string.PasswordOff);
                                                }
                                                q8Var.s(LocaleController.getString(R.string.Passkey), str2, true, R.drawable.msg2_permissions, true);
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
                                            q8Var.s(LocaleController.getString(R.string.TwoStepVerification), str4, true, i41, true);
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
                                                obj.f28049a |= 256;
                                                obj.f28050b = indexOf;
                                                int i46 = lastIndexOf + 1;
                                                obj.f28051c = i46;
                                                valueOf.setSpan(new org.telegram.ui.Components.m11(obj, 0), indexOf, i46, 0);
                                            }
                                            z16 = false;
                                            str5 = valueOf;
                                        }
                                        q8Var.setPrioritizeTitleOverValue(true);
                                        String string4 = LocaleController.getString(R.string.EmailLogin);
                                        int i47 = R.drawable.msg2_email;
                                        q8Var.f22788w = 16;
                                        q8Var.f22787s = 58;
                                        org.telegram.ui.ActionBar.j5 j5Var = q8Var.f22781a;
                                        j5Var.l(string4, false);
                                        j5Var.i(null);
                                        org.telegram.ui.ActionBar.j5 j5Var2 = q8Var.d;
                                        j5Var2.setVisibility(0);
                                        j5Var2.l(str5, false);
                                        q6Var.setVisibility(8);
                                        q8Var.h.setVisibility(8);
                                        org.telegram.ui.Components.xj0 xj0Var = q8Var.e;
                                        xj0Var.setVisibility(0);
                                        xj0Var.setTranslationX(0.0f);
                                        xj0Var.setTranslationY(0.0f);
                                        xj0Var.setPadding(0, AndroidUtilities.dp(7.0f), 0, 0);
                                        xj0Var.setImageResource(i47);
                                        q8Var.f22786r = true;
                                        q8Var.setWillNotDraw(false);
                                        Switch r02 = q8Var.f22784f;
                                        if (r02 != null) {
                                            r02.setVisibility(8);
                                        }
                                        org.telegram.ui.Components.p5 p5Var = q8Var.K;
                                        if (p5Var != null) {
                                            p5Var.g(null, false);
                                        }
                                        z17 = z16;
                                    }
                                } else {
                                    if (privacySettingsActivity.f33556a0.j0() == 0) {
                                        if (privacySettingsActivity.getMessagesController().lastKnownSessionsCount == 0) {
                                            z17 = true;
                                            str6 = str9;
                                        } else {
                                            str6 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.getMessagesController().lastKnownSessionsCount));
                                        }
                                    } else {
                                        str6 = String.format(LocaleController.getInstance().getCurrentLocale(), "%d", Integer.valueOf(privacySettingsActivity.f33556a0.j0()));
                                    }
                                    String str10 = str6;
                                    privacySettingsActivity.getMessagesController().lastKnownSessionsCount = privacySettingsActivity.f33556a0.j0();
                                    q8Var.s(LocaleController.getString(R.string.SessionsTitle), str10, true, R.drawable.msg2_devices, false);
                                }
                            }
                            q8Var.f(16, z17, z15);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                    i30 = privacySettingsActivity.secretWebpageRow;
                    if (i10 != i30) {
                        i31 = privacySettingsActivity.contactsSyncRow;
                        if (i10 != i31) {
                            i32 = privacySettingsActivity.contactsSuggestRow;
                            if (i10 != i32) {
                                i33 = privacySettingsActivity.newChatsRow;
                                if (i10 == i33) {
                                    v8Var.f(LocaleController.getString("ArchiveAndMute", R.string.ArchiveAndMute), privacySettingsActivity.W, false);
                                    return;
                                }
                                return;
                            }
                            v8Var.f(LocaleController.getString("SuggestContacts", R.string.SuggestContacts), privacySettingsActivity.V, false);
                            return;
                        }
                        v8Var.f(LocaleController.getString("SyncContacts", R.string.SyncContacts), privacySettingsActivity.T, true);
                        return;
                    }
                    String string5 = LocaleController.getString("SecretWebPage", R.string.SecretWebPage);
                    if (privacySettingsActivity.getMessagesController().secretWebpagePreview != 1) {
                        z18 = false;
                    }
                    v8Var.f(string5, z18, false);
                    return;
                }
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                if (i10 == privacySettingsActivity.f33561f) {
                    l4Var.setText(LocaleController.getString("PrivacyTitle", R.string.PrivacyTitle));
                    return;
                } else if (i10 == 0) {
                    l4Var.setText(LocaleController.getString("SecurityTitle", R.string.SecurityTitle));
                    return;
                } else if (i10 == privacySettingsActivity.f33567y) {
                    l4Var.setText(LocaleController.getString("DeleteMyAccount", R.string.DeleteMyAccount));
                    return;
                } else if (i10 == privacySettingsActivity.M) {
                    l4Var.setText(LocaleController.getString("SecretChat", R.string.SecretChat));
                    return;
                } else if (i10 == privacySettingsActivity.F) {
                    l4Var.setText(LocaleController.getString("PrivacyBots", R.string.PrivacyBots));
                    return;
                } else if (i10 == privacySettingsActivity.K) {
                    l4Var.setText(LocaleController.getString("Contacts", R.string.Contacts));
                    return;
                } else if (i10 == privacySettingsActivity.f33565w) {
                    l4Var.setText(LocaleController.getString("NewChatsFromNonContacts", R.string.NewChatsFromNonContacts));
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.d9 d9Var = (org.telegram.ui.Cells.d9) view;
            if (i10 == privacySettingsActivity.E) {
                d9Var.setText(LocaleController.getString("DeleteAccountHelp", R.string.DeleteAccountHelp));
                return;
            } else if (i10 == privacySettingsActivity.f33563r) {
                d9Var.setText(LocaleController.getString("GroupsAndChannelsHelp", R.string.GroupsAndChannelsHelp));
                return;
            } else if (i10 == privacySettingsActivity.v) {
                d9Var.setText(LocaleController.getString("SessionsSettingsInfo", R.string.SessionsSettingsInfo));
                return;
            } else if (i10 == privacySettingsActivity.N) {
                d9Var.setText(LocaleController.getString("SecretWebPageInfo", R.string.SecretWebPageInfo));
                return;
            } else if (i10 == privacySettingsActivity.I) {
                d9Var.setText(LocaleController.getString("PrivacyBotsInfo", R.string.PrivacyBotsInfo));
                return;
            } else if (i10 == privacySettingsActivity.h) {
                d9Var.setText(LocaleController.getString(R.string.PrivacyInvitesInfo));
                return;
            } else if (i10 == privacySettingsActivity.L) {
                d9Var.setText(LocaleController.getString("SuggestContactsInfo", R.string.SuggestContactsInfo));
                return;
            } else if (i10 == privacySettingsActivity.f33566x) {
                d9Var.setText(LocaleController.getString("ArchiveAndMuteInfo", R.string.ArchiveAndMuteInfo));
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
        org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
        baVar.setBetterLayout(true);
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
                    baVar.c(LocaleController.getString("PrivacyLastSeen", R.string.PrivacyLastSeen), str8, false, true);
                } else if (i10 != privacySettingsActivity.f33562n) {
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
                                                        baVar.c(u02, string6, false, z12);
                                                    } else if (i10 != privacySettingsActivity.G) {
                                                        i23 = privacySettingsActivity.deleteAccountRow;
                                                        if (i10 != i23) {
                                                            i24 = privacySettingsActivity.paymentsClearRow;
                                                            if (i10 == i24) {
                                                                baVar.b(LocaleController.getString("PrivacyPaymentsClear", R.string.PrivacyPaymentsClear), true);
                                                            } else if (i10 != privacySettingsActivity.H) {
                                                                i25 = privacySettingsActivity.secretMapRow;
                                                                if (i10 != i25) {
                                                                    i26 = privacySettingsActivity.contactsDeleteRow;
                                                                    if (i10 == i26) {
                                                                        baVar.b(LocaleController.getString("SyncContactsDelete", R.string.SyncContactsDelete), true);
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
                                                                    baVar.c(LocaleController.getString("MapPreviewProvider", R.string.MapPreviewProvider), string, privacySettingsActivity.R, true);
                                                                    privacySettingsActivity.R = false;
                                                                }
                                                            } else {
                                                                baVar.b(LocaleController.getString(R.string.PrivacyBiometryBotsButton), true);
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
                                                            baVar.c(LocaleController.getString("DeleteAccountIfAwayFor3", R.string.DeleteAccountIfAwayFor3), str8, privacySettingsActivity.Q, false);
                                                            privacySettingsActivity.Q = false;
                                                        }
                                                    } else {
                                                        baVar.b(LocaleController.getString("TelegramPassport", R.string.TelegramPassport), true);
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
                                                    baVar.c(u03, x02, false, z14);
                                                    baVar.getValueImageView().setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21149m6, false), PorterDuff.Mode.MULTIPLY));
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
                                                baVar.c(LocaleController.getString("PrivacyForwards", R.string.PrivacyForwards), str8, false, true);
                                            }
                                        } else {
                                            if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(12)) {
                                                z11 = true;
                                                i43 = 30;
                                            } else {
                                                str8 = PrivacySettingsActivity.x0(12, privacySettingsActivity.getAccountInstance());
                                                z11 = false;
                                            }
                                            baVar.c(LocaleController.getString(R.string.PrivacyGifts), str8, false, true);
                                        }
                                    } else {
                                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(11)) {
                                            z11 = true;
                                            i43 = 30;
                                        } else {
                                            str8 = PrivacySettingsActivity.x0(11, privacySettingsActivity.getAccountInstance());
                                            z11 = false;
                                        }
                                        baVar.c(LocaleController.getString(R.string.PrivacyBirthday), str8, false, true);
                                    }
                                } else {
                                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(14)) {
                                        z11 = true;
                                        i43 = 30;
                                    } else {
                                        str8 = PrivacySettingsActivity.x0(14, privacySettingsActivity.getAccountInstance());
                                        z11 = false;
                                    }
                                    baVar.c(LocaleController.getString(R.string.PrivacyMusic), str8, false, true);
                                }
                            } else {
                                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(9)) {
                                    z11 = true;
                                    i43 = 30;
                                } else {
                                    str8 = PrivacySettingsActivity.x0(9, privacySettingsActivity.getAccountInstance());
                                    z11 = false;
                                }
                                baVar.c(LocaleController.getString("PrivacyBio", R.string.PrivacyBio), str8, false, true);
                            }
                        } else {
                            if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(4)) {
                                z11 = true;
                                i43 = 30;
                            } else {
                                str8 = PrivacySettingsActivity.x0(4, privacySettingsActivity.getAccountInstance());
                                z11 = false;
                            }
                            baVar.c(LocaleController.getString("PrivacyProfilePhoto", R.string.PrivacyProfilePhoto), str8, false, true);
                        }
                    } else {
                        if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(2)) {
                            z11 = true;
                            i43 = 30;
                        } else {
                            str8 = PrivacySettingsActivity.x0(2, privacySettingsActivity.getAccountInstance());
                            z11 = false;
                        }
                        baVar.c(LocaleController.getString("Calls", R.string.Calls), str8, false, true);
                    }
                } else {
                    if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(1)) {
                        z11 = true;
                        i43 = 30;
                    } else {
                        str8 = PrivacySettingsActivity.x0(1, privacySettingsActivity.getAccountInstance());
                        z11 = false;
                    }
                    baVar.c(LocaleController.getString(R.string.PrivacyInvites), str8, false, false);
                }
            } else {
                if (privacySettingsActivity.getContactsController().getLoadingPrivacyInfo(6)) {
                    z11 = true;
                    i43 = 30;
                } else {
                    str8 = PrivacySettingsActivity.x0(6, privacySettingsActivity.getAccountInstance());
                    z11 = false;
                }
                baVar.c(LocaleController.getString("PrivacyPhone", R.string.PrivacyPhone), str8, false, true);
            }
            z17 = z11;
        } else {
            baVar.b(LocaleController.getString("WebSessionsTitle", R.string.WebSessionsTitle), false);
        }
        baVar.f22066r = z17;
        baVar.f22070y = i43;
        if (!z10) {
            if (z17) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            baVar.f22069x = f7;
        } else {
            baVar.E = true;
        }
        baVar.invalidate();
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View baVar;
        Context context = this.f37993c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            baVar = new org.telegram.ui.Cells.v8(context);
                        } else {
                            baVar = new org.telegram.ui.Cells.q8(context);
                        }
                    } else {
                        baVar = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.t0) null);
                    }
                } else {
                    baVar = new org.telegram.ui.Cells.l4(context);
                }
            } else {
                baVar = new org.telegram.ui.Cells.d9(context);
            }
        } else {
            baVar = new org.telegram.ui.Cells.ba(context);
        }
        return new s4.b1(baVar);
    }
}
