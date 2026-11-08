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
public final class f61 extends org.telegram.ui.Components.oj0 {
    public final Context f45465c;
    public boolean d = true;
    public final ThemeActivity f45466e;

    public f61(ThemeActivity themeActivity, Context context) {
        this.f45466e = themeActivity;
        this.f45465c = context;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        int i7 = d1Var.f57048f;
        if (i7 == 0 || i7 == 1 || i7 == 4 || i7 == 7 || i7 == 10 || i7 == 11 || i7 == 12 || i7 == 14 || i7 == 18 || i7 == 20 || i7 == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f45466e.J0;
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
        ThemeActivity themeActivity = this.f45466e;
        if (i7 != themeActivity.f42012a0 && i7 != themeActivity.K && i7 != themeActivity.f42014b0 && i7 != themeActivity.Y && i7 != themeActivity.P && i7 != themeActivity.Q && i7 != themeActivity.M && i7 != themeActivity.L) {
            if (i7 != themeActivity.f42021f0 && i7 != themeActivity.Z && i7 != themeActivity.f42039v0 && i7 != themeActivity.A0 && i7 != themeActivity.G0) {
                if (i7 != themeActivity.f42034r0 && i7 != themeActivity.V && i7 != themeActivity.f42016c0 && i7 != themeActivity.O && i7 != themeActivity.f42023h0 && i7 != themeActivity.f42029n0 && i7 != themeActivity.f42026k0 && i7 != themeActivity.J && i7 != themeActivity.I0 && i7 != themeActivity.f42046z0 && i7 != themeActivity.B0 && i7 != themeActivity.C0 && i7 != themeActivity.D0) {
                    if (i7 != themeActivity.R && i7 != themeActivity.S && i7 != themeActivity.T && i7 != themeActivity.U) {
                        if (i7 != themeActivity.W && i7 != themeActivity.f42017d0 && i7 != themeActivity.f42022g0 && i7 != themeActivity.f42044y && i7 != themeActivity.f42024i0 && i7 != themeActivity.f42042x && i7 != themeActivity.f42027l0 && i7 != themeActivity.f42025j0 && i7 != themeActivity.f42037t0 && i7 != themeActivity.f42041w0 && i7 != themeActivity.H0 && i7 != themeActivity.E0 && i7 != themeActivity.F0) {
                            if (i7 == themeActivity.f42019e0) {
                                return 6;
                            }
                            if (i7 != themeActivity.X && i7 != themeActivity.G && i7 != themeActivity.E) {
                                i10 = themeActivity.raiseToListenRow;
                                if (i7 != i10) {
                                    i11 = themeActivity.pauseOnRecordRow;
                                    if (i7 != i11 && i7 != themeActivity.D && i7 != themeActivity.f42036s0) {
                                        i12 = themeActivity.pauseOnMediaRow;
                                        if (i7 != i12 && i7 != themeActivity.F) {
                                            i13 = themeActivity.sensitiveContentRow;
                                            if (i7 != i13) {
                                                i14 = themeActivity.textSizeRow;
                                                if (i7 == i14) {
                                                    return 8;
                                                }
                                                if (i7 != themeActivity.m0) {
                                                    i15 = themeActivity.nightThemeRow;
                                                    if (i7 != i15) {
                                                        i16 = themeActivity.browserRow;
                                                        if (i7 != i16) {
                                                            if (i7 == themeActivity.f42030o0) {
                                                                return 11;
                                                            }
                                                            if (i7 != themeActivity.f42032q0) {
                                                                i17 = themeActivity.bubbleRadiusRow;
                                                                if (i7 != i17) {
                                                                    i18 = themeActivity.backgroundRow;
                                                                    if (i7 != i18 && i7 != themeActivity.f42045y0) {
                                                                        i19 = themeActivity.createNewThemeRow;
                                                                        if (i7 != i19) {
                                                                            i20 = themeActivity.liteModeRow;
                                                                            if (i7 != i20) {
                                                                                i21 = themeActivity.stickersRow;
                                                                                if (i7 != i21) {
                                                                                    if (i7 == themeActivity.f42038u0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i7 == themeActivity.f42043x0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i7 == themeActivity.f42031p0) {
                                                                                        return 17;
                                                                                    }
                                                                                    if (i7 != themeActivity.H && i7 != themeActivity.I) {
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
    public final void t(v4.d1 d1Var, int i7) {
        int i10;
        int i11;
        String M0;
        String M02;
        boolean z9;
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
        int i23 = d1Var.f57048f;
        View view = d1Var.f57044a;
        ThemeActivity themeActivity = this.f45466e;
        boolean z10 = false;
        boolean z11 = true;
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
                                                        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                                                        i21 = themeActivity.nightThemeRow;
                                                        if (i7 != i21) {
                                                            i22 = themeActivity.browserRow;
                                                            if (i7 == i22) {
                                                                h5Var.b(org.telegram.messenger.id.M0(2131749210, null), org.telegram.messenger.id.M0(2131749209, null), 2131232030, themeActivity.getMessagesController().M2(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.k6.f28046o != 0) {
                                                            z10 = true;
                                                        }
                                                        if (z10) {
                                                            M03 = org.telegram.ui.ActionBar.k6.C0();
                                                        } else {
                                                            M03 = org.telegram.messenger.id.M0(2131753783, "AutoNightThemeOff");
                                                        }
                                                        if (z10) {
                                                            int i24 = org.telegram.ui.ActionBar.k6.f28046o;
                                                            if (i24 == 1) {
                                                                M04 = org.telegram.messenger.id.M0(2131753787, "AutoNightScheduled");
                                                            } else if (i24 == 3) {
                                                                M04 = org.telegram.messenger.id.M0(2131753786, "AutoNightSystemDefault");
                                                            } else {
                                                                M04 = org.telegram.messenger.id.M0(2131753796, "AutoNightAdaptive");
                                                            }
                                                            M03 = a8.p0.D(M04, " ", M03);
                                                        }
                                                        h5Var.b(org.telegram.messenger.id.M0(2131753784, "AutoNightTheme"), M03, 2131231843, z10, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f42015c.A1(themeActivity.f42013b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.pj0 pj0Var = (org.telegram.ui.Components.pj0) view;
                                                        h61 h61Var = (h61) pj0Var.getAdapter();
                                                        h61Var.f();
                                                        int indexOf = h61Var.f46229e.indexOf(h61Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = h61Var.b() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((v4.b0) pj0Var.getLayoutManager()).h1(indexOf, (themeActivity.f42013b.getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((nl0) view).set(themeActivity.getUserConfig().f());
                                            return;
                                        }
                                        org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) view;
                                        if (i7 == themeActivity.H) {
                                            h6Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            h6Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((tt) view).a();
                                    return;
                                }
                                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                                m8Var.f29575w = 48;
                                i16 = themeActivity.backgroundRow;
                                if (i7 == i16) {
                                    m8Var.setSubtitle(null);
                                    int i25 = org.telegram.ui.ActionBar.k6.f28092q6;
                                    m8Var.g(i25, i25);
                                    String M05 = org.telegram.messenger.id.M0(2131752550, null);
                                    i20 = themeActivity.changeUserColor;
                                    if (i20 >= 0) {
                                        z10 = true;
                                    }
                                    m8Var.o(2131232066, M05, z10);
                                    return;
                                } else if (i7 != themeActivity.f42045y0) {
                                    i17 = themeActivity.createNewThemeRow;
                                    if (i7 != i17) {
                                        i18 = themeActivity.liteModeRow;
                                        if (i7 != i18) {
                                            i19 = themeActivity.stickersRow;
                                            if (i7 == i19) {
                                                m8Var.g(org.telegram.ui.ActionBar.k6.J5, org.telegram.ui.ActionBar.k6.G6);
                                                m8Var.o(2131232038, org.telegram.messenger.id.M0(2131744860, null), false);
                                                m8Var.setSubtitle(org.telegram.messenger.id.M0(2131744859, null));
                                                m8Var.f29574s = 64;
                                                m8Var.f29575w = 60;
                                                m8Var.f29576x = 20;
                                                return;
                                            }
                                            return;
                                        }
                                        m8Var.g(org.telegram.ui.ActionBar.k6.J5, org.telegram.ui.ActionBar.k6.G6);
                                        m8Var.o(2131232015, org.telegram.messenger.id.M0(2131748867, null), true);
                                        m8Var.setSubtitle(org.telegram.messenger.id.M0(2131748866, null));
                                        m8Var.f29575w = 60;
                                        m8Var.f29574s = 64;
                                        m8Var.f29576x = 20;
                                        return;
                                    }
                                    m8Var.setSubtitle(null);
                                    int i26 = org.telegram.ui.ActionBar.k6.f28092q6;
                                    m8Var.g(i26, i26);
                                    m8Var.o(2131232097, org.telegram.messenger.id.M0(2131751713, null), false);
                                    return;
                                } else {
                                    m8Var.setSubtitle(null);
                                    int i27 = org.telegram.ui.ActionBar.k6.f28092q6;
                                    m8Var.g(i27, i27);
                                    m8Var.o(2131232400, org.telegram.messenger.id.M0(2131751282, null), true);
                                    return;
                                }
                            }
                            org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                            if (i7 == themeActivity.X) {
                                r8Var.f(org.telegram.messenger.id.M0(2131753791, "AutoNightLocation"), org.telegram.ui.ActionBar.k6.f28065p, true);
                                return;
                            } else if (i7 == themeActivity.N) {
                                r8Var.f(org.telegram.messenger.id.M0(2131751158, "EnableAnimations"), org.telegram.messenger.qp.e1().getBoolean("view_animations", true), true);
                                return;
                            } else if (i7 == themeActivity.G) {
                                r8Var.f(org.telegram.messenger.id.M0(2131745635, "SendByEnter"), org.telegram.messenger.qp.e1().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i7 != themeActivity.E) {
                                i12 = themeActivity.raiseToListenRow;
                                if (i7 == i12) {
                                    r8Var.g(org.telegram.messenger.id.M0(2131746428, "RaiseToListen"), org.telegram.messenger.id.M0(2131746427, "RaiseToListenInfo"), org.telegram.messenger.iz.f23435s0, true, true);
                                    return;
                                } else if (i7 != themeActivity.F) {
                                    i13 = themeActivity.pauseOnRecordRow;
                                    if (i7 != i13) {
                                        i14 = themeActivity.pauseOnMediaRow;
                                        if (i7 == i14) {
                                            r8Var.f(org.telegram.messenger.id.M0(2131747433, null), org.telegram.messenger.iz.G0, true);
                                            return;
                                        } else if (i7 != themeActivity.D) {
                                            i15 = themeActivity.sensitiveContentRow;
                                            if (i7 == i15) {
                                                r8Var.g(org.telegram.messenger.id.M0(2131745333, null), org.telegram.messenger.id.M0(2131745332, null), themeActivity.getMessagesController().S4(), true, true);
                                                return;
                                            } else if (i7 == themeActivity.f42036s0) {
                                                r8Var.f(org.telegram.messenger.id.M0(2131753675, "BlurInChat"), org.telegram.messenger.iz.f(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            r8Var.g(org.telegram.messenger.id.M0(2131751439, "DirectShare"), org.telegram.messenger.id.M0(2131751438, "DirectShareInfo"), org.telegram.messenger.iz.f23449x0, false, true);
                                            return;
                                        }
                                    }
                                    r8Var.g(org.telegram.messenger.id.M0(2131747432, null), org.telegram.messenger.id.M0(2131747431, "PauseMusicOnRecordInfo"), org.telegram.messenger.iz.F0, true, true);
                                    return;
                                } else {
                                    r8Var.g(org.telegram.messenger.id.M0(2131748250, "NextMediaTap"), org.telegram.messenger.id.M0(2131748249, "NextMediaTapInfo"), org.telegram.messenger.iz.f23438t0, true, true);
                                    return;
                                }
                            } else {
                                r8Var.g(org.telegram.messenger.id.M0(2131746426, "RaiseToSpeak"), org.telegram.messenger.id.M0(2131746425, "RaiseToSpeakInfo"), org.telegram.messenger.iz.f23432r0, true, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.i0) view).setProgress(org.telegram.ui.ActionBar.k6.f28085q);
                        return;
                    }
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (i7 == themeActivity.W) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131753788, "AutoNightSchedule"));
                        return;
                    } else if (i7 == themeActivity.f42017d0) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131753795, "AutoNightBrightness"));
                        return;
                    } else if (i7 == themeActivity.f42022g0) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131753789, "AutoNightPreferred"));
                        return;
                    } else if (i7 == themeActivity.f42044y) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131745986, "SETTINGS"));
                        return;
                    } else if (i7 == themeActivity.f42024i0) {
                        if (themeActivity.f42020f == 3) {
                            n4Var.setText(org.telegram.messenger.id.M0(2131752839, "BuildMyOwnTheme"));
                            return;
                        } else {
                            n4Var.setText(org.telegram.messenger.id.M0(2131752011, "ColorTheme"));
                            return;
                        }
                    } else if (i7 == themeActivity.f42042x) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131744194, "TextSizeHeader"));
                        return;
                    } else if (i7 == themeActivity.f42027l0) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131752225, "ChatList"));
                        return;
                    } else if (i7 == themeActivity.f42025j0) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131752840, "BubbleRadius"));
                        return;
                    } else if (i7 == themeActivity.f42037t0) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131752222, "ChatListSwipeGesture"));
                        return;
                    } else if (i7 == themeActivity.f42041w0) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131745654, "SelectTheme"));
                        return;
                    } else if (i7 == themeActivity.H0) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131754240, null));
                        return;
                    } else if (i7 == themeActivity.F0) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131747766, "OtherSettings"));
                        return;
                    } else if (i7 == themeActivity.E0) {
                        n4Var.setText(org.telegram.messenger.id.M0(2131748661, "MediaAndSoundSettings"));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                if (i7 == themeActivity.R) {
                    String M06 = org.telegram.messenger.id.M0(2131753793, "AutoNightDisabled");
                    if (org.telegram.ui.ActionBar.k6.f28046o == 0) {
                        z10 = true;
                    }
                    aaVar.a(M06, z10, true);
                    return;
                } else if (i7 == themeActivity.S) {
                    String M07 = org.telegram.messenger.id.M0(2131753787, "AutoNightScheduled");
                    if (org.telegram.ui.ActionBar.k6.f28046o == 1) {
                        z10 = true;
                    }
                    aaVar.a(M07, z10, true);
                    return;
                } else if (i7 == themeActivity.T) {
                    String M08 = org.telegram.messenger.id.M0(2131753796, "AutoNightAdaptive");
                    if (org.telegram.ui.ActionBar.k6.f28046o == 2) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (themeActivity.U != -1) {
                        z10 = true;
                    }
                    aaVar.a(M08, z9, z10);
                    return;
                } else if (i7 == themeActivity.U) {
                    String M09 = org.telegram.messenger.id.M0(2131753786, "AutoNightSystemDefault");
                    if (org.telegram.ui.ActionBar.k6.f28046o != 3) {
                        z11 = false;
                    }
                    aaVar.a(M09, z11, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.z8 z8Var = (org.telegram.ui.Cells.z8) view;
            z8Var.setFixedSize(0);
            if (i7 == themeActivity.f42021f0) {
                z8Var.setText(org.telegram.messenger.id.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (org.telegram.ui.ActionBar.k6.f28085q * 100.0f))));
                return;
            } else if (i7 == themeActivity.Z) {
                z8Var.setText(ThemeActivity.D0());
                return;
            } else if (i7 == themeActivity.f42039v0) {
                z8Var.setText(org.telegram.messenger.id.M0(2131752221, "ChatListSwipeGestureInfo"));
                return;
            } else if (i7 == themeActivity.G0) {
                z8Var.setText(org.telegram.messenger.id.M0(2131748866, "LiteModeInfo"));
                return;
            } else {
                z8Var.setFixedSize(12);
                z8Var.setText("");
                return;
            }
        }
        org.telegram.ui.Cells.w9 w9Var = (org.telegram.ui.Cells.w9) view;
        i10 = themeActivity.nightThemeRow;
        if (i7 == i10) {
            if (org.telegram.ui.ActionBar.k6.f28046o != 0 && org.telegram.ui.ActionBar.k6.J != null) {
                w9Var.c(org.telegram.messenger.id.M0(2131753784, null), org.telegram.ui.ActionBar.k6.C0(), false, false);
            } else {
                w9Var.c(org.telegram.messenger.id.M0(2131753784, null), org.telegram.messenger.id.M0(2131753783, null), false, false);
            }
        } else if (i7 == themeActivity.f42012a0) {
            int i28 = org.telegram.ui.ActionBar.k6.f28104r;
            int i29 = i28 / 60;
            w9Var.c(org.telegram.messenger.id.M0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i29), Integer.valueOf(i28 - (i29 * 60))), false, true);
        } else if (i7 == themeActivity.f42014b0) {
            int i30 = org.telegram.ui.ActionBar.k6.f28124s;
            int i31 = i30 / 60;
            w9Var.c(org.telegram.messenger.id.M0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i31), Integer.valueOf(i30 - (i31 * 60))), false, false);
        } else if (i7 == themeActivity.Y) {
            w9Var.c(org.telegram.messenger.id.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.k6.f28199w, false, false);
        } else if (i7 == themeActivity.Q) {
            int i32 = org.telegram.messenger.qp.e1().getInt("sortContactsBy", 0);
            if (i32 == 0) {
                M02 = org.telegram.messenger.id.M0(2131751601, "Default");
            } else if (i32 == 1) {
                M02 = org.telegram.messenger.id.M0(2131745290, "FirstName");
            } else {
                M02 = org.telegram.messenger.id.M0(2131745289, "LastName");
            }
            w9Var.c(org.telegram.messenger.id.M0(2131745294, "SortBy"), M02, false, true);
        } else if (i7 == themeActivity.P) {
            w9Var.b(org.telegram.messenger.id.M0(2131749265, "ImportContacts"), true);
        } else if (i7 == themeActivity.K) {
            int i33 = org.telegram.messenger.iz.f23436s1;
            if (i33 == 0) {
                M0 = org.telegram.messenger.id.M0(2131751367, "DistanceUnitsAutomatic");
            } else if (i33 == 1) {
                M0 = org.telegram.messenger.id.M0(2131751366, "DistanceUnitsKilometers");
            } else {
                M0 = org.telegram.messenger.id.M0(2131751365, "DistanceUnitsMiles");
            }
            String M010 = org.telegram.messenger.id.M0(2131751368, "DistanceUnits");
            boolean z12 = themeActivity.O0;
            if (themeActivity.D0 < 0) {
                z11 = false;
            }
            w9Var.c(M010, M0, z12, z11);
            themeActivity.O0 = false;
        } else if (i7 == themeActivity.L) {
            w9Var.c(org.telegram.messenger.id.M0(2131745802, null), org.telegram.ui.web.f1.a().f51129a, themeActivity.P0, false);
        } else if (i7 == themeActivity.M) {
            String M011 = org.telegram.messenger.id.M0(2131748440, null);
            if (org.telegram.messenger.iz.f23441u0) {
                i11 = 2131748438;
            } else {
                i11 = 2131748439;
            }
            w9Var.c(M011, org.telegram.messenger.id.M0(i11, null), themeActivity.N0, false);
            themeActivity.N0 = false;
        }
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        ?? frameLayout;
        int i10;
        int i11;
        float f10;
        e61 e61Var;
        boolean z9;
        int i12;
        boolean z10;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.q4 q4Var;
        int i15;
        int i16;
        int i17 = 3;
        float f11 = 21.0f;
        ThemeActivity themeActivity = this.f45466e;
        Context context = this.f45465c;
        switch (i7) {
            case 1:
                e61Var = new org.telegram.ui.Cells.w9(context);
                break;
            case 2:
                e61Var = new org.telegram.ui.Cells.z8(context);
                break;
            case 3:
                e61Var = new org.telegram.ui.Cells.y6(context, (org.telegram.ui.Cells.f1) null);
                break;
            case 4:
                frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f28904a = textView;
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.G6, null);
                org.telegram.messenger.camera.q.n(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (org.telegram.messenger.id.f23157a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
                boolean z11 = org.telegram.messenger.id.f23157a0;
                if (z11) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                int i18 = i11 | 48;
                if (z11) {
                    f10 = 71.0f;
                } else {
                    f10 = 21.0f;
                }
                if (!z11) {
                    f11 = 23.0f;
                }
                frameLayout.addView(textView, c8.ha.d(-1, -1.0f, i18, f10, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f28905b = imageView;
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ai, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131232755);
                if (!org.telegram.messenger.id.f23157a0) {
                    i17 = 5;
                }
                frameLayout.addView(imageView, c8.ha.d(19, 14.0f, i17 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                e61Var = frameLayout;
                break;
            case 5:
                e61Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 6:
                e61Var = new b61(this, context);
                break;
            case 7:
                e61Var = new org.telegram.ui.Cells.r8(context);
                break;
            case 8:
                e61Var = new g61(themeActivity, context);
                break;
            case 9:
                frameLayout = new c61(context, 0);
                frameLayout.f44708b = new org.telegram.ui.Cells.v0[2];
                frameLayout.setOrientation(0);
                frameLayout.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), 0);
                int i19 = 0;
                while (true) {
                    org.telegram.ui.Cells.v0[] v0VarArr = (org.telegram.ui.Cells.v0[]) frameLayout.f44708b;
                    if (i19 < v0VarArr.length) {
                        if (i19 == 1) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, 0);
                        v0Var.f30613b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        v0Var.f30615e = textPaint;
                        v0Var.setWillNotDraw(false);
                        v0Var.f30614c = z9;
                        if (z9) {
                            i12 = 2131752223;
                        } else {
                            i12 = 2131752224;
                        }
                        v0Var.setContentDescription(org.telegram.messenger.id.M0(i12, null));
                        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                        org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(v0Var, context);
                        v0Var.d = u0Var;
                        u0Var.setSize(org.telegram.messenger.g0.L(20.0f));
                        v0Var.addView(u0Var, c8.ha.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z9 && org.telegram.messenger.iz.f23427p1) || (!z9 && !org.telegram.messenger.iz.f23427p1)) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        u0Var.a(z10, false);
                        v0VarArr[i19] = v0Var;
                        org.telegram.ui.Cells.v0 v0Var2 = ((org.telegram.ui.Cells.v0[]) frameLayout.f44708b)[i19];
                        if (i19 == 1) {
                            i13 = 10;
                        } else {
                            i13 = 0;
                        }
                        frameLayout.addView(v0Var2, c8.ha.m(0.5f, -1, -1, i13, 0, 0));
                        ((org.telegram.ui.Cells.v0[]) frameLayout.f44708b)[i19].setOnClickListener(new di.a2(3, frameLayout, z9));
                        i19++;
                    } else {
                        e61Var = frameLayout;
                        break;
                    }
                }
                break;
            case 10:
                e61Var = new org.telegram.ui.Cells.h5(this.f45465c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                d61 d61Var = new d61(this, this.f45465c, themeActivity, themeActivity.f42020f, themeActivity.f42018e, themeActivity.d);
                themeActivity.f42015c = d61Var;
                d61Var.setDrawDivider(themeActivity.f42040w);
                themeActivity.f42015c.setFocusable(false);
                View view = themeActivity.f42015c;
                view.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(148.0f)));
                e61Var = view;
                break;
            case 12:
                e61 e61Var2 = new e61(0, context, null);
                e61Var2.setFocusable(false);
                e61Var2.setItemAnimator(null);
                e61Var2.setLayoutAnimation(null);
                e61Var2.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
                e61Var2.setClipToPadding(false);
                v4.b0 b0Var = new v4.b0();
                b0Var.j1(0);
                e61Var2.setLayoutManager(b0Var);
                h61 h61Var = new h61(themeActivity, context);
                e61Var2.setAdapter(h61Var);
                e61Var2.setOnItemClickListener(new z51(this, h61Var, e61Var2, 0));
                e61Var2.setOnItemLongClickListener(new lk0(17, this, h61Var));
                e61Var2.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(62.0f)));
                e61Var = e61Var2;
                break;
            case 13:
                e61Var = new w51(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                e61Var = new org.telegram.ui.Cells.m8(context);
                break;
            case 15:
                i14 = ((org.telegram.ui.ActionBar.f2) themeActivity).currentAccount;
                e61Var = new org.telegram.ui.Components.uw0(context, i14);
                break;
            case 16:
                q4Var = ((org.telegram.ui.ActionBar.f2) themeActivity).parentLayout;
                View wl0Var = new wl0(context, q4Var, 0);
                wl0Var.setImportantForAccessibility(4);
                e61Var = wl0Var;
                break;
            case 17:
                View ttVar = new tt(themeActivity.f42020f, context, themeActivity);
                ttVar.setFocusable(false);
                ttVar.setLayoutParams(new v4.o0(-1, -2));
                e61Var = ttVar;
                break;
            case 19:
                e61Var = new org.telegram.ui.Cells.h6(context, false);
                break;
            case 20:
                i15 = ((org.telegram.ui.ActionBar.f2) themeActivity).currentAccount;
                ?? pj0Var = new org.telegram.ui.Components.pj0(context, null);
                pj0Var.f30292e3 = new ArrayList();
                pj0Var.f30294g3 = i15;
                pj0Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                pj0Var.setFocusable(false);
                pj0Var.setItemAnimator(null);
                pj0Var.setLayoutAnimation(null);
                v4.b0 b0Var2 = new v4.b0(0, false);
                pj0Var.f30293f3 = b0Var2;
                pj0Var.setLayoutManager(b0Var2);
                pj0Var.setAdapter(new x7(pj0Var, 1));
                pj0Var.i(new fi.o1(pj0Var, 1));
                pj0Var.setOnItemClickListener(new di.f0(pj0Var, themeActivity, context, 3));
                pj0Var.z1();
                e61Var = pj0Var;
                break;
            case 21:
                i16 = ((org.telegram.ui.ActionBar.f2) themeActivity).currentAccount;
                e61Var = new nl0(i16, 0L, this.f45465c, themeActivity.getResourceProvider());
                break;
        }
        return new v4.d1(e61Var);
    }

    @Override
    public final void y(v4.d1 d1Var) {
        boolean z9;
        if (d1Var.f57048f == 4) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) d1Var.f57044a;
            if (d1Var.b() == org.telegram.ui.ActionBar.k6.f28046o) {
                z9 = true;
            } else {
                z9 = false;
            }
            aaVar.setTypeChecked(z9);
        }
    }
}
