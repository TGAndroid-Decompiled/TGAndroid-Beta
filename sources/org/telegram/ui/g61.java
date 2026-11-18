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
public final class g61 extends org.telegram.ui.Components.bk0 {
    public final Context f47911c;
    public boolean d = true;
    public final ThemeActivity f47912e;

    public g61(ThemeActivity themeActivity, Context context) {
        this.f47912e = themeActivity;
        this.f47911c = context;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        int i7 = f1Var.f59127f;
        if (i7 == 0 || i7 == 1 || i7 == 4 || i7 == 7 || i7 == 10 || i7 == 11 || i7 == 12 || i7 == 14 || i7 == 18 || i7 == 20 || i7 == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f47912e.L0;
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
        ThemeActivity themeActivity = this.f47912e;
        if (i7 != themeActivity.f43833b0 && i7 != themeActivity.L && i7 != themeActivity.f43835c0 && i7 != themeActivity.Z && i7 != themeActivity.Q && i7 != themeActivity.R && i7 != themeActivity.N && i7 != themeActivity.M) {
            if (i7 != themeActivity.f43841g0 && i7 != themeActivity.f43831a0 && i7 != themeActivity.f43860w0 && i7 != themeActivity.C0 && i7 != themeActivity.I0) {
                if (i7 != themeActivity.f43855s0 && i7 != themeActivity.W && i7 != themeActivity.f43836d0 && i7 != themeActivity.P && i7 != themeActivity.f43843i0 && i7 != themeActivity.f43849o0 && i7 != themeActivity.f43846l0 && i7 != themeActivity.K && i7 != themeActivity.K0 && i7 != themeActivity.A0 && i7 != themeActivity.D0 && i7 != themeActivity.E0 && i7 != themeActivity.F0) {
                    if (i7 != themeActivity.S && i7 != themeActivity.T && i7 != themeActivity.U && i7 != themeActivity.V) {
                        if (i7 != themeActivity.X && i7 != themeActivity.f43838e0 && i7 != themeActivity.f43842h0 && i7 != themeActivity.f43863y && i7 != themeActivity.f43844j0 && i7 != themeActivity.f43861x && i7 != themeActivity.m0 && i7 != themeActivity.f43845k0 && i7 != themeActivity.f43857u0 && i7 != themeActivity.f43862x0 && i7 != themeActivity.J0 && i7 != themeActivity.G0 && i7 != themeActivity.H0) {
                            if (i7 == themeActivity.f43840f0) {
                                return 6;
                            }
                            if (i7 != themeActivity.Y && i7 != themeActivity.H && i7 != themeActivity.F) {
                                i10 = themeActivity.raiseToListenRow;
                                if (i7 != i10) {
                                    i11 = themeActivity.pauseOnRecordRow;
                                    if (i7 != i11 && i7 != themeActivity.E && i7 != themeActivity.f43856t0) {
                                        i12 = themeActivity.pauseOnMediaRow;
                                        if (i7 != i12 && i7 != themeActivity.G) {
                                            i13 = themeActivity.sensitiveContentRow;
                                            if (i7 != i13) {
                                                i14 = themeActivity.textSizeRow;
                                                if (i7 == i14) {
                                                    return 8;
                                                }
                                                if (i7 != themeActivity.f43848n0) {
                                                    i15 = themeActivity.nightThemeRow;
                                                    if (i7 != i15) {
                                                        i16 = themeActivity.browserRow;
                                                        if (i7 != i16) {
                                                            if (i7 == themeActivity.f43850p0) {
                                                                return 11;
                                                            }
                                                            if (i7 != themeActivity.f43853r0) {
                                                                i17 = themeActivity.bubbleRadiusRow;
                                                                if (i7 != i17) {
                                                                    i18 = themeActivity.backgroundRow;
                                                                    if (i7 != i18 && i7 != themeActivity.f43865z0) {
                                                                        i19 = themeActivity.createNewThemeRow;
                                                                        if (i7 != i19) {
                                                                            i20 = themeActivity.liteModeRow;
                                                                            if (i7 != i20) {
                                                                                i21 = themeActivity.stickersRow;
                                                                                if (i7 != i21 && i7 != themeActivity.B0) {
                                                                                    if (i7 == themeActivity.f43858v0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i7 == themeActivity.f43864y0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i7 == themeActivity.f43851q0) {
                                                                                        return 17;
                                                                                    }
                                                                                    if (i7 != themeActivity.I && i7 != themeActivity.J) {
                                                                                        i22 = themeActivity.appIconSelectorRow;
                                                                                        if (i7 != i22) {
                                                                                            i23 = themeActivity.changeUserColor;
                                                                                            if (i7 == i23) {
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
    public final void t(v4.f1 f1Var, int i7) {
        int i10;
        int i11;
        String M0;
        String M02;
        boolean z10;
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
        String M03;
        String M04;
        int i23 = f1Var.f59127f;
        View view = f1Var.f59123a;
        ThemeActivity themeActivity = this.f47912e;
        boolean z11 = false;
        boolean z12 = true;
        if (i23 != 1) {
            if (i23 != 2) {
                if (i23 != 4) {
                    if (i23 != 5) {
                        if (i23 != 6) {
                            if (i23 != 7) {
                                if (i23 != 14) {
                                    if (i23 != 17) {
                                        if (i23 != 19) {
                                            if (i23 != 21) {
                                                switch (i23) {
                                                    case 10:
                                                        org.telegram.ui.Cells.j5 j5Var = (org.telegram.ui.Cells.j5) view;
                                                        i21 = themeActivity.nightThemeRow;
                                                        if (i7 != i21) {
                                                            i22 = themeActivity.browserRow;
                                                            if (i7 == i22) {
                                                                j5Var.b(org.telegram.messenger.gd.M0(2131749017, null), org.telegram.messenger.gd.M0(2131749016, null), 2131232031, themeActivity.getMessagesController().S2(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.n6.f29588o != 0) {
                                                            z11 = true;
                                                        }
                                                        if (z11) {
                                                            M03 = org.telegram.ui.ActionBar.n6.C0();
                                                        } else {
                                                            M03 = org.telegram.messenger.gd.M0(2131753781, "AutoNightThemeOff");
                                                        }
                                                        if (z11) {
                                                            int i24 = org.telegram.ui.ActionBar.n6.f29588o;
                                                            if (i24 == 1) {
                                                                M04 = org.telegram.messenger.gd.M0(2131753785, "AutoNightScheduled");
                                                            } else if (i24 == 3) {
                                                                M04 = org.telegram.messenger.gd.M0(2131753784, "AutoNightSystemDefault");
                                                            } else {
                                                                M04 = org.telegram.messenger.gd.M0(2131753794, "AutoNightAdaptive");
                                                            }
                                                            M03 = a8.p0.E(M04, " ", M03);
                                                        }
                                                        j5Var.b(org.telegram.messenger.gd.M0(2131753782, "AutoNightTheme"), M03, 2131231844, z11, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f43834c.A1(themeActivity.f43832b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.ck0 ck0Var = (org.telegram.ui.Components.ck0) view;
                                                        i61 i61Var = (i61) ck0Var.getAdapter();
                                                        i61Var.f();
                                                        int indexOf = i61Var.f48547e.indexOf(i61Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = i61Var.b() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((v4.c0) ck0Var.getLayoutManager()).h1(indexOf, (themeActivity.f43832b.getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((rl0) view).set(themeActivity.getUserConfig().f());
                                            return;
                                        }
                                        org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) view;
                                        if (i7 == themeActivity.I) {
                                            i6Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            i6Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((xt) view).a();
                                    return;
                                }
                                org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) view;
                                n8Var.f31142w = 48;
                                i16 = themeActivity.backgroundRow;
                                if (i7 == i16) {
                                    n8Var.setSubtitle(null);
                                    int i25 = org.telegram.ui.ActionBar.n6.f29634q6;
                                    n8Var.g(i25, i25);
                                    String M05 = org.telegram.messenger.gd.M0(2131752539, null);
                                    i20 = themeActivity.changeUserColor;
                                    if (i20 >= 0) {
                                        z11 = true;
                                    }
                                    n8Var.o(2131232068, M05, z11);
                                    return;
                                } else if (i7 != themeActivity.f43865z0) {
                                    i17 = themeActivity.createNewThemeRow;
                                    if (i7 != i17) {
                                        i18 = themeActivity.liteModeRow;
                                        if (i7 != i18) {
                                            i19 = themeActivity.stickersRow;
                                            if (i7 == i19) {
                                                n8Var.g(org.telegram.ui.ActionBar.n6.J5, org.telegram.ui.ActionBar.n6.G6);
                                                n8Var.o(2131232040, org.telegram.messenger.gd.M0(2131744622, null), true);
                                                n8Var.setSubtitle(org.telegram.messenger.gd.M0(2131744621, null));
                                                n8Var.f31141s = 64;
                                                n8Var.f31142w = 60;
                                                n8Var.f31143x = 20;
                                                return;
                                            } else if (i7 == themeActivity.B0) {
                                                n8Var.g(org.telegram.ui.ActionBar.n6.J5, org.telegram.ui.ActionBar.n6.G6);
                                                n8Var.o(2131232039, org.telegram.messenger.gd.M0(2131745041, null), false);
                                                n8Var.setSubtitle(org.telegram.messenger.gd.M0(2131745042, null));
                                                n8Var.f31141s = 64;
                                                n8Var.f31142w = 60;
                                                n8Var.f31143x = 20;
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        n8Var.g(org.telegram.ui.ActionBar.n6.J5, org.telegram.ui.ActionBar.n6.G6);
                                        n8Var.o(2131232016, org.telegram.messenger.gd.M0(2131748674, null), true);
                                        n8Var.setSubtitle(org.telegram.messenger.gd.M0(2131748673, null));
                                        n8Var.f31142w = 60;
                                        n8Var.f31141s = 64;
                                        n8Var.f31143x = 20;
                                        return;
                                    }
                                    n8Var.setSubtitle(null);
                                    int i26 = org.telegram.ui.ActionBar.n6.f29634q6;
                                    n8Var.g(i26, i26);
                                    n8Var.o(2131232099, org.telegram.messenger.gd.M0(2131751701, null), false);
                                    return;
                                } else {
                                    n8Var.setSubtitle(null);
                                    int i27 = org.telegram.ui.ActionBar.n6.f29634q6;
                                    n8Var.g(i27, i27);
                                    n8Var.o(2131232402, org.telegram.messenger.gd.M0(2131751270, null), true);
                                    return;
                                }
                            }
                            org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                            if (i7 == themeActivity.Y) {
                                s8Var.f(org.telegram.messenger.gd.M0(2131753789, "AutoNightLocation"), org.telegram.ui.ActionBar.n6.f29607p, true);
                                return;
                            } else if (i7 == themeActivity.O) {
                                s8Var.f(org.telegram.messenger.gd.M0(2131751146, "EnableAnimations"), org.telegram.messenger.mp.g1().getBoolean("view_animations", true), true);
                                return;
                            } else if (i7 == themeActivity.H) {
                                s8Var.f(org.telegram.messenger.gd.M0(2131745437, "SendByEnter"), org.telegram.messenger.mp.g1().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i7 != themeActivity.F) {
                                i12 = themeActivity.raiseToListenRow;
                                if (i7 == i12) {
                                    s8Var.g(org.telegram.messenger.gd.M0(2131746232, "RaiseToListen"), org.telegram.messenger.gd.M0(2131746231, "RaiseToListenInfo"), org.telegram.messenger.bz.f23195s0, true, true);
                                    return;
                                } else if (i7 != themeActivity.G) {
                                    i13 = themeActivity.pauseOnRecordRow;
                                    if (i7 != i13) {
                                        i14 = themeActivity.pauseOnMediaRow;
                                        if (i7 == i14) {
                                            s8Var.f(org.telegram.messenger.gd.M0(2131747239, null), org.telegram.messenger.bz.G0, true);
                                            return;
                                        } else if (i7 != themeActivity.E) {
                                            i15 = themeActivity.sensitiveContentRow;
                                            if (i7 == i15) {
                                                s8Var.g(org.telegram.messenger.gd.M0(2131745135, null), org.telegram.messenger.gd.M0(2131745134, null), themeActivity.getMessagesController().e5(), true, true);
                                                return;
                                            } else if (i7 == themeActivity.f43856t0) {
                                                s8Var.f(org.telegram.messenger.gd.M0(2131753673, "BlurInChat"), org.telegram.messenger.bz.f(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            s8Var.g(org.telegram.messenger.gd.M0(2131751427, "DirectShare"), org.telegram.messenger.gd.M0(2131751426, "DirectShareInfo"), org.telegram.messenger.bz.f23209x0, false, true);
                                            return;
                                        }
                                    }
                                    s8Var.g(org.telegram.messenger.gd.M0(2131747238, null), org.telegram.messenger.gd.M0(2131747237, "PauseMusicOnRecordInfo"), org.telegram.messenger.bz.F0, true, true);
                                    return;
                                } else {
                                    s8Var.g(org.telegram.messenger.gd.M0(2131748057, "NextMediaTap"), org.telegram.messenger.gd.M0(2131748056, "NextMediaTapInfo"), org.telegram.messenger.bz.f23198t0, true, true);
                                    return;
                                }
                            } else {
                                s8Var.g(org.telegram.messenger.gd.M0(2131746230, "RaiseToSpeak"), org.telegram.messenger.gd.M0(2131746229, "RaiseToSpeakInfo"), org.telegram.messenger.bz.f23192r0, true, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.j0) view).setProgress(org.telegram.ui.ActionBar.n6.f29627q);
                        return;
                    }
                    org.telegram.ui.Cells.o4 o4Var = (org.telegram.ui.Cells.o4) view;
                    if (i7 == themeActivity.X) {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131753786, "AutoNightSchedule"));
                        return;
                    } else if (i7 == themeActivity.f43838e0) {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131753793, "AutoNightBrightness"));
                        return;
                    } else if (i7 == themeActivity.f43842h0) {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131753787, "AutoNightPreferred"));
                        return;
                    } else if (i7 == themeActivity.f43863y) {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131745788, "SETTINGS"));
                        return;
                    } else if (i7 == themeActivity.f43844j0) {
                        if (themeActivity.f43839f == 3) {
                            o4Var.setText(org.telegram.messenger.gd.M0(2131752828, "BuildMyOwnTheme"));
                            return;
                        } else {
                            o4Var.setText(org.telegram.messenger.gd.M0(2131752000, "ColorTheme"));
                            return;
                        }
                    } else if (i7 == themeActivity.f43861x) {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131743956, "TextSizeHeader"));
                        return;
                    } else if (i7 == themeActivity.m0) {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131752214, "ChatList"));
                        return;
                    } else if (i7 == themeActivity.f43845k0) {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131752829, "BubbleRadius"));
                        return;
                    } else if (i7 == themeActivity.f43857u0) {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131752211, "ChatListSwipeGesture"));
                        return;
                    } else if (i7 == themeActivity.f43862x0) {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131745456, "SelectTheme"));
                        return;
                    } else if (i7 == themeActivity.J0) {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131754238, null));
                        return;
                    } else if (i7 == themeActivity.H0) {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131747572, "OtherSettings"));
                        return;
                    } else if (i7 == themeActivity.G0) {
                        o4Var.setText(org.telegram.messenger.gd.M0(2131748468, "MediaAndSoundSettings"));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
                if (i7 == themeActivity.S) {
                    String M06 = org.telegram.messenger.gd.M0(2131753791, "AutoNightDisabled");
                    if (org.telegram.ui.ActionBar.n6.f29588o == 0) {
                        z11 = true;
                    }
                    caVar.a(M06, z11, true);
                    return;
                } else if (i7 == themeActivity.T) {
                    String M07 = org.telegram.messenger.gd.M0(2131753785, "AutoNightScheduled");
                    if (org.telegram.ui.ActionBar.n6.f29588o == 1) {
                        z11 = true;
                    }
                    caVar.a(M07, z11, true);
                    return;
                } else if (i7 == themeActivity.U) {
                    String M08 = org.telegram.messenger.gd.M0(2131753794, "AutoNightAdaptive");
                    if (org.telegram.ui.ActionBar.n6.f29588o == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (themeActivity.V != -1) {
                        z11 = true;
                    }
                    caVar.a(M08, z10, z11);
                    return;
                } else if (i7 == themeActivity.V) {
                    String M09 = org.telegram.messenger.gd.M0(2131753784, "AutoNightSystemDefault");
                    if (org.telegram.ui.ActionBar.n6.f29588o != 3) {
                        z12 = false;
                    }
                    caVar.a(M09, z12, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
            a9Var.setFixedSize(0);
            if (i7 == themeActivity.f43841g0) {
                a9Var.setText(org.telegram.messenger.gd.a0("AutoNightBrightnessInfo", null, 2131753792, Integer.valueOf((int) (org.telegram.ui.ActionBar.n6.f29627q * 100.0f))));
                return;
            } else if (i7 == themeActivity.f43831a0) {
                a9Var.setText(ThemeActivity.D0());
                return;
            } else if (i7 == themeActivity.f43860w0) {
                a9Var.setText(org.telegram.messenger.gd.M0(2131752210, "ChatListSwipeGestureInfo"));
                return;
            } else if (i7 == themeActivity.I0) {
                a9Var.setText(org.telegram.messenger.gd.M0(2131748673, "LiteModeInfo"));
                return;
            } else {
                a9Var.setFixedSize(12);
                a9Var.setText("");
                return;
            }
        }
        org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
        i10 = themeActivity.nightThemeRow;
        if (i7 == i10) {
            if (org.telegram.ui.ActionBar.n6.f29588o != 0 && org.telegram.ui.ActionBar.n6.J != null) {
                x9Var.c(org.telegram.messenger.gd.M0(2131753782, null), org.telegram.ui.ActionBar.n6.C0(), false, false);
            } else {
                x9Var.c(org.telegram.messenger.gd.M0(2131753782, null), org.telegram.messenger.gd.M0(2131753781, null), false, false);
            }
        } else if (i7 == themeActivity.f43833b0) {
            int i28 = org.telegram.ui.ActionBar.n6.f29646r;
            int i29 = i28 / 60;
            x9Var.c(org.telegram.messenger.gd.M0(2131753790, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i29), Integer.valueOf(i28 - (i29 * 60))), false, true);
        } else if (i7 == themeActivity.f43835c0) {
            int i30 = org.telegram.ui.ActionBar.n6.f29666s;
            int i31 = i30 / 60;
            x9Var.c(org.telegram.messenger.gd.M0(2131753780, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i31), Integer.valueOf(i30 - (i31 * 60))), false, false);
        } else if (i7 == themeActivity.Z) {
            x9Var.c(org.telegram.messenger.gd.M0(2131753779, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.n6.f29741w, false, false);
        } else if (i7 == themeActivity.R) {
            int i32 = org.telegram.messenger.mp.g1().getInt("sortContactsBy", 0);
            if (i32 == 0) {
                M02 = org.telegram.messenger.gd.M0(2131751589, "Default");
            } else if (i32 == 1) {
                M02 = org.telegram.messenger.gd.M0(2131745092, "FirstName");
            } else {
                M02 = org.telegram.messenger.gd.M0(2131745091, "LastName");
            }
            x9Var.c(org.telegram.messenger.gd.M0(2131745096, "SortBy"), M02, false, true);
        } else if (i7 == themeActivity.Q) {
            x9Var.b(org.telegram.messenger.gd.M0(2131749072, "ImportContacts"), true);
        } else if (i7 == themeActivity.L) {
            int i33 = org.telegram.messenger.bz.f23196s1;
            if (i33 == 0) {
                M0 = org.telegram.messenger.gd.M0(2131751355, "DistanceUnitsAutomatic");
            } else if (i33 == 1) {
                M0 = org.telegram.messenger.gd.M0(2131751354, "DistanceUnitsKilometers");
            } else {
                M0 = org.telegram.messenger.gd.M0(2131751353, "DistanceUnitsMiles");
            }
            String M010 = org.telegram.messenger.gd.M0(2131751356, "DistanceUnits");
            boolean z13 = themeActivity.Q0;
            if (themeActivity.F0 < 0) {
                z12 = false;
            }
            x9Var.c(M010, M0, z13, z12);
            themeActivity.Q0 = false;
        } else if (i7 == themeActivity.M) {
            x9Var.c(org.telegram.messenger.gd.M0(2131745604, null), org.telegram.ui.web.e1.a().f53079a, themeActivity.R0, false);
        } else if (i7 == themeActivity.N) {
            String M011 = org.telegram.messenger.gd.M0(2131748247, null);
            if (org.telegram.messenger.bz.f23201u0) {
                i11 = 2131748245;
            } else {
                i11 = 2131748246;
            }
            x9Var.c(M011, org.telegram.messenger.gd.M0(i11, null), themeActivity.P0, false);
            themeActivity.P0 = false;
        }
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        ?? frameLayout;
        int i10;
        int i11;
        float f10;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        f61 j5Var;
        int i14;
        org.telegram.ui.ActionBar.s4 s4Var;
        int i15;
        int i16;
        int i17 = 3;
        float f11 = 21.0f;
        ThemeActivity themeActivity = this.f47912e;
        Context context = this.f47911c;
        switch (i7) {
            case 1:
                j5Var = new org.telegram.ui.Cells.x9(context);
                break;
            case 2:
                j5Var = new org.telegram.ui.Cells.a9(context);
                break;
            case 3:
                j5Var = new org.telegram.ui.Cells.z6(context, (org.telegram.ui.Cells.c0) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f30491a = textView;
                org.telegram.ui.ActionBar.u6.U(textView, org.telegram.ui.ActionBar.n6.G6, null);
                org.telegram.messenger.n10.q(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (org.telegram.messenger.gd.f24213a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
                boolean z12 = org.telegram.messenger.gd.f24213a0;
                if (z12) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                int i18 = i11 | 48;
                if (z12) {
                    f10 = 71.0f;
                } else {
                    f10 = 21.0f;
                }
                if (!z12) {
                    f11 = 23.0f;
                }
                frameLayout.addView(textView, c8.ma.d(-1, -1.0f, i18, f10, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f30492b = imageView;
                org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.Di, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131232757);
                if (!org.telegram.messenger.gd.f24213a0) {
                    i17 = 5;
                }
                frameLayout.addView(imageView, c8.ma.d(19, 14.0f, i17 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                j5Var = frameLayout;
                break;
            case 5:
                j5Var = new org.telegram.ui.Cells.o4(context);
                break;
            case 6:
                j5Var = new c61(this, context);
                break;
            case 7:
                j5Var = new org.telegram.ui.Cells.s8(context);
                break;
            case 8:
                j5Var = new h61(themeActivity, context);
                break;
            case 9:
                frameLayout = new d61(context, 0);
                frameLayout.f46829b = new org.telegram.ui.Cells.x0[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), 0);
                int i19 = 0;
                while (true) {
                    org.telegram.ui.Cells.x0[] x0VarArr = (org.telegram.ui.Cells.x0[]) frameLayout.f46829b;
                    if (i19 >= x0VarArr.length) {
                        j5Var = frameLayout;
                        break;
                    } else {
                        if (i19 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        org.telegram.ui.Cells.x0 x0Var = new org.telegram.ui.Cells.x0(context, 0);
                        x0Var.f32281b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        x0Var.f32283e = textPaint;
                        x0Var.setWillNotDraw(false);
                        x0Var.f32282c = z10;
                        if (z10) {
                            i12 = 2131752212;
                        } else {
                            i12 = 2131752213;
                        }
                        x0Var.setContentDescription(org.telegram.messenger.gd.M0(i12, null));
                        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(x0Var, context);
                        x0Var.d = w0Var;
                        w0Var.setSize(org.telegram.messenger.g0.L(20.0f));
                        x0Var.addView(w0Var, c8.ma.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z10 && org.telegram.messenger.bz.f23187p1) || (!z10 && !org.telegram.messenger.bz.f23187p1)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        w0Var.a(z11, false);
                        x0VarArr[i19] = x0Var;
                        org.telegram.ui.Cells.x0 x0Var2 = ((org.telegram.ui.Cells.x0[]) frameLayout.f46829b)[i19];
                        if (i19 == 1) {
                            i13 = 10;
                        } else {
                            i13 = 0;
                        }
                        frameLayout.addView(x0Var2, c8.ma.m(0.5f, -1, -1, i13, 0, 0));
                        ((org.telegram.ui.Cells.x0[]) frameLayout.f46829b)[i19].setOnClickListener(new fi.v1(3, frameLayout, z10));
                        i19++;
                    }
                }
                break;
            case 10:
                j5Var = new org.telegram.ui.Cells.j5(this.f47911c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                e61 e61Var = new e61(this, this.f47911c, themeActivity, themeActivity.f43839f, themeActivity.f43837e, themeActivity.d);
                themeActivity.f43834c = e61Var;
                e61Var.setDrawDivider(themeActivity.f43859w);
                themeActivity.f43834c.setFocusable(false);
                View view = themeActivity.f43834c;
                view.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(148.0f)));
                j5Var = view;
                break;
            case 12:
                f61 f61Var = new f61(0, context, null);
                f61Var.setFocusable(false);
                f61Var.setItemAnimator(null);
                f61Var.setLayoutAnimation(null);
                f61Var.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
                f61Var.setClipToPadding(false);
                v4.c0 c0Var = new v4.c0();
                c0Var.j1(0);
                f61Var.setLayoutManager(c0Var);
                i61 i61Var = new i61(themeActivity, context);
                f61Var.setAdapter(i61Var);
                f61Var.setOnItemClickListener(new a61(this, i61Var, f61Var, 0));
                f61Var.setOnItemLongClickListener(new aj0(20, this, i61Var));
                f61Var.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(62.0f)));
                j5Var = f61Var;
                break;
            case 13:
                j5Var = new x51(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                j5Var = new org.telegram.ui.Cells.n8(context);
                break;
            case 15:
                i14 = ((org.telegram.ui.ActionBar.h2) themeActivity).currentAccount;
                j5Var = new org.telegram.ui.Components.ex0(context, i14);
                break;
            case 16:
                s4Var = ((org.telegram.ui.ActionBar.h2) themeActivity).parentLayout;
                View am0Var = new am0(context, s4Var, 0);
                am0Var.setImportantForAccessibility(4);
                j5Var = am0Var;
                break;
            case 17:
                View xtVar = new xt(themeActivity.f43839f, context, themeActivity);
                xtVar.setFocusable(false);
                xtVar.setLayoutParams(new v4.q0(-1, -2));
                j5Var = xtVar;
                break;
            case 19:
                j5Var = new org.telegram.ui.Cells.i6(context, false);
                break;
            case 20:
                i15 = ((org.telegram.ui.ActionBar.h2) themeActivity).currentAccount;
                ?? ck0Var = new org.telegram.ui.Components.ck0(context, null);
                ck0Var.f31794f3 = new ArrayList();
                ck0Var.f31796h3 = i15;
                ck0Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                ck0Var.setFocusable(false);
                ck0Var.setItemAnimator(null);
                ck0Var.setLayoutAnimation(null);
                v4.c0 c0Var2 = new v4.c0(0, false);
                ck0Var.f31795g3 = c0Var2;
                ck0Var.setLayoutManager(c0Var2);
                ck0Var.setAdapter(new y7(ck0Var, 1));
                ck0Var.i(new ai.i0(ck0Var, 2));
                ck0Var.setOnItemClickListener(new bi.p1(ck0Var, themeActivity, context, 4));
                ck0Var.z1();
                j5Var = ck0Var;
                break;
            case 21:
                i16 = ((org.telegram.ui.ActionBar.h2) themeActivity).currentAccount;
                frameLayout = new rl0(i16, 0L, this.f47911c, themeActivity.getResourceProvider());
                j5Var = frameLayout;
                break;
        }
        return new v4.f1(j5Var);
    }

    @Override
    public final void y(v4.f1 f1Var) {
        boolean z10;
        if (f1Var.f59127f == 4) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) f1Var.f59123a;
            if (f1Var.b() == org.telegram.ui.ActionBar.n6.f29588o) {
                z10 = true;
            } else {
                z10 = false;
            }
            caVar.setTypeChecked(z10);
        }
    }
}
