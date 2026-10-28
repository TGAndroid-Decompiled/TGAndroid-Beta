package org.telegram.ui;

import android.content.Context;
import android.graphics.PorterDuff;
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
public final class db1 extends org.telegram.ui.Components.mm0 {
    public final Context f38570c;
    public boolean d = true;
    public final ThemeActivity e;

    public db1(ThemeActivity themeActivity, Context context) {
        this.e = themeActivity;
        this.f38570c = context;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        int i10 = e1Var.f47776f;
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
        if (i10 != themeActivity.f36288a0 && i10 != themeActivity.K && i10 != themeActivity.f36290b0 && i10 != themeActivity.Y && i10 != themeActivity.P && i10 != themeActivity.Q && i10 != themeActivity.M && i10 != themeActivity.L) {
            if (i10 != themeActivity.f36296f0 && i10 != themeActivity.Z && i10 != themeActivity.f36314v0 && i10 != themeActivity.A0 && i10 != themeActivity.G0) {
                if (i10 != themeActivity.f36309r0 && i10 != themeActivity.V && i10 != themeActivity.f36292c0 && i10 != themeActivity.O && i10 != themeActivity.f36298h0 && i10 != themeActivity.f36304n0 && i10 != themeActivity.f36301k0 && i10 != themeActivity.J && i10 != themeActivity.I0 && i10 != themeActivity.f36321z0 && i10 != themeActivity.B0 && i10 != themeActivity.C0 && i10 != themeActivity.D0) {
                    if (i10 != themeActivity.R && i10 != themeActivity.S && i10 != themeActivity.T && i10 != themeActivity.U) {
                        if (i10 != themeActivity.W && i10 != themeActivity.f36293d0 && i10 != themeActivity.f36297g0 && i10 != themeActivity.f36317x && i10 != themeActivity.f36299i0 && i10 != themeActivity.f36315w && i10 != themeActivity.f36302l0 && i10 != themeActivity.f36300j0 && i10 != themeActivity.f36312t0 && i10 != themeActivity.f36316w0 && i10 != themeActivity.H0 && i10 != themeActivity.E0 && i10 != themeActivity.F0) {
                            if (i10 == themeActivity.f36294e0) {
                                return 6;
                            }
                            if (i10 != themeActivity.X && i10 != themeActivity.G && i10 != themeActivity.E) {
                                i11 = themeActivity.raiseToListenRow;
                                if (i10 != i11) {
                                    i12 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i12 && i10 != themeActivity.f36319y && i10 != themeActivity.f36311s0) {
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
                                                            if (i10 == themeActivity.f36305o0) {
                                                                return 11;
                                                            }
                                                            if (i10 != themeActivity.f36307q0) {
                                                                i18 = themeActivity.bubbleRadiusRow;
                                                                if (i10 != i18) {
                                                                    i19 = themeActivity.backgroundRow;
                                                                    if (i10 != i19 && i10 != themeActivity.f36320y0) {
                                                                        i20 = themeActivity.createNewThemeRow;
                                                                        if (i10 != i20) {
                                                                            i21 = themeActivity.liteModeRow;
                                                                            if (i10 != i21) {
                                                                                i22 = themeActivity.stickersRow;
                                                                                if (i10 != i22) {
                                                                                    if (i10 == themeActivity.f36313u0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i10 == themeActivity.f36318x0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i10 == themeActivity.f36306p0) {
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
    public final void v(s4.e1 e1Var, int i10) {
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
        int i24 = e1Var.f47776f;
        View view = e1Var.f47773a;
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
                                                        org.telegram.ui.Cells.n5 n5Var = (org.telegram.ui.Cells.n5) view;
                                                        i22 = themeActivity.nightThemeRow;
                                                        if (i10 != i22) {
                                                            i23 = themeActivity.browserRow;
                                                            if (i10 == i23) {
                                                                n5Var.b(LocaleController.getString(R.string.InappBrowser), LocaleController.getString(R.string.InappBrowserInfo), R.drawable.msg2_language, themeActivity.getMessagesController().isWebBrowserInAppEnabled(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.y6.f23554o != 0) {
                                                            z11 = true;
                                                        }
                                                        if (z11) {
                                                            string3 = org.telegram.ui.ActionBar.y6.B0();
                                                        } else {
                                                            string3 = LocaleController.getString("AutoNightThemeOff", R.string.AutoNightThemeOff);
                                                        }
                                                        if (z11) {
                                                            int i25 = org.telegram.ui.ActionBar.y6.f23554o;
                                                            if (i25 == 1) {
                                                                string4 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                                                            } else if (i25 == 3) {
                                                                string4 = LocaleController.getString("AutoNightSystemDefault", R.string.AutoNightSystemDefault);
                                                            } else {
                                                                string4 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                                                            }
                                                            string3 = a1.g.D(string4, " ", string3);
                                                        }
                                                        n5Var.b(LocaleController.getString("AutoNightTheme", R.string.AutoNightTheme), string3, R.drawable.menu_night_mode_24, z11, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f36291c.D1(themeActivity.f36289b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.nm0 nm0Var = (org.telegram.ui.Components.nm0) view;
                                                        fb1 fb1Var = (fb1) nm0Var.getAdapter();
                                                        fb1Var.l();
                                                        int indexOf = fb1Var.e.indexOf(fb1Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = fb1Var.h() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((s4.c0) nm0Var.getLayoutManager()).h1(indexOf, (themeActivity.f36289b.getMeasuredWidth() / 2) - AndroidUtilities.dp(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((yo0) view).set(themeActivity.getUserConfig().getCurrentUser());
                                            return;
                                        }
                                        org.telegram.ui.Cells.n6 n6Var = (org.telegram.ui.Cells.n6) view;
                                        if (i10 == themeActivity.H) {
                                            n6Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            n6Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((tu) view).a();
                                    return;
                                }
                                org.telegram.ui.Cells.v8 v8Var = (org.telegram.ui.Cells.v8) view;
                                v8Var.v = 48;
                                i17 = themeActivity.backgroundRow;
                                if (i10 == i17) {
                                    v8Var.setSubtitle(null);
                                    int i26 = org.telegram.ui.ActionBar.y6.f23598q6;
                                    v8Var.g(i26, i26);
                                    String string5 = LocaleController.getString(R.string.ChangeChatBackground);
                                    int i27 = R.drawable.msg_background;
                                    i21 = themeActivity.changeUserColor;
                                    if (i21 >= 0) {
                                        z11 = true;
                                    }
                                    v8Var.o(i27, string5, z11);
                                    return;
                                } else if (i10 != themeActivity.f36320y0) {
                                    i18 = themeActivity.createNewThemeRow;
                                    if (i10 != i18) {
                                        i19 = themeActivity.liteModeRow;
                                        if (i10 != i19) {
                                            i20 = themeActivity.stickersRow;
                                            if (i10 == i20) {
                                                v8Var.g(org.telegram.ui.ActionBar.y6.J5, org.telegram.ui.ActionBar.y6.G6);
                                                v8Var.o(R.drawable.msg2_sticker, LocaleController.getString(R.string.StickersName), false);
                                                v8Var.setSubtitle(LocaleController.getString(R.string.StickersNameInfo2));
                                                v8Var.f25601s = 64;
                                                v8Var.v = 60;
                                                v8Var.f25602w = 20;
                                                return;
                                            }
                                            return;
                                        }
                                        v8Var.g(org.telegram.ui.ActionBar.y6.J5, org.telegram.ui.ActionBar.y6.G6);
                                        v8Var.o(R.drawable.msg2_animations, LocaleController.getString(R.string.LiteMode), true);
                                        v8Var.setSubtitle(LocaleController.getString(R.string.LiteModeInfo));
                                        v8Var.v = 60;
                                        v8Var.f25601s = 64;
                                        v8Var.f25602w = 20;
                                        return;
                                    }
                                    v8Var.setSubtitle(null);
                                    int i28 = org.telegram.ui.ActionBar.y6.f23598q6;
                                    v8Var.g(i28, i28);
                                    v8Var.o(R.drawable.msg_colors, LocaleController.getString(R.string.CreateNewTheme), false);
                                    return;
                                } else {
                                    v8Var.setSubtitle(null);
                                    int i29 = org.telegram.ui.ActionBar.y6.f23598q6;
                                    v8Var.g(i29, i29);
                                    v8Var.o(R.drawable.msg_theme, LocaleController.getString(R.string.EditCurrentTheme), true);
                                    return;
                                }
                            }
                            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                            if (i10 == themeActivity.X) {
                                a9Var.f(LocaleController.getString("AutoNightLocation", R.string.AutoNightLocation), org.telegram.ui.ActionBar.y6.f23574p, true);
                                return;
                            } else if (i10 == themeActivity.N) {
                                a9Var.f(LocaleController.getString("EnableAnimations", R.string.EnableAnimations), MessagesController.getGlobalMainSettings().getBoolean("view_animations", true), true);
                                return;
                            } else if (i10 == themeActivity.G) {
                                a9Var.f(LocaleController.getString("SendByEnter", R.string.SendByEnter), MessagesController.getGlobalMainSettings().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i10 != themeActivity.E) {
                                i13 = themeActivity.raiseToListenRow;
                                if (i10 == i13) {
                                    a9Var.g(LocaleController.getString("RaiseToListen", R.string.RaiseToListen), LocaleController.getString("RaiseToListenInfo", R.string.RaiseToListenInfo), SharedConfig.raiseToListen, true, true);
                                    return;
                                } else if (i10 != themeActivity.F) {
                                    i14 = themeActivity.pauseOnRecordRow;
                                    if (i10 != i14) {
                                        i15 = themeActivity.pauseOnMediaRow;
                                        if (i10 == i15) {
                                            a9Var.f(LocaleController.getString(R.string.PauseMusicOnMedia), SharedConfig.pauseMusicOnMedia, true);
                                            return;
                                        } else if (i10 != themeActivity.f36319y) {
                                            i16 = themeActivity.sensitiveContentRow;
                                            if (i10 == i16) {
                                                a9Var.g(LocaleController.getString(R.string.ShowSensitiveContent), LocaleController.getString(R.string.ShowSensitiveContentInfo), themeActivity.getMessagesController().showSensitiveContent(), true, true);
                                                return;
                                            } else if (i10 == themeActivity.f36311s0) {
                                                a9Var.f(LocaleController.getString("BlurInChat", R.string.BlurInChat), SharedConfig.chatBlurEnabled(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            a9Var.g(LocaleController.getString("DirectShare", R.string.DirectShare), LocaleController.getString("DirectShareInfo", R.string.DirectShareInfo), SharedConfig.directShare, false, true);
                                            return;
                                        }
                                    }
                                    a9Var.g(LocaleController.getString(R.string.PauseMusicOnRecord), LocaleController.getString("PauseMusicOnRecordInfo", R.string.PauseMusicOnRecordInfo), SharedConfig.pauseMusicOnRecord, true, true);
                                    return;
                                } else {
                                    a9Var.g(LocaleController.getString("NextMediaTap", R.string.NextMediaTap), LocaleController.getString("NextMediaTapInfo", R.string.NextMediaTapInfo), SharedConfig.nextMediaTap, true, true);
                                    return;
                                }
                            } else {
                                a9Var.g(LocaleController.getString("RaiseToSpeak", R.string.RaiseToSpeak), LocaleController.getString("RaiseToSpeakInfo", R.string.RaiseToSpeakInfo), SharedConfig.raiseToSpeak, true, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.j0) view).setProgress(org.telegram.ui.ActionBar.y6.f23592q);
                        return;
                    }
                    org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
                    if (i10 == themeActivity.W) {
                        q4Var.setText(LocaleController.getString("AutoNightSchedule", R.string.AutoNightSchedule));
                        return;
                    } else if (i10 == themeActivity.f36293d0) {
                        q4Var.setText(LocaleController.getString("AutoNightBrightness", R.string.AutoNightBrightness));
                        return;
                    } else if (i10 == themeActivity.f36297g0) {
                        q4Var.setText(LocaleController.getString("AutoNightPreferred", R.string.AutoNightPreferred));
                        return;
                    } else if (i10 == themeActivity.f36317x) {
                        q4Var.setText(LocaleController.getString("SETTINGS", R.string.SETTINGS));
                        return;
                    } else if (i10 == themeActivity.f36299i0) {
                        if (themeActivity.f36295f == 3) {
                            q4Var.setText(LocaleController.getString("BuildMyOwnTheme", R.string.BuildMyOwnTheme));
                            return;
                        } else {
                            q4Var.setText(LocaleController.getString("ColorTheme", R.string.ColorTheme));
                            return;
                        }
                    } else if (i10 == themeActivity.f36315w) {
                        q4Var.setText(LocaleController.getString("TextSizeHeader", R.string.TextSizeHeader));
                        return;
                    } else if (i10 == themeActivity.f36302l0) {
                        q4Var.setText(LocaleController.getString("ChatList", R.string.ChatList));
                        return;
                    } else if (i10 == themeActivity.f36300j0) {
                        q4Var.setText(LocaleController.getString("BubbleRadius", R.string.BubbleRadius));
                        return;
                    } else if (i10 == themeActivity.f36312t0) {
                        q4Var.setText(LocaleController.getString("ChatListSwipeGesture", R.string.ChatListSwipeGesture));
                        return;
                    } else if (i10 == themeActivity.f36316w0) {
                        q4Var.setText(LocaleController.getString("SelectTheme", R.string.SelectTheme));
                        return;
                    } else if (i10 == themeActivity.H0) {
                        q4Var.setText(LocaleController.getString(R.string.AppIcon));
                        return;
                    } else if (i10 == themeActivity.F0) {
                        q4Var.setText(LocaleController.getString("OtherSettings", R.string.OtherSettings));
                        return;
                    } else if (i10 == themeActivity.E0) {
                        q4Var.setText(LocaleController.getString("MediaAndSoundSettings", R.string.MediaAndSoundSettings));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) view;
                if (i10 == themeActivity.R) {
                    String string6 = LocaleController.getString("AutoNightDisabled", R.string.AutoNightDisabled);
                    if (org.telegram.ui.ActionBar.y6.f23554o == 0) {
                        z11 = true;
                    }
                    laVar.a(string6, z11, true);
                    return;
                } else if (i10 == themeActivity.S) {
                    String string7 = LocaleController.getString("AutoNightScheduled", R.string.AutoNightScheduled);
                    if (org.telegram.ui.ActionBar.y6.f23554o == 1) {
                        z11 = true;
                    }
                    laVar.a(string7, z11, true);
                    return;
                } else if (i10 == themeActivity.T) {
                    String string8 = LocaleController.getString("AutoNightAdaptive", R.string.AutoNightAdaptive);
                    if (org.telegram.ui.ActionBar.y6.f23554o == 2) {
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
                    if (org.telegram.ui.ActionBar.y6.f23554o != 3) {
                        z12 = false;
                    }
                    laVar.a(string9, z12, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.i9 i9Var = (org.telegram.ui.Cells.i9) view;
            i9Var.setFixedSize(0);
            if (i10 == themeActivity.f36296f0) {
                i9Var.setText(LocaleController.formatString("AutoNightBrightnessInfo", R.string.AutoNightBrightnessInfo, Integer.valueOf((int) (org.telegram.ui.ActionBar.y6.f23592q * 100.0f))));
                return;
            } else if (i10 == themeActivity.Z) {
                i9Var.setText(ThemeActivity.z0());
                return;
            } else if (i10 == themeActivity.f36314v0) {
                i9Var.setText(LocaleController.getString("ChatListSwipeGestureInfo", R.string.ChatListSwipeGestureInfo));
                return;
            } else if (i10 == themeActivity.G0) {
                i9Var.setText(LocaleController.getString("LiteModeInfo", R.string.LiteModeInfo));
                return;
            } else {
                i9Var.setFixedSize(12);
                i9Var.setText("");
                return;
            }
        }
        org.telegram.ui.Cells.ga gaVar = (org.telegram.ui.Cells.ga) view;
        i11 = themeActivity.nightThemeRow;
        if (i10 == i11) {
            if (org.telegram.ui.ActionBar.y6.f23554o != 0 && org.telegram.ui.ActionBar.y6.J != null) {
                gaVar.c(LocaleController.getString(R.string.AutoNightTheme), org.telegram.ui.ActionBar.y6.B0(), false, false);
            } else {
                gaVar.c(LocaleController.getString(R.string.AutoNightTheme), LocaleController.getString(R.string.AutoNightThemeOff), false, false);
            }
        } else if (i10 == themeActivity.f36288a0) {
            int i30 = org.telegram.ui.ActionBar.y6.f23609r;
            int i31 = i30 / 60;
            gaVar.c(LocaleController.getString("AutoNightFrom", R.string.AutoNightFrom), String.format("%02d:%02d", Integer.valueOf(i31), Integer.valueOf(i30 - (i31 * 60))), false, true);
        } else if (i10 == themeActivity.f36290b0) {
            int i32 = org.telegram.ui.ActionBar.y6.f23628s;
            int i33 = i32 / 60;
            gaVar.c(LocaleController.getString("AutoNightTo", R.string.AutoNightTo), String.format("%02d:%02d", Integer.valueOf(i33), Integer.valueOf(i32 - (i33 * 60))), false, false);
        } else if (i10 == themeActivity.Y) {
            gaVar.c(LocaleController.getString("AutoNightUpdateLocation", R.string.AutoNightUpdateLocation), org.telegram.ui.ActionBar.y6.f23705w, false, false);
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
            gaVar.c(LocaleController.getString(R.string.SearchEngine), org.telegram.ui.web.n1.a().f44843a, themeActivity.P0, false);
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
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        int i11;
        int i12;
        float f7;
        bb1 bb1Var;
        boolean z10;
        int i13;
        boolean z11;
        int i14;
        int i15;
        org.telegram.ui.ActionBar.j5 j5Var;
        int i16;
        int i17;
        float f10 = 21.0f;
        ThemeActivity themeActivity = this.e;
        Context context = this.f38570c;
        switch (i10) {
            case 1:
                bb1Var = new org.telegram.ui.Cells.ga(context);
                break;
            case 2:
                bb1Var = new org.telegram.ui.Cells.i9(context);
                break;
            case 3:
                bb1Var = new org.telegram.ui.Cells.f7(context, (d3) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f24401a = textView;
                org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.G6, null);
                org.telegram.messenger.wh.r(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                int i18 = 3;
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
                int i19 = i12 | 48;
                if (z12) {
                    f7 = 71.0f;
                } else {
                    f7 = 21.0f;
                }
                if (!z12) {
                    f10 = 23.0f;
                }
                frameLayout.addView(textView, org.telegram.ui.Components.kb1.h(-1, -1.0f, i19, f7, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f24402b = imageView;
                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.Mh, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(R.drawable.sticker_added);
                if (!LocaleController.isRTL) {
                    i18 = 5;
                }
                frameLayout.addView(imageView, org.telegram.ui.Components.kb1.h(19, 14.0f, i18 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                bb1Var = frameLayout;
                break;
            case 5:
                bb1Var = new org.telegram.ui.Cells.q4(context);
                break;
            case 6:
                bb1Var = new ya1(this, context);
                break;
            case 7:
                bb1Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 8:
                bb1Var = new eb1(themeActivity, context);
                break;
            case 9:
                za1 za1Var = new za1(context);
                za1Var.f46212b = new org.telegram.ui.Cells.x0[2];
                za1Var.setOrientation(0);
                za1Var.setPadding(AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(21.0f), 0);
                int i20 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) za1Var.f46212b;
                    if (i20 < x0VarArr.length) {
                        if (i20 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        ?? frameLayout2 = new FrameLayout(context);
                        frameLayout2.f25685c = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        frameLayout2.d = textPaint;
                        frameLayout2.setWillNotDraw(false);
                        frameLayout2.f25684b = z10;
                        if (z10) {
                            i13 = R.string.ChatListExpanded;
                        } else {
                            i13 = R.string.ChatListDefault;
                        }
                        frameLayout2.setContentDescription(LocaleController.getString(i13));
                        textPaint.setTextSize(AndroidUtilities.dp(13.0f));
                        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(frameLayout2, context);
                        frameLayout2.f25683a = w0Var;
                        w0Var.setSize(AndroidUtilities.dp(20.0f));
                        frameLayout2.addView(w0Var, org.telegram.ui.Components.kb1.h(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z10 && SharedConfig.useThreeLinesLayout) || (!z10 && !SharedConfig.useThreeLinesLayout)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        w0Var.a(z11, false);
                        x0VarArr[i20] = frameLayout2;
                        org.telegram.ui.Cells.x0 x0Var = ((org.telegram.ui.Cells.x0[]) za1Var.f46212b)[i20];
                        if (i20 == 1) {
                            i14 = 10;
                        } else {
                            i14 = 0;
                        }
                        za1Var.addView(x0Var, org.telegram.ui.Components.kb1.q(0.5f, -1, -1, i14, 0, 0));
                        ((org.telegram.ui.Cells.x0[]) za1Var.f46212b)[i20].setOnClickListener(new di.g2(3, za1Var, z10));
                        i20++;
                    } else {
                        bb1Var = za1Var;
                        break;
                    }
                }
                break;
            case 10:
                bb1Var = new org.telegram.ui.Cells.n5(21, 60, this.f38570c, null, true);
                break;
            case 11:
                this.d = true;
                ab1 ab1Var = new ab1(this, this.f38570c, themeActivity, themeActivity.f36295f, themeActivity.e, themeActivity.d);
                themeActivity.f36291c = ab1Var;
                ab1Var.setDrawDivider(themeActivity.v);
                themeActivity.f36291c.setFocusable(false);
                View view = themeActivity.f36291c;
                view.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(148.0f)));
                bb1Var = view;
                break;
            case 12:
                bb1 bb1Var2 = new bb1(context, 0, null);
                bb1Var2.setFocusable(false);
                bb1Var2.setItemAnimator(null);
                bb1Var2.setLayoutAnimation(null);
                bb1Var2.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
                bb1Var2.setClipToPadding(false);
                s4.c0 c0Var = new s4.c0();
                c0Var.k1(0);
                bb1Var2.setLayoutManager(c0Var);
                fb1 fb1Var = new fb1(themeActivity, context);
                bb1Var2.setAdapter(fb1Var);
                bb1Var2.setOnItemClickListener(new wa1(this, fb1Var, bb1Var2, 0));
                bb1Var2.setOnItemLongClickListener(new cf0(24, this, fb1Var));
                bb1Var2.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(62.0f)));
                bb1Var = bb1Var2;
                break;
            case 13:
                bb1Var = new ta1(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                bb1Var = new org.telegram.ui.Cells.v8(context);
                break;
            case 15:
                i15 = ((org.telegram.ui.ActionBar.r2) themeActivity).currentAccount;
                bb1Var = new org.telegram.ui.Components.a01(context, i15);
                break;
            case 16:
                j5Var = ((org.telegram.ui.ActionBar.r2) themeActivity).parentLayout;
                View kaVar = new org.telegram.ui.Cells.ka(context, j5Var, 0);
                kaVar.setImportantForAccessibility(4);
                bb1Var = kaVar;
                break;
            case 17:
                View tuVar = new tu(themeActivity.f36295f, context, themeActivity);
                tuVar.setFocusable(false);
                tuVar.setLayoutParams(new s4.q0(-1, -2));
                bb1Var = tuVar;
                break;
            case 19:
                bb1Var = new org.telegram.ui.Cells.n6(context, false);
                break;
            case 20:
                i16 = ((org.telegram.ui.ActionBar.r2) themeActivity).currentAccount;
                ?? nm0Var = new org.telegram.ui.Components.nm0(context, null);
                nm0Var.f25424f3 = new ArrayList();
                nm0Var.f25426h3 = i16;
                nm0Var.setPadding(0, AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f));
                nm0Var.setFocusable(false);
                nm0Var.setItemAnimator(null);
                nm0Var.setLayoutAnimation(null);
                s4.c0 c0Var2 = new s4.c0(0, false);
                nm0Var.f25425g3 = c0Var2;
                nm0Var.setLayoutManager(c0Var2);
                nm0Var.setAdapter(new c8(nm0Var, 1));
                nm0Var.i(new fi.p1(nm0Var, 1));
                nm0Var.setOnItemClickListener(new di.g0(nm0Var, themeActivity, context, 3));
                nm0Var.C1();
                bb1Var = nm0Var;
                break;
            case 21:
                i17 = ((org.telegram.ui.ActionBar.r2) themeActivity).currentAccount;
                bb1Var = new yo0(i17, 0L, this.f38570c, themeActivity.getResourceProvider());
                break;
        }
        return new s4.e1(bb1Var);
    }

    @Override
    public final void y(s4.e1 e1Var) {
        boolean z10;
        if (e1Var.f47776f == 4) {
            org.telegram.ui.Cells.la laVar = (org.telegram.ui.Cells.la) e1Var.f47773a;
            if (e1Var.b() == org.telegram.ui.ActionBar.y6.f23554o) {
                z10 = true;
            } else {
                z10 = false;
            }
            laVar.setTypeChecked(z10);
        }
    }
}
