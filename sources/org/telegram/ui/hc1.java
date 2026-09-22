package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
public final class hc1 extends org.telegram.ui.Components.xl0 {
    public final Context f34185c;
    public boolean d = true;
    public final ThemeActivity e;

    public hc1(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.f34185c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42998f;
        if (i10 == 0 || i10 == 1 || i10 == 4 || i10 == 7 || i10 == 10 || i10 == 11 || i10 == 12 || i10 == 14 || i10 == 18 || i10 == 20 || i10 == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.e.J0;
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
        ThemeActivity themeActivity = this.e;
        if (i10 != themeActivity.f31855a0 && i10 != themeActivity.K && i10 != themeActivity.f31857b0 && i10 != themeActivity.Y && i10 != themeActivity.P && i10 != themeActivity.Q && i10 != themeActivity.M && i10 != themeActivity.L) {
            if (i10 != themeActivity.f31863f0 && i10 != themeActivity.Z && i10 != themeActivity.f31881v0 && i10 != themeActivity.A0 && i10 != themeActivity.G0) {
                if (i10 != themeActivity.f31876r0 && i10 != themeActivity.V && i10 != themeActivity.f31859c0 && i10 != themeActivity.O && i10 != themeActivity.f31865h0 && i10 != themeActivity.f31871n0 && i10 != themeActivity.f31868k0 && i10 != themeActivity.J && i10 != themeActivity.I0 && i10 != themeActivity.f31888z0 && i10 != themeActivity.B0 && i10 != themeActivity.C0 && i10 != themeActivity.D0) {
                    if (i10 != themeActivity.R && i10 != themeActivity.S && i10 != themeActivity.T && i10 != themeActivity.U) {
                        if (i10 != themeActivity.W && i10 != themeActivity.f31860d0 && i10 != themeActivity.f31864g0 && i10 != themeActivity.f31884x && i10 != themeActivity.f31866i0 && i10 != themeActivity.f31882w && i10 != themeActivity.f31869l0 && i10 != themeActivity.f31867j0 && i10 != themeActivity.f31879t0 && i10 != themeActivity.f31883w0 && i10 != themeActivity.H0 && i10 != themeActivity.E0 && i10 != themeActivity.F0) {
                            if (i10 == themeActivity.f31861e0) {
                                return 6;
                            }
                            if (i10 != themeActivity.X && i10 != themeActivity.G && i10 != themeActivity.E) {
                                i11 = themeActivity.raiseToListenRow;
                                if (i10 != i11) {
                                    i12 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i12 && i10 != themeActivity.f31886y && i10 != themeActivity.f31878s0) {
                                        i13 = themeActivity.pauseOnMediaRow;
                                        if (i10 != i13 && i10 != themeActivity.F) {
                                            i14 = themeActivity.sensitiveContentRow;
                                            if (i10 != i14) {
                                                i15 = themeActivity.textSizeRow;
                                                if (i10 == i15) {
                                                    return 8;
                                                }
                                                if (i10 != themeActivity.m0) {
                                                    i16 = themeActivity.nightThemeRow;
                                                    if (i10 != i16) {
                                                        i17 = themeActivity.browserRow;
                                                        if (i10 != i17) {
                                                            if (i10 == themeActivity.f31872o0) {
                                                                return 11;
                                                            }
                                                            if (i10 != themeActivity.f31874q0) {
                                                                i18 = themeActivity.bubbleRadiusRow;
                                                                if (i10 != i18) {
                                                                    i19 = themeActivity.backgroundRow;
                                                                    if (i10 != i19 && i10 != themeActivity.f31887y0) {
                                                                        i20 = themeActivity.createNewThemeRow;
                                                                        if (i10 != i20) {
                                                                            i21 = themeActivity.liteModeRow;
                                                                            if (i10 != i21) {
                                                                                i22 = themeActivity.stickersRow;
                                                                                if (i10 != i22) {
                                                                                    if (i10 == themeActivity.f31880u0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i10 == themeActivity.f31885x0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i10 == themeActivity.f31873p0) {
                                                                                        return 17;
                                                                                    }
                                                                                    if (i10 != themeActivity.H && i10 != themeActivity.I) {
                                                                                        i23 = themeActivity.appIconSelectorRow;
                                                                                        if (i10 != i23) {
                                                                                            i24 = themeActivity.changeUserColor;
                                                                                            if (i10 == i24) {
                                                                                                return 21;
                                                                                            }
                                                                                            return 1;
                                                                                        }
                                                                                        return 20;
                                                                                    }
                                                                                    return 19;
                                                                                }
                                                                                return 14;
                                                                            }
                                                                            return 14;
                                                                        }
                                                                        return 14;
                                                                    }
                                                                    return 14;
                                                                }
                                                                return 13;
                                                            }
                                                            return 12;
                                                        }
                                                        return 10;
                                                    }
                                                    return 10;
                                                }
                                                return 9;
                                            }
                                            return 7;
                                        }
                                        return 7;
                                    }
                                    return 7;
                                }
                                return 7;
                            }
                            return 7;
                        }
                        return 5;
                    }
                    return 4;
                }
                return 3;
            }
            return 2;
        }
        return 1;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        int i12;
        String string;
        String string2;
        boolean z10;
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
        String string3;
        String string4;
        int i24 = c1Var.f42998f;
        View view = c1Var.f42995a;
        ThemeActivity themeActivity = this.e;
        boolean z11 = false;
        boolean z12 = true;
        if (i24 != 1) {
            if (i24 != 2) {
                if (i24 != 4) {
                    if (i24 != 5) {
                        if (i24 != 6) {
                            if (i24 != 7) {
                                if (i24 != 14) {
                                    if (i24 != 17) {
                                        if (i24 != 19) {
                                            if (i24 != 21) {
                                                switch (i24) {
                                                    case 10:
                                                        org.telegram.ui.Cells.k5 k5Var = (org.telegram.ui.Cells.k5) view;
                                                        i22 = themeActivity.nightThemeRow;
                                                        if (i10 != i22) {
                                                            i23 = themeActivity.browserRow;
                                                            if (i10 == i23) {
                                                                k5Var.b(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.j6.f19304o != 0) {
                                                            z11 = true;
                                                        }
                                                        if (z11) {
                                                            string3 = org.telegram.ui.ActionBar.j6.z0();
                                                        } else {
                                                            string3 = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                                                        }
                                                        if (z11) {
                                                            int i25 = org.telegram.ui.ActionBar.j6.f19304o;
                                                            if (i25 == 1) {
                                                                string4 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                                                            } else if (i25 == 3) {
                                                                string4 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                                                            } else {
                                                                string4 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                                                            }
                                                            string3 = a4.a.C(string4, " ", string3);
                                                        }
                                                        k5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string3, R.drawable.menu_night_mode_24, z11, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f31858c.y1(themeActivity.f31856b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.yl0 yl0Var = (org.telegram.ui.Components.yl0) view;
                                                        jc1 jc1Var = (jc1) yl0Var.getAdapter();
                                                        jc1Var.l();
                                                        int indexOf = jc1Var.e.indexOf(jc1Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = jc1Var.h() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((s4.c0) yl0Var.getLayoutManager()).h1(indexOf, (themeActivity.f31856b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((hp0) view).set(themeActivity.getUserConfig().getCurrentUser());
                                            return;
                                        }
                                        org.telegram.ui.Cells.k6 k6Var = (org.telegram.ui.Cells.k6) view;
                                        if (i10 == themeActivity.H) {
                                            k6Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            k6Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((gv) view).b();
                                    return;
                                }
                                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                                s8Var.v = 48;
                                i17 = themeActivity.backgroundRow;
                                if (i10 == i17) {
                                    s8Var.setSubtitle(null);
                                    int i26 = org.telegram.ui.ActionBar.j6.q6;
                                    s8Var.e(i26, i26);
                                    String string5 = LocaleController.getString(R.string.ChangeChatBackground);
                                    int i27 = R.drawable.msg_background;
                                    i21 = themeActivity.changeUserColor;
                                    if (i21 >= 0) {
                                        z11 = true;
                                    }
                                    s8Var.m(i27, string5, z11);
                                    return;
                                } else if (i10 != themeActivity.f31887y0) {
                                    i18 = themeActivity.createNewThemeRow;
                                    if (i10 != i18) {
                                        i19 = themeActivity.liteModeRow;
                                        if (i10 != i19) {
                                            i20 = themeActivity.stickersRow;
                                            if (i10 == i20) {
                                                s8Var.e(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
                                                s8Var.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                                                s8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                                                s8Var.f21081s = 64;
                                                s8Var.v = 60;
                                                s8Var.f21082w = 20;
                                                return;
                                            }
                                            return;
                                        }
                                        s8Var.e(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
                                        s8Var.m(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                                        s8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                                        s8Var.v = 60;
                                        s8Var.f21081s = 64;
                                        s8Var.f21082w = 20;
                                        return;
                                    }
                                    s8Var.setSubtitle(null);
                                    int i28 = org.telegram.ui.ActionBar.j6.q6;
                                    s8Var.e(i28, i28);
                                    s8Var.m(R.drawable.msg_colors, LocaleController.getString(R.string.CreateNewTheme), false);
                                    return;
                                } else {
                                    s8Var.setSubtitle(null);
                                    int i29 = org.telegram.ui.ActionBar.j6.q6;
                                    s8Var.e(i29, i29);
                                    s8Var.m(R.drawable.msg_theme, LocaleController.getString(R.string.EditCurrentTheme), true);
                                    return;
                                }
                            }
                            org.telegram.ui.Cells.x8 x8Var = (org.telegram.ui.Cells.x8) view;
                            if (i10 == themeActivity.X) {
                                x8Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.j6.f19323p, true);
                                return;
                            } else if (i10 == themeActivity.N) {
                                x8Var.f(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                                return;
                            } else if (i10 == themeActivity.G) {
                                x8Var.f(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i10 != themeActivity.E) {
                                i13 = themeActivity.raiseToListenRow;
                                if (i10 == i13) {
                                    x8Var.g(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                                    return;
                                } else if (i10 != themeActivity.F) {
                                    i14 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i14) {
                                        i15 = themeActivity.pauseOnMediaRow;
                                        if (i10 == i15) {
                                            x8Var.f(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                                            return;
                                        } else if (i10 != themeActivity.f31886y) {
                                            i16 = themeActivity.sensitiveContentRow;
                                            if (i10 == i16) {
                                                x8Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                                                return;
                                            } else if (i10 == themeActivity.f31878s0) {
                                                x8Var.f(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            x8Var.g(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                                            return;
                                        }
                                    }
                                    x8Var.g(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                                    return;
                                } else {
                                    x8Var.g(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                                    return;
                                }
                            } else {
                                x8Var.g(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.k0) view).setProgress(org.telegram.ui.ActionBar.j6.f19341q);
                        return;
                    }
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (i10 == themeActivity.W) {
                        n4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                        return;
                    } else if (i10 == themeActivity.f31860d0) {
                        n4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                        return;
                    } else if (i10 == themeActivity.f31864g0) {
                        n4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                        return;
                    } else if (i10 == themeActivity.f31884x) {
                        n4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                        return;
                    } else if (i10 == themeActivity.f31866i0) {
                        if (themeActivity.f31862f == 3) {
                            n4Var.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                            return;
                        } else {
                            n4Var.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                            return;
                        }
                    } else if (i10 == themeActivity.f31882w) {
                        n4Var.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                        return;
                    } else if (i10 == themeActivity.f31869l0) {
                        n4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                        return;
                    } else if (i10 == themeActivity.f31867j0) {
                        n4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                        return;
                    } else if (i10 == themeActivity.f31879t0) {
                        n4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                        return;
                    } else if (i10 == themeActivity.f31883w0) {
                        n4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                        return;
                    } else if (i10 == themeActivity.H0) {
                        n4Var.setText(LocaleController.getString(R.string.AppIcon));
                        return;
                    } else if (i10 == themeActivity.F0) {
                        n4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                        return;
                    } else if (i10 == themeActivity.E0) {
                        n4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.ka kaVar = (org.telegram.ui.Cells.ka) view;
                if (i10 == themeActivity.R) {
                    String string6 = LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled);
                    if (org.telegram.ui.ActionBar.j6.f19304o == 0) {
                        z11 = true;
                    }
                    kaVar.a(string6, z11, true);
                    return;
                } else if (i10 == themeActivity.S) {
                    String string7 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                    if (org.telegram.ui.ActionBar.j6.f19304o == 1) {
                        z11 = true;
                    }
                    kaVar.a(string7, z11, true);
                    return;
                } else if (i10 == themeActivity.T) {
                    String string8 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                    if (org.telegram.ui.ActionBar.j6.f19304o == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (themeActivity.U != -1) {
                        z11 = true;
                    }
                    kaVar.a(string8, z10, z11);
                    return;
                } else if (i10 == themeActivity.U) {
                    String string9 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                    if (org.telegram.ui.ActionBar.j6.f19304o != 3) {
                        z12 = false;
                    }
                    kaVar.a(string9, z12, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            f9Var.setFixedSize(0);
            if (i10 == themeActivity.f31863f0) {
                f9Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.j6.f19341q * 100.0f))));
                return;
            } else if (i10 == themeActivity.Z) {
                f9Var.setText(ThemeActivity.y0());
                return;
            } else if (i10 == themeActivity.f31881v0) {
                f9Var.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            } else if (i10 == themeActivity.G0) {
                f9Var.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                return;
            } else {
                f9Var.setFixedSize(12);
                f9Var.setText("");
                return;
            }
        }
        org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
        i11 = themeActivity.nightThemeRow;
        if (i10 == i11) {
            if (org.telegram.ui.ActionBar.j6.f19304o != 0 && org.telegram.ui.ActionBar.j6.J != null) {
                faVar.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.j6.z0(), false, false);
            } else {
                faVar.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
            }
        } else if (i10 == themeActivity.f31855a0) {
            int i30 = org.telegram.ui.ActionBar.j6.f19359r;
            int i31 = i30 / 60;
            faVar.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i31), Integer.valueOf(i30 - (i31 * 60))), false, true);
        } else if (i10 == themeActivity.f31857b0) {
            int i32 = org.telegram.ui.ActionBar.j6.f19378s;
            int i33 = i32 / 60;
            faVar.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i33), Integer.valueOf(i32 - (i33 * 60))), false, false);
        } else if (i10 == themeActivity.Y) {
            faVar.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.f19451w, false, false);
        } else if (i10 == themeActivity.Q) {
            int i34 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
            if (i34 == 0) {
                string2 = LocaleController.getString("Default", R.string.Default);
            } else if (i34 == 1) {
                string2 = LocaleController.getString("FirstName", R.string.SortFirstName);
            } else {
                string2 = LocaleController.getString("LastName", R.string.SortLastName);
            }
            faVar.c(LocaleController.getString("SortBy", R.string.SortBy), string2, false, true);
        } else if (i10 == themeActivity.P) {
            faVar.b(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
        } else if (i10 == themeActivity.K) {
            int i35 = SharedConfig.distanceSystemType;
            if (i35 == 0) {
                string = LocaleController.getString("DistanceUnitsAutomatic", R.string.DistanceUnitsAutomatic);
            } else if (i35 == 1) {
                string = LocaleController.getString("DistanceUnitsKilometers", R.string.DistanceUnitsKilometers);
            } else {
                string = LocaleController.getString("DistanceUnitsMiles", R.string.DistanceUnitsMiles);
            }
            String string10 = LocaleController.getString("DistanceUnits", R.string.DistanceUnits);
            boolean z13 = themeActivity.O0;
            if (themeActivity.D0 < 0) {
                z12 = false;
            }
            faVar.c(string10, string, z13, z12);
            themeActivity.O0 = false;
        } else if (i10 == themeActivity.L) {
            faVar.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.p1.a().f39038a, themeActivity.P0, false);
        } else if (i10 == themeActivity.M) {
            String string11 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
            if (SharedConfig.recordViaSco) {
                i12 = R.string.MicrophoneForVoiceMessagesSco;
            } else {
                i12 = R.string.MicrophoneForVoiceMessagesBuiltIn;
            }
            faVar.c(string11, LocaleController.getString(i12), themeActivity.N0, false);
            themeActivity.N0 = false;
        }
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ?? frameLayout;
        int i11;
        int i12;
        float f7;
        float f10;
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        fc1 k5Var;
        int i15;
        org.telegram.ui.ActionBar.d5 d5Var;
        int i16;
        int i17;
        int i18 = 4;
        int i19 = 5;
        ThemeActivity themeActivity = this.e;
        Context context = this.f34185c;
        switch (i10) {
            case 1:
                k5Var = new org.telegram.ui.Cells.fa(context);
                break;
            case 2:
                k5Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 3:
                k5Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.c1) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f20595a = textView;
                org.telegram.messenger.rk.t(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView.setGravity(i11 | 16);
                boolean z12 = LocaleController.isRTL;
                if (z12) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                int i20 = i12 | 48;
                if (z12) {
                    f7 = 71.0f;
                } else {
                    f7 = 21.0f;
                }
                if (z12) {
                    f10 = 21.0f;
                } else {
                    f10 = 23.0f;
                }
                frameLayout.addView(textView, w7.y5.d(-1, -1.0f, i20, f7, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f20596b = imageView;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.sticker_added);
                if (LocaleController.isRTL) {
                    i19 = 3;
                }
                frameLayout.addView(imageView, w7.y5.d(19, 14.0f, i19 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                k5Var = frameLayout;
                break;
            case 5:
                k5Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 6:
                k5Var = new cc1(this, context);
                break;
            case 7:
                k5Var = new org.telegram.ui.Cells.x8(context);
                break;
            case 8:
                k5Var = new ic1(themeActivity, context);
                break;
            case 9:
                frameLayout = new dc1(context);
                frameLayout.f33034b = new org.telegram.ui.Cells.y0[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i21 = 0;
                while (true) {
                    ?? r32 = (org.telegram.ui.Cells.y0[]) frameLayout.f33034b;
                    if (i21 >= r32.length) {
                        k5Var = frameLayout;
                        break;
                    } else {
                        if (i21 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.f21890c = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.d = textPaint;
                        frameLayout2.setWillNotDraw(false);
                        frameLayout2.f21889b = z10;
                        if (z10) {
                            i13 = R.string.ChatListExpanded;
                        } else {
                            i13 = R.string.ChatListDefault;
                        }
                        frameLayout2.setContentDescription(LocaleController.getString(i13));
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(frameLayout2, context);
                        frameLayout2.f21888a = x0Var;
                        x0Var.setSize(AndroidUtilities.dp(20.0f));
                        frameLayout2.addView(x0Var, w7.y5.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z10 && SharedConfig.useThreeLinesLayout) || (!z10 && !SharedConfig.useThreeLinesLayout)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        x0Var.a(z11, false);
                        r32[i21] = frameLayout2;
                        org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) frameLayout.f33034b)[i21];
                        if (i21 == 1) {
                            i14 = 10;
                        } else {
                            i14 = 0;
                        }
                        frameLayout.addView(y0Var, w7.y5.m(0.5f, -1, -1, i14, 0, 0));
                        ((org.telegram.ui.Cells.y0[]) frameLayout.f33034b)[i21].setOnClickListener(new ai.j3(3, frameLayout, z10));
                        i21++;
                    }
                }
                break;
            case 10:
                k5Var = new org.telegram.ui.Cells.k5(21, 60, this.f34185c, null, true);
                break;
            case 11:
                this.d = true;
                ec1 ec1Var = new ec1(this, this.f34185c, themeActivity, themeActivity.f31862f, themeActivity.e, themeActivity.d);
                themeActivity.f31858c = ec1Var;
                ec1Var.setDrawDivider(themeActivity.v);
                themeActivity.f31858c.setFocusable(false);
                View view = themeActivity.f31858c;
                view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(148.0f)));
                k5Var = view;
                break;
            case 12:
                fc1 fc1Var = new fc1(context, 0, null);
                fc1Var.setFocusable(false);
                fc1Var.setItemAnimator(null);
                fc1Var.setLayoutAnimation(null);
                fc1Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                fc1Var.setClipToPadding(false);
                s4.c0 c0Var = new s4.c0();
                c0Var.j1(0);
                fc1Var.setLayoutManager(c0Var);
                jc1 jc1Var = new jc1(themeActivity, context);
                fc1Var.setAdapter(jc1Var);
                fc1Var.setOnItemClickListener(new ac1(this, jc1Var, fc1Var, 0));
                fc1Var.setOnItemLongClickListener(new rv0(13, this, jc1Var));
                fc1Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(62.0f)));
                k5Var = fc1Var;
                break;
            case 13:
                k5Var = new xb1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                k5Var = new org.telegram.ui.Cells.s8(context);
                break;
            case 15:
                i15 = ((org.telegram.ui.ActionBar.n2) themeActivity).currentAccount;
                ?? frameLayout3 = new FrameLayout(context);
                Paint paint = new Paint(1);
                frameLayout3.f24648a = paint;
                frameLayout3.f24649b = new Paint(1);
                Paint paint2 = new Paint(1);
                frameLayout3.f24650c = paint2;
                Paint paint3 = new Paint(1);
                frameLayout3.d = paint3;
                frameLayout3.e = new RectF();
                int i22 = 6;
                frameLayout3.h = r14;
                frameLayout3.f24652n = r15;
                frameLayout3.f24653r = new org.telegram.ui.Components.kj0[6];
                frameLayout3.v = new org.telegram.ui.Components.nj0[2];
                float f11 = 1.0f;
                frameLayout3.f24656x = 1.0f;
                String[] strArr = {LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
                int i23 = org.telegram.ui.ActionBar.j6.f19094c9;
                int[] iArr = {i23, i23, i23, i23, org.telegram.ui.ActionBar.j6.Y5, org.telegram.ui.ActionBar.j6.f19112d9};
                Paint.Style style = Paint.Style.STROKE;
                paint.setStyle(style);
                paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
                paint2.setStyle(style);
                Paint.Cap cap = Paint.Cap.ROUND;
                paint2.setStrokeCap(cap);
                paint2.setStrokeWidth(AndroidUtilities.dp(5.0f));
                paint3.setStyle(style);
                paint3.setStrokeCap(cap);
                paint3.setStrokeWidth(AndroidUtilities.dp(2.0f));
                org.telegram.ui.Components.fz0 fz0Var = new org.telegram.ui.Components.fz0(frameLayout3, context);
                frameLayout3.f24651f = fz0Var;
                fz0Var.setMinValue(0);
                fz0Var.setDrawDividers(false);
                boolean isEmpty = MessagesController.getInstance(i15).dialogFilters.isEmpty();
                if (!isEmpty) {
                    i18 = 5;
                }
                fz0Var.setMaxValue(i18);
                if (isEmpty) {
                    i22 = 5;
                }
                fz0Var.setAllItemsCount(i22);
                fz0Var.setWrapSelectorWheel(true);
                fz0Var.setFormatter(new org.telegram.ui.Components.ez0(frameLayout3));
                fz0Var.setOnValueChangedListener(new org.telegram.ui.Components.ez0(frameLayout3));
                fz0Var.setImportantForAccessibility(2);
                fz0Var.setValue(SharedConfig.getChatSwipeAction(i15));
                frameLayout3.addView(fz0Var, w7.y5.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
                frameLayout3.setWillNotDraw(false);
                frameLayout3.f24654s = 0;
                for (int i24 = 0; i24 < 2; i24++) {
                    frameLayout3.v[i24] = new ImageView(context);
                    frameLayout3.addView(frameLayout3.v[i24], w7.y5.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
                }
                org.telegram.ui.Components.kj0 a2 = frameLayout3.a(frameLayout3.f24651f.getValue());
                if (a2 != null) {
                    frameLayout3.v[0].setImageDrawable(a2);
                    a2.M(a2.e[0] - 1);
                }
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout3.v[0], true, 0.5f, false);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout3.v[1], false, 0.5f, false);
                if (frameLayout3.f24651f.getValue() != 5) {
                    f11 = 0.0f;
                }
                frameLayout3.f24655w = f11;
                frameLayout3.F = frameLayout3.f24651f.getValue();
                k5Var = frameLayout3;
                break;
            case 16:
                d5Var = ((org.telegram.ui.ActionBar.n2) themeActivity).parentLayout;
                View jaVar = new org.telegram.ui.Cells.ja(context, d5Var, 0);
                jaVar.setImportantForAccessibility(4);
                k5Var = jaVar;
                break;
            case 17:
                View gvVar = new gv(themeActivity.f31862f, context, themeActivity);
                gvVar.setFocusable(false);
                gvVar.setLayoutParams(new s4.p0(-1, -2));
                k5Var = gvVar;
                break;
            case 19:
                k5Var = new org.telegram.ui.Cells.k6(context, false);
                break;
            case 20:
                i16 = ((org.telegram.ui.ActionBar.n2) themeActivity).currentAccount;
                ?? yl0Var = new org.telegram.ui.Components.yl0(context, null);
                yl0Var.X2 = new ArrayList();
                yl0Var.Z2 = i16;
                yl0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                yl0Var.setFocusable(false);
                yl0Var.setItemAnimator(null);
                yl0Var.setLayoutAnimation(null);
                s4.c0 c0Var2 = new s4.c0(0, false);
                yl0Var.Y2 = c0Var2;
                yl0Var.setLayoutManager(c0Var2);
                yl0Var.setAdapter(new x7(yl0Var, 1));
                yl0Var.i(new ci.r1(yl0Var, 1));
                yl0Var.setOnItemClickListener(new ai.u0(yl0Var, themeActivity, context, 3));
                yl0Var.x1();
                k5Var = yl0Var;
                break;
            case 21:
                i17 = ((org.telegram.ui.ActionBar.n2) themeActivity).currentAccount;
                frameLayout = new hp0(i17, 0L, this.f34185c, themeActivity.getResourceProvider());
                k5Var = frameLayout;
                break;
        }
        return new s4.c1(k5Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        if (c1Var.f42998f == 4) {
            org.telegram.ui.Cells.ka kaVar = (org.telegram.ui.Cells.ka) c1Var.f42995a;
            if (c1Var.b() == org.telegram.ui.ActionBar.j6.f19304o) {
                z10 = true;
            } else {
                z10 = false;
            }
            kaVar.setTypeChecked(z10);
        }
    }
}
