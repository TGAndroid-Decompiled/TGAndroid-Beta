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
public final class c61 extends org.telegram.ui.Components.tj0 {
    public final Context f46037c;
    public boolean d = true;
    public final ThemeActivity f46038e;

    public c61(ThemeActivity themeActivity, Context context) {
        this.f46038e = themeActivity;
        this.f46037c = context;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        int i7 = e1Var.f58539f;
        if (i7 == 0 || i7 == 1 || i7 == 4 || i7 == 7 || i7 == 10 || i7 == 11 || i7 == 12 || i7 == 14 || i7 == 18 || i7 == 20 || i7 == 21) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f46038e.L0;
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
        ThemeActivity themeActivity = this.f46038e;
        if (i7 != themeActivity.f43387b0 && i7 != themeActivity.L && i7 != themeActivity.f43389c0 && i7 != themeActivity.Z && i7 != themeActivity.Q && i7 != themeActivity.R && i7 != themeActivity.N && i7 != themeActivity.M) {
            if (i7 != themeActivity.f43395g0 && i7 != themeActivity.f43385a0 && i7 != themeActivity.f43414w0 && i7 != themeActivity.C0 && i7 != themeActivity.I0) {
                if (i7 != themeActivity.f43409s0 && i7 != themeActivity.W && i7 != themeActivity.f43390d0 && i7 != themeActivity.P && i7 != themeActivity.f43397i0 && i7 != themeActivity.f43403o0 && i7 != themeActivity.f43400l0 && i7 != themeActivity.K && i7 != themeActivity.K0 && i7 != themeActivity.A0 && i7 != themeActivity.D0 && i7 != themeActivity.E0 && i7 != themeActivity.F0) {
                    if (i7 != themeActivity.S && i7 != themeActivity.T && i7 != themeActivity.U && i7 != themeActivity.V) {
                        if (i7 != themeActivity.X && i7 != themeActivity.f43392e0 && i7 != themeActivity.f43396h0 && i7 != themeActivity.f43417y && i7 != themeActivity.f43398j0 && i7 != themeActivity.f43415x && i7 != themeActivity.m0 && i7 != themeActivity.f43399k0 && i7 != themeActivity.f43411u0 && i7 != themeActivity.f43416x0 && i7 != themeActivity.J0 && i7 != themeActivity.G0 && i7 != themeActivity.H0) {
                            if (i7 == themeActivity.f43394f0) {
                                return 6;
                            }
                            if (i7 != themeActivity.Y && i7 != themeActivity.H && i7 != themeActivity.F) {
                                i10 = themeActivity.raiseToListenRow;
                                if (i7 != i10) {
                                    i11 = themeActivity.pauseOnRecordRow;
                                    if (i7 != i11 && i7 != themeActivity.E && i7 != themeActivity.f43410t0) {
                                        i12 = themeActivity.pauseOnMediaRow;
                                        if (i7 != i12 && i7 != themeActivity.G) {
                                            i13 = themeActivity.sensitiveContentRow;
                                            if (i7 != i13) {
                                                i14 = themeActivity.textSizeRow;
                                                if (i7 == i14) {
                                                    return 8;
                                                }
                                                if (i7 != themeActivity.f43402n0) {
                                                    i15 = themeActivity.nightThemeRow;
                                                    if (i7 != i15) {
                                                        i16 = themeActivity.browserRow;
                                                        if (i7 != i16) {
                                                            if (i7 == themeActivity.f43404p0) {
                                                                return 11;
                                                            }
                                                            if (i7 != themeActivity.f43407r0) {
                                                                i17 = themeActivity.bubbleRadiusRow;
                                                                if (i7 != i17) {
                                                                    i18 = themeActivity.backgroundRow;
                                                                    if (i7 != i18 && i7 != themeActivity.f43419z0) {
                                                                        i19 = themeActivity.createNewThemeRow;
                                                                        if (i7 != i19) {
                                                                            i20 = themeActivity.liteModeRow;
                                                                            if (i7 != i20) {
                                                                                i21 = themeActivity.stickersRow;
                                                                                if (i7 != i21 && i7 != themeActivity.B0) {
                                                                                    if (i7 == themeActivity.f43412v0) {
                                                                                        return 15;
                                                                                    }
                                                                                    if (i7 == themeActivity.f43418y0) {
                                                                                        return 16;
                                                                                    }
                                                                                    if (i7 == themeActivity.f43405q0) {
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
    public final void t(v4.e1 e1Var, int i7) {
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
        int i23 = e1Var.f58539f;
        View view = e1Var.f58535a;
        ThemeActivity themeActivity = this.f46038e;
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
                                                        org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view;
                                                        i21 = themeActivity.nightThemeRow;
                                                        if (i7 != i21) {
                                                            i22 = themeActivity.browserRow;
                                                            if (i7 == i22) {
                                                                h5Var.b(org.telegram.messenger.hd.M0(2131749209, null), org.telegram.messenger.hd.M0(2131749208, null), 2131232030, themeActivity.getMessagesController().M2(), 0, false, true, false);
                                                                return;
                                                            }
                                                            return;
                                                        }
                                                        if (org.telegram.ui.ActionBar.j6.f29043o != 0) {
                                                            z11 = true;
                                                        }
                                                        if (z11) {
                                                            M03 = org.telegram.ui.ActionBar.j6.C0();
                                                        } else {
                                                            M03 = org.telegram.messenger.hd.M0(2131753783, "AutoNightThemeOff");
                                                        }
                                                        if (z11) {
                                                            int i24 = org.telegram.ui.ActionBar.j6.f29043o;
                                                            if (i24 == 1) {
                                                                M04 = org.telegram.messenger.hd.M0(2131753787, "AutoNightScheduled");
                                                            } else if (i24 == 3) {
                                                                M04 = org.telegram.messenger.hd.M0(2131753786, "AutoNightSystemDefault");
                                                            } else {
                                                                M04 = org.telegram.messenger.hd.M0(2131753796, "AutoNightAdaptive");
                                                            }
                                                            M03 = a8.p0.E(M04, " ", M03);
                                                        }
                                                        h5Var.b(org.telegram.messenger.hd.M0(2131753784, "AutoNightTheme"), M03, 2131231843, z11, 0, false, true, false);
                                                        return;
                                                    case 11:
                                                        if (this.d) {
                                                            themeActivity.f43388c.A1(themeActivity.f43386b.getMeasuredWidth());
                                                            this.d = false;
                                                            return;
                                                        }
                                                        return;
                                                    case 12:
                                                        org.telegram.ui.Components.uj0 uj0Var = (org.telegram.ui.Components.uj0) view;
                                                        e61 e61Var = (e61) uj0Var.getAdapter();
                                                        e61Var.f();
                                                        int indexOf = e61Var.f46584e.indexOf(e61Var.d.k(false));
                                                        if (indexOf == -1) {
                                                            indexOf = e61Var.b() - 1;
                                                        }
                                                        if (indexOf != -1) {
                                                            ((v4.b0) uj0Var.getLayoutManager()).h1(indexOf, (themeActivity.f43386b.getMeasuredWidth() / 2) - org.telegram.messenger.g0.L(42.0f));
                                                            return;
                                                        }
                                                        return;
                                                    default:
                                                        return;
                                                }
                                            }
                                            ((ol0) view).set(themeActivity.getUserConfig().f());
                                            return;
                                        }
                                        org.telegram.ui.Cells.g6 g6Var = (org.telegram.ui.Cells.g6) view;
                                        if (i7 == themeActivity.I) {
                                            g6Var.b("save media only from peer chats", "", true, false);
                                            return;
                                        } else {
                                            g6Var.b("save media from all chats", "", true, false);
                                            return;
                                        }
                                    }
                                    ((vt) view).a();
                                    return;
                                }
                                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                                l8Var.f30661w = 48;
                                i16 = themeActivity.backgroundRow;
                                if (i7 == i16) {
                                    l8Var.setSubtitle(null);
                                    int i25 = org.telegram.ui.ActionBar.j6.f29089q6;
                                    l8Var.g(i25, i25);
                                    String M05 = org.telegram.messenger.hd.M0(2131752550, null);
                                    i20 = themeActivity.changeUserColor;
                                    if (i20 >= 0) {
                                        z11 = true;
                                    }
                                    l8Var.o(2131232067, M05, z11);
                                    return;
                                } else if (i7 != themeActivity.f43419z0) {
                                    i17 = themeActivity.createNewThemeRow;
                                    if (i7 != i17) {
                                        i18 = themeActivity.liteModeRow;
                                        if (i7 != i18) {
                                            i19 = themeActivity.stickersRow;
                                            if (i7 == i19) {
                                                l8Var.g(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
                                                l8Var.o(2131232039, org.telegram.messenger.hd.M0(2131744857, null), true);
                                                l8Var.setSubtitle(org.telegram.messenger.hd.M0(2131744856, null));
                                                l8Var.f30660s = 64;
                                                l8Var.f30661w = 60;
                                                l8Var.f30662x = 20;
                                                return;
                                            } else if (i7 == themeActivity.B0) {
                                                l8Var.g(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
                                                l8Var.o(2131232038, "Speech to Text", false);
                                                l8Var.setSubtitle("Voice message transcription and dictation");
                                                l8Var.f30660s = 64;
                                                l8Var.f30661w = 60;
                                                l8Var.f30662x = 20;
                                                return;
                                            } else {
                                                return;
                                            }
                                        }
                                        l8Var.g(org.telegram.ui.ActionBar.j6.J5, org.telegram.ui.ActionBar.j6.G6);
                                        l8Var.o(2131232015, org.telegram.messenger.hd.M0(2131748866, null), true);
                                        l8Var.setSubtitle(org.telegram.messenger.hd.M0(2131748865, null));
                                        l8Var.f30661w = 60;
                                        l8Var.f30660s = 64;
                                        l8Var.f30662x = 20;
                                        return;
                                    }
                                    l8Var.setSubtitle(null);
                                    int i26 = org.telegram.ui.ActionBar.j6.f29089q6;
                                    l8Var.g(i26, i26);
                                    l8Var.o(2131232098, org.telegram.messenger.hd.M0(2131751712, null), false);
                                    return;
                                } else {
                                    l8Var.setSubtitle(null);
                                    int i27 = org.telegram.ui.ActionBar.j6.f29089q6;
                                    l8Var.g(i27, i27);
                                    l8Var.o(2131232401, org.telegram.messenger.hd.M0(2131751281, null), true);
                                    return;
                                }
                            }
                            org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                            if (i7 == themeActivity.Y) {
                                q8Var.f(org.telegram.messenger.hd.M0(2131753791, "AutoNightLocation"), org.telegram.ui.ActionBar.j6.f29062p, true);
                                return;
                            } else if (i7 == themeActivity.O) {
                                q8Var.f(org.telegram.messenger.hd.M0(2131751157, "EnableAnimations"), org.telegram.messenger.np.e1().getBoolean("view_animations", true), true);
                                return;
                            } else if (i7 == themeActivity.H) {
                                q8Var.f(org.telegram.messenger.hd.M0(2131745632, "SendByEnter"), org.telegram.messenger.np.e1().getBoolean("send_by_enter", false), true);
                                return;
                            } else if (i7 != themeActivity.F) {
                                i12 = themeActivity.raiseToListenRow;
                                if (i7 == i12) {
                                    q8Var.g(org.telegram.messenger.hd.M0(2131746427, "RaiseToListen"), org.telegram.messenger.hd.M0(2131746426, "RaiseToListenInfo"), org.telegram.messenger.gz.f23979s0, true, true);
                                    return;
                                } else if (i7 != themeActivity.G) {
                                    i13 = themeActivity.pauseOnRecordRow;
                                    if (i7 != i13) {
                                        i14 = themeActivity.pauseOnMediaRow;
                                        if (i7 == i14) {
                                            q8Var.f(org.telegram.messenger.hd.M0(2131747432, null), org.telegram.messenger.gz.G0, true);
                                            return;
                                        } else if (i7 != themeActivity.E) {
                                            i15 = themeActivity.sensitiveContentRow;
                                            if (i7 == i15) {
                                                q8Var.g(org.telegram.messenger.hd.M0(2131745330, null), org.telegram.messenger.hd.M0(2131745329, null), themeActivity.getMessagesController().T4(), true, true);
                                                return;
                                            } else if (i7 == themeActivity.f43410t0) {
                                                q8Var.f(org.telegram.messenger.hd.M0(2131753675, "BlurInChat"), org.telegram.messenger.gz.f(), true);
                                                return;
                                            } else {
                                                return;
                                            }
                                        } else {
                                            q8Var.g(org.telegram.messenger.hd.M0(2131751438, "DirectShare"), org.telegram.messenger.hd.M0(2131751437, "DirectShareInfo"), org.telegram.messenger.gz.f23993x0, false, true);
                                            return;
                                        }
                                    }
                                    q8Var.g(org.telegram.messenger.hd.M0(2131747431, null), org.telegram.messenger.hd.M0(2131747430, "PauseMusicOnRecordInfo"), org.telegram.messenger.gz.F0, true, true);
                                    return;
                                } else {
                                    q8Var.g(org.telegram.messenger.hd.M0(2131748249, "NextMediaTap"), org.telegram.messenger.hd.M0(2131748248, "NextMediaTapInfo"), org.telegram.messenger.gz.f23982t0, true, true);
                                    return;
                                }
                            } else {
                                q8Var.g(org.telegram.messenger.hd.M0(2131746425, "RaiseToSpeak"), org.telegram.messenger.hd.M0(2131746424, "RaiseToSpeakInfo"), org.telegram.messenger.gz.f23976r0, true, true);
                                return;
                            }
                        }
                        ((org.telegram.ui.Cells.i0) view).setProgress(org.telegram.ui.ActionBar.j6.f29082q);
                        return;
                    }
                    org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                    if (i7 == themeActivity.X) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131753788, "AutoNightSchedule"));
                        return;
                    } else if (i7 == themeActivity.f43392e0) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131753795, "AutoNightBrightness"));
                        return;
                    } else if (i7 == themeActivity.f43396h0) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131753789, "AutoNightPreferred"));
                        return;
                    } else if (i7 == themeActivity.f43417y) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131745983, "SETTINGS"));
                        return;
                    } else if (i7 == themeActivity.f43398j0) {
                        if (themeActivity.f43393f == 3) {
                            n4Var.setText(org.telegram.messenger.hd.M0(2131752839, "BuildMyOwnTheme"));
                            return;
                        } else {
                            n4Var.setText(org.telegram.messenger.hd.M0(2131752011, "ColorTheme"));
                            return;
                        }
                    } else if (i7 == themeActivity.f43415x) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131744191, "TextSizeHeader"));
                        return;
                    } else if (i7 == themeActivity.m0) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131752225, "ChatList"));
                        return;
                    } else if (i7 == themeActivity.f43399k0) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131752840, "BubbleRadius"));
                        return;
                    } else if (i7 == themeActivity.f43411u0) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131752222, "ChatListSwipeGesture"));
                        return;
                    } else if (i7 == themeActivity.f43416x0) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131745651, "SelectTheme"));
                        return;
                    } else if (i7 == themeActivity.J0) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131754240, null));
                        return;
                    } else if (i7 == themeActivity.H0) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131747765, "OtherSettings"));
                        return;
                    } else if (i7 == themeActivity.G0) {
                        n4Var.setText(org.telegram.messenger.hd.M0(2131748660, "MediaAndSoundSettings"));
                        return;
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
                if (i7 == themeActivity.S) {
                    String M06 = org.telegram.messenger.hd.M0(2131753793, "AutoNightDisabled");
                    if (org.telegram.ui.ActionBar.j6.f29043o == 0) {
                        z11 = true;
                    }
                    aaVar.a(M06, z11, true);
                    return;
                } else if (i7 == themeActivity.T) {
                    String M07 = org.telegram.messenger.hd.M0(2131753787, "AutoNightScheduled");
                    if (org.telegram.ui.ActionBar.j6.f29043o == 1) {
                        z11 = true;
                    }
                    aaVar.a(M07, z11, true);
                    return;
                } else if (i7 == themeActivity.U) {
                    String M08 = org.telegram.messenger.hd.M0(2131753796, "AutoNightAdaptive");
                    if (org.telegram.ui.ActionBar.j6.f29043o == 2) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (themeActivity.V != -1) {
                        z11 = true;
                    }
                    aaVar.a(M08, z10, z11);
                    return;
                } else if (i7 == themeActivity.V) {
                    String M09 = org.telegram.messenger.hd.M0(2131753786, "AutoNightSystemDefault");
                    if (org.telegram.ui.ActionBar.j6.f29043o != 3) {
                        z12 = false;
                    }
                    aaVar.a(M09, z12, false);
                    return;
                } else {
                    return;
                }
            }
            org.telegram.ui.Cells.y8 y8Var = (org.telegram.ui.Cells.y8) view;
            y8Var.setFixedSize(0);
            if (i7 == themeActivity.f43395g0) {
                y8Var.setText(org.telegram.messenger.hd.a0("AutoNightBrightnessInfo", null, 2131753794, Integer.valueOf((int) (org.telegram.ui.ActionBar.j6.f29082q * 100.0f))));
                return;
            } else if (i7 == themeActivity.f43385a0) {
                y8Var.setText(ThemeActivity.D0());
                return;
            } else if (i7 == themeActivity.f43414w0) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131752221, "ChatListSwipeGestureInfo"));
                return;
            } else if (i7 == themeActivity.I0) {
                y8Var.setText(org.telegram.messenger.hd.M0(2131748865, "LiteModeInfo"));
                return;
            } else {
                y8Var.setFixedSize(12);
                y8Var.setText("");
                return;
            }
        }
        org.telegram.ui.Cells.v9 v9Var = (org.telegram.ui.Cells.v9) view;
        i10 = themeActivity.nightThemeRow;
        if (i7 == i10) {
            if (org.telegram.ui.ActionBar.j6.f29043o != 0 && org.telegram.ui.ActionBar.j6.J != null) {
                v9Var.c(org.telegram.messenger.hd.M0(2131753784, null), org.telegram.ui.ActionBar.j6.C0(), false, false);
            } else {
                v9Var.c(org.telegram.messenger.hd.M0(2131753784, null), org.telegram.messenger.hd.M0(2131753783, null), false, false);
            }
        } else if (i7 == themeActivity.f43387b0) {
            int i28 = org.telegram.ui.ActionBar.j6.f29101r;
            int i29 = i28 / 60;
            v9Var.c(org.telegram.messenger.hd.M0(2131753792, "AutoNightFrom"), String.format("%02d:%02d", Integer.valueOf(i29), Integer.valueOf(i28 - (i29 * 60))), false, true);
        } else if (i7 == themeActivity.f43389c0) {
            int i30 = org.telegram.ui.ActionBar.j6.f29121s;
            int i31 = i30 / 60;
            v9Var.c(org.telegram.messenger.hd.M0(2131753782, "AutoNightTo"), String.format("%02d:%02d", Integer.valueOf(i31), Integer.valueOf(i30 - (i31 * 60))), false, false);
        } else if (i7 == themeActivity.Z) {
            v9Var.c(org.telegram.messenger.hd.M0(2131753781, "AutoNightUpdateLocation"), org.telegram.ui.ActionBar.j6.f29196w, false, false);
        } else if (i7 == themeActivity.R) {
            int i32 = org.telegram.messenger.np.e1().getInt("sortContactsBy", 0);
            if (i32 == 0) {
                M02 = org.telegram.messenger.hd.M0(2131751600, "Default");
            } else if (i32 == 1) {
                M02 = org.telegram.messenger.hd.M0(2131745287, "FirstName");
            } else {
                M02 = org.telegram.messenger.hd.M0(2131745286, "LastName");
            }
            v9Var.c(org.telegram.messenger.hd.M0(2131745291, "SortBy"), M02, false, true);
        } else if (i7 == themeActivity.Q) {
            v9Var.b(org.telegram.messenger.hd.M0(2131749264, "ImportContacts"), true);
        } else if (i7 == themeActivity.L) {
            int i33 = org.telegram.messenger.gz.f23980s1;
            if (i33 == 0) {
                M0 = org.telegram.messenger.hd.M0(2131751366, "DistanceUnitsAutomatic");
            } else if (i33 == 1) {
                M0 = org.telegram.messenger.hd.M0(2131751365, "DistanceUnitsKilometers");
            } else {
                M0 = org.telegram.messenger.hd.M0(2131751364, "DistanceUnitsMiles");
            }
            String M010 = org.telegram.messenger.hd.M0(2131751367, "DistanceUnits");
            boolean z13 = themeActivity.Q0;
            if (themeActivity.F0 < 0) {
                z12 = false;
            }
            v9Var.c(M010, M0, z13, z12);
            themeActivity.Q0 = false;
        } else if (i7 == themeActivity.M) {
            v9Var.c(org.telegram.messenger.hd.M0(2131745799, null), org.telegram.ui.web.d1.a().f52586a, themeActivity.R0, false);
        } else if (i7 == themeActivity.N) {
            String M011 = org.telegram.messenger.hd.M0(2131748439, null);
            if (org.telegram.messenger.gz.f23985u0) {
                i11 = 2131748437;
            } else {
                i11 = 2131748438;
            }
            v9Var.c(M011, org.telegram.messenger.hd.M0(i11, null), themeActivity.P0, false);
            themeActivity.P0 = false;
        }
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        int i10;
        int i11;
        float f10;
        float f11;
        b61 b61Var;
        boolean z10;
        int i12;
        boolean z11;
        int i13;
        int i14;
        org.telegram.ui.ActionBar.o4 o4Var;
        int i15;
        int i16;
        int i17 = 3;
        ThemeActivity themeActivity = this.f46038e;
        Context context = this.f46037c;
        switch (i7) {
            case 1:
                b61Var = new org.telegram.ui.Cells.v9(context);
                break;
            case 2:
                b61Var = new org.telegram.ui.Cells.y8(context);
                break;
            case 3:
                b61Var = new org.telegram.ui.Cells.x6(context, (org.telegram.ui.Cells.y0) null);
                break;
            case 4:
                ?? frameLayout = new FrameLayout(context);
                frameLayout.setWillNotDraw(false);
                TextView textView = new TextView(context);
                frameLayout.f30019a = textView;
                org.telegram.ui.ActionBar.q6.U(textView, org.telegram.ui.ActionBar.j6.G6, null);
                org.telegram.messenger.i20.p(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                if (org.telegram.messenger.hd.f24101a0) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 16);
                boolean z12 = org.telegram.messenger.hd.f24101a0;
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
                if (z12) {
                    f11 = 21.0f;
                } else {
                    f11 = 23.0f;
                }
                frameLayout.addView(textView, c8.ja.d(-1, -1.0f, i18, f10, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(context);
                frameLayout.f30020b = imageView;
                org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.Di, null, PorterDuff.Mode.MULTIPLY);
                imageView.setImageResource(2131232756);
                if (!org.telegram.messenger.hd.f24101a0) {
                    i17 = 5;
                }
                frameLayout.addView(imageView, c8.ja.d(19, 14.0f, i17 | 16, 23.0f, 0.0f, 23.0f, 0.0f));
                b61Var = frameLayout;
                break;
            case 5:
                b61Var = new org.telegram.ui.Cells.n4(context);
                break;
            case 6:
                b61Var = new y51(this, context);
                break;
            case 7:
                b61Var = new org.telegram.ui.Cells.q8(context);
                break;
            case 8:
                b61Var = new d61(themeActivity, context);
                break;
            case 9:
                z51 z51Var = new z51(context, 0);
                z51Var.f53882b = new org.telegram.ui.Cells.v0[2];
                z51Var.setOrientation(0);
                z51Var.setPadding(org.telegram.messenger.g0.L(21.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(21.0f), 0);
                int i19 = 0;
                while (true) {
                    org.telegram.ui.Cells.v0[] v0VarArr = (org.telegram.ui.Cells.v0[]) z51Var.f53882b;
                    if (i19 < v0VarArr.length) {
                        if (i19 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context, 0);
                        v0Var.f31783b = new RectF();
                        TextPaint textPaint = new TextPaint(1);
                        v0Var.f31785e = textPaint;
                        v0Var.setWillNotDraw(false);
                        v0Var.f31784c = z10;
                        if (z10) {
                            i12 = 2131752223;
                        } else {
                            i12 = 2131752224;
                        }
                        v0Var.setContentDescription(org.telegram.messenger.hd.M0(i12, null));
                        textPaint.setTextSize(org.telegram.messenger.g0.L(13.0f));
                        org.telegram.ui.Cells.u0 u0Var = new org.telegram.ui.Cells.u0(v0Var, context);
                        v0Var.d = u0Var;
                        u0Var.setSize(org.telegram.messenger.g0.L(20.0f));
                        v0Var.addView(u0Var, c8.ja.d(22, 22.0f, 53, 0.0f, 26.0f, 10.0f, 0.0f));
                        if ((z10 && org.telegram.messenger.gz.f23971p1) || (!z10 && !org.telegram.messenger.gz.f23971p1)) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        u0Var.a(z11, false);
                        v0VarArr[i19] = v0Var;
                        org.telegram.ui.Cells.v0 v0Var2 = ((org.telegram.ui.Cells.v0[]) z51Var.f53882b)[i19];
                        if (i19 == 1) {
                            i13 = 10;
                        } else {
                            i13 = 0;
                        }
                        z51Var.addView(v0Var2, c8.ja.m(0.5f, -1, -1, i13, 0, 0));
                        ((org.telegram.ui.Cells.v0[]) z51Var.f53882b)[i19].setOnClickListener(new fi.x1(3, z51Var, z10));
                        i19++;
                    } else {
                        b61Var = z51Var;
                        break;
                    }
                }
                break;
            case 10:
                b61Var = new org.telegram.ui.Cells.h5(this.f46037c, 21, 60, true, null);
                break;
            case 11:
                this.d = true;
                a61 a61Var = new a61(this, this.f46037c, themeActivity, themeActivity.f43393f, themeActivity.f43391e, themeActivity.d);
                themeActivity.f43388c = a61Var;
                a61Var.setDrawDivider(themeActivity.f43413w);
                themeActivity.f43388c.setFocusable(false);
                View view = themeActivity.f43388c;
                view.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(148.0f)));
                b61Var = view;
                break;
            case 12:
                b61 b61Var2 = new b61(0, context, null);
                b61Var2.setFocusable(false);
                b61Var2.setItemAnimator(null);
                b61Var2.setLayoutAnimation(null);
                b61Var2.setPadding(org.telegram.messenger.g0.L(11.0f), 0, org.telegram.messenger.g0.L(11.0f), 0);
                b61Var2.setClipToPadding(false);
                v4.b0 b0Var = new v4.b0();
                b0Var.j1(0);
                b61Var2.setLayoutManager(b0Var);
                e61 e61Var = new e61(themeActivity, context);
                b61Var2.setAdapter(e61Var);
                b61Var2.setOnItemClickListener(new w51(this, e61Var, b61Var2, 0));
                b61Var2.setOnItemLongClickListener(new xi0(21, this, e61Var));
                b61Var2.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(62.0f)));
                b61Var = b61Var2;
                break;
            case 13:
                b61Var = new t51(themeActivity, context);
                break;
            case 14:
            case 18:
            default:
                b61Var = new org.telegram.ui.Cells.l8(context);
                break;
            case 15:
                i14 = ((org.telegram.ui.ActionBar.e2) themeActivity).currentAccount;
                b61Var = new org.telegram.ui.Components.xw0(context, i14);
                break;
            case 16:
                o4Var = ((org.telegram.ui.ActionBar.e2) themeActivity).parentLayout;
                View xl0Var = new xl0(context, o4Var, 0);
                xl0Var.setImportantForAccessibility(4);
                b61Var = xl0Var;
                break;
            case 17:
                View vtVar = new vt(themeActivity.f43393f, context, themeActivity);
                vtVar.setFocusable(false);
                vtVar.setLayoutParams(new v4.p0(-1, -2));
                b61Var = vtVar;
                break;
            case 19:
                b61Var = new org.telegram.ui.Cells.g6(context, false);
                break;
            case 20:
                i15 = ((org.telegram.ui.ActionBar.e2) themeActivity).currentAccount;
                ?? uj0Var = new org.telegram.ui.Components.uj0(context, null);
                uj0Var.f31442f3 = new ArrayList();
                uj0Var.f31444h3 = i15;
                uj0Var.setPadding(0, org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f));
                uj0Var.setFocusable(false);
                uj0Var.setItemAnimator(null);
                uj0Var.setLayoutAnimation(null);
                v4.b0 b0Var2 = new v4.b0(0, false);
                uj0Var.f31443g3 = b0Var2;
                uj0Var.setLayoutManager(b0Var2);
                uj0Var.setAdapter(new y7(uj0Var, 1));
                uj0Var.i(new ai.h0(uj0Var, 2));
                uj0Var.setOnItemClickListener(new fi.f0(uj0Var, themeActivity, context, 3));
                uj0Var.z1();
                b61Var = uj0Var;
                break;
            case 21:
                i16 = ((org.telegram.ui.ActionBar.e2) themeActivity).currentAccount;
                b61Var = new ol0(i16, 0L, this.f46037c, themeActivity.getResourceProvider());
                break;
        }
        return new v4.e1(b61Var);
    }

    @Override
    public final void y(v4.e1 e1Var) {
        boolean z10;
        if (e1Var.f58539f == 4) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) e1Var.f58535a;
            if (e1Var.b() == org.telegram.ui.ActionBar.j6.f29043o) {
                z10 = true;
            } else {
                z10 = false;
            }
            aaVar.setTypeChecked(z10);
        }
    }
}
