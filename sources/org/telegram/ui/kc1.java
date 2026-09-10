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
public final class kc1 extends org.telegram.ui.Components.ul0 {
    public final Context f34333c;
    public boolean d = true;
    public final ThemeActivity e;

    public kc1(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.f34333c = context;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f41613f;
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
        if (i10 != themeActivity.f30662a0 && i10 != themeActivity.K && i10 != themeActivity.f30664b0 && i10 != themeActivity.Y && i10 != themeActivity.P && i10 != themeActivity.Q && i10 != themeActivity.M && i10 != themeActivity.L) {
            if (i10 != themeActivity.f30670f0 && i10 != themeActivity.Z && i10 != themeActivity.f30688v0 && i10 != themeActivity.A0 && i10 != themeActivity.G0) {
                if (i10 != themeActivity.f30683r0 && i10 != themeActivity.V && i10 != themeActivity.f30666c0 && i10 != themeActivity.O && i10 != themeActivity.f30672h0 && i10 != themeActivity.f30678n0 && i10 != themeActivity.f30675k0 && i10 != themeActivity.J && i10 != themeActivity.I0 && i10 != themeActivity.f30695z0 && i10 != themeActivity.B0 && i10 != themeActivity.C0 && i10 != themeActivity.D0) {
                    if (i10 != themeActivity.R && i10 != themeActivity.S && i10 != themeActivity.T && i10 != themeActivity.U) {
                        if (i10 != themeActivity.W && i10 != themeActivity.f30667d0 && i10 != themeActivity.f30671g0 && i10 != themeActivity.f30691x && i10 != themeActivity.f30673i0 && i10 != themeActivity.f30689w && i10 != themeActivity.f30676l0 && i10 != themeActivity.f30674j0 && i10 != themeActivity.f30686t0 && i10 != themeActivity.f30690w0 && i10 != themeActivity.H0 && i10 != themeActivity.E0 && i10 != themeActivity.F0) {
                            if (i10 == themeActivity.f30668e0) {
                                return 6;
                            }
                            if (i10 != themeActivity.X && i10 != themeActivity.G && i10 != themeActivity.E) {
                                i11 = themeActivity.raiseToListenRow;
                                if (i10 != i11) {
                                    i12 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i12 && i10 != themeActivity.f30693y && i10 != themeActivity.f30685s0) {
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
                                                            if (i10 == themeActivity.f30679o0) {
                                                                return 11;
                                                            }
                                                            if (i10 != themeActivity.f30681q0) {
                                                                i18 = themeActivity.bubbleRadiusRow;
                                                                if (i10 != i18) {
                                                                    i19 = themeActivity.backgroundRow;
                                                                    if (i10 != i19 && i10 != themeActivity.f30694y0) {
                                                                        i20 = themeActivity.createNewThemeRow;
                                                                        if (i10 != i20) {
                                                                            i21 = themeActivity.liteModeRow;
                                                                            if (i10 != i21) {
                                                                                i22 = themeActivity.stickersRow;
                                                                                if (i10 != i22) {
                                                                                    if (i10 == themeActivity.f30687u0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i10 == themeActivity.f30692x0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i10 == themeActivity.f30680p0) {
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
        int i24 = c1Var.f41613f;
        View view = c1Var.f41610a;
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
                                                        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                                                        i22 = themeActivity.nightThemeRow;
                                                        if (i10 != i22) {
                                                            i23 = themeActivity.browserRow;
                                                            if (i10 == i23) {
                                                                j5Var.b(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.j6.f18119o != 0) {
                                                            z11 = true;
                                                        }
                                                        if (z11) {
                                                            string3 = org.telegram.ui.ActionBar.j6.z0();
                                                        } else {
                                                            string3 = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                                                        }
                                                        if (z11) {
                                                            int i25 = org.telegram.ui.ActionBar.j6.f18119o;
                                                            if (i25 == 1) {
                                                                string4 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                                                            } else if (i25 == 3) {
                                                                string4 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                                                            } else {
                                                                string4 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                                                            }
                                                            string3 = a4.a.C(string4, " ", string3);
                                                        }
                                                        j5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string3, R.drawable.menu_night_mode_24, z11, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f30665c.w1(themeActivity.f30663b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.vl0 vl0Var = (org.telegram.ui.Components.vl0) view;
                                                        mc1 mc1Var = (mc1) vl0Var.getAdapter();
                                                        mc1Var.l();
                                                        int indexOf = mc1Var.e.indexOf(mc1Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = mc1Var.h() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((s4.c0) vl0Var.getLayoutManager()).h1(indexOf, (themeActivity.f30663b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((fp0) view).set(themeActivity.getUserConfig().getCurrentUser());
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
                                    ((hv) view).b();
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
                                } else if (i10 != themeActivity.f30694y0) {
                                    i18 = themeActivity.createNewThemeRow;
                                    if (i10 != i18) {
                                        i19 = themeActivity.liteModeRow;
                                        if (i10 != i19) {
                                            i20 = themeActivity.stickersRow;
                                            if (i10 == i20) {
                                                s8Var.e(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
                                                s8Var.m(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                                                s8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                                                s8Var.f20043s = 64;
                                                s8Var.v = 60;
                                                s8Var.f20044w = 20;
                                                return;
                                            }
                                            return;
                                        }
                                        s8Var.e(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
                                        s8Var.m(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                                        s8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                                        s8Var.v = 60;
                                        s8Var.f20043s = 64;
                                        s8Var.f20044w = 20;
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
                                x8Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.j6.f18137p, true);
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
                                        } else if (i10 != themeActivity.f30693y) {
                                            i16 = themeActivity.sensitiveContentRow;
                                            if (i10 == i16) {
                                                x8Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                                                return;
                                            } else if (i10 == themeActivity.f30685s0) {
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
                        ((org.telegram.ui.Cells.k0) view).setProgress(org.telegram.ui.ActionBar.j6.f18155q);
                        return;
                    }
                    org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                    if (i10 == themeActivity.W) {
                        m4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                        return;
                    } else if (i10 == themeActivity.f30667d0) {
                        m4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                        return;
                    } else if (i10 == themeActivity.f30671g0) {
                        m4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                        return;
                    } else if (i10 == themeActivity.f30691x) {
                        m4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                        return;
                    } else if (i10 == themeActivity.f30673i0) {
                        if (themeActivity.f30669f == 3) {
                            m4Var.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                            return;
                        } else {
                            m4Var.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                            return;
                        }
                    } else if (i10 == themeActivity.f30689w) {
                        m4Var.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                        return;
                    } else if (i10 == themeActivity.f30676l0) {
                        m4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                        return;
                    } else if (i10 == themeActivity.f30674j0) {
                        m4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                        return;
                    } else if (i10 == themeActivity.f30686t0) {
                        m4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                        return;
                    } else if (i10 == themeActivity.f30690w0) {
                        m4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                        return;
                    } else if (i10 == themeActivity.H0) {
                        m4Var.setText(LocaleController.getString(R.string.AppIcon));
                        return;
                    } else if (i10 == themeActivity.F0) {
                        m4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                        return;
                    } else if (i10 == themeActivity.E0) {
                        m4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) view;
                if (i10 == themeActivity.R) {
                    String string6 = LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled);
                    if (org.telegram.ui.ActionBar.j6.f18119o == 0) {
                        z11 = true;
                    }
                    laVar.a(string6, z11, true);
                    return;
                } else if (i10 == themeActivity.S) {
                    String string7 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                    if (org.telegram.ui.ActionBar.j6.f18119o == 1) {
                        z11 = true;
                    }
                    laVar.a(string7, z11, true);
                    return;
                } else if (i10 == themeActivity.T) {
                    String string8 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                    if (org.telegram.ui.ActionBar.j6.f18119o == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (themeActivity.U != -1) {
                        z11 = true;
                    }
                    laVar.a(string8, z10, z11);
                    return;
                } else if (i10 == themeActivity.U) {
                    String string9 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                    if (org.telegram.ui.ActionBar.j6.f18119o != 3) {
                        z12 = false;
                    }
                    laVar.a(string9, z12, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
            f9Var.setFixedSize(0);
            if (i10 == themeActivity.f30670f0) {
                f9Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.j6.f18155q * 100.0f))));
                return;
            } else if (i10 == themeActivity.Z) {
                f9Var.setText(ThemeActivity.y0());
                return;
            } else if (i10 == themeActivity.f30688v0) {
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
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
        i11 = themeActivity.nightThemeRow;
        if (i10 == i11) {
            if (org.telegram.ui.ActionBar.j6.f18119o != 0 && org.telegram.ui.ActionBar.j6.J != null) {
                gaVar.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.j6.z0(), false, false);
            } else {
                gaVar.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
            }
        } else if (i10 == themeActivity.f30662a0) {
            int i30 = org.telegram.ui.ActionBar.j6.f18173r;
            int i31 = i30 / 60;
            gaVar.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i31), Integer.valueOf(i30 - (i31 * 60))), false, true);
        } else if (i10 == themeActivity.f30664b0) {
            int i32 = org.telegram.ui.ActionBar.j6.f18192s;
            int i33 = i32 / 60;
            gaVar.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i33), Integer.valueOf(i32 - (i33 * 60))), false, false);
        } else if (i10 == themeActivity.Y) {
            gaVar.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.j6.f18264w, false, false);
        } else if (i10 == themeActivity.Q) {
            int i34 = MessagesController.getGlobalMainSettings().getInt("sortContactsBy", 0);
            if (i34 == 0) {
                string2 = LocaleController.getString("Default", R.string.Default);
            } else if (i34 == 1) {
                string2 = LocaleController.getString("FirstName", R.string.SortFirstName);
            } else {
                string2 = LocaleController.getString("LastName", R.string.SortLastName);
            }
            gaVar.c(LocaleController.getString("SortBy", R.string.SortBy), string2, false, true);
        } else if (i10 == themeActivity.P) {
            gaVar.b(LocaleController.getString("ImportContacts", R.string.ImportContacts), true);
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
            gaVar.c(string10, string, z13, z12);
            themeActivity.O0 = false;
        } else if (i10 == themeActivity.L) {
            gaVar.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.o1.a().f38031a, themeActivity.P0, false);
        } else if (i10 == themeActivity.M) {
            String string11 = LocaleController.getString(R.string.MicrophoneForVoiceMessages);
            if (SharedConfig.recordViaSco) {
                i12 = R.string.MicrophoneForVoiceMessagesSco;
            } else {
                i12 = R.string.MicrophoneForVoiceMessagesBuiltIn;
            }
            gaVar.c(string11, LocaleController.getString(i12), themeActivity.N0, false);
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
        ic1 j5Var;
        int i15;
        org.telegram.ui.ActionBar.f5 f5Var;
        int i16;
        int i17;
        int i18 = 4;
        int i19 = 5;
        ThemeActivity themeActivity = this.e;
        Context context = this.f34333c;
        switch (i10) {
            case 1:
                j5Var = new org.telegram.ui.Cells.ga(context);
                break;
            case 2:
                j5Var = new org.telegram.ui.Cells.f9(context);
                break;
            case 3:
                j5Var = new org.telegram.ui.Cells.c7(context, (org.telegram.ui.Cells.r6) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f19502a = textView;
                org.telegram.messenger.em.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
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
                frameLayout.addView(textView, w7.a6.d(-1, -1.0f, i20, f7, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f19503b = imageView;
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Mh, false), PorterDuff.Mode.MULTIPLY));
                imageView.setImageResource(R.drawable.sticker_added);
                if (LocaleController.isRTL) {
                    i19 = 3;
                }
                frameLayout.addView(imageView, w7.a6.d(19, 14.0f, i19 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                j5Var = frameLayout;
                break;
            case 5:
                j5Var = new org.telegram.ui.Cells.m4(context);
                break;
            case 6:
                j5Var = new fc1(this, context);
                break;
            case 7:
                j5Var = new org.telegram.ui.Cells.x8(context);
                break;
            case 8:
                j5Var = new lc1(themeActivity, context);
                break;
            case 9:
                frameLayout = new gc1(context);
                frameLayout.f33059b = new org.telegram.ui.Cells.y0[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i21 = 0;
                while (true) {
                    ?? r32 = (org.telegram.ui.Cells.y0[]) frameLayout.f33059b;
                    if (i21 >= r32.length) {
                        j5Var = frameLayout;
                        break;
                    } else {
                        if (i21 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.f20742c = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.d = textPaint;
                        frameLayout2.setWillNotDraw(false);
                        frameLayout2.f20741b = z10;
                        if (z10) {
                            i13 = R.string.ChatListExpanded;
                        } else {
                            i13 = R.string.ChatListDefault;
                        }
                        frameLayout2.setContentDescription(LocaleController.getString(i13));
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(frameLayout2, context);
                        frameLayout2.f20740a = x0Var;
                        x0Var.setSize(AndroidUtilities.dp(20.0f));
                        frameLayout2.addView(x0Var, w7.a6.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z10 && SharedConfig.useThreeLinesLayout) || (!z10 && !SharedConfig.useThreeLinesLayout)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        x0Var.a(z11, false);
                        r32[i21] = frameLayout2;
                        org.telegram.ui.Cells.y0 y0Var = ((org.telegram.ui.Cells.y0[]) frameLayout.f33059b)[i21];
                        if (i21 == 1) {
                            i14 = 10;
                        } else {
                            i14 = 0;
                        }
                        frameLayout.addView(y0Var, w7.a6.m(0.5f, -1, -1, i14, 0, 0));
                        ((org.telegram.ui.Cells.y0[]) frameLayout.f33059b)[i21].setOnClickListener(new org.telegram.ui.ActionBar.e0(1, frameLayout, z10));
                        i21++;
                    }
                }
                break;
            case 10:
                j5Var = new org.telegram.ui.Cells.j5(21, 60, this.f34333c, null, true);
                break;
            case 11:
                this.d = true;
                hc1 hc1Var = new hc1(this, this.f34333c, themeActivity, themeActivity.f30669f, themeActivity.e, themeActivity.d);
                themeActivity.f30665c = hc1Var;
                hc1Var.setDrawDivider(themeActivity.v);
                themeActivity.f30665c.setFocusable(false);
                View view = themeActivity.f30665c;
                view.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(148.0f)));
                j5Var = view;
                break;
            case 12:
                ic1 ic1Var = new ic1(context, 0, null);
                ic1Var.setFocusable(false);
                ic1Var.setItemAnimator(null);
                ic1Var.setLayoutAnimation(null);
                ic1Var.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                ic1Var.setClipToPadding(false);
                s4.c0 c0Var = new s4.c0();
                c0Var.j1(0);
                ic1Var.setLayoutManager(c0Var);
                mc1 mc1Var = new mc1(themeActivity, context);
                ic1Var.setAdapter(mc1Var);
                ic1Var.setOnItemClickListener(new dc1(this, mc1Var, ic1Var, 0));
                ic1Var.setOnItemLongClickListener(new fz0(8, this, mc1Var));
                ic1Var.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(62.0f)));
                j5Var = ic1Var;
                break;
            case 13:
                j5Var = new ac1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                j5Var = new org.telegram.ui.Cells.s8(context);
                break;
            case 15:
                i15 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                ?? frameLayout3 = new FrameLayout(context);
                Paint paint = new Paint(1);
                frameLayout3.f23098a = paint;
                frameLayout3.f23099b = new Paint(1);
                Paint paint2 = new Paint(1);
                frameLayout3.f23100c = paint2;
                Paint paint3 = new Paint(1);
                frameLayout3.d = paint3;
                frameLayout3.e = new RectF();
                int i22 = 6;
                frameLayout3.h = r14;
                frameLayout3.f23102n = r15;
                frameLayout3.f23103r = new org.telegram.ui.Components.hj0[6];
                frameLayout3.v = new org.telegram.ui.Components.kj0[2];
                float f11 = 1.0f;
                frameLayout3.f23106x = 1.0f;
                String[] strArr = {LocaleController.getString(R.string.SwipeSettingsPin), LocaleController.getString(R.string.SwipeSettingsRead), LocaleController.getString(R.string.SwipeSettingsArchive), LocaleController.getString(R.string.SwipeSettingsMute), LocaleController.getString(R.string.SwipeSettingsDelete), LocaleController.getString(R.string.SwipeSettingsFolders)};
                int i23 = org.telegram.ui.ActionBar.j6.f17913c9;
                int[] iArr = {i23, i23, i23, i23, org.telegram.ui.ActionBar.j6.Y5, org.telegram.ui.ActionBar.j6.f17931d9};
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
                org.telegram.ui.Components.ez0 ez0Var = new org.telegram.ui.Components.ez0(frameLayout3, context);
                frameLayout3.f23101f = ez0Var;
                ez0Var.setMinValue(0);
                ez0Var.setDrawDividers(false);
                boolean isEmpty = MessagesController.getInstance(i15).dialogFilters.isEmpty();
                if (!isEmpty) {
                    i18 = 5;
                }
                ez0Var.setMaxValue(i18);
                if (isEmpty) {
                    i22 = 5;
                }
                ez0Var.setAllItemsCount(i22);
                ez0Var.setWrapSelectorWheel(true);
                ez0Var.setFormatter(new org.telegram.ui.Components.dz0(frameLayout3));
                ez0Var.setOnValueChangedListener(new org.telegram.ui.Components.dz0(frameLayout3));
                ez0Var.setImportantForAccessibility(2);
                ez0Var.setValue(SharedConfig.getChatSwipeAction(i15));
                frameLayout3.addView(ez0Var, w7.a6.d(132, -1.0f, 5, 21.0f, 0.0f, 21.0f, 0.0f));
                frameLayout3.setWillNotDraw(false);
                frameLayout3.f23104s = 0;
                for (int i24 = 0; i24 < 2; i24++) {
                    frameLayout3.v[i24] = new ImageView(context);
                    frameLayout3.addView(frameLayout3.v[i24], w7.a6.d(28, 28.0f, 21, 0.0f, 0.0f, 184.0f, 0.0f));
                }
                org.telegram.ui.Components.hj0 a2 = frameLayout3.a(frameLayout3.f23101f.getValue());
                if (a2 != null) {
                    frameLayout3.v[0].setImageDrawable(a2);
                    a2.M(a2.e[0] - 1);
                }
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout3.v[0], true, 0.5f, false);
                AndroidUtilities.updateViewVisibilityAnimated(frameLayout3.v[1], false, 0.5f, false);
                if (frameLayout3.f23101f.getValue() != 5) {
                    f11 = 0.0f;
                }
                frameLayout3.f23105w = f11;
                frameLayout3.F = frameLayout3.f23101f.getValue();
                j5Var = frameLayout3;
                break;
            case 16:
                f5Var = ((org.telegram.ui.ActionBar.p2) themeActivity).parentLayout;
                View kaVar = new org.telegram.ui.Cells.ka(context, f5Var, 0);
                kaVar.setImportantForAccessibility(4);
                j5Var = kaVar;
                break;
            case 17:
                View hvVar = new hv(themeActivity.f30669f, context, themeActivity);
                hvVar.setFocusable(false);
                hvVar.setLayoutParams(new s4.p0(-1, -2));
                j5Var = hvVar;
                break;
            case 19:
                j5Var = new org.telegram.ui.Cells.k6(context, false);
                break;
            case 20:
                i16 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                ?? vl0Var = new org.telegram.ui.Components.vl0(context, null);
                vl0Var.X2 = new ArrayList();
                vl0Var.Z2 = i16;
                vl0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                vl0Var.setFocusable(false);
                vl0Var.setItemAnimator(null);
                vl0Var.setLayoutAnimation(null);
                s4.c0 c0Var2 = new s4.c0(0, false);
                vl0Var.Y2 = c0Var2;
                vl0Var.setLayoutManager(c0Var2);
                vl0Var.setAdapter(new w7(vl0Var, 1));
                vl0Var.i(new bi.z1(vl0Var, 1));
                vl0Var.setOnItemClickListener(new bi.b9(vl0Var, themeActivity, context, 2));
                vl0Var.v1();
                j5Var = vl0Var;
                break;
            case 21:
                i17 = ((org.telegram.ui.ActionBar.p2) themeActivity).currentAccount;
                frameLayout = new fp0(i17, 0L, this.f34333c, themeActivity.getResourceProvider());
                j5Var = frameLayout;
                break;
        }
        return new s4.c1(j5Var);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        boolean z10;
        if (c1Var.f41613f == 4) {
            org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) c1Var.f41610a;
            if (c1Var.b() == org.telegram.ui.ActionBar.j6.f18119o) {
                z10 = true;
            } else {
                z10 = false;
            }
            laVar.setTypeChecked(z10);
        }
    }
}
